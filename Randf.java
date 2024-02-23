package /*Package Path*/;

import lombok.experimental.UtilityClass;
import org.apache.commons.lang3.tuple.Pair;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Randf - Random Functions
 * <br><br>
 * Contains functions for generating and managing random numbers, and selecting / shuffling random elements from collections, sets, and maps.<br>
 * While some of these are simple enough to instead be written in-situ, by lending a method name to them, their purpose is made clear when used amongst other methods and logic.
 *
 * @author Laura Price
 */
@UtilityClass
public class Randf {

    /**
     * Returns a value which is randomly selected between 'MIN' and 'MAX', with a bias to either
     * smaller or larger numbers.
     * The 'BIAS' argument is generally between 0.0 and 2.0, and will favour larger numbers when <1 and smaller numbers when >1.
     * <p> 'MAX' is inclusive for Ints and Longs, exclusive for Doubles and Floats
     *
     * @param min  the minimum of the range (inclusive)
     * @param max  the maximum of the range (exclusive)
     * @param bias the bias to favour smaller or larger numbers (>1 = Smaller, <1 = Larger)
     * @return A randomly selected value between min and max
     */
    public static double randomBias(double min, double max, double bias) {
        return (max - min) * Math.pow(Math.random(), bias) + min;
    }

    /**
     * Returns a value which is randomly selected between 'MIN' and 'MAX', with a bias to either
     * smaller or larger numbers.
     * The 'BIAS' argument is generally between 0.0 and 2.0, and will favour larger numbers when <1 and smaller numbers when >1.
     * <p> 'MAX' is inclusive for Ints and Longs, exclusive for Doubles and Floats
     *
     * @param min  the minimum of the range (inclusive)
     * @param max  the maximum of the range (exclusive)
     * @param bias the bias to favour smaller or larger numbers (>1 = Smaller, <1 = Larger)
     * @return A randomly selected value between min and max
     */
    public static float randomBias(float min, float max, float bias) {
        return (max - min) * ((float) Math.pow(((float) Math.random()), bias)) + min;
    }

    /**
     * Returns a value which is randomly selected between 'MIN' and 'MAX', with a bias to either
     * smaller or larger numbers.
     * The 'BIAS' argument is generally between 0.0 and 2.0, and will favour larger numbers when <1 and smaller numbers when >1.
     * <p> 'MAX' is inclusive for Ints and Longs, exclusive for Doubles and Floats
     *
     * @param min  the minimum of the range (inclusive)
     * @param max  the maximum of the range (inclusive)
     * @param bias the bias to favour smaller or larger numbers (>1 = Smaller, <1 = Larger)
     * @return A randomly selected value between min and max
     */
    public static int randomBias(int min, int max, double bias) {
        return (int) Math.floor((max + 1 - min) * Math.pow(Math.random(), bias) + min);
    }

    /**
     * Returns a value which is randomly selected between 'MIN' and 'MAX', with a bias to either
     * smaller or larger numbers.
     * The 'BIAS' argument is generally between 0.0 and 2.0, and will favour larger numbers when <1 and smaller numbers when >1.
     * <p> 'MAX' is inclusive for Ints and Longs, exclusive for Doubles and Floats
     *
     * @param min  the minimum of the range (inclusive)
     * @param max  the maximum of the range (inclusive)
     * @param bias the bias to favour smaller or larger numbers (>1 = Smaller, <1 = Larger)
     * @return A randomly selected value between min and max
     */
    public static long randomBias(long min, long max, double bias) {
        return (long) Math.floor((max + 1L - min) * Math.pow(Math.random(), bias) + min);
    }

    /**
     * Returns a value which is randomly selected between 'MIN' and 'MAX', with a bias to either
     * smaller or larger numbers.
     * The 'BIAS' argument is generally between 0.0 and 2.0, and will favour larger numbers when <1 and smaller numbers when >1.
     * <p> 'MAX' is inclusive for Ints and Longs, exclusive for Doubles and Floats
     *
     * @param min  the minimum of the range (inclusive)
     * @param max  the maximum of the range (inclusive)
     * @param bias the bias to favour smaller or larger numbers (>1 = Smaller, <1 = Larger)
     * @return A randomly selected value between min and max
     */
    public static int randomBias(int min, int max, float bias) {
        return (int) Math.floor((max + 1 - min) * Math.pow(Math.random(), bias) + min);
    }

    /**
     * Returns a value which is randomly selected between 'MIN' and 'MAX', with a bias to either
     * smaller or larger numbers.
     * The 'BIAS' argument is generally between 0.0 and 2.0, and will favour larger numbers when <1 and smaller numbers when >1.
     * <p> 'MAX' is inclusive for Ints and Longs, exclusive for Doubles and Floats
     *
     * @param min  the minimum of the range (inclusive)
     * @param max  the maximum of the range (inclusive)
     * @param bias the bias to favour smaller or larger numbers (>1 = Smaller, <1 = Larger)
     * @return A randomly selected value between min and max
     */
    public static long randomBias(long min, long max, float bias) {
        return (long) Math.floor((max + 1L - min) * Math.pow(Math.random(), bias) + min);
    }


