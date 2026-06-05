class Solution {
    public int totalWaviness(int num1, int num2) {
        int total = 0;

        for (int num = num1; num <= num2; num++) {
            char[] digits = String.valueOf(num).toCharArray();

            for (int i = 1; i < digits.length - 1; i++) {
                int left = digits[i - 1] - '0';
                int mid = digits[i] - '0';
                int right = digits[i + 1] - '0';

                if (mid > left && mid > right || mid<left && mid<right) {
                    total++;
                }
            }
        }

        return total;
    }
}