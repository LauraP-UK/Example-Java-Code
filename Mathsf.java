package /*Package Path*/;

import lombok.experimental.UtilityClass;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.Validate;

/**
 * Mathsf - Mathematical Functions
 * <br><br>
 * The aim of this class is to create additional, commonly used mathematical functions used in game design.<br>
 * While some of these are simple enough to instead be written in-situ, by lending a method name to them, their purpose is made clear when used amongst other methods and logic.<br>
 * For example;<br>
 * While '(v * (b - a)) + a' is generally easy to understand and write, reading lerp(a, b, v) in a method means you instantly understand linear interpolation is being done here.
 *
 * @author Laura Price
 */
@Slf4j
@UtilityClass
public class Mathsf {

    /**
     * Clamps a value to min or max if the given value is not between or equal to them.
     * <br>
     * Clamped to min if the given value is less than it, clamped to max if the given value is greater than it.
     *
     * @param min   the lower bound the value can be
     * @param max   the upper bound the value can be
     * @param value the value to clamp
     * @return the value clamped between min and max
     */
    public static int clamp(int min, int max, int value) {
        return Math.max(Math.min(value, max), min);
    }

    /**
     * Clamps a value to min or max if the given value is not between or equal to them.
     * <br>
     * Clamped to min if the given value is less than it, clamped to max if the given value is greater than it.
     *
     * @param min   the lower bound the value can be
     * @param max   the upper bound the value can be
     * @param value the value to clamp
     * @return the value clamped between min and max
     */
    public static int clamp(int min, int max, double value) {
        return (int) Math.max(Math.min(value, max), min);
    }

    /**
     * Clamps a value to min or max if the given value is not between or equal to them.
     * <br>
     * Clamped to min if the given value is less than it, clamped to max if the given value is greater than it.
     *
     * @param min   the lower bound the value can be
     * @param max   the upper bound the value can be
     * @param value the value to clamp
     * @return the value clamped between min and max
     */
    public static int clamp(int min, int max, float value) {
        return (int) Math.max(Math.min(value, max), min);
    }

    /**
     * Clamps a value to min or max if the given value is not between or equal to them.
     * <br>
     * Clamped to min if the given value is less than it, clamped to max if the given value is greater than it.
     *
     * @param min   the lower bound the value can be
     * @param max   the upper bound the value can be
     * @param value the value to clamp
     * @return the value clamped between min and max
     */
    public static double clamp(double min, double max, double value) {
        return Math.max(Math.min(value, max), min);
    }

    /**
     * Clamps a value to min or max if the given value is not between or equal to them.
     * <br>
     * Clamped to min if the given value is less than it, clamped to max if the given value is greater than it.
     *
     * @param min   the lower bound the value can be
     * @param max   the upper bound the value can be
     * @param value the value to clamp
     * @return the value clamped between min and max
     */
    public static float clamp(float min, float max, float value) {
        return Math.max(Math.min(value, max), min);
    }

    /**
     * Clamps a value to min or max if the given value is not between or equal to them.
     * <br>
     * Clamped to min if the given value is less than it, clamped to max if the given value is greater than it.
     *
     * @param min   the lower bound the value can be
     * @param max   the upper bound the value can be
     * @param value the value to clamp
     * @return the value clamped between min and max
     */
    public static long clamp(long min, long max, long value) {
        return Math.max(Math.min(value, max), min);
    }

    /**
     * Clamps a value to min or max if the given value is not between or equal to them.
     * <br>
     * Clamped to min if the given value is less than it, clamped to max if the given value is greater than it.
     *
     * @param min   the lower bound the value can be
     * @param max   the upper bound the value can be
     * @param value the value to clamp
     * @return the value clamped between min and max
     */
    public static long clamp(long min, long max, double value) {
        return (long) Math.max(Math.min(value, max), min);
    }

    /**
     * Clamps a value to min or max if the given value is not between or equal to them.
     * <br>
     * Clamped to min if the given value is less than it, clamped to max if the given value is greater than it.
     *
     * @param min   the lower bound the value can be
     * @param max   the upper bound the value can be
     * @param value the value to clamp
     * @return the value clamped between min and max
     */
    public static long clamp(long min, long max, float value) {
        return (long) Math.max(Math.min(value, max), min);
    }


    /**
     * Rounds the given value to a specified number of significant digits.
     * <br>
     * Eg:<br>
     * <i>round(1.23456, 2) results in '1.23'</i><br>
     * <i>round(9.87666, 3) results in '9.877'</i><br>
     *
     * @param value             the value to round
     * @param significantDigits the number of digits after the decimal point
     * @return the value rounded to the given significant digits
     * @throws IllegalArgumentException if the given significant digits is less than 0
     */
    public static double round(double value, int significantDigits) {
        if (significantDigits == 0) return Math.round(value);
        if (significantDigits < 0) throw new IllegalArgumentException("Significant digits must be greater than or equal to 0");
        double pow = Math.pow(10d, significantDigits);
        return (Math.round(pow * value) / pow);
    }

    /**
     * Rounds the given value to a specified number of significant digits.
     * <br>
     * Eg:<br>
     * <i>round(1.23456, 2) results in '1.23'</i><br>
     * <i>round(9.87666, 3) results in '9.877'</i><br>
     *
     * @param value             the value to round
     * @param significantDigits the number of digits after the decimal point
     * @return the value rounded to the given significant digits
     * @throws IllegalArgumentException if the given significant digits is less than 0
     */
    public static float round(float value, int significantDigits) {
        if (significantDigits == 0) return Math.round(value);
        if (significantDigits < 0) throw new IllegalArgumentException("Significant digits must be greater than or equal to 0");
        float pow = ((float) Math.pow(10d, significantDigits));
        return (((float) Math.round(pow * value)) / pow);
    }

    /**
     * Rounds the given value to a specified fraction.
     * <br>
     * Eg:<br>
     * <i>round(1.23456, 2) results in '1.0'</i><br>
     * <i>round(1.61, 2) results in '1.5'</i><br>
     *
     * @param value             the value to round
     * @param fraction the fraction to round to
     * @return the value rounded by the given fraction
     * @throws IllegalArgumentException if the given fraction is equal to zero
     */
    public static double roundToFraction(double value, long fraction) {
        if (fraction == 0) throw new IllegalArgumentException("Fraction must not be 0");
        return (double) Math.round(value * fraction) / fraction;
    }

    /**
     * Rounds the given value to a specified fraction.
     * <br>
     * Eg:<br>
     * <i>round(1.23456, 2) results in '1.0'</i><br>
     * <i>round(1.61, 2) results in '1.5'</i><br>
     *
     * @param value             the value to round
     * @param fraction the fraction to round to
     * @return the value rounded by the given fraction
     * @throws IllegalArgumentException if the given fraction is equal to zero
     */
    public static float roundToFraction(float value, long fraction) {
        if (fraction == 0) throw new IllegalArgumentException("Fraction must not be 0");
        return (float) Math.round(value * fraction) / fraction;
    }

    /**
     * Calculates the value halfway between min and max
     *
     * @param min the smaller of the two values
     * @param max the larger of the two values
     * @return the value halfway between min and max
     */
    public static int mid(int min, int max) {
        return lerp(min, max, 0.5d);
    }

    /**
     * Calculates the value halfway between min and max
     *
     * @param min the smaller of the two values
     * @param max the larger of the two values
     * @return the value halfway between min and max
     */
    public static double mid(double min, double max) {
        return lerp(min, max, 0.5d);
    }

