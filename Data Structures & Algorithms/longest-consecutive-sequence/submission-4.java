class Solution {
    public int longestConsecutive(int[] nums) {
        int count =0;
        Set<Integer> s = new HashSet<>();
        for(int i :nums){
            s.add(i);
        }
//[2,20,4,10,3,5]]
        for(int i : s){
            if(!s.contains(i-1)){
                int length =1;
                while(s.contains(i+1)){
                    i++;
                length++;
                }
                count = Math.max(count,length);
            }
        }
        return count;
    }
}
