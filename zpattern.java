package pattern;

public class zpattern {

    public static void main(String args[])
    {
        String s="zohocorporationteam";
        int n=7,in=0;
        for(int i=0;i<n;i++)
        {
            if(i==0||i==n-1)
            {
                for(int j=0;j<n;j++)
                {
                    System.out.print(s.charAt(in++));
                }
            }
            else
            {
                for(int j=0;j<n-i-1;j++)
                    System.out.print(" ");
                System.out.print(s.charAt(in++));

            }
            System.out.println();
        }
    }
}
