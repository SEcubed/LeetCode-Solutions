class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int maxFactor;
        if (str1.length() >= str2.length() ) {
            maxFactor = str2.length();
        } else {
            maxFactor = str1.length();
        }
        for (int i = maxFactor; i > 0; i--) {
            if (str1.length() % i == 0 && str2.length() % i == 0) {
                StringBuilder testOne = new StringBuilder();
                StringBuilder testTwo = new StringBuilder();
                for (int x = 0; x < str1.length(); x += i) {
                    testOne.append(str1.substring(0, i));
                }
                for (int y = 0; y < str2.length(); y += i) {
                    testTwo.append(str1.substring(0, i));
                }
                if (str1.equals(testOne.toString()) && str2.equals(testTwo.toString())) {
                    return str1.substring(0, i);
                }
            }
        }
        return "";
    }
}