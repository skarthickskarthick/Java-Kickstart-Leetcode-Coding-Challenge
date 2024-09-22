class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int a=nums[0];
        int b=nums[nums.length-1];
        int rem=1;
        
        while(rem!=0)
        {
            rem=a%b;
            a=b;
            b=rem;
        }
        return a;
    }
}
