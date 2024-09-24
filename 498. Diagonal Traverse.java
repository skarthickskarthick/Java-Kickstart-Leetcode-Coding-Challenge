class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int i=0,j=0,in=0;
        boolean up=true;
        int ans[]=new int[mat.length*mat[0].length];
        while(i<mat.length&&j<mat[0].length)
        {
            if(up)
            {
               while(i>0&&j<mat[0].length-1)//traversing across the diagonal elements
               {
                ans[in++]=mat[i][j];
                i--;
                j++;
               }
               ans[in++]=mat[i][j];   //to overcome index out of bounds
               if(j==mat[0].length-1)//direction change or turn
               i++;
               else
               j++;
               
            }
            else
            {

                while(j>0&&i<mat.length-1)//traversing across the diagonal elements
               {
                ans[in++]=mat[i][j];
                j--;
                i++;
               }
               ans[in++]=mat[i][j];
               if(i==mat.length-1)//direction change or turn
               j++;
               else
               i++;
              
            }
              up=!up;
        }
        return ans;
    }
}
