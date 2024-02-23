package /*Package Path*/;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import /*Package Path*/.Direction; // An enum containing more combinations of Bukkit's BlockFace enum, such as NORTH_UP, SOUTH_WEST_DOWN, etc.
import /*Package Path*/.Mathsf;
import /*Package Path*/.Randf;
import /*Package Path*/.Ease; // A class containing different types of easing functions, such as EASE_IN, EASE_OUT, EASE_IN_SINE, etc.
import org.bukkit.util.BlockVector;
import org.bukkit.util.Vector;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * Represents a 3D geometric circle with utility methods for generating points on the circumference.
 *
 * @author Laura Price
 */
public class Circle {

    public static final double ROOT_TWO = Math.sqrt(2);

    @Getter @Setter
    private Vector centre;
    @Getter @Setter
    private double radius;
    private Vector axis;

    /**
     * Constructs a Circle with a centre, radius, and a Direction.
     * The Direction is converted to a Vector and used as the circle's axis.
     *
     * @param centre    the centre of the circle as a Vector
     * @param radius    the radius of the circle
     * @param direction the direction of the axis circle is generated perpendicular to, as a Direction
     */
    public Circle(@NonNull Vector centre, double radius, @NonNull Direction direction) {
        this(centre, radius, direction.toVector());
    }

    /**
     * Constructs a Circle with a centre, radius, and an axis.
     * The axis is normalized before being set as the circle's axis.
     *
     * @param centre the centre of the circle as a Vector
     * @param radius the radius of the circle
     * @param axis   the direction of the axis circle is generated perpendicular to, as a Vector
     */
    public Circle(@NonNull Vector centre, double radius, @NonNull Vector axis) {
        this.centre = centre;
        this.radius = radius;
        this.axis = axis.clone().normalize();
    }

    /**
     * Returns a cloned copy of the axis Vector.
     * The original axis Vector remains unchanged.
     *
     * @return a cloned copy of the axis Vector
     */
    public Vector getAxis() {
        return axis.clone();
    }

    /**
     * Sets the axis of the circle and normalizes it.
     * This ensures that the circle's axis is always a unit vector.
     *
     * @param axis the axis of the circle as a Vector
     */
    public void setAxis(@NonNull Vector axis) {
        this.axis = axis.clone().normalize();
    }

    /**
     * Calculates a point on the circumference of the circle based on the given angle.
     * The angle is in degrees and the circle can be oriented in any 3D space.
     *
     * @param angle the angle in degrees to get a point on the circle
     * @return a Vector representing a point on the circle
     */
    public Vector getPointOnCircumference(double angle) {
        return getPointOnCircumference(angle, 0.0d);
    }

    /**
     * Calculates a point on the circumference of the circle based on the given angle and offset.
     * The angle and offset are in degrees and the circle can be oriented in any 3D space.
     *
     * @param angle  the angle in degrees to get a point on the circle
     * @param offset the degree offset to apply when generating the point
     * @return a Vector representing a point on the circle
     */
    public Vector getPointOnCircumference(double angle, double offset) {
        angle = Math.toRadians(angle);
        offset = Math.toRadians(offset);

        // Create orthogonal vectors to the axis
        Vector referenceVec = new Vector(1, 0, 0);
        if (Math.abs(axis.dot(referenceVec)) > 0.999) { // Check if 'axis' is almost parallel to the referenceVec
            referenceVec = new Vector(0, 1, 0); // Choose another reference vector if 'axis' is parallel to the initial referenceVec
        }
        Vector ortho1 = axis.clone().crossProduct(referenceVec).normalize();
        Vector ortho2 = axis.clone().crossProduct(ortho1).normalize();

        double x = centre.getX() + radius * Math.cos(angle + offset) * ortho1.getX() + radius * Math.sin(angle + offset) * ortho2.getX();
        double y = centre.getY() + radius * Math.cos(angle + offset) * ortho1.getY() + radius * Math.sin(angle + offset) * ortho2.getY();
        double z = centre.getZ() + radius * Math.cos(angle + offset) * ortho1.getZ() + radius * Math.sin(angle + offset) * ortho2.getZ();

        return new Vector(x, y, z);
    }

    /**
     * Returns a list of evenly spaced points on the circle's circumference using the default easing function.
     *
     * @param numPoints the number of points to generate
     * @return a list of Vectors representing points on the circle
     */
    public List<Vector> getPointsOnCircumference(int numPoints) {
        return getPointsOnCircumference(numPoints, Ease.getDefault());
    }

    /**
     * Returns a list of evenly spaced points on the circle's circumference using the default easing function and a specified offset.
     *
     * @param numPoints the number of points to generate
     * @param offset    the degree offset to apply when generating points
     * @return a list of Vectors representing points on the circle
     */
    public List<Vector> getPointsOnCircumference(int numPoints, double offset) {
        return getPointsOnCircumference(numPoints, offset, Ease.getDefault());
    }

