// 231 Power of Two
// Easy
// Given an integer, write a function to determine if it is a power of two.


// Learn the bitwise operation

public boolean isPowerOfTwo(int n) {
         return n>0 && (n&n-1)==0;
    }



public boolean isPowerOfTwo(int n) {
    if(n<=0) 
        return false;
 
    while(n>2){
        int t = n>>1;
        int c = t<<1;
 
        if(n-c != 0)
            return false;
 
        n = n>>1;
    }
 
    return true;
}