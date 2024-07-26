class Solution {
    public int removeDuplicates(int[] nums) {
        List<Integer> numsList = new ArrayList<Integer>();
        numsList.add(nums[0]);
        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != numsList.get(j)) {
                numsList.add(nums[i]);
                j++;
            }
        }
        for (int x = 0; x < nums.length; x++) {
            if (x < numsList.size()) {
                nums[x] = numsList.get(x);
            }
        }
        return numsList.size();
    }
}