    /**
     * Returns a list of points on the circle's circumference using a specified easing function.
     *
     * @param numPoints the number of points to generate
     * @param ease      the easing function to apply
     * @return a list of Vectors representing points on the circle
     */
    public List<Vector> getPointsOnCircumference(int numPoints, @NonNull Ease ease) {
        return getPointsOnCircumference(numPoints, 0.0d, ease);
    }

    /**
     * Returns a list of points on the circle's circumference using a specified easing function and offset.
     *
     * @param numPoints the number of points to generate
     * @param offset    the degree offset to apply when generating points
     * @param ease      the easing function to apply
     * @return a list of Vectors representing points on the circle
     */
    public List<Vector> getPointsOnCircumference(int numPoints, double offset, @NonNull Ease ease) {
        return getPointsOnCircumference(numPoints, offset, ease, 1.0d);
    }

    /**
     * Returns a list of points on the circle's circumference using a specified easing function and easing strength.
     *
     * @param numPoints     the number of points to generate
     * @param ease          the easing function to apply
     * @param easeStrength  the strength of the easing function
     * @return a list of Vectors representing points on the circle
     */
    public List<Vector> getPointsOnCircumference(int numPoints, @NonNull Ease ease, double easeStrength) {
        return getPointsOnCircumference(numPoints, 0.0d, ease, easeStrength);
    }

    /**
     * Returns a list of points on the circle's circumference using a specified easing function, offset, and easing strength.
     *
     * @param numPoints     the number of points to generate
     * @param offset        the degree offset to apply when generating points
     * @param ease          the easing function to apply
     * @param easeStrength  the strength of the easing function
     * @return a list of Vectors representing points on the circle
     */
    public List<Vector> getPointsOnCircumference(int numPoints, double offset, @NonNull Ease ease, double easeStrength) {
        return getPointsOnCircumference(numPoints, offset, ease.asCustomEase(easeStrength));
    }

    /**
     * Returns a list of points on the circle's circumference using a specified custom easing function.
     *
     * @param numPoints the number of points to generate
     * @param ease      the custom easing function to apply
     * @return a list of Vectors representing points on the circle
     */
    public List<Vector> getPointsOnCircumference(int numPoints, @NonNull Ease.EaseType.CustomEase ease) {
        return getPointsOnCircumference(numPoints, 0.0d, ease);
    }

    /**
     * Returns a list of points on the circle's circumference using a specified custom easing function and offset.
     *
     * @param numPoints the number of points to generate
     * @param offset    the degree offset to apply when generating points
     * @param ease      the custom easing function to apply
     * @return a list of Vectors representing points on the circle
     */
    public List<Vector> getPointsOnCircumference(int numPoints, double offset, @NonNull Ease.EaseType.CustomEase ease) {
        List<Vector> points = new ArrayList<>();

        for (int i = 0; i < numPoints; i++) {
            double easedAngle = ease.ease(0, 360, Mathsf.iLerp(0, numPoints, i));
            points.add(getPointOnCircumference(easedAngle, offset));
        }

        return points;
    }

    /**
     * Returns a list of points inside the circle's circumference, distributed randomly, using rejection sampling to generate the points.<br>
     * Rejection sampling is favoured as on average it's less computationally expensive than other methods involving sin/cos.
     *
     * @param points the number of points to generate
     * @return a list of Vectors representing random points inside the circle
     */
    public List<Vector> getRandomPointInside(int points) {
        List<Vector> pointsList = new ArrayList<>();
        for (int i = 0; i < points; i++) pointsList.add(getRandomPointInside());
        return pointsList;
    }


    /**
     * Returns a point inside the circle's circumference, distributed randomly, using rejection sampling to generate the point.<br>
     * Rejection sampling is favoured as on average it's less computationally expensive than other methods involving sin/cos.
     *
     * @return a Vector representing a random point inside the circle
     */
    public Vector getRandomPointInside() {
        // Bounding cube's half side length (since the circle is inside it)
        double halfSide = radius / ROOT_TWO;

        double minX = centre.getX() - halfSide;
        double maxX = centre.getX() + halfSide;
        double minY = centre.getY() - halfSide;
        double maxY = centre.getY() + halfSide;
        double minZ = centre.getZ() - halfSide;
        double maxZ = centre.getZ() + halfSide;

        Vector randomPoint;
        Vector projectedPoint;
        do {
            double x = Randf.random(minX, maxX);
            double y = Randf.random(minY, maxY);
            double z = Randf.random(minZ, maxZ);
            randomPoint = new Vector(x, y, z);

            Vector relativePoint = randomPoint.clone().subtract(centre);

            // Project this point onto the plane of the circle
            double dotProduct = relativePoint.dot(axis);
            projectedPoint = relativePoint.subtract(axis.clone().multiply(dotProduct));

        } while (projectedPoint.lengthSquared() > radius * radius);

        return randomPoint;
    }
}
