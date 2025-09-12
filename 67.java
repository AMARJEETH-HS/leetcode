import java.math.BigInteger;
class Solution {
    public String addBinary(String a, String b) {
      // return Integer.toBinaryString(Integer.parseInt(a, 2)+Integer.parseInt(b, 2));
     BigInteger num1 = new BigInteger(a, 2);  // interpret as binary
        BigInteger num2 = new BigInteger(b, 2);  // interpret as binary

        BigInteger sum = num1.add(num2);

        return sum.toString(2); 
    }
    
}
