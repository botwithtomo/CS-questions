// 342 Power of Four
// Easy
/*
Given an integer (signed 32 bits), write a function to check whether it is a power of 4.

Example:
Given num = 16, return true. Given num = 5, return false.

Follow up: Could you solve it without loops/recursion?


*/

public boolean isPowerOfFour(int num) {
        return num > 0 && (num & (num - 1)) ==0  && (num & 0x55555555) !=0;
    }



//http://www.programcreek.com/2015/04/leetcode-power-of-four-java/
public boolean isPowerOfFour(int num) {
    int count0=0;
    int count1=0;
 
    while(num>0){
        if((num&1)==1){
            count1++;
        }else{
            count0++;
        }
 
        num>>=1;
    }
 
    return count1==1 && (count0%2==0);
}



public boolean isPowerOfFour(int num) {
	if(num == 1) return true;
	while(n>0){
		if(n % 4 !=0) return false;
		n /=4;
	}

	return false;	
}









