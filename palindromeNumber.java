class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) { return false; }
        int d = digits(x);
        int y = 0; int z = x;
        for (int i = 1; i <= d; i++) {
            y = y * 10;
            y = y + (z % 10);
            z = z / 10;
        }
        return (y == x);
    }
    public int digits(int x) {
        if (x < 10) {
            return 1;
        } else {
            return 1 + digits(x/10);
        }
    }
}