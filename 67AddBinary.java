// 67 Add Binary
// Easy
/*
Given two binary strings, return their sum (also a binary string).

For example,
a = "11"
b = "1"
Return "100".
*/


public String addBinary(String a, String b) {
        if(a.length()<b.length()){
            String tmp = a;
            a = b;
            b = tmp;
        }
        int aLen = a.length()-1;
        int bLen = b.length()-1;
        int carries = 0;
        int value = 0;
        String rst = "";
        while(bLen >= 0){
            value = (a.charAt(aLen) - '0')+(b.charAt(bLen) - '0')+carries;
            rst = String.valueOf(value%2)+rst;
            carries = value /2;
            bLen--;
            aLen--;
        }
        while(aLen >= 0){
            value =(a.charAt(aLen)-'0')+carries;
            rst = String.valueOf(value %2) +rst;
            carries = value /2;
            aLen--;
        }
        if(carries ==1) rst = "1"+rst;

        return rst;
    }