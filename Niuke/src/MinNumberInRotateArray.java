/**
 * Created by wangshuyang on 2018-9-4.
 */
public class MinNumberInRotateArray  {
    public int minNumberInRotateArray(int [] array) {
        if (array.length == 0) {
            return 0;
        }
        int i = 0;
        while (i < array.length - 1 && array[i] <= array[i + 1]) {
            i++;
        }
        if (i == array.length) {
            return array[0];
        } else {
            return array[i + 1];
        }
    }
}
