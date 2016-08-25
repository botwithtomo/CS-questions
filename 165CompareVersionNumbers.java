// 165 Compare Version Numbers
// Easy
/*

Compare two version numbers version1 and version2.
If version1 > version2 return 1, if version1 < version2 return -1, otherwise return 0.

You may assume that the version strings are non-empty and contain only digits and the . character.
The . character does not represent a decimal point and is used to separate number sequences.
For instance, 2.5 is not "two and a half" or "half way to version three", 
it is the fifth second-level revision of the second first-level revision.

Here is an example of version numbers ordering:

0.1 < 1.1 < 1.2 < 13.37

*/

public int compareVersion(String version1, String version2) {
	if(version1.equals(version2)){
		return 0;
	}
	int oneLength = version1.length();
	int twoLength = version2.length();
	int i =0, j =0;

	while(i<oneLength || j < twoLength){
		int oneTmp = 0;
		int twoTmp = 0;
		while(i<oneLength && version1.charAt(i)!='.'){
			oneTmp = oneTmp *10 + (version1.charAt(i)-'0');
			i++;
		}

		while(j<twoLength && version2.charAt(j)!='.'){
			twoTmp = twoTmp*10 +(version2.charAt(j)-'0');
			j++
		}

		if(oneTmp > twoTmp) return 1;
		if(twoTmp > oneTmp) return -1;

		i++;
		j++;
	}

	return 0
}
// Method 2 takes about 3 ms

public int compareVersion(String version1, String version2) {
	
	String[] verOne = version1.split("\\.");
	String[] verTwo = version2.split("\\.");
	int i =0;
	while(i<verOne.length || i<verTwo.length){
		if( i < verOne.length && i < verTwo.length){
			if(Integer.parseInt(verOne[i])    <    Integer.parseInt(verTwo[i])) return -1;
			if(Integer.parseInt(verOne[i])    >    Intger.parseInt(verTwo[i]))  return 1;
		} else {
			if(i < verOne.length){
				if(Integer.parseInt(verOne[i]) != 0){
					return 1;
				}
			}

			if(i < verTwo.length){
				if(Integer.parseInt(verTwo[i]) !=0 ){
					return -1;
				}
			}
		}

		i++;
	}

	return 0;
}





















