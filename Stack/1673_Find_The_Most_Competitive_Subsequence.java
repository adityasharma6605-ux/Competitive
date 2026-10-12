class Solution {
    public int[] mostCompetitive(int[] nums, int k) {
        Stack<Integer>stack=new Stack<>();

        for(int i=0;i<nums.length;i++){
            while(!stack.isEmpty() && stack.peek()>nums[i] && stack.size()-1+nums.length-i>=k){
                stack.pop();
            }
            if(stack.size()<k){
                stack.push(nums[i]);
            }
        }
        int[] result=new int[k];
        for(int i=0;i<k;i++){
            result[i]=stack.get(i);
        }
        return result;
        
    }
}
