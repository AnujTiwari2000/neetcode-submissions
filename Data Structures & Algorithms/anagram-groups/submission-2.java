class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> m = new HashMap();

        for(String s : strs){

            char[] s1 = s.toCharArray();
            Arrays.sort(s1);

            String sorted_s = new String(s1);



            if(!m.containsKey(sorted_s)){
                m.put(sorted_s,new ArrayList<>());
            }

            m.get(sorted_s).add(s);
            
            }
            return new ArrayList(m.values());

    }
}
