public class pattern{
    public static void main(String args[])
    {
        int n=5,k;
       for(int i=1;i<=2*n-1;i++)
       {
        k=n;
        if(i<=n)
        {
             for(int j=1;j<=2*n-1;j++){
                 System.out.print(" "+k);
                 if(i>j)
                 k=k-1;
                 if((i+j)>(2*n-1))
                 k=k+1;
                }
             System.out.println();
        }
        else{
             for(int j=1;j<=2*n-1;j++){
                 System.out.print(" "+k);
                 if(i<=j)
                 k=k+1;
                 if((i+j)<(2*n))
                 k=k-1;
                }
             System.out.println();
        }
       
     
    }
}
}