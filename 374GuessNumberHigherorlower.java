// 374 Guess Number Higher or Lower
// Easy
/*

We are playing the Guess Game. The game is as follows:

I pick a number from 1 to n. You have to guess which number I picked.

Every time you guess wrong, I'll tell you whether the number is higher or lower.

You call a pre-defined API guess(int num) which returns 3 possible results (-1, 1, or 0):

-1 : My number is lower
 1 : My number is higher
 0 : Congrats! You got it!
Example:
n = 10, I pick 6.

Return 6.

*/

public int guessNumber(int n) {
        int low = 1;
        int high = n;
        while(low<=high){
            int tmp = low+(high-low)/2;
            if(guess(tmp)==0) return tmp;
            else if(guess(tmp)==-1){
                high = tmp-1;
            } else {
                low = tmp+1;
            }

        }
        return -1;
        
    }


