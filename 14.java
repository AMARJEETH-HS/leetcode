class Solution {
    public String prefix(String s1 ,String s2){
        while (!s1.startsWith(s2)) {
    s2 = s2.substring(0, s2.length() - 1);
    }
    return s2;
    }
    public String longestCommonPrefix(String[] strs) {
       String result = strs[0];
       for(int i=1;i<strs.length;i++){
        result = prefix(strs[i],result);
       }
       return result;
    }
}