class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            int b= i+1;
            int c = nums.length-1;
            if(i > 0 && nums[i] == nums[i-1]) continue;
            while(b<c){
                if(nums[i]+nums[b]+nums[c]>0){c--;}
                else if(nums[i]+nums[b]+nums[c]<0){b++;}
                else {
                // nums[a]+nums[b]+nums[c]==0
                    list.add(Arrays.asList(nums[i],nums[b],nums[c]));
                    b++;
                    c--;

                   while (b < c && nums[b] == nums[b - 1]) {
                    b++;
                }

            while (b < c && nums[c] == nums[c + 1]) {
                    c--;
                }
            }
        }

    }
        return list;
    }
}
