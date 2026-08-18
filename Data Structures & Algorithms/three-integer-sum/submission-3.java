class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();

        for(int i=0;i<nums.length-2;i++){
            int b = i+1;
            int c = nums.length-1;
            if(i>0 && nums[i]==nums[i-1]) continue;
            while(b<c){
                int sum = nums[i]+nums[b]+nums[c];

                if(sum>0){c--;}
                else if(sum<0){b++;}
                else{
                    list.add(Arrays.asList(nums[i],nums[b],nums[c]));
                    b++;
                    c--;

                    while(b<c && nums[b]==nums[b-1]){b++;}
                    while(b<c && nums[c]==nums[c+1]){c--;}


                }
            }

        }
        return list;
    }
}