    /**
     * Calculates the value halfway between min and max
     *
     * @param min the smaller of the two values
     * @param max the larger of the two values
     * @return the value halfway between min and max
     */
    public static float mid(float min, float max) {
        return lerp(min, max, 0.5f);
    }

    /**
     * Calculates the value halfway between min and max
     *
     * @param min the smaller of the two values
     * @param max the larger of the two values
     * @return the value halfway between min and max
     */
    public static long mid(long min, long max) {
        return lerp(min, max, 0.5d);
    }

    /**
     * Returns the value closest to 'to' from the given 'values' array.
     *
     * @param to the value to find the closest to
     * @param values an array of values to find the closest to
     * @return the value closest to 'to' from the 'values' array
     * @throws NullPointerException when 'values' array is null
     * @throws IllegalArgumentException when 'values' array is of length 0
     */
    public static int closestTo(int to, int... values) {
        Validate.notNull(values, "The given 'values' array cannot be null!");
        if (values.length == 0) throw new IllegalArgumentException("Values array cannot be empty");
        int closest = values[0];
        for (int value : values) {
            if (Math.abs(value - to) < Math.abs(closest - to)) closest = value;
        }
        return closest;
    }

    /**
     * Returns the value closest to 'to' from the given 'values' array.
     *
     * @param to the value to find the closest to
     * @param values an array of values to find the closest to
     * @return the value closest to 'to' from the 'values' array
     * @throws NullPointerException when 'values' array is null
     * @throws IllegalArgumentException when 'values' array is of length 0
     */
    public static long closestTo(long to, long... values) {
        Validate.notNull(values, "The given 'values' array cannot be null!");
        if (values.length == 0) throw new IllegalArgumentException("Values array cannot be empty");
        long closest = values[0];
        for (long value : values) {
            if (Math.abs(value - to) < Math.abs(closest - to)) closest = value;
        }
        return closest;
    }

    /**
     * Returns the value closest to 'to' from the given 'values' array.
     *
     * @param to the value to find the closest to
     * @param values an array of values to find the closest to
     * @return the value closest to 'to' from the 'values' array
     * @throws NullPointerException when 'values' array is null
     * @throws IllegalArgumentException when 'values' array is of length 0
     */
    public static float closestTo(float to, float... values) {
        Validate.notNull(values, "The given 'values' array cannot be null!");
        if (values.length == 0) throw new IllegalArgumentException("Values array cannot be empty");
        float closest = values[0];
        for (float value : values) {
            if (Math.abs(value - to) < Math.abs(closest - to)) closest = value;
        }
        return closest;
    }

    /**
     * Returns the value closest to 'to' from the given 'values' array.
     *
     * @param to the value to find the closest to
     * @param values an array of values to find the closest to
     * @return the value closest to 'to' from the 'values' array
     * @throws NullPointerException when 'values' array is null
     * @throws IllegalArgumentException when 'values' array is of length 0
     */
    public static double closestTo(double to, double... values) {
        Validate.notNull(values, "The given 'values' array cannot be null!");
        if (values.length == 0) throw new IllegalArgumentException("Values array cannot be empty");
        double closest = values[0];
        for (double value : values) {
            if (Math.abs(value - to) < Math.abs(closest - to)) closest = value;
        }
        return closest;
    }


    /**
     * Performs linear interpolation between start and end by the given ratio, and returns that value.
     * <br>
     * Eg:<br>
     * <i>lerp(0, 10, 0.5) results in '5'</i><br>
     * <i>lerp(50, 100, 0.5) results in '75'</i><br>
     * <i>lerp(20, 40, 0.75) results in '35'</i><br>
     * <i>lerp(20, 40, 2) results in '60'</i>
     *
     * @param start the lower bound of the lerp range
     * @param end   the upper bound of the lerp range
     * @param ratio the ratio between start and end to calculate, 0 = start, 1 = end
     * @return the value linear interpolated between start and end, not clamped to these values
     */
    public static int lerp(int start, int end, double ratio) {
        return (int) ((ratio * (((double) end) - ((double) start))) + ((double) start));
    }

    /**
     * Performs linear interpolation between start and end by the given ratio, and returns that value.
     * <br>
     * Eg:<br>
     * <i>lerp(0, 10, 0.5) results in '5'</i><br>
     * <i>lerp(50, 100, 0.5) results in '75'</i><br>
     * <i>lerp(20, 40, 0.75) results in '35'</i><br>
     * <i>lerp(20, 40, 2) results in '60'</i>
     *
     * @param start the lower bound of the lerp range
     * @param end   the upper bound of the lerp range
     * @param ratio the ratio between start and end to calculate, 0 = 0 = start, 1 = end
     * @return the value linear interpolated between start and end, not clamped to these values
     */
    public static int lerp(int start, int end, float ratio) {
        return (int) ((ratio * (((float) end) - ((float) start))) + ((float) start));
    }

    /**
     * Performs linear interpolation between start and end by the given ratio, and returns that value.
     * <br>
     * Eg:<br>
     * <i>lerp(0, 10, 0.5) results in '5'</i><br>
     * <i>lerp(50, 100, 0.5) results in '75'</i><br>
     * <i>lerp(20, 40, 0.75) results in '35'</i><br>
     * <i>lerp(20, 40, 2) results in '60'</i>
     *
     * @param start the lower bound of the lerp range
     * @param end   the upper bound of the lerp range
     * @param ratio the ratio between start and end to calculate, 0 = start, 1 = end
     * @return the value linear interpolated between start and end, not clamped to these values
     */
    public static double lerp(double start, double end, double ratio) {
        return (ratio * (end - start)) + start;
    }

    /**
     * Performs linear interpolation between start and end by the given ratio, and returns that value.
     * <br>
     * Eg:<br>
     * <i>lerp(0, 10, 0.5) results in '5'</i><br>
     * <i>lerp(50, 100, 0.5) results in '75'</i><br>
     * <i>lerp(20, 40, 0.75) results in '35'</i><br>
     * <i>lerp(20, 40, 2) results in '60'</i>
     *
     * @param start the lower bound of the lerp range
     * @param end   the upper bound of the lerp range
     * @param ratio the ratio between start and end to calculate, 0 = start, 1 = end
     * @return the value linear interpolated between start and end, not clamped to these values
     */
    public static float lerp(float start, float end, float ratio) {
        return (ratio * (end - start)) + start;
    }

    /**
     * Performs linear interpolation between start and end by the given ratio, and returns that value.
     * <br>
     * Eg:<br>
     * <i>lerp(0, 10, 0.5) results in '5'</i><br>
     * <i>lerp(50, 100, 0.5) results in '75'</i><br>
     * <i>lerp(20, 40, 0.75) results in '35'</i><br>
     * <i>lerp(20, 40, 2) results in '60'</i>
     *
     * @param start the lower bound of the lerp range
     * @param end   the upper bound of the lerp range
     * @param ratio the ratio between start and end to calculate, 0 = start, 1 = end
     * @return the value linear interpolated between start and end, not clamped to these values
     */
    public static long lerp(long start, long end, double ratio) {
        return (long) ((ratio * (((double) end) - ((double) start))) + ((double) start));
    }

