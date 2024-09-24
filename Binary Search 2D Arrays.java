
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
        int start=0,stop=n*m-1;
        while(start<=stop)
        {
            int mid=start+(stop-start)/2;
            int i=mid/n;
            int j=mid%n;
            if(matrix[i][j]==target)
            return true;
            else if(matrix[i][j]<target)
            start=mid+1;
            else
            stop=mid-1;
        }
        return false; 
    }
}
