class Solution {
    public int trap(int[] height) {

        int n= height.length;

        int sum=0;

        int [] left_max= new int[n];

        int [] right_max = new int[n];

        int leftH=0;

        for(int i=0;i<n;i++){

            left_max[i]= leftH;

            if(leftH<height[i]){
                leftH=height[i];
            }
            
        }
        int rightH=0;
        for(int i=n-1;i>=0;i--){

            right_max[i]= rightH;

            if(rightH<height[i]){
                rightH=height[i];
            }
            
        }

        for(int i=0;i<n;i++){
            sum+=Math.max(0,Math.min(left_max[i],right_max[i])-height[i]);
        }
        return sum;
        
    }
}