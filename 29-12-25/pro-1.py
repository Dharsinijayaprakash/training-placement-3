class Solution(object):
    def countElements(self, nums):
        c=0
        mx=max(nums)
        mn=min(nums)
        for i in nums:
            if i<mx and i>mn:
                c=c+1
        return c
        
