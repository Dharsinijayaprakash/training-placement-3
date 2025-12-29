class Solution {
    public boolean checkZeroOnes(String s) {
        int o = 0, z = 0;
        for (int i = 0; i < s.length(); i++) {
            int temp = 0;
            if (s.charAt(i) == '0') {
                while (i < s.length() && s.charAt(i) == '0') {
                    temp++;
                    i++;
                }
                z = Math.max(z, temp);
                i--;
                continue;
            }
            while (i < s.length() && s.charAt(i) == '1') {
                temp++;
                i++;
            }
            o = Math.max(o, temp);
            i--;
        }
        return o > z;
    }
}
