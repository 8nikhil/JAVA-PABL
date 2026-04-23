import java.util.*;

class Solution {
    public boolean isSubset(int[] a, int[] b) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int num : a) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        for (int num : b) {
            if (!map.containsKey(num) || map.get(num) == 0) {
                return false;
            }
            map.put(num, map.get(num) - 1);
        }
        
        return true;
    }

    public boolean hasTripletSum(int[] arr, int target) {
        Arrays.sort(arr);
        int n = arr.length;

        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];

                if (sum == target) {
                    return true;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return false;
    }
}
