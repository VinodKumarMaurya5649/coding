public class searchmatrix_binarySearch {
    public static void main(String[] args) {
        int[][] mat = {{1}};
        int target = 1;
        Solution s = new Solution();
        System.out.println(s.searchMatrix(mat, target));
    }
}
class Solution {
    public boolean searchMatrix(int[][] mat, int target) {
        int m = mat[0].length;
        int n = mat.length;
        // int beg = 0;
        // int end = m * n - 1;
        if (m == 0) {
            return false;
        }
        if (n == 1) {
            int l = 0;
            int h = m - 1;
            while (l <= h) {
                int mid = (l + h) / 2;
                if (mat[0][mid] == target) {
                    return true;
                } else if (mat[0][mid] < target) {
                    l = mid + 1;
                } else {
                    h = mid - 1;
                }
            }
        } else {
            for (int i = 0; i < n; i++) {
                int l = 0;
                int h = m - 1;
                while (l <= h) {
                    int mid = (l + h) / 2;
                    if (mat[i][mid] == target) {
                        return true;
                    } else if (mat[i][mid] < target) {
                        l = mid + 1;
                    } else {
                        h = mid - 1;
                    }
                }
            }
        }
        return false;
    }
}