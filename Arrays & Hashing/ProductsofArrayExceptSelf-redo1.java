class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;

        int[] answer = new int[len];

        answer[0] = 1;
        for(int i = 1; i < len; i++){
            answer[i] = answer[i - 1] * nums[i - 1];
        }

        int right = 1;
        for(int i = len - 1; i >= 0; i--){
            answer[i] = right * answer[i];
            right = right * nums[i];
        }
        return answer;
    }
}  
