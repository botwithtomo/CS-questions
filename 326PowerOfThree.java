// 326 Power of Three
// Easy
/*
Given an integer, write a function to determine if it is a power of three.

Follow up:
Could you do it without using any loop / recursion?

*/

public boolean isPowerOfThree(int n) {
        double res = Math.log10(n) / Math.log10(3);  
        return (res - (int)(res) == 0) ? true : false;  
    }


double rst = Math.log10(n)/Math.log10(3);
return (rst - (int) rst ==0) ? true :false;