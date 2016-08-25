// 344 Reverse String
// Easy
/*
Write a function that takes a string as input and returns the string reversed.

Example:
Given s = "hello", return "olleh".
*/

// Method 1, this method takes less time than method 2
// and it is accepted by OJ while method 2 doe snot
public String reverseString(String s) {
	if(s == null) return null;
	if(s.length()<2) return s;
	char[] charstring = s.toCharArray();
	int left = 0;
	int right = s.length()-1;
	while(left<right){
		char tmp = charstring[left];
		charstring[left] = charstring[right];
		charstring[right] = charstring[left];
		left++;
		right--;
	}

	return new String(charstring);
}

// Method 2
public String reverseString(String s ){
	if(s == null) return null;
	if(s.length()<2) return s;
	String rst ="";
	for(int i = s.length()-1;i>=0;i--){
		rst += s.charAt(i);
	}
	return rst;

}







