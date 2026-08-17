class Solution {
    public int[] productExceptSelf(int[] nums) {

int size= nums.length;
int result =1;
int zeroCount =0;
        for (int num : nums) {
            if (num == 0) {
                zeroCount++;
            } else {
                result *= num;
            }
        }


        int[] ans = new int[size];

        for (int i = 0; i < size; i++) {
            if (zeroCount > 1) {
                ans[i] = 0;
            } else if (zeroCount == 1) {
                ans[i] = (nums[i] == 0) ? result : 0;
            } else {
                ans[i] = result / nums[i];
            }
        }

        return ans;




    }
}  
