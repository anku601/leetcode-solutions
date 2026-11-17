class Solution {
    public int maxArea(int[] height) {
        int n=height.length;

        int i=0;
        int j=n-1;
        int ans=0;

        while(i<j){
            int dif=Math.min(height[i],height[j]);
            int len=j-i;

            int area=dif*len;
            if(area>ans){
                ans=area;
            }

            if(height[i]>height[j]){
                j--;
            }
            else{
                i++;
            }  
        }
        return ans;
       
    }
        
    
}
