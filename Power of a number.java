package practise;

public class n {
	class Solution {
	    public double myPow(double x, int n) {
	        double prod=1;
	     

	        if(n<0){
	             if (n == Integer.MIN_VALUE) {
	                n++; // Increment by one to avoid overflow
	                prod *= x; // Multiply prod by x since we've effectively removed one power of x
	            }
	        n*=-1;
	         x=1/x;
	    }

	        while(n>0)
	        {
	            if(n%2==1)
	            {
	                prod*=x;
	            }
	            x*=x;
	            n/=2;
	        }
	       
	       return prod;
	    }
	}


}
