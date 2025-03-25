package Sample.PY;
import java.util.HashMap;
public class Program_1 {
	//Array 1={6,8,11,6,7,18}. Target =17. Write a program in java to find index of two elements from the array whose sum=target.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		    
		        int[] nums = {6, 8, 11, 6, 7, 18};  // Given array
		        int target = 17;                    // Target sum

		        int[] result = findTwoSum(nums, target);

		        if (result.length == 2) {
		            System.out.println("Indices: " + result[0] + ", " + result[1]);
		        } else {
		            System.out.println("No two elements found with sum = " + target);
		        }
		    }

		    public static int[] findTwoSum(int[] nums, int target) {
		        HashMap<Integer, Integer> map = new HashMap<>();  // Store value and index

		        for (int i = 0; i < nums.length; i++) {
		            int complement = target - nums[i];  // Required number to reach target

		            if (map.containsKey(complement)) {
		                return new int[]{map.get(complement), i};  // Return indices
		            }

		            map.put(nums[i], i);  // Store current number and index
		        }

		        return new int[]{};  // Return empty array if no solution found
		    }
		

	}