    /**
     * Performs linear interpolation between start and end by the given ratio, and returns that value.
     * <br>
     * Eg:<br>
     * <i>lerp(0, 10, 0.5) results in '5'</i><br>
     * <i>lerp(50, 100, 0.5) results in '75'</i><br>
     * <i>lerp(20, 40, 0.75) results in '35'</i><br>
     * <i>lerp(20, 40, 2) results in '60'</i>
     *
     * @param start the lower bound of the lerp range
     * @param end   the upper bound of the lerp range
     * @param ratio the ratio between start and end to calculate, 0 = start, 1 = end
     * @return the value linear interpolated between start and end, not clamped to these values
     */
    public static long lerp(long start, long end, float ratio) {
        return (long) ((ratio * (((float) end) - ((float) start))) + ((float) start));
    }


    /**
     * Performs linear interpolation between start and end by the given ratio, and returns that value, but clamped between start and end.
     * <br>
     * Eg:<br>
     * <i>lerpClamped(0, 10, 0.5) results in '5'</i><br>
     * <i>lerpClamped(50, 100, 0.5) results in '75'</i><br>
     * <i>lerpClamped(20, 40, 0.75) results in '35'</i><br>
     * <i>lerpClamped(20, 40, 2) results in '40'</i>
     *
     * @param start the lower bound of the lerp range
     * @param end   the upper bound of the lerp range
     * @param ratio the ratio between start and end to calculate, 0 = start, 1 = end
     * @return the value linear interpolated between start and end, clamped to these values
     */
    public static int lerpClamped(int start, int end, double ratio) {
        return clamp(start, end, lerp(start, end, ratio));
    }

    /**
     * Performs linear interpolation between start and end by the given ratio, and returns that value, but clamped between start and end.
     * <br>
     * Eg:<br>
     * <i>lerpClamped(0, 10, 0.5) results in '5'</i><br>
     * <i>lerpClamped(50, 100, 0.5) results in '75'</i><br>
     * <i>lerpClamped(20, 40, 0.75) results in '35'</i><br>
     * <i>lerpClamped(20, 40, 2) results in '40'</i>
     *
     * @param start the lower bound of the lerp range
     * @param end   the upper bound of the lerp range
     * @param ratio the ratio between start and end to calculate, 0 = start, 1 = end
     * @return the value linear interpolated between start and end, clamped to these values
     */
    public static int lerpClamped(int start, int end, float ratio) {
        return clamp(start, end, lerp(start, end, ratio));
    }

    /**
     * Performs linear interpolation between start and end by the given ratio, and returns that value, but clamped between start and end.
     * <br>
     * Eg:<br>
     * <i>lerpClamped(0, 10, 0.5) results in '5'</i><br>
     * <i>lerpClamped(50, 100, 0.5) results in '75'</i><br>
     * <i>lerpClamped(20, 40, 0.75) results in '35'</i><br>
     * <i>lerpClamped(20, 40, 2) results in '40'</i>
     *
     * @param start the lower bound of the lerp range
     * @param end   the upper bound of the lerp range
     * @param ratio the ratio between start and end to calculate, 0 = start, 1 = end
     * @return the value linear interpolated between start and end, clamped to these values
     */
    public static double lerpClamped(double start, double end, double ratio) {
        return clamp(start, end, lerp(start, end, ratio));
    }

    /**
     * Performs linear interpolation between start and end by the given ratio, and returns that value, but clamped between start and end.
     * <br>
     * Eg:<br>
     * <i>lerpClamped(0, 10, 0.5) results in '5'</i><br>
     * <i>lerpClamped(50, 100, 0.5) results in '75'</i><br>
     * <i>lerpClamped(20, 40, 0.75) results in '35'</i><br>
     * <i>lerpClamped(20, 40, 2) results in '40'</i>
     *
     * @param start the lower bound of the lerp range
     * @param end   the upper bound of the lerp range
     * @param ratio the ratio between start and end to calculate, 0 = start, 1 = end
     * @return the value linear interpolated between start and end, clamped to these values
     */
    public static float lerpClamped(float start, float end, float ratio) {
        return clamp(start, end, lerp(start, end, ratio));
    }

    /**
     * Performs linear interpolation between start and end by the given ratio, and returns that value, but clamped between start and end.
     * <br>
     * Eg:<br>
     * <i>lerpClamped(0, 10, 0.5) results in '5'</i><br>
     * <i>lerpClamped(50, 100, 0.5) results in '75'</i><br>
     * <i>lerpClamped(20, 40, 0.75) results in '35'</i><br>
     * <i>lerpClamped(20, 40, 2) results in '40'</i>
     *
     * @param start the lower bound of the lerp range
     * @param end   the upper bound of the lerp range
     * @param ratio the ratio between start and end to calculate, 0 = start, 1 = end
     * @return the value linear interpolated between start and end, clamped to these values
     */
    public static long lerpClamped(long start, long end, double ratio) {
        return clamp(start, end, lerp(start, end, ratio));
    }

    /**
     * Performs linear interpolation between start and end by the given ratio, and returns that value, but clamped between start and end.
     * <br>
     * Eg:<br>
     * <i>lerpClamped(0, 10, 0.5) results in '5'</i><br>
     * <i>lerpClamped(50, 100, 0.5) results in '75'</i><br>
     * <i>lerpClamped(20, 40, 0.75) results in '35'</i><br>
     * <i>lerpClamped(20, 40, 2) results in '40'</i>
     *
     * @param start the lower bound of the lerp range
     * @param end   the upper bound of the lerp range
     * @param ratio the ratio between start and end to calculate, 0 = start, 1 = end
     * @return the value linear interpolated between start and end, clamped to these values
     */
    public static long lerpClamped(long start, long end, float ratio) {
        return clamp(start, end, lerp(start, end, ratio));
    }


    /**
     * Performs inverse linear interpolation between start and end by the given value, and returns the ratio (0 to 1 unclamped) that value is to those numbers.
     * <br>
     * Eg:<br>
     * <i>iLerp(0, 10, 5) results in '0.5'</i><br>
     * <i>iLerp(50, 100, 75) results in '0.5'</i><br>
     * <i>iLerp(20, 40, 35) results in '0.75'</i><br>
     * <i>iLerp(20, 40, 60) results in '2'</i><br>
     * <p style="color:#FF3333">Will return a value of 0 if the start and end parameters match, as this is undefined mathematics.</p>
     *
     * @param start the lower bound of the inverse lerp range
     * @param end   the upper bound of the inverse lerp range
     * @param value the value relative to start and end to calculate, if value = start return '0', if value = end return '1'
     * @return a ratio (0 to 1 unclamped) representing the relation value is to start and end, or 0 if start and end are the same
     */
    public static double iLerp(int start, int end, int value) {
        if (start == end) {
            log.debug("Mathsf.iLerp() : Start was the same as end, leading to division by zero... Returning 0.  |  start/end: {}  |  value: {}", start, value, new Throwable("Stacktrace"));
            return 0;
        }
        return (double) (value - start) / (double) (end - start);
    }

    /**
     * Performs inverse linear interpolation between start and end by the given value, and returns the ratio (0 to 1 unclamped) that value is to those numbers.
     * <br>
     * Eg:<br>
     * <i>iLerp(0, 10, 5) results in '0.5'</i><br>
     * <i>iLerp(50, 100, 75) results in '0.5'</i><br>
     * <i>iLerp(20, 40, 35) results in '0.75'</i><br>
     * <i>iLerp(20, 40, 60) results in '2'</i><br>
     * <p style="color:#FF3333">Will return a value of 0 if the start and end parameters match, as this is undefined mathematics.</p>
     *
     * @param start the lower bound of the inverse lerp range
     * @param end   the upper bound of the inverse lerp range
     * @param value the value relative to start and end to calculate, if value = start return '0', if value = end return '1'
     * @return a ratio (0 to 1 unclamped) representing the relation value is to start and end, or 0 if start and end are the same
     */
    public static double iLerp(int start, int end, double value) {
        if (start == end) {
            log.debug("Mathsf.iLerp() : Start was the same as end, leading to division by zero... Returning 0.  |  start/end: {}  |  value: {}", start, value, new Throwable("Stacktrace"));
            return 0;
        }
        return (value - start) / (double) (end - start);
    }

