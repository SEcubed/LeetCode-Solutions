class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        char[] m = jewels.toCharArray();
        int count = 0;
        for (int i = 0; i < stones.length(); i++) {
            for (int j = 0; j < m.length; j++) {
                if (stones.charAt(i) == m[j]) {
                    count++;
                }
            }
        }
        return count;
    }
}