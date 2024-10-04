

// User function Template for Java
class Solution {

    // Note that the size of the array is n-1
    int missingNumber(int n, int arr[]) {

        // Your Code Here
        int sum=0,total=0;
        for(int i:arr)
        {
            sum+=i;
        }
        for(int i=1;i<=n;i++)
        {
            total+=i;
        }
        return total-sum;
    }
}
