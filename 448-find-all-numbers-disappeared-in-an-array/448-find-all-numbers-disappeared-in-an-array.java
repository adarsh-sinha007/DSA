class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        List<Integer>list=new ArrayList<>();
         HashSet<Integer>set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        for(int j=1;j<=nums.length;j++){
            if(!set.contains(j)){
                list.add(j);
            }
        }
        return list;
        
    }
}