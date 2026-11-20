class Solution {
    public int maxVowels(String s, int k) {

        int n=s.length();
        //String vowels ="aeiou";
        int cnt=0;
        int maxCnt=0;


        for(int i=0;i<k;i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                cnt++;
            }
        }
        maxCnt=cnt;
        for(int i=k;i<n;i++){

            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                cnt++;
            }

            if(s.charAt(i-k)=='a'||s.charAt(i-k)=='e'||s.charAt(i-k)=='i'||s.charAt(i-k)=='o'||s.charAt(i-k)=='u'){
                cnt--;
            }
            maxCnt=Math.max(maxCnt,cnt);



        }
        return maxCnt;
        
    }
}