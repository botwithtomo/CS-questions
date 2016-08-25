// 292 Nim Game
// Easy
/*

You are playing the following Nim Game with your friend: 
There is a heap of stones on the table, each time one of 
you take turns to remove 1 to 3 stones. The one who removes 
the last stone will be the winner. You will take the first turn to remove the stones.

Both of you are very clever and have optimal strategies 
for the game. Write a function to determine whether you 
can win the game given the number of stones in the heap.

For example, if there are 4 stones in the heap, then you 
will never win the game: no matter 1, 2, or 3 stones you remove, 
the last stone will always be removed by your friend.
*/

// This question is actually very easy
// Suppose 1,2,3   you can take whatever you want you will always win
// if it is 4, no matter how many you take(1-3), your friend will always take the rest and win the game
// if it is 5, you can take 1 and your freind has 4 left to pick and he will lose
// same for 6 and 7, if it 8 then you lose again becasue no matter how many you take,
// your friend will always leave you 4 to take, then you lose.

public boolean canWinNim(int n) {
        if(n %4 >0) return true;
        else return false;
    }