    /**
     * Performs inverse linear interpolation between start and end by the given value, and returns the ratio (0 to 1 unclamped) that value is to those numbers.
     * <br>
     * Eg:<br>
     * <i>iLerp(0, 10, 5) results in '0.5'</i><br>
     * <i>iLerp(50, 100, 75) results in '0.5'</i><br>
     * <i>iLerp(20, 40, 35) results in '0.75'</i><br>
     * <i>iLerp(20, 40, 60) results in '2'</i><br>
     * <p style="color:#FF3333">Will return a value of 0 if the start and end parameters match, as this is undefined mathematics.</p>
     *
     * @param start the lower bound of the inverse lerp range
     * @param end   the upper bound of the inverse lerp range
     * @param value the value relative to start and end to calculate, if value = start return '0', if value = end return '1'
     * @return a ratio (0 to 1 unclamped) representing the relation value is to start and end, or 0 if start and end are the same
     */
    public static float iLerp(int start, int end, float value) {
        if (start == end) {
            log.debug("Mathsf.iLerp() : Start was the same as end, leading to division by zero... Returning 0.  |  start/end: {}  |  value: {}", start, value, new Throwable("Stacktrace"));
            return 0;
        }
        return (value - start) / (float) (end - start);
    }

    /**
     * Performs inverse linear interpolation between start and end by the given value, and returns the ratio (0 to 1 unclamped) that value is to those numbers.
     * <br>
     * Eg:<br>
     * <i>iLerp(0, 10, 5) results in '0.5'</i><br>
     * <i>iLerp(50, 100, 75) results in '0.5'</i><br>
     * <i>iLerp(20, 40, 35) results in '0.75'</i><br>
     * <i>iLerp(20, 40, 60) results in '2'</i><br>
     * <p style="color:#FF3333">Will return a value of 0 if the start and end parameters match, as this is undefined mathematics.</p>
     *
     * @param start the lower bound of the inverse lerp range
     * @param end   the upper bound of the inverse lerp range
     * @param value the value relative to start and end to calculate, if value = start return '0', if value = end return '1'
     * @return a ratio (0 to 1 unclamped) representing the relation value is to start and end, or 0 if start and end are the same
     */
    public static double iLerp(double start, double end, double value) {
        if (start == end) {
            log.debug("Mathsf.iLerp() : Start was the same as end, leading to division by zero... Returning 0.  |  start/end: {}  |  value: {}", start, value, new Throwable("Stacktrace"));
            return 0;
        }
        return (value - start) / (end - start);
    }

    /**
     * Performs inverse linear interpolation between start and end by the given value, and returns the ratio (0 to 1 unclamped) that value is to those numbers.
     * <br>
     * Eg:<br>
     * <i>iLerp(0, 10, 5) results in '0.5'</i><br>
     * <i>iLerp(50, 100, 75) results in '0.5'</i><br>
     * <i>iLerp(20, 40, 35) results in '0.75'</i><br>
     * <i>iLerp(20, 40, 60) results in '2'</i><br>
     * <p style="color:#FF3333">Will return a value of 0 if the start and end parameters match, as this is undefined mathematics.</p>
     *
     * @param start the lower bound of the inverse lerp range
     * @param end   the upper bound of the inverse lerp range
     * @param value the value relative to start and end to calculate, if value = start return '0', if value = end return '1'
     * @return a ratio (0 to 1 unclamped) representing the relation value is to start and end, or 0 if start and end are the same
     */
    public static float iLerp(float start, float end, float value) {
        if (start == end) {
            log.debug("Mathsf.iLerp() : Start was the same as end, leading to division by zero... Returning 0.  |  start/end: {}  |  value: {}", start, value, new Throwable("Stacktrace"));
            return 0;
        }
        return (value - start) / (end - start);
    }

    /**
     * Performs inverse linear interpolation between start and end by the given value, and returns the ratio (0 to 1 unclamped) that value is to those numbers.
     * <br>
     * Eg:<br>
     * <i>iLerp(0, 10, 5) results in '0.5'</i><br>
     * <i>iLerp(50, 100, 75) results in '0.5'</i><br>
     * <i>iLerp(20, 40, 35) results in '0.75'</i><br>
     * <i>iLerp(20, 40, 60) results in '2'</i><br>
     * <p style="color:#FF3333">Will return a value of 0 if the start and end parameters match, as this is undefined mathematics.</p>
     *
     * @param start the lower bound of the inverse lerp range
     * @param end   the upper bound of the inverse lerp range
     * @param value the value relative to start and end to calculate, if value = start return '0', if value = end return '1'
     * @return a ratio (0 to 1 unclamped) representing the relation value is to start and end, or 0 if start and end are the same
     */
    public static double iLerp(long start, long end, long value) {
        if (start == end) {
            log.debug("Mathsf.iLerp() : Start was the same as end, leading to division by zero... Returning 0.  |  start/end: {}  |  value: {}", start, value, new Throwable("Stacktrace"));
            return 0;
        }
        return (double) (value - start) / (double) (end - start);
    }

    /**
     * Performs inverse linear interpolation between start and end by the given value, and returns the ratio (0 to 1 unclamped) that value is to those numbers.
     * <br>
     * Eg:<br>
     * <i>iLerp(0, 10, 5) results in '0.5'</i><br>
     * <i>iLerp(50, 100, 75) results in '0.5'</i><br>
     * <i>iLerp(20, 40, 35) results in '0.75'</i><br>
     * <i>iLerp(20, 40, 60) results in '2'</i><br>
     * <p style="color:#FF3333">Will return a value of 0 if the start and end parameters match, as this is undefined mathematics.</p>
     *
     * @param start the lower bound of the inverse lerp range
     * @param end   the upper bound of the inverse lerp range
     * @param value the value relative to start and end to calculate, if value = start return '0', if value = end return '1'
     * @return a ratio (0 to 1 unclamped) representing the relation value is to start and end, or 0 if start and end are the same
     */
    public static double iLerp(long start, long end, double value) {
        if (start == end) {
            log.debug("Mathsf.iLerp() : Start was the same as end, leading to division by zero... Returning 0.  |  start/end: {}  |  value: {}", start, value, new Throwable("Stacktrace"));
            return 0;
        }
        return (value - start) / (double) (end - start);
    }

    /**
     * Performs inverse linear interpolation between start and end by the given value, and returns the ratio (0 to 1 unclamped) that value is to those numbers.
     * <br>
     * Eg:<br>
     * <i>iLerp(0, 10, 5) results in '0.5'</i><br>
     * <i>iLerp(50, 100, 75) results in '0.5'</i><br>
     * <i>iLerp(20, 40, 35) results in '0.75'</i><br>
     * <i>iLerp(20, 40, 60) results in '2'</i><br>
     * <p style="color:#FF3333">Will return a value of 0 if the start and end parameters match, as this is undefined mathematics.</p>
     *
     * @param start the lower bound of the inverse lerp range
     * @param end   the upper bound of the inverse lerp range
     * @param value the value relative to start and end to calculate, if value = start return '0', if value = end return '1'
     * @return a ratio (0 to 1 unclamped) representing the relation value is to start and end, or 0 if start and end are the same
     */
    public static float iLerp(long start, long end, float value) {
        if (start == end) {
            log.debug("Mathsf.iLerp() : Start was the same as end, leading to division by zero... Returning 0.  |  start/end: {}  |  value: {}", start, value, new Throwable("Stacktrace"));
            return 0;
        }
        return (value - start) / (float) (end - start);
    }


