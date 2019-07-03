class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        if (A==null || A.length==0) {
            return A;
        }
        int jmax = A[0].length/2;
        if (A[0].length % 2 == 1) {
            jmax++;
        }
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < jmax; j++) {
                int left = j;
                int right = A[0].length - j - 1;
                if (A[i][left] == A[i][right]) {
                    if (A[i][left] == 1) {
                        A[i][left] = A[i][right] = 0;
                    } else {
                        A[i][left] = A[i][right] = 1;
                    }
                }
            }
        }
        return A;
    }
}
