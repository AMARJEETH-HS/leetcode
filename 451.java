class Solution {
    public String frequencySort(String s) {
      Map<Character,Integer> map = new HashMap<>();
      for(int i=0;i<s.length();i++){
        if(map.containsKey(s.charAt(i))){
            int val = map.get(s.charAt(i));
            val++;
            map.put(s.charAt(i),val);
        }
        else{
            map.put(s.charAt(i),1);
        }
      } 
      // Convert entries to list
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());

        // Sort list by values (descending)
        list.sort((a, b) -> b.getValue().compareTo(a.getValue()));

    //   for (Map.Entry<Character, Integer> e : list) {
    //   System.out.println(e.getKey() + " -> " + e.getValue());
    //  } 

    StringBuilder sb = new StringBuilder();
    for(Map.Entry<Character,Integer> e : list){
        for(int i=0;i<e.getValue();i++){
            sb.append(e.getKey());
        }
    }
     return sb.toString();
    }
}