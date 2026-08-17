class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        

       Map<String, List<String>> map = new HashMap<>();

        for(String s : strs){

            char[] s1 = s.toCharArray();

            Arrays.sort(s1);
            String sortedString = new String(s1);

            if(!map.containsKey(sortedString)){
                map.put(sortedString,new ArrayList<>());
            }

            map.get(sortedString).add(s);

        
            
        }

return new ArrayList(map.values());
    }
}
