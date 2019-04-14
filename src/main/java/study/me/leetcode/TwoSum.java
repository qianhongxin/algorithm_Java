package study.me.leetcode;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        Integer[] arr = {3, 2, 4, 19, 45};
        calculateTwoSum(arr, 6);
    }

    /**
     * 利用hash算法实现，时间复杂度时O(n)，空间复杂度时O(n)
     * nums数组中两数之和等于target， 返回两个数的下标
     * https://leetcode.com/problems/two-sum/
     *
     * @param nums
     * @param target
     */
    private static int[] calculateTwoSum(Integer[] nums, int target) {
        if(nums == null || nums.length < 2) {
            return null;
        }
        HashMap<Integer, Integer> arrMap = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            arrMap.put(nums[i], i);
        }
        int temp;
        Integer getValue;
        for (int i = 0; i < nums.length; i++) {
            temp = target - nums[i];
            getValue = arrMap.get(temp);
            if(getValue != null && i != getValue) {
                return new int[]{i, arrMap.get(temp)};
            }
        }
        return null;
    }
}
