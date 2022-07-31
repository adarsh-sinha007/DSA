class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int result[]=new int[2];
        HashMap<Integer,Integer>num=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(num.containsKey(target-nums[i])){
                result[0]=i;
                result[1]=num.get(target-nums[i]);
            }
            else
                num.put(nums[i],i);
        }
        return result;
        
    }
}