    /**
     * Returns a value which is randomly selected between 'MIN' and 'MAX'.
     * <p> 'MAX' is inclusive for Ints and Longs, exclusive for Doubles and Floats
     *
     * @param min the minimum of the range (inclusive)
     * @param max the maximum of the range (exclusive)
     * @return A randomly selected value between min and max
     */
    public static double random(double min, double max) {
        return randomBias(min, max, 1.0d);
    }

    /**
     * Returns a value which is randomly selected between 'MIN' and 'MAX'.
     * <p> 'MAX' is inclusive for Ints and Longs, exclusive for Doubles and Floats
     *
     * @param min the minimum of the range (inclusive)
     * @param max the maximum of the range (exclusive)
     * @return A randomly selected value between min and max
     */
    public static float random(float min, float max) {
        return randomBias(min, max, 1.0f);
    }

    /**
     * Returns a value which is randomly selected between 'MIN' and 'MAX'.
     * <p> 'MAX' is inclusive for Ints and Longs, exclusive for Doubles and Floats
     *
     * @param min the minimum of the range (inclusive)
     * @param max the maximum of the range (inclusive)
     * @return A randomly selected value between min and max
     */
    public static int random(int min, int max) {
        return randomBias(min, max, 1.0d);
    }

    /**
     * Returns a value which is randomly selected between 'MIN' and 'MAX'.
     * <p> 'MAX' is inclusive for Ints and Longs, exclusive for Doubles and Floats
     *
     * @param min the minimum of the range (inclusive)
     * @param max the maximum of the range (inclusive)
     * @return A randomly selected value between min and max
     */
    public static long random(long min, long max) {
        return randomBias(min, max, 1.0d);
    }


    /**
     * Returns TRUE if a simulated dice roll of a die with 'IN' number of sides was less than or equal to the given 'CHANCE'.
     * <p>
     * If a random number between 1 and 'IN' is less than or equal to 'CHANCE', then return TRUE, otherwise FALSE.
     *
     * @param in     the number of sides to the die (inclusive)
     * @param chance the value the chosen dice face has to be smaller than or equal to
     * @return TRUE if passed, otherwise FALSE
     */
    public static boolean randomChanceIn(double chance, double in) {
        return random(1.0d, Math.abs(in)) <= Math.abs(chance);
    }

    /**
     * Returns TRUE if a simulated dice roll of a die with 'IN' number of sides was less than or equal to the given 'CHANCE'.
     * <p>
     * If a random number between 1 and 'IN' is less than or equal to 'CHANCE', then return TRUE, otherwise FALSE.
     *
     * @param in     the number of sides to the die (inclusive)
     * @param chance the value the chosen dice face has to be smaller than or equal to
     * @return TRUE if passed, otherwise FALSE
     */
    public static boolean randomChanceIn(float chance, float in) {
        return random(1.0f, Math.abs(in)) <= Math.abs(chance);
    }

    /**
     * Returns TRUE if a simulated dice roll of a die with 'IN' number of sides was less than or equal to the given 'CHANCE'.
     * <p>
     * If a random number between 1 and 'IN' is less than or equal to 'CHANCE', then return TRUE, otherwise FALSE.
     *
     * @param in     the number of sides to the die (inclusive)
     * @param chance the value the chosen dice face has to be smaller than or equal to
     * @return TRUE if passed, otherwise FALSE
     */
    public static boolean randomChanceIn(int chance, int in) {
        return random(1, Math.abs(in)) <= Math.abs(chance);
    }

    /**
     * Returns TRUE if a simulated dice roll of a die with 'IN' number of sides was less than or equal to the given 'CHANCE'.
     * <p>
     * If a random number between 1 and 'IN' is less than or equal to 'CHANCE', then return TRUE, otherwise FALSE.
     *
     * @param in     the number of sides to the die (inclusive)
     * @param chance the value the chosen dice face has to be smaller than or equal to
     * @return TRUE if passed, otherwise FALSE
     */
    public static boolean randomChanceIn(long chance, long in) {
        return random(1L, Math.abs(in)) <= Math.abs(chance);
    }


    /**
     * Flips a coin for an even split, 50/50 chance of returning TRUE or FALSE
     *
     * @return An even chance of being TRUE or FALSE
     */
    public static boolean random() {
        return random(0, 1) == 0;
    }


    /**
     * Picks an element from an array at random and returns that element.
     *
     * @param array the Array to pick a random element from
     * @return a randomly selected element from 'array'
     */
    @SafeVarargs
    public static <T> T random(T... array) {
        if (array == null || array.length == 0) return null;
        if (array.length == 1) return array[0];
        return array[random(0, array.length - 1)];
    }


