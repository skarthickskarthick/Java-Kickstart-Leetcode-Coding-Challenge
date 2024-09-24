soln 1: along rows

 int start=0,stop=matrix.length-1;
                while(start<stop){
                int temp[]=matrix[start];
                matrix[start]=matrix[stop];
                matrix[stop]=temp;
                start++;
                stop--;
                }


soln 2: along columns

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