    /**
     * Performs inverse linear interpolation between start and end by the given value, and returns the ratio (0 to 1) that value is to those numbers, clamped to 0 and 1.
     * <br>
     * Eg:<br>
     * <i>iLerpClamped(0, 10, 5) results in '0.5'</i><br>
     * <i>iLerpClamped(50, 100, 75) results in '0.5'</i><br>
     * <i>iLerpClamped(20, 40, 35) results in '0.75'</i><br>
     * <i>iLerpClamped(20, 40, 60) results in '1'</i>
     * <p style="color:#FF3333">Will return a value of 0 if the start and end parameters match, as this is undefined mathematics.</p>
     *
     * @param start the lower bound of the inverse lerp range
     * @param end   the upper bound of the inverse lerp range
     * @param value the value relative to start and end to calculate, if value = start return '0', if value = end return '1'
     * @return a ratio (0 to 1) representing the relation value is to start and end
     */
    public static double iLerpClamped(int start, int end, int value) {
        return clamp(0.0d, 1.0d, iLerp(start, end, value));
    }

    /**
     * Performs inverse linear interpolation between start and end by the given value, and returns the ratio (0 to 1) that value is to those numbers, clamped to 0 and 1.
     * <br>
     * Eg:<br>
     * <i>iLerpClamped(0, 10, 5) results in '0.5'</i><br>
     * <i>iLerpClamped(50, 100, 75) results in '0.5'</i><br>
     * <i>iLerpClamped(20, 40, 35) results in '0.75'</i><br>
     * <i>iLerpClamped(20, 40, 60) results in '1'</i>
     * <p style="color:#FF3333">Will return a value of 0 if the start and end parameters match, as this is undefined mathematics.</p>
     *
     * @param start the lower bound of the inverse lerp range
     * @param end   the upper bound of the inverse lerp range
     * @param value the value relative to start and end to calculate, if value = start return '0', if value = end return '1'
     * @return a ratio (0 to 1) representing the relation value is to start and end
     */
    public static double iLerpClamped(int start, int end, double value) {
        return clamp(0.0d, 1.0d, iLerp(start, end, value));
    }

    /**
     * Performs inverse linear interpolation between start and end by the given value, and returns the ratio (0 to 1) that value is to those numbers, clamped to 0 and 1.
     * <br>
     * Eg:<br>
     * <i>iLerpClamped(0, 10, 5) results in '0.5'</i><br>
     * <i>iLerpClamped(50, 100, 75) results in '0.5'</i><br>
     * <i>iLerpClamped(20, 40, 35) results in '0.75'</i><br>
     * <i>iLerpClamped(20, 40, 60) results in '1'</i>
     * <p style="color:#FF3333">Will return a value of 0 if the start and end parameters match, as this is undefined mathematics.</p>
     *
     * @param start the lower bound of the inverse lerp range
     * @param end   the upper bound of the inverse lerp range
     * @param value the value relative to start and end to calculate, if value = start return '0', if value = end return '1'
     * @return a ratio (0 to 1) representing the relation value is to start and end
     */
    public static float iLerpClamped(int start, int end, float value) {
        return clamp(0.0f, 1.0f, iLerp(start, end, value));
    }

    /**
     * Performs inverse linear interpolation between start and end by the given value, and returns the ratio (0 to 1) that value is to those numbers, clamped to 0 and 1.
     * <br>
     * Eg:<br>
     * <i>iLerpClamped(0, 10, 5) results in '0.5'</i><br>
     * <i>iLerpClamped(50, 100, 75) results in '0.5'</i><br>
     * <i>iLerpClamped(20, 40, 35) results in '0.75'</i><br>
     * <i>iLerpClamped(20, 40, 60) results in '1'</i>
     * <p style="color:#FF3333">Will return a value of 0 if the start and end parameters match, as this is undefined mathematics.</p>
     *
     * @param start the lower bound of the inverse lerp range
     * @param end   the upper bound of the inverse lerp range
     * @param value the value relative to start and end to calculate, if value = start return '0', if value = end return '1'
     * @return a ratio (0 to 1) representing the relation value is to start and end
     */
    public static double iLerpClamped(double start, double end, double value) {
        return clamp(0.0d, 1.0d, iLerp(start, end, value));
    }

    /**
     * Performs inverse linear interpolation between start and end by the given value, and returns the ratio (0 to 1) that value is to those numbers, clamped to 0 and 1.
     * <br>
     * Eg:<br>
     * <i>iLerpClamped(0, 10, 5) results in '0.5'</i><br>
     * <i>iLerpClamped(50, 100, 75) results in '0.5'</i><br>
     * <i>iLerpClamped(20, 40, 35) results in '0.75'</i><br>
     * <i>iLerpClamped(20, 40, 60) results in '1'</i>
     * <p style="color:#FF3333">Will return a value of 0 if the start and end parameters match, as this is undefined mathematics.</p>
     *
     * @param start the lower bound of the inverse lerp range
     * @param end   the upper bound of the inverse lerp range
     * @param value the value relative to start and end to calculate, if value = start return '0', if value = end return '1'
     * @return a ratio (0 to 1) representing the relation value is to start and end
     */
    public static float iLerpClamped(float start, float end, float value) {
        return clamp(0.0f, 1.0f, iLerp(start, end, value));
    }

    /**
     * Performs inverse linear interpolation between start and end by the given value, and returns the ratio (0 to 1) that value is to those numbers, clamped to 0 and 1.
     * <br>
     * Eg:<br>
     * <i>iLerpClamped(0, 10, 5) results in '0.5'</i><br>
     * <i>iLerpClamped(50, 100, 75) results in '0.5'</i><br>
     * <i>iLerpClamped(20, 40, 35) results in '0.75'</i><br>
     * <i>iLerpClamped(20, 40, 60) results in '1'</i>
     * <p style="color:#FF3333">Will return a value of 0 if the start and end parameters match, as this is undefined mathematics.</p>
     *
     * @param start the lower bound of the inverse lerp range
     * @param end   the upper bound of the inverse lerp range
     * @param value the value relative to start and end to calculate, if value = start return '0', if value = end return '1'
     * @return a ratio (0 to 1) representing the relation value is to start and end
     */
    public static double iLerpClamped(long start, long end, long value) {
        return clamp(0.0d, 1.0d, iLerp(start, end, value));
    }

    /**
     * Performs inverse linear interpolation between start and end by the given value, and returns the ratio (0 to 1) that value is to those numbers, clamped to 0 and 1.
     * <br>
     * Eg:<br>
     * <i>iLerpClamped(0, 10, 5) results in '0.5'</i><br>
     * <i>iLerpClamped(50, 100, 75) results in '0.5'</i><br>
     * <i>iLerpClamped(20, 40, 35) results in '0.75'</i><br>
     * <i>iLerpClamped(20, 40, 60) results in '1'</i>
     * <p style="color:#FF3333">Will return a value of 0 if the start and end parameters match, as this is undefined mathematics.</p>
     *
     * @param start the lower bound of the inverse lerp range
     * @param end   the upper bound of the inverse lerp range
     * @param value the value relative to start and end to calculate, if value = start return '0', if value = end return '1'
     * @return a ratio (0 to 1) representing the relation value is to start and end
     */
    public static double iLerpClamped(long start, long end, double value) {
        return clamp(0.0d, 1.0d, iLerp(start, end, value));
    }

