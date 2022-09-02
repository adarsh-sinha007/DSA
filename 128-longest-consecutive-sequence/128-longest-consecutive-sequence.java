class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer>hashSet=new HashSet<>();
        for(int n:nums){
            hashSet.add(n);
            
        }
        
        int longeststreak=0;
        
        for(int i:nums){
            
            if(!hashSet.contains(i-1)){
                int currnum=i;
                int currstreak=1;
                
                while(hashSet.contains(currnum+1)){
                    currstreak++;
                    currnum=currnum+1;
                }
                longeststreak=Math.max(longeststreak,currstreak);
            }
        }
        return longeststreak;
       
    }
}