    /**
     * Picks an element from a Collection at random and returns that element.
     *
     * @param collection the Collection to pick a random element from
     * @return a randomly selected element from 'collection'
     */
    public static <T> T random(Collection<T> collection) {
        if (collection == null || collection.isEmpty()) return null;
        if (collection.size() == 1) return collection.iterator().next();
        return (collection instanceof List ? ((List<T>) collection) : new ArrayList<>(collection)).get(random(0, Math.max(0, collection.size() - 1)));
    }

    /**
     * Picks an entry from a Map at random and returns that element.
     *
     * @param map the Map to pick a random element from
     * @return a randomly selected entry from 'map'
     */
    public static <K, V> Map.Entry<K, V> random(Map<K, V> map) {
        if (map == null || map.isEmpty()) return null;
        if (map.size() == 1) return map.entrySet().iterator().next();
        return random(map.entrySet());
    }


    /**
     * Picks an entry from a Set at random, removes it from a copy of the Set,
     * and returns a Pair of the selected entry as the key, and the copied Set as the value.
     *
     * @param set the Set to pick a random entry from
     * @return a Pair of a randomly selected entry, and a copy of the original Set without the entry
     */
    public static <T> Pair<T, Set<T>> randomAndRemove(Set<T> set) {
        if (set == null || set.isEmpty()) return null;
        T element = random(set);
        if (element == null) return null;
        Set<T> setCopy = new HashSet<>(set);
        setCopy.remove(element);
        return Pair.of(element, setCopy);
    }

    /**
     * Picks an entry from a Map at random, removes it from a copy of the Map,
     * and returns a Pair of the selected entry as the key, and the copied Map (less the entry) as the value.
     *
     * @param map the Map to pick a random entry from
     * @return a Pair of a randomly selected entry, and a copy of the original Map without the entry
     */
    public static <K, V> Pair<Map.Entry<K, V>, Map<K, V>> randomAndRemove(Map<K, V> map) {
        if (map == null || map.isEmpty()) return null;
        Map.Entry<K, V> element = random(map);
        if (element == null) return null;
        Map<K, V> mapCopy = new HashMap<>(map);
        mapCopy.remove(element.getKey());
        return Pair.of(element, mapCopy);
    }

    /**
     * Picks an element from a Collection at random, removes it from a copy of the Collection,
     * and returns a Pair of the selected element as the key, and the copied Collection (less the entry) as the value.
     *
     * @param collection the Collection to pick a random element from
     * @return a Pair of a randomly selected element, and a copy of the original Collection without the element
     */
    public static <T> Pair<T, List<T>> randomAndRemove(List<T> collection) {
        if (collection == null || collection.isEmpty()) return null;
        T element = random(collection);
        if (element == null) return null;
        ArrayList<T> copy = new ArrayList<>(collection);
        copy.remove(element);
        return Pair.of(element, copy);
    }


    /**
     * Creates a subset of a given Map of length 'LENGTH', comprised of randomly selected elements of the original Map.
     * <p>
     * Does not generate duplicate elements, therefore 'LENGTH' will be capped at the size of the original Map.
     *
     * @param map   the Map to pick random elements from
     * @param length the number of elements to select
     * @return a subset of random elements from the original Map
     */
    public static <K, V> Map<K, V> randomSubSet(Map<K, V> map, int length) {
        if (map == null || map.isEmpty() || length >= map.size()) return map;
        return randomSubSet(map.entrySet(), length).stream().collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }


    /**
     * Creates a subset of a given Set of length 'LENGTH', comprised of randomly selected elements of the original Set.
     * <p>
     * Does not generate duplicate elements, therefore 'LENGTH' will be capped at the size of the original Set.
     *
     * @param set   the Set to pick random elements from
     * @param length the number of elements to select
     * @return a subset of random elements from the original Set
     */
    public static <T> Set<T> randomSubSet(Set<T> set, int length) {
        if (set == null || set.isEmpty() || length >= set.size()) return set;
        return new HashSet<>(((List<T>) copyAndShuffleList(set)).subList(0, Math.min(length, set.size() - 1)));
    }


    /**
     * Creates a sublist of a given List of length 'LENGTH', comprised of randomly selected elements of the original List.
     * <p>
     * Does not generate duplicate elements, therefore 'LENGTH' will be capped at the size of the original List.
     *
     * @param list   the List to pick random elements from
     * @param length the number of elements to select
     * @return a sublist of random elements from the original List
     */
    public static <T> List<T> randomSubList(List<T> list, int length) {
        if (list == null || list.isEmpty()) return list;
        if (length >= list.size()) return (List<T>) copyAndShuffleList(list);
        return ((List<T>) copyAndShuffleList(list)).subList(0, length);
    }


    /**
     * Creates a copy of a given List and shuffles it.
     *
     * @param collection the List to copy and shuffle
     * @return a shuffled copy of the original List
     */
    public static <T> Collection<T> copyAndShuffleList(Collection<T> collection) {
        if (collection == null || collection.isEmpty()) return collection;
        List<T> returnList = new ArrayList<>(collection);
        Collections.shuffle(returnList);
        return returnList;
    }
}
