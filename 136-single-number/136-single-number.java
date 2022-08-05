class Solution {
    public int singleNumber(int[] nums) {
        
        HashMap<Integer,Integer> num=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(num.containsKey(nums[i])){
                num.put(nums[i],num.get(nums[i])+1);
            }
            else 
                num.put(nums[i],1);
        }
        for(int n:nums){
            if(num.get(n)==1){
                return n;
            }
        }
        return 0;
    }
}