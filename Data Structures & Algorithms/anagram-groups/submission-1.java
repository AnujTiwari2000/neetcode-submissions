class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
      

      Map<String, List<String>> map = new HashMap();
      for(String s : strs){

        char[] s1 = s.toCharArray();
        Arrays.sort(s1);

        String sort_s1 = new String(s1);
        
        if(!map.containsKey(sort_s1)){
            map.put(sort_s1,new ArrayList<>());
        }

        map.get(sort_s1).add(s);

      }
return new ArrayList<>(map.values());

    }
}
