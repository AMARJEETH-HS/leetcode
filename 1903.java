import java.math.BigInteger;
class Solution {
     public String largestOddNumber(String num) {
        BigInteger bigNum = new BigInteger(num);
        if (!bigNum.mod(BigInteger.TWO).equals(BigInteger.ZERO)) {
            return num;  
        }else{
            char[] arr = num.toCharArray();
            int indx = 0;
            boolean flag = false;
            for(int i=arr.length-1;i>=0;i--){
                if(arr[i]%2!=0){
                   indx=i;
                   flag=true;
                    break;
                    
                }
            }
            String s="";
            if(flag == true){
            s = new String(arr, 0, indx+1);}
            else{s = new String(arr, 0, indx);}
           return s; 
        }

     }
}
