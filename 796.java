class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        //  int indx=0;
        //  for(int i=0;i<goal.length();i++){
        //     if(goal.charAt(i)==s.charAt(0)){
        //         indx = i;
        //         break;
        //     }
        //  }
        // int i=indx;
        // int j=0;
        // for(j=0;j<s.length();j++){
        //     if(s.charAt(j) != goal.charAt(i)){
        //         break;
        //     }
        //     i=(i+1)%s.length();
        // }
        // System.out.print(j);
        // if(j==s.length()){
        //     return true;
        // }else{
        //     return false;
        // }

        // method 2
        // String temp="";
        // boolean flag = false;
        // for(int i=0;i<s.length();i++){
        // temp = s.substring(i) + s.substring(0, i);
        // if(temp.equals(goal)){
        //     flag = true;
        //     break;
        // }
        // }
        // return flag;

        //method 3
        s=s.concat(s);
       return s.contains(goal);
    }
}