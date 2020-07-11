
public class Task1504 {

    public static void main(String[] args) {

        int[][] mat = new int[][] { { 1, 0, 1 }, { 1, 1, 0 }, { 1, 1, 0 } };

        new Solution().numSubmat(mat);

    }

}

class Solution {
    public int numSubmat(int[][] mat) {

        // 2^m+n - 2^m - 2^n + 1
        int res = 0;
        int[][] precompiledArray = new int[mat.length][mat[0].length];
        for (int i = 0; i < mat.length; i++) {
            int tmp = 0;
            for (int j = mat[i].length - 1; j >= 0; j--) {
                tmp = mat[i][j] == 1 ? tmp + 1 : 0;
                precompiledArray[i][j] = tmp;
            }
        }

        for (int i = 0; i < mat.length; i++) {

            for (int j = 0; j < mat[i].length; j++) {

                int tmpMin = Integer.MAX_VALUE;

                for (int k = i; k < mat.length; k++) {
                    tmpMin = Math.min(tmpMin, precompiledArray[k][j]);
                    res += tmpMin;
                }

            }

        }

        System.out.println(res);

        return res;
    }

}