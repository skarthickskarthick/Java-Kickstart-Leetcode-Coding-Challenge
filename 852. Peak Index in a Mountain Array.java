class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int st=0;
        int sp=arr.length - 1;
        while(st<=sp)
        {
          int  mid=st+(sp-st)/2;
            if(arr[mid]>arr[mid+1])
             sp=mid-1;
             else
                 st=mid+1;
                  
         }
        
        return st;
    }
}
