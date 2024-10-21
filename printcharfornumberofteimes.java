package programs;

public class printcharfornumberofteimes {
    public static void main(String args[])
    {
        String s="a23b10c20";
        int n=0;

        char[] chararr=s.toCharArray();

        for(int i=0;i<chararr.length;i++)
        {



            if(i!=0&&Character.isDigit(chararr[i])&&Character.isDigit(chararr[i-1]))
            {
                n=((chararr[i-1]-'0')*10)+chararr[i]-'0';

                for(int j=0;j<n;j++)
                    System.out.print(chararr[i-2]+"");
                i++;

            }
           else if(i!=chararr.length-1&&Character.isDigit(chararr[i])&&!Character.isDigit(chararr[i+1]))
            {
                n=chararr[i]-'0';
                for(int j=0;j<n;j++)
                    System.out.print(chararr[i-1]+"");
                i++;

            }




        }
    }
}
