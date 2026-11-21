class Solution {
    public int lengthOfLongestSubstring(String s) {

        int n= s.length();

        Set<Character> set =new HashSet<>();
        int cnt=0;
        int j=0;
        int maxCnt=0;

        

        for(int i=0;i<n;i++){
    
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(j));
                j++;
                cnt--;
            }
            set.add(s.charAt(i));
            cnt++;
            maxCnt= Math.max(maxCnt,cnt);
        }
        return maxCnt;

        
    }
}