    /**
     * Performs inverse linear interpolation between start and end by the given value, and returns the ratio (0 to 1) that value is to those numbers, clamped to 0 and 1.
     * <br>
     * Eg:<br>
     * <i>iLerpClamped(0, 10, 5) results in '0.5'</i><br>
     * <i>iLerpClamped(50, 100, 75) results in '0.5'</i><br>
     * <i>iLerpClamped(20, 40, 35) results in '0.75'</i><br>
     * <i>iLerpClamped(20, 40, 60) results in '1'</i>
     * <p style="color:#FF3333">Will return a value of 0 if the start and end parameters match, as this is undefined mathematics.</p>
     *
     * @param start the lower bound of the inverse lerp range
     * @param end   the upper bound of the inverse lerp range
     * @param value the value relative to start and end to calculate, if value = start return '0', if value = end return '1'
     * @return a ratio (0 to 1) representing the relation value is to start and end
     */
    public static float iLerpClamped(long start, long end, float value) {
        return clamp(0.0f, 1.0f, iLerp(start, end, value));
    }


    /**
     * Produces a result relative to 'toMin' and 'toMax', the same as 'value' is relative to 'fromMin' and 'fromMax'
     * <br>
     * Ergo: <i>'value' is to 'fromMin' and 'fromMax', as the result is to 'toMin' and 'toMax'</i>
     * <br>
     * Eg:<br>
     * <i>remap(0, 10, 5, 0, 100) results in '50'</i><br>
     * <i>remap(50, 100, 75, 0, 20) results in '10'</i><br>
     * <i>remap(20, 40, 35, 80, 100) results in '95'</i><br>
     * <i>remap(20, 40, 60, 200, 300) results in '400'</i>
     * <p style="color:#FF3333">Will return 'toMin' if the 'fromMin' and fromMax parameters match, or if the 'toMin' and 'toMax' match, as this is undefined mathematics.</p>
     *
     * @param fromMin the lower bound of the relation to 'value' and 'fromMax'
     * @param fromMax the upper bound of the relation to 'value' and 'fromMin'
     * @param value   the value relative to 'fromMin' and 'fromMax'
     * @param toMin   the lower bound to calculate a result relative to 'value' is to 'fromMin' and fromMax
     * @param toMax   the upper bound to calculate a result relative to 'value' is to 'fromMin' and fromMax
     * @return a value relative to 'toMin' and 'toMax', the same as 'value' is relative to 'fromMin' and 'fromMax'
     */
    public static int remap(int fromMin, int fromMax, int value, int toMin, int toMax) {
        return lerp(toMin, toMax, iLerp(fromMin, fromMax, value));
    }

    /**
     * Produces a result relative to 'toMin' and 'toMax', the same as 'value' is relative to 'fromMin' and 'fromMax'
     * <br>
     * Ergo: <i>'value' is to 'fromMin' and 'fromMax', as the result is to 'toMin' and 'toMax'</i>
     * <br>
     * Eg:<br>
     * <i>remap(0, 10, 5, 0, 100) results in '50'</i><br>
     * <i>remap(50, 100, 75, 0, 20) results in '10'</i><br>
     * <i>remap(20, 40, 35, 80, 100) results in '95'</i><br>
     * <i>remap(20, 40, 60, 200, 300) results in '400'</i>
     * <p style="color:#FF3333">Will return 'toMin' if the 'fromMin' and fromMax parameters match, or if the 'toMin' and 'toMax' match, as this is undefined mathematics.</p>
     *
     * @param fromMin the lower bound of the relation to 'value' and 'fromMax'
     * @param fromMax the upper bound of the relation to 'value' and 'fromMin'
     * @param value   the value relative to 'fromMin' and 'fromMax'
     * @param toMin   the lower bound to calculate a result relative to 'value' is to 'fromMin' and fromMax
     * @param toMax   the upper bound to calculate a result relative to 'value' is to 'fromMin' and fromMax
     * @return a value relative to 'toMin' and 'toMax', the same as 'value' is relative to 'fromMin' and 'fromMax'
     */
    public static double remap(double fromMin, double fromMax, double value, double toMin, double toMax) {
        return lerp(toMin, toMax, iLerp(fromMin, fromMax, value));
    }

    /**
     * Produces a result relative to 'toMin' and 'toMax', the same as 'value' is relative to 'fromMin' and 'fromMax'
     * <br>
     * Ergo: <i>'value' is to 'fromMin' and 'fromMax', as the result is to 'toMin' and 'toMax'</i>
     * <br>
     * Eg:<br>
     * <i>remap(0, 10, 5, 0, 100) results in '50'</i><br>
     * <i>remap(50, 100, 75, 0, 20) results in '10'</i><br>
     * <i>remap(20, 40, 35, 80, 100) results in '95'</i><br>
     * <i>remap(20, 40, 60, 200, 300) results in '400'</i>
     * <p style="color:#FF3333">Will return 'toMin' if the 'fromMin' and fromMax parameters match, or if the 'toMin' and 'toMax' match, as this is undefined mathematics.</p>
     *
     * @param fromMin the lower bound of the relation to 'value' and 'fromMax'
     * @param fromMax the upper bound of the relation to 'value' and 'fromMin'
     * @param value   the value relative to 'fromMin' and 'fromMax'
     * @param toMin   the lower bound to calculate a result relative to 'value' is to 'fromMin' and fromMax
     * @param toMax   the upper bound to calculate a result relative to 'value' is to 'fromMin' and fromMax
     * @return a value relative to 'toMin' and 'toMax', the same as 'value' is relative to 'fromMin' and 'fromMax'
     */
    public static float remap(float fromMin, float fromMax, float value, float toMin, float toMax) {
        return lerp(toMin, toMax, iLerp(fromMin, fromMax, value));
    }

    /**
     * Produces a result relative to 'toMin' and 'toMax', the same as 'value' is relative to 'fromMin' and 'fromMax'
     * <br>
     * Ergo: <i>'value' is to 'fromMin' and 'fromMax', as the result is to 'toMin' and 'toMax'</i>
     * <br>
     * Eg:<br>
     * <i>remap(0, 10, 5, 0, 100) results in '50'</i><br>
     * <i>remap(50, 100, 75, 0, 20) results in '10'</i><br>
     * <i>remap(20, 40, 35, 80, 100) results in '95'</i><br>
     * <i>remap(20, 40, 60, 200, 300) results in '400'</i>
     * <p style="color:#FF3333">Will return 'toMin' if the 'fromMin' and fromMax parameters match, or if the 'toMin' and 'toMax' match, as this is undefined mathematics.</p>
     *
     * @param fromMin the lower bound of the relation to 'value' and 'fromMax'
     * @param fromMax the upper bound of the relation to 'value' and 'fromMin'
     * @param value   the value relative to 'fromMin' and 'fromMax'
     * @param toMin   the lower bound to calculate a result relative to 'value' is to 'fromMin' and fromMax
     * @param toMax   the upper bound to calculate a result relative to 'value' is to 'fromMin' and fromMax
     * @return a value relative to 'toMin' and 'toMax', the same as 'value' is relative to 'fromMin' and 'fromMax'
     */
    public static long remap(long fromMin, long fromMax, long value, long toMin, long toMax) {
        return lerp(toMin, toMax, iLerp(fromMin, fromMax, value));
    }

