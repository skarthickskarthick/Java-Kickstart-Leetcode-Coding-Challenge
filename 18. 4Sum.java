class Solution {
    public int thirdMax(int[] nums) {
        int max=-2147483648,smax=-2147483648,tmax=-2147483648;
        if(nums.length==1)
        return nums[0];
        if(nums.length==2&&nums[0]>nums[1])
        return nums[0];
         if(nums.length==2&&nums[1]>nums[0])
        return nums[1];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==max||nums[i]==smax||nums[i]==tmax)
            continue;
            if(max<nums[i]){
                tmax=smax;
                smax=max;
            max=nums[i];
            continue;

            }
            if(smax<nums[i]){
                tmax=smax;
                smax=nums[i];
                continue;
            }
            if(tmax<nums[i])
            {
                tmax=nums[i];
                continue;
            }

        }
        
        int flag=1;
     for(int j=0;j<nums.length-1;j++)  //if all the elements in the array are same
     if(nums[j]==nums[j+1])
       flag++;
       Arrays.sort(nums);
       int in=1;
        for(int j=0;j<nums.length-1;j++)  // if there are only two distinct element in the array we return the max. element(problemstates)
        if(nums[j]!=nums[j+1])
        in++;
        
        if(tmax==-2147483648&&(in==2||flag==nums.length))
        return max;
        return tmax;
        
    }
}
