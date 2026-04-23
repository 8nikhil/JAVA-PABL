class Solution {
    public void mergeArrays(int[] a, int[] b) {
        int n = a.length;
        int m = b.length;
        int gap = (n + m + 1) / 2;

        while (gap > 0) {
            int i = 0;
            int j = gap;

            while (j < n + m) {
                if (get(a, b, n, i) > get(a, b, n, j)) {
                    int temp = get(a, b, n, i);
                    set(a, b, n, i, get(a, b, n, j));
                    set(a, b, n, j, temp);
                }
                i++;
                j++;
            }

            if (gap == 1) break;
            gap = (gap + 1) / 2;
        }
    }

    private int get(int[] a, int[] b, int n, int index) {
        if (index < n) return a[index];
        return b[index - n];
    }

    private void set(int[] a, int[] b, int n, int index, int value) {
        if (index < n) a[index] = value;
        else b[index - n] = value;
    }
}
