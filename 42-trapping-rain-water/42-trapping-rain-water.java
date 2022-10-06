class Solution {
    public int trap(int[] height) {
        int res=0;
        int maxl[]=new int[height.length];
        int maxR[]=new int[height.length];
        maxl[0]=height[0];
        for(int i=1;i<height.length;i++){
            maxl[i]=Math.max(maxl[i-1],height[i]);
        }
        maxR[height.length-1]=height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            maxR[i]=Math.max(maxR[i+1],height[i]);
        }
        int finarr[]=new int[height.length];
        for(int i=0;i<finarr.length;i++){
            finarr[i]=Math.min(maxl[i],maxR[i])-height[i];
            res=res+finarr[i];
        }
        return res;
        
    }
}