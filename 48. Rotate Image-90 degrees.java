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
        }                      //Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
                               //Output: [[7,4,1],[8,5,2],[9,6,3]]

      
                int start=0,stop=matrix[0].length-1;
                while(start<stop){
                    for(int i=0;i<matrix.length;i++)
                    {
                int temp=matrix[i][start];
                matrix[i][start]=matrix[i][stop];
                matrix[i][stop]=temp;
                    }
                start++;
                stop--;
                }
    }
}
