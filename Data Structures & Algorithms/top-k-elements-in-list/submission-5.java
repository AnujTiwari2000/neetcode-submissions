class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        /**Using min-heap Priority Queue
        **/

        Map<Integer,Integer> map= new HashMap<>();

//created frequency map
        for(int i :nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
//PriorityQueue initialisation 
         PriorityQueue<Map.Entry<Integer, Integer>> minheap =
            new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());
//poll to kth elements

for(Map.Entry<Integer,Integer> i : map.entrySet())
{
    minheap.add(i);
    if(minheap.size()>k){
        minheap.poll();
    }

}

int[] arr = new int[k];

for(int i =0;i<k;i++){
arr[i]=minheap.poll().getKey();
}
return arr;

    }
}