    /**
     * Returns the highest value out of an array of values.
     *
     * @param values an array of values to get the highest value from
     * @return the highest value out of the given array
     */
    public static long max(long... values) {
        if (values == null || values.length == 0) {
            log.debug("Mathsf.max() : No values given. Returning 0...");
            return 0;
        }
        if (values.length == 1) {
            log.debug("Mathsf.max() : Only one value given. Returning that value...");
            return values[0];
        }
        if (values.length == 2) return Math.max(values[0], values[1]);
        long max = values[0];
        for (int i = 1; i < values.length; i++) max = Math.max(max, values[i]);
        return max;
    }

    /**
     * Returns the highest value out of an array of values.
     *
     * @param values an array of values to get the highest value from
     * @return the highest value out of the given array
     */
    public static int max(int... values) {
        if (values == null || values.length == 0) {
            log.debug("Mathsf.max() : No values given. Returning 0...");
            return 0;
        }
        if (values.length == 1) {
            log.debug("Mathsf.max() : Only one value given. Returning that value...");
            return values[0];
        }
        if (values.length == 2) return Math.max(values[0], values[1]);
        int max = values[0];
        for (int i = 1; i < values.length; i++) max = Math.max(max, values[i]);
        return max;
    }
    /**
     * Returns the highest value out of an array of values.
     *
     * @param values an array of values to get the highest value from
     * @return the highest value out of the given array
     */

    public static float max(float... values) {
        if (values == null || values.length == 0) {
            log.debug("Mathsf.max() : No values given. Returning 0...");
            return 0;
        }
        if (values.length == 1) {
            log.debug("Mathsf.max() : Only one value given. Returning that value...");
            return values[0];
        }
        if (values.length == 2) return Math.max(values[0], values[1]);
        float max = values[0];
        for (int i = 1; i < values.length; i++) max = Math.max(max, values[i]);
        return max;
    }

    /**
     * Returns the highest value out of an array of values.
     *
     * @param values an array of values to get the highest value from
     * @return the highest value out of the given array
     */
    public static double max(double... values) {
        if (values == null || values.length == 0) {
            log.debug("Mathsf.max() : No values given. Returning 0...");
            return 0;
        }
        if (values.length == 1) {
            log.debug("Mathsf.max() : Only one value given. Returning that value...");
            return values[0];
        }
        if (values.length == 2) return Math.max(values[0], values[1]);
        double max = values[0];
        for (int i = 1; i < values.length; i++) max = Math.max(max, values[i]);
        return max;
    }

    /**
     * Returns the smallest value out of an array of values.
     *
     * @param values an array of values to get the smallest value from
     * @return the smallest value out of the given array
     */
    public static long min(long... values) {
        if (values == null || values.length == 0) {
            log.debug("Mathsf.min() : No values given. Returning 0...");
            return 0;
        }
        if (values.length == 1) {
            log.debug("Mathsf.min() : Only one value given. Returning that value...");
            return values[0];
        }
        if (values.length == 2) return Math.min(values[0], values[1]);
        long min = values[0];
        for (int i = 1; i < values.length; i++) min = Math.min(min, values[i]);
        return min;
    }

    /**
     * Returns the smallest value out of an array of values.
     *
     * @param values an array of values to get the smallest value from
     * @return the smallest value out of the given array
     */
    public static int min(int... values) {
        if (values == null || values.length == 0) {
            log.debug("Mathsf.min() : No values given. Returning 0...");
            return 0;
        }
        if (values.length == 1) {
            log.debug("Mathsf.min() : Only one value given. Returning that value...");
            return values[0];
        }
        if (values.length == 2) return Math.min(values[0], values[1]);
        int min = values[0];
        for (int i = 1; i < values.length; i++) min = Math.min(min, values[i]);
        return min;
    }
    /**
     * Returns the smallest value out of an array of values.
     *
     * @param values an array of values to get the smallest value from
     * @return the smallest value out of the given array
     */

    public static float min(float... values) {
        if (values == null || values.length == 0) {
            log.debug("Mathsf.min() : No values given. Returning 0...");
            return 0;
        }
        if (values.length == 1) {
            log.debug("Mathsf.min() : Only one value given. Returning that value...");
            return values[0];
        }
        if (values.length == 2) return Math.min(values[0], values[1]);
        float min = values[0];
        for (int i = 1; i < values.length; i++) min = Math.min(min, values[i]);
        return min;
    }

    /**
     * Returns the smallest value out of an array of values.
     *
     * @param values an array of values to get the smallest value from
     * @return the smallest value out of the given array
     */
    public static double min(double... values) {
        if (values == null || values.length == 0) {
            log.debug("Mathsf.min() : No values given. Returning 0...");
            return 0;
        }
        if (values.length == 1) {
            log.debug("Mathsf.min() : Only one value given. Returning that value...");
            return values[0];
        }
        if (values.length == 2) return Math.min(values[0], values[1]);
        double min = values[0];
        for (int i = 1; i < values.length; i++) min = Math.min(min, values[i]);
        return min;
    }

    /**
     * Calculates the shortest angle distance (-180 to 180) between 'angleA' and 'angleB'.<br>
     * Angles can be provided in any order.
     * <br><br>
     * Clockwise = 0 to 180<br>
     * Anti-clockwise = <0 to -180
     *
     * @param angleA the angle to calculate from
     * @param angleB the angle to calculate to
     * @return the shortest angle between 'angleA' and 'angleB'
     */
    public static double deltaAngle(double angleA, double angleB) {
        double deltaAngle = (angleB - angleA) % 360.0d; // Calculate raw delta between angles
		if (deltaAngle > 180.0d)  deltaAngle -= 360.0d;
		else if (deltaAngle <= -180.0d)  deltaAngle += 360.0d;
		return deltaAngle;
    }

    /**
     * Calculates the shortest angle distance (-180 to 180) between 'angleA' and 'angleB'.<br>
     * Angles can be provided in any order.
     * <br><br>
     * Clockwise = 0 to 180<br>
     * Anti-clockwise = <0 to -180
     *
     * @param angleA the angle to calculate from
     * @param angleB the angle to calculate to
     * @return the shortest angle between 'angleA' and 'angleB'
     */
    public static float deltaAngle(float angleA, float angleB) {
        float deltaAngle = (angleB - angleA) % 360.0f; // Calculate raw delta between angles
		if (deltaAngle > 180.0f)  deltaAngle -= 360.0f;
		else if (deltaAngle <= -180.0f)  deltaAngle += 360.0f;
		return deltaAngle;
    }

    /**
     * Calculates the angle from an origin point to a given point.
     *
     * @param originX the X coordinate of the origin
     * @param originY the Y coordinate of the origin
     * @param toX the X coordinate of the given point
     * @param toY the Y coordinate of the given point
     * @return the angle between the origin and the given point
     */
    public static double angleTo(double originX, double originY, double toX, double toY) {
        return Math.toDegrees(Math.atan2(toX - originX, toY - originY));
    }


    /**
     * Calculate a quadratic equation.
     * <br>
     * <i>(a * (x^i)) + (b * x) + c</i>
     *
     * @return the value of the equation
     */
    public static int quadratic(int a, int b, int c, int i, int x) {
        return (a * ((int) Math.pow(x, i))) + (b * x) + c;
    }

