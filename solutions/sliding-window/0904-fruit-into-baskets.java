class Solution {
    public int totalFruit(int[] fruits) {

        int n = fruits.length;

        Map<Integer, Integer> map = new HashMap<>();
        int left = 0;
        int maxSum = 0;

        for (int right = 0; right < n; right++) {

            map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1);

            while (map.size() > 2) {
                int fruit = fruits[left];

                map.put(fruit, map.get(fruit) - 1);

                if (map.get(fruit) == 0) {
                    map.remove(fruit);
                }

                left++;
            }

            maxSum = Math.max(maxSum, right - left + 1);
        }

        return maxSum;
    }
}
