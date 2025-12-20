
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int u = nums.length;
        int c = nums[0]+nums[1]+nums[2];
        for(int i = 0;i < u-2;i++){
            int l = i + 1;
            int r = u - 1;
            while(l<r){
                int s = nums[i] + nums[l] + nums[r];
                if (Math.abs(target - s) < Math.abs(target - c)) {
                    c = s;
                }
                if (s < target) {
                    l++;  
                } else if (s > target) {
                    r--; 
                } else {
                    return s; 
                }
            }
        }
        return c;
    }
}
