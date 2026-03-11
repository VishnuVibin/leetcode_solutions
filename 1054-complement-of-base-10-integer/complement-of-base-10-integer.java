class Solution {
    public int bitwiseComplement(int n) {
        String x = Integer.toBinaryString(n);
        String res = "";

        for(int i = 0; i < x.length(); i++){
            if(x.charAt(i) == '0'){
                res += '1';
            } else {
                res += '0';
            }
        }

        return Integer.parseInt(res, 2);
    }
}