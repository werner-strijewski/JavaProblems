package org.strijewski.problems.targetSum;

import java.util.ArrayList;
import java.util.List;

public class TargetSumFinder {

    public static void main(String[] args) {
        int[] inputArray = {2, 3, 4, 5, 6, 7};
        int target = 7;

        List<List<Integer>> result = findTargetSumCombinations(inputArray, target);

        System.out.println("Combinations that sum up to " + target + ": " + result);
    }

    public static List<List<Integer>> findTargetSumCombinations(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        findCombinations(nums, target, 0, new ArrayList<>(), result);
        return result;
    }

    private static void findCombinations(int[] nums, int target, int start, List<Integer> current, List<List<Integer>> result) {
        if (target == 0) {
            // Found a valid combination
            result.add(new ArrayList<>(current));
            return;
        }

        if (target < 0) {
            // Exceeded the target, stop exploring this path
            return;
        }

        for (int i = start; i < nums.length; i++) {
            current.add(nums[i]);
            findCombinations(nums, target - nums[i], i + 1, current, result); // Try the next index
            current.remove(current.size() - 1); // Backtrack
        }
    }
}
