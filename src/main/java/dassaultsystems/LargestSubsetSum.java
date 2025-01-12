package dassaultsystems;

/* Given a list of numbers,
    can contain both +ve and -ve,
    we have to find largest subset sum on that array.
    (pointed out, rather than nested loop, two-pointer approach can be employed) */

public class LargestSubsetSum {

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int result = findLargestSum_SlidingWindow(nums);
        System.out.println("Largest Subset Sum: " + result); // Output should be 6
    }

    // Using Sliding window
    public static int findLargestSum_SlidingWindow(int[] nums) {
        int left = 0;
        int right = 0;
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        while(right < nums.length) {
            currentSum += nums[right];

            maxSum = Math.max(maxSum, currentSum);

            if(currentSum < 0) {
                currentSum = 0;
                left = right + 1;
            }

            right++;
        }

        return maxSum;
    }

    // Using Kadane's algorithm
    public static int findLargestSum_KadaneAlgo(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for(int num : nums) {
            currentSum += num;
            maxSum = Math.max(maxSum, currentSum);

            if(currentSum < 0) {
                currentSum = 0;
            }
        }

        return maxSum;
    }
}
