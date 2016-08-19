// 125 Valid Palindrome
// Easy
/*
Given a string, determine if it is a palindrome, 
considering only alphanumeric characters and ignoring cases.

For example,
"A man, a plan, a canal: Panama" is a palindrome.
"race a car" is not a palindrome.

Note:
Have you consider that the string might be empty? 
This is a good question to ask during an interview.

For the purpose of this problem, we define empty 
string as valid palindrome.
*/
// This method is most commmon one, but we can still improve on runtime

public boolean isPalindrome(String s) {
        if(s.length()==0 || s == null){
            return true;
        }

        int first = 0;
        int end = s.length()-1;
        while(first <end){
            // We just check from both start and end to mid
            // If it is trash, we just ignore it and first++
            while(first <s.length() && !isValid(s.charAt(first))){
                first++;
            }
            if(first == s.length()) return true;
            while(end>0 && !isValid(s.charAt(end))){
                // Here, end can be >=0 or >0, both fine
                // >0 is faster, because if end =0; we already check at the first
                end--;
            }

            if(Character.toLowerCase(s.charAt(first))!= Character.toLowerCase(s.charAt(end))){
                break;
            } else{
                first++;
                end--;
            }
        }
        return end<=first;
    }
public boolean isValid(char c){
     return Character.isDigit(c) || Character.isLetter(c);
}

// This method is easy to understand, just use regex to replace all the trash
// and then to check if it is palindrome from start and end.
public boolean isPalindrome(String s) {
        if(s==null||s.length()==0) return true;
 
		s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		System.out.println(s);
 
		for(int i = 0; i < s.length() ; i++){
			if(s.charAt(i) != s.charAt(s.length() - 1 - i)){
				return false;
			}
		}
 
		return true;
    }