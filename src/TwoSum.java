import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store the number and its index
        Map<Integer, Integer> map = new HashMap<>();

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // Calculate the complement of the current number
            int complement = target - nums[i];

            // If the complement is found in the map, return the indices
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            // If not found, add the current number and its index to the map
            map.put(nums[i], i);
        }

        // If no solution is found, return an empty array (though the problem guarantees a solution)
        return new int[] {};
    }

    public static void main(String[] args) {
        TwoSum solution = new TwoSum();

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = solution.twoSum(nums, target);

        // Output the result
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}
