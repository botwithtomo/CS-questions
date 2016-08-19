// 9 Palindrome Number
// Easy
//Determine whether an integer is a palindrome. Do this without extra space.

// You can also write the function outside the method
// when you do the reverse, they key is to set up while(x!=0)
 public boolean isPalindrome(int x) {
        int ori= x;
        if(x<0) return false;
        int value = 0;
        while(x!=0){
            value = value*10 + x%10;
            x /=10;
        }
        return ori==value;

    }