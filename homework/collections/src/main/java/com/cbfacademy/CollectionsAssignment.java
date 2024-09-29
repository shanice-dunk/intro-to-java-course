package com.cbfacademy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.HashMap;
import java.util.Map;

public class CollectionsAssignment {

    /**
     * This method removes all values from the provided list that are smaller
     * than the indicated integer. The remaining elements retain their original
     * ordering.
     *
     * @param list   - the list of integers
     * @param minValue the minimum value to retain
     */
    public static void removeSmallInts(List<Integer> list, int minValue) {
        // Your solution must traverse the list from last to first element
        // removing any values less than minValue.
        // Start from last index and iterate to first
        for (int i = list.size() - 1; i >= 0; i--) {
            // Remove element if smaller than minValue
            if (list.get(i) < minValue) {
                list.remove(i);
            }
        }
    }

    /**
     * This method returns true if the provided collection contains any
     * duplicate elements.
     *
     * @param integers - a collection of integers
     * @return true if integers contains duplicates, false otherwise
     */
    public static boolean containsDuplicates(Collection<Integer> integers) {
        // Your solution must not use any loops.
        // HashSet to store unique elements
        Set<Integer> uniqueSet = new HashSet<>(integers);

        // If size of the set is smaller than original collection = duplicates
        return uniqueSet.size() < integers.size();

        // return false;

        // Used HashSet as it automatically handles duplicate elements
    }

    /**
     * This method returns an ArrayList containing all elements that appear in
     * either of the two collection arguments. There will be no duplicate values
     * in the resulting ArrayList. The values in the returned ArrayList must be
     * in sorted order.
     * <p>
     * For example, if the two arguments contain {2, 1, 2, 3} and {3, 4, 4, 5},
     * the returned ArrayList will contain {1, 2, 3, 4, 5}. The original
     * collections will not be modified.
     *
     * @param ints1 - the first collection
     * @param ints2 - the second collection
     * @return A sorted ArrayList containing the integers that appear in either
     * collection.
     */
    public static ArrayList<Integer> inEither(Collection<Integer> ints1, Collection<Integer> ints2) {
        // This must be done with no loops.

        // Use TreeSet to automatically sort and remove duplicates
        TreeSet<Integer> resultSet = new TreeSet<>();
        
        // Add all elements from both collections to TreeSet
        resultSet.addAll(ints1);
        resultSet.addAll(ints2);

        // Convert sorted TreeSet to ArrayList
        return new ArrayList<>(resultSet);

        // Used TreeSet as it automatically sorts elements in ascending order and removes duplicates
    }

    /**
     * This method returns an ArrayList containing all elements that appear in
     * both of the two collection arguments. There will be no duplicate values
     * in the resulting ArrayList. The values in the returned ArrayList must be
     * in sorted order. For example, if the two arguments contain {2, 1, 2, 3} and
     * {3, 4, 4, 5}, the returned ArrayList will contain {3}. The original
     * collections will not be modified.
     *
     * @param ints1 - the first collection
     * @param ints2 - the second collection
     * @return An ArrayList containing the integers that appear in both
     * collections.
     */
    public static ArrayList<Integer> inBoth(Collection<Integer> ints1, Collection<Integer> ints2) {
        // This must be done with no loops.

        // Treeset to automatically sort and remove duplicates
        TreeSet<Integer> returnSet = new TreeSet<>(ints1);

        // Retain only elements that are also in ints2
        returnSet.retainAll(ints2);

        // Convert sorted TreeSet to ArrayList
        return new ArrayList<>(returnSet);

        // Used TreeSet as it automatically sorts elements in ascending order and removes duplicates
    }

    /**
     * This method returns the String that appears most frequently in the
     * provided list. For example, if the input list contains the elements
     * {"Bob", "Alice", "Bob"}, this method will return "Bob". If there are
     * ties, any of the most frequently occurring elements may be returned.
     * If the list is empty, return the empty string "".
     *
     * @param list - a list of Strings
     * @return the most frequently occurring String
     */
    public static String mostFrequent(List<String> list) {
        // You should solve this problem in two stages: First iterate through
        // the list to count occurrences of each String. Then iterate through
        // your counts to find the largest. You'll need a collection that allows
        // you to store a mapping from Strings to counts.
        // No nested loops or non-enhanced for-loops are allowed.

        // If list is empty, return empty string
        if (list.isEmpty()) {
            return "";
        }

        // Count occurences of each string
        Map<String, Integer> map = new HashMap<>();
        list.forEach(s -> map.put(s, map.getOrDefault(s, 0) + 1));

        // Find the string with highest frequency
        String mostFrequency = "";
        int maxCount = 0;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostFrequency = entry.getKey();
                maxCount = entry.getValue();
            }
        }
                return mostFrequency;

        // Used Map as allows storage of data as key-value pairs
        
    }

    public static String getName() {
        return "Collections Assignment";
    }
}
