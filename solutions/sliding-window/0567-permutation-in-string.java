import java.util.Arrays;

class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int n1 = s1.length();
        int n2 = s2.length();

        if (n1 > n2) return false;

        char[] arr1 = s1.toCharArray();
        Arrays.sort(arr1);

        for (int i = 0; i <= n2 - n1; i++) {

            String str = s2.substring(i, i + n1);

            char[] arr2 = str.toCharArray();
            Arrays.sort(arr2);

            if (Arrays.equals(arr1, arr2)) {
                return true;
            }
        }

        return false;
    }
}