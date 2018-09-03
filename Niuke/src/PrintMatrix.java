import java.util.ArrayList;

/**
 * Created by wangshuyang on 2018-9-1.
 */
public class PrintMatrix {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        int top = 0;
        int bootom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;
        ArrayList<Integer> list = new ArrayList<Integer>();

        while (left <= right && top <= bootom) {
            for (int i = left; i <= right; i++) {
                list.add(matrix[top][i]);
            }
            for (int j = top + 1; j <= bootom; j++) {
                list.add(matrix[j][right]);
            }
            if (top != bootom)
            for (int m = right - 1; m >= left; m--) {
                list.add(matrix[bootom][m]);
            }
            if (left != right)
            for (int n = bootom - 1; n > top; n--) {
                list.add(matrix[n][left]);
            }
            left++;
            top++;
            right--;
            bootom--;
        }
        return list;
    }
}
