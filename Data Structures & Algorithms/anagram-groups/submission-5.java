class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<String> list = new ArrayList();
        Map<String,List<String>> map = new HashMap();

        for(String i : strs){
            char[] s = i.toCharArray();
             Arrays.sort(s);
             String sortedString = new String(s);

            if(!map.containsKey(sortedString)){
                map.put(sortedString,new ArrayList<>());
            }
            map.get(sortedString).add(i);
        }
        return new ArrayList(map.values());
    }
}
