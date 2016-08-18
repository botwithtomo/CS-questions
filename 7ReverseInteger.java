// 7 Reverse Integer
// Easy
/*
Reverse digits of an integer.

Example1: x = 123, return 321
Example2: x = -123, return -321
*/
// Please always consider the situation where overflows happens
// One easy way to solve the problem is that the reverse should be the same
// if not, overflow happens
public class Solution {
    public int reverse(int x) {
        int value =0;
        while(x !=0){
            int tmp = value*10 +x%10;
            x /=10;
            if(tmp/10 != value){  // this if is to test if there is an overflow
                value =0;
                break;
            }
            value = tmp;
             
    }
   return value;
}
}
