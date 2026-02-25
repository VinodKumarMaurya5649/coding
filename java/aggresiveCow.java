public class aggresiveCow {
    public static void main(String[] args) {
        int[] stalls = {1, 2, 4, 8, 9,12,15,19};
        int k = 3;
        Solution s = new Solution();
        System.out.println(s.solve(stalls, k));
    }
}
class Solution{
    public int solve(int[] stalls, int k) {
        int n = stalls.length;
        int l = 1;
        int h = stalls[n - 1] - stalls[0];
        int ans = 0;
        while (l <= h) {
            int mid = (l + h) / 2;
            if (isPossible(stalls, k, mid)) {
                ans = mid;
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }
        return ans;
    }
    public boolean isPossible(int[] stalls, int k, int dist) {
        int count = 1;
        int lastPos = stalls[0];
        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - lastPos >= dist) {
                count++;
                lastPos = stalls[i];
            }
            if (count == k) {
                return true;
            }
        }
        return false;
    }
}