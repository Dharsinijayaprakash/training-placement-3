import java.util.HashMap;

class Solution {
    public int countGoodSubstrings(String s) {
        int n = s.length();
        if(n < 3) return 0;

        HashMap<Character, Integer> map = new HashMap<>();

        int left=0, count = 0;
        for(int right = 0; right<n; right++) {
            map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0) + 1);
            if(right - left + 1 == 3) {
                if(map.size() == 3) count++;
                int freq = map.get(s.charAt(left));
                if(freq == 1) {
                    map.remove(s.charAt(left));
                } else {
                    map.put(s.charAt(left), freq-1);
                }
                left++;
            }
        }
        return count;
    }
}
