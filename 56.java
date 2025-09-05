class Solution {
    public int[][] merge(int[][] intervals) {
        boolean flag=false;
        int count=0;
        Collections.sort(Arrays.asList(intervals), (a, b) -> Integer.compare(a[0], b[0]));
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<intervals.length-1;i++){
            if (intervals[i][1]>= intervals[i+1][0] && intervals[i][1]>= intervals[i+1][1] ){
               list.add(Arrays.stream(intervals[i])
               .boxed()
               .collect(Collectors.toList()));
               i++;
               count++;
               if(i==intervals.length-1){
               flag=true;}
            }
            else if(intervals[i][1]>= intervals[i+1][0]){
                  intervals[i][1]= intervals[i+1][1];
               list.add(Arrays.stream(intervals[i])
               .boxed()
               .collect(Collectors.toList()));
               i++;
               count++;
               if(i==intervals.length-1){
               flag=true;} 
            }
            else{
             list.add(Arrays.stream(intervals[i])
               .boxed()
               .collect(Collectors.toList()));
            }
        }
          if(!flag){
                list.add(Arrays.stream(intervals[intervals.length-1])
               .boxed()
               .collect(Collectors.toList()));
            }
        intervals = list.stream()
        .map(inner -> inner.stream().mapToInt(Integer::intValue).toArray())
        .toArray(int[][]::new);
        if(count>0){
            intervals = merge(intervals);
        }

        
return intervals; 
}
}