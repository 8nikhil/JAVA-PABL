class Solution {
    public static java.util.ArrayList<Integer> findUnion(int[] a, int[] b) {
        java.util.HashSet<Integer> set = new java.util.HashSet<>();
        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }
        for (int i = 0; i < b.length; i++) {
            set.add(b[i]);
        }
        java.util.ArrayList<Integer> result = new java.util.ArrayList<>(set);
        java.util.Collections.sort(result);
        return result;
    }
}
