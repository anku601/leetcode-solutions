class Solution {
    public int characterReplacement(String s, int k) {

        int n= s.length();


        int[] frq=new int[26];

        int j=0;
        int maxFreq=0;
        int maxLen=0;

        for(int i=0;i<n;i++){
            
            frq[s.charAt(i)-'A']++;
            maxFreq= Math.max(maxFreq,frq[s.charAt(i)-'A']);


            if((i-j+1)-maxFreq>k){
                frq[s.charAt(j)-'A']--;
                j++;

            }

            if((i-j+1)-maxFreq<=k){
                maxLen=Math.max(maxLen,i-j+1);
            }
        }
        return maxLen;
        
    }
}