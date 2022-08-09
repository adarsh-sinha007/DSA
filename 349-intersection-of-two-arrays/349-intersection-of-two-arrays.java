class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
     HashSet<Integer>set=new HashSet<>();
    HashSet<Integer>set1=new HashSet<>();
        
        for(Integer i:nums1){
            set.add(i);
            
        }
        for(Integer i:nums2){
            if(set.contains(i)){
                set1.add(i);
            }
        }
        int n=set1.size();
        int result[]=new int[n];
        int index=0;
        for(Integer i:set1){
            result[index++]=i;
        }
        return result;
    }
}