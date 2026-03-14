class Solution {

    int count = 0;
    String ans = "";

    public String getHappyString(int n, int k) {
        generate(n, k, new StringBuilder());
        return ans;
    }

    void generate(int n, int k, StringBuilder sb) {

        if (sb.length() == n) {
            count++;

            if (count == k) {
                ans = sb.toString();
            }
            return;
        }

        char[] ch = {'a', 'b', 'c'};

        for (char c : ch) {

            if (sb.length() > 0 && sb.charAt(sb.length() - 1) == c)
                continue;

            sb.append(c);
            generate(n, k, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
