// 14 Longest Common Prefix
// Easy
/*
Write a function to find the longest common prefix string amongst an array of strings.
*/
// there are 3 methods, I finish it with third one but it takes much time
// I learn from online the first method and second method which are much faster than mine.
//http://codereview.stackexchange.com/questions/46965/longest-common-prefix-in-an-array-of-strings


//Caution substring is substring(a,b) a is inclusive and b is exclusive
public String longestCommonPrefix(String[] strs) {
     if (strs.length == 0) {
        return "";   // Or maybe return null?
    }

    for (int prefixLen = 0; prefixLen < strs[0].length(); prefixLen++) {
        char c = strs[0].charAt(prefixLen);
        for (int i = 1; i < strs.length; i++) {
            if ( prefixLen >= strs[i].length() ||
                 strs[i].charAt(prefixLen) != c ) {
                // Mismatch found
                return strs[i].substring(0, prefixLen);
            	// i here can be any number from 0 to strs.length because they have common prefix
            }
        }
    }
    return strs[0];
        
    }


//http://www.programcreek.com/2014/02/leetcode-longest-common-prefix-java/
public String longestCommonPrefix(String[] strs) {
      if(strs==null || strs.length==0){
        return "";
    }
 
    if(strs.length==1) 
        return strs[0];
 
    int minLen = strs.length+1;
 
    for(String str: strs){
        if(minLen > str.length()){
            minLen = str.length();
        }
    }
 
    for(int i=0; i<minLen; i++){
        for(int j=0; j<strs.length-1; j++){
            String s1 = strs[j];
            String s2 = strs[j+1];
            if(s1.charAt(i)!=s2.charAt(i)){
                return s1.substring(0, i);
            }
        }
    }
 
    return strs[0].substring(0, minLen);
        
    }

public String longestCommonPrefix(String[] strs) {
        if(strs==null || strs.length == 0){
            return "";
        }
        String prefix = strs[0];
        for(int i =1;i<strs.length;i++){
            int j = 0;
            while(j<strs[i].length() && j<prefix.length()
                    && strs[i].charAt(j)==prefix.charAt(j)) j++;

            if(j==0) return "";
            prefix = prefix.substring(0,j);
        }
        return prefix;

    }