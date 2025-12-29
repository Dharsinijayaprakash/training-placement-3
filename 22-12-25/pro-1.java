class Solution {
    public String kthDistinct(String[] arr, int k) {
        int n = arr.length;
        java.util.ArrayList<String> vec = new java.util.ArrayList<>();
        for (int i = 0; i < n; i++) {
            int t = 0;
            for (int j = 0; j < n; j++) {
                if (i != j && arr[i].equals(arr[j])) break;
                else if (i != j && !arr[i].equals(arr[j])) t++;
            }
            if (t == n - 1) vec.add(arr[i]);
        }
        if (vec.size() <= k - 1) return "";
        return vec.get(k - 1);
    }
}
