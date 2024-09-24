class Solution {
    public void rotate(int[][] matrix) {
         for(int i=0;i<matrix.length;i++)
        {
            for(int j=i+1;j<matrix[0].length;j++)
            {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
               
            }
        }         //[[1,2,3],[4,5,6],[7,8,9]]-matrix
                  // transpose- [[1,4,7],[2,5,8],[3,6,9]]
    }
}