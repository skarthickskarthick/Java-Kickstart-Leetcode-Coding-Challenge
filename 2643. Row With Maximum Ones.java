class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int min=0,max=0;
        for(int i=0;i<mat.length;i++)
        {
            int count=0;
            for(int j=0;j<mat[0].length;j++)
            {
                if(mat[i][j]==1)
                count++;
                
            }
            
            if(max<count)
            {
                max=count;
                min=i;
            }
            
            
        }

        
        int ans[]=new int[2];
        ans[0]=min;
        ans[1]=max;
        return ans;
    }
}
