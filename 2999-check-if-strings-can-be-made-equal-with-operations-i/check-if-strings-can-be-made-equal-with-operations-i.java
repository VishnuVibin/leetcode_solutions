import java.util.Arrays;

class Solution {
    public boolean canBeEqual(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        StringBuilder even1 = new StringBuilder();
        StringBuilder odd1 = new StringBuilder();
        StringBuilder even2 = new StringBuilder();
        StringBuilder odd2 = new StringBuilder();

        // even indices
        for (int i = 0; i < s1.length(); i += 2) {
            even1.append(s1.charAt(i));
            even2.append(s2.charAt(i));
        }

        // odd indices
        for (int i = 1; i < s1.length(); i += 2) {
            odd1.append(s1.charAt(i));
            odd2.append(s2.charAt(i));
        }

        // sort
        char[] e1 = even1.toString().toCharArray();
        char[] e2 = even2.toString().toCharArray();
        char[] o1 = odd1.toString().toCharArray();
        char[] o2 = odd2.toString().toCharArray();

        Arrays.sort(e1);
        Arrays.sort(e2);
        Arrays.sort(o1);
        Arrays.sort(o2);

        return Arrays.equals(e1, e2) && Arrays.equals(o1, o2);
    }
}