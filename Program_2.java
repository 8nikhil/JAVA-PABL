class Solution {
    public java.util.ArrayList<Integer> getMinMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        java.util.ArrayList<Integer> res = new java.util.ArrayList<>();
        res.add(min);
        res.add(max);
        return res;
    }
}
