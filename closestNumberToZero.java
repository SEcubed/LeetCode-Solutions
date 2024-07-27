class Solution {
    public int findClosestNumber(int[] nums) {
        int closest = nums[0];
        if (nums.length == 1) return closest;
        for (int i = 1; i < nums.length; i++) {
            if (Math.abs(nums[i]) < Math.abs(closest) || 
                (Math.abs(nums[i]) == Math.abs(closest) && nums[i] > closest)) {
                    closest = nums[i];
                }
        }
        return closest;
    }
}