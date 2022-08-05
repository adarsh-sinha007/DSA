class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer>num=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(num.containsKey(nums[i])){
                num.put(nums[i],num.get(nums[i])+1);
            }
            else{
                num.put(nums[i],1);
            }
        }
        int max=0;
        int val=0;
        for(int n:nums){
            if(num.get(n)>max)
            {
                max=num.get(n);
                val=n;
            }
        }
        return val;
        
    }
}