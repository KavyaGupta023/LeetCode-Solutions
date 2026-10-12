class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int n = nums1.length;
        long k = (long) k1 + k2;
        int[] arr = new int[n];

        long sum = 0;
        int max = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = Math.abs(nums1[i] - nums2[i]);
            sum += arr[i];
            max = Math.max(max, arr[i]);
        }

        if (sum <= k) {
            return 0;
        }

        int low = 0, high = max;

        while (low < high) {
            int mid = low + (high - low) / 2;
            long need = 0;

            for (int d : arr) {
                if (d > mid) {
                    need += d - mid;
                }
            }

            if (need <= k) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        long ans = 0;
        long remaining = k;

        for (int d : arr) {
            if (d > low) {
                remaining -= d - low;
                d = low;
            }
            ans += (long) d * d;
        }

        for (int i = 0; i < n && remaining > 0; i++) {
            if (arr[i] >= low && arr[i] > 0) {
                ans -= (long) low * low;
                ans += (long) (low - 1) * (low - 1);
                remaining--;
            }
        }

        return ans;
    }
}