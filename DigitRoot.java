class Solution
{
    // complete the function
    public static int digitalRoot(int n)
    {
        // add your code here
        if (n < 10) {
            return n;
        }
        
        int sum = 0;
        String numString = String.valueOf(n);
        for (int i = 0; i < numString.length(); i++) {

            sum += Character.getNumericValue(numString.charAt(i));
        }
        
        return digitalRoot(sum);
    }
}