    /**
     * Calculate a quadratic equation.
     * <br>
     * <i>(a * (x^i)) + (b * x) + c</i>
     *
     * @return the value of the equation
     */
    public static double quadratic(double a, double b, double c, double i, double x) {
        return (a * Math.pow(x, i)) + (b * x) + c;
    }

    /**
     * Calculate a quadratic equation.
     * <br>
     * <i>(a * (x^i)) + (b * x) + c</i>
     *
     * @return the value of the equation
     */
    public static float quadratic(float a, float b, float c, float i, float x) {
        return (a * ((float) Math.pow(x, i))) + (b * x) + c;
    }

    /**
     * Calculate a quadratic equation.
     * <br>
     * <i>(a * (x^i)) + (b * x) + c</i>
     *
     * @return the value of the equation
     */
    public static long quadratic(long a, long b, long c, long i, long x) {
        return (a * ((long) Math.pow(x, i))) + (b * x) + c;
    }


    /**
     * Calculate a normalised to the origin quadratic equation
     * <br>
     * <i>(1 * (x^i)) + (0 * x) + 0</i><br>
     * <br>
     * <i>Yes, this is basically Math.pow(x, i).</i>
     *
     * @return the value of the equation
     */
    public static int quadratic(int i, int x) {
        return quadratic(1, 0, 0, i, x);
    }

    /**
     * Calculate a normalised to the origin quadratic equation
     * <br>
     * <i>(1 * (x^i)) + (0 * x) + 0</i><br>
     * <br>
     * <i>Yes, this is basically Math.pow(x, i).</i>
     *
     * @return the value of the equation
     */
    public static double quadratic(double i, double x) {
        return quadratic(1.0d, 0.0d, 0.0d, i, x);
    }

    /**
     * Calculate a normalised to the origin quadratic equation
     * <br>
     * <i>(1 * (x^i)) + (0 * x) + 0</i><br>
     * <br>
     * <i>Yes, this is basically Math.pow(x, i).</i>
     *
     * @return the value of the equation
     */
    public static float quadratic(float i, float x) {
        return quadratic(1.0f, 0.0f, 0.0f, i, x);
    }

    /**
     * Calculate a normalised to the origin quadratic equation
     * <br>
     * <i>(1 * (x^i)) + (0 * x) + 0</i><br>
     * <br>
     * <i>Yes, this is basically Math.pow(x, i).</i>
     *
     * @return the value of the equation
     */
    public static long quadratic(long i, long x) {
        return quadratic(1L, 0L, 0L, i, x);
    }


    /**
     * Calculate the sign of the given value
     *
     * @param value the value to calculate the sign of
     * @return 1 if value >= 0, otherwise -1
     */
    public static int sign(int value) {
        return value >= 0 ? 1 : -1;
    }

    /**
     * Calculate the sign of the given value
     *
     * @param value the value to calculate the sign of
     * @return 1 if value >= 0, otherwise -1
     */
    public static int sign(double value) {
        return value >= 0.0d ? 1 : -1;
    }

    /**
     * Calculate the sign of the given value
     *
     * @param value the value to calculate the sign of
     * @return 1 if value >= 0, otherwise -1
     */
    public static int sign(float value) {
        return value >= 0.0f ? 1 : -1;
    }

    /**
     * Calculate the sign of the given value
     *
     * @param value the value to calculate the sign of
     * @return 1 if value >= 0, otherwise -1
     */
    public static int sign(long value) {
        return value >= 0L ? 1 : -1;
    }


    /**
     * Calculate the inverted sign of the given value
     *
     * @param value the value to calculate the sign of
     * @return -1 if value >= 0, otherwise 1
     */
    public static int iSign(int value) {
        return value >= 0 ? -1 : 1;
    }

    /**
     * Calculate the inverted sign of the given value
     *
     * @param value the value to calculate the sign of
     * @return -1 if value >= 0, otherwise 1
     */
    public static int iSign(double value) {
        return value >= 0.0d ? -1 : 1;
    }

    /**
     * Calculate the inverted sign of the given value
     *
     * @param value the value to calculate the sign of
     * @return -1 if value >= 0, otherwise 1
     */
    public static int iSign(float value) {
        return value >= 0.0f ? -1 : 1;
    }

    /**
     * Calculate the inverted sign of the given value
     *
     * @param value the value to calculate the sign of
     * @return -1 if value >= 0, otherwise 1
     */
    public static int iSign(long value) {
        return value >= 0L ? -1 : 1;
    }

    /**
     * Calculate the percentage of the given value 'of'.
     *
     * @param percent the percentage to calculate
     * @param of      the value to calculate the percentage of
     * @return the percentage of the given value
     */
    public static float percentOf(float percent, float of) {
        return (percent / 100.0f) * of;
    }

    /**
     * Calculate the percentage of the given value 'of'.
     *
     * @param percent the percentage to calculate
     * @param of      the value to calculate the percentage of
     * @return the percentage of the given value
     */
    public static double percentOf(double percent, double of) {
        return (percent / 100.0d) * of;
    }
	
	/**
	 * Calculate the percentage increase from the original to the new number.
	 *
	 * @param original The original value before increase.
	 * @param newNumber The new value after increase.
	 * @return The percentage increase from original to new number.
	 */
	public static double percentIncrease(double original, double newNumber) {
		return ((newNumber - original) / original) * 100.0;
	}
	
	/**
	 * Calculate the percentage decrease from the original to the new number.
	 *
	 * @param original The original value before decrease.
	 * @param newNumber The new value after decrease.
	 * @return The percentage decrease from original to new number.
	 */
	public static double percentDecrease(double original, double newNumber) {
		return ((original - newNumber) / original) * 100.0;
	}
	
	/**
	 * Calculate the percentage difference between two numbers.
	 * The result is always positive and represents the absolute percentage change.
	 *
	 * @param original The original value.
	 * @param newNumber The new value to compare against the original.
	 * @return The absolute percentage difference between the original and new value.
	 */
	public static double percentDifference(double original, double newNumber) {
		if (original == 0) throw new IllegalArgumentException("Original value must not be 0.");
		return Math.abs((newNumber - original) / original) * 100.0d;
	}
	
	/**
	 * Calculate the original number before a percentage increase was applied.
	 *
	 * @param finalAmount The amount after the percentage increase.
	 * @param percentIncrease The percentage increase that was applied.
	 * @return The original amount before the percentage increase.
	 */
	public static double originalFromPercentIncrease(double finalAmount, double percentIncrease) {
		return finalAmount / (1 + percentIncrease / 100.0);
	}
	
	/**
	 * Calculate the original number before a percentage decrease was applied.
	 *
	 * @param finalAmount The amount after the percentage decrease.
	 * @param percentDecrease The percentage decrease that was applied.
	 * @return The original amount before the percentage decrease.
	 */
	public static double originalFromPercentDecrease(double finalAmount, double percentDecrease) {
		return finalAmount / (1 - percentDecrease / 100.0);
	}
	
	/**
	 * Calculate the original number before a percentage change was applied.
	 *
	 * @param finalAmount The amount after the percentage change.
	 * @param percentChange The percentage change that was applied, can be positive (increase) or negative (decrease).
	 * @return The original amount before the percentage change.
	 */
	public static double originalFromPercentChange(double finalAmount, double percentChange) {
		return percentChange >= 0 ?
			originalFromPercentIncrease(finalAmount, percentChange) :
			originalFromPercentDecrease(finalAmount, percentChange);
	}
}
