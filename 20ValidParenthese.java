// 20 Valid Parentheses
// Easy
/*
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', 
determine if the input string is valid.

The brackets must close in the correct order, "()" and "()[]{}" 
are all valid but "(]" and "([)]" are not.
*/

/* 
We use stack to solve this problem
First to determine if stack is null, if yes, then return false
if no, if they are ({[, then push,
if they are })], then first check if stack is empty, then pop the last one of the stack
Lastly, we have to check if the sack is empty.
*/
public boolean isValid(String s) {
        if(s.length() <2) return false;
        Stack<Character> sk = new Stack<Character>();
        for(int i =0; i < s.length();i++){
            char tmp = s.charAt(i);
            if(tmp == '[' || tmp=='(' || tmp == '{'){
                sk.push(tmp);
            }
            if(tmp == ']' || tmp == '}' || tmp ==')'){
                if(sk.isEmpty()) return false;
                char skpop = sk.pop();
                if(tmp=='}' && skpop=='{') continue;
                else if(tmp==')' && skpop=='(') continue;
                else if(tmp==']' && skpop=='[') continue;
                else return false;
            }
        }
        return sk.isEmpty();

    }