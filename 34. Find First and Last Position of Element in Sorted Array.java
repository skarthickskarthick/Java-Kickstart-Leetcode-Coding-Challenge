class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans={-1,-1};
        int st=search(nums,target,true);
        int sp=search(nums,target,false);
        ans[0]=st;
        ans[1]=sp;
        return ans;

    }
    int search(int[] nums,int target,boolean findstartindex)
    {
        int ans=-1;
        int st=0;
        int sp=nums.length-1;
        while(st<=sp)
        {
            int mid=st+(sp-st)/2;
            if(target<nums[mid])
            sp=mid-1;
            else if(target>nums[mid])
            st=mid+1;
            else
            {
                ans=mid;
                if(findstartindex)
                sp=mid-1;
                else
                st=mid+1;
            }
        }
        return ans;
    }
}
