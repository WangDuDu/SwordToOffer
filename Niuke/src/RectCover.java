/**
 * Created by wangshuyang on 2018-9-4.
 * 矩形的覆盖问题
 */
public class RectCover {
    public int rectCover(int target) {
        if (target == 0) {
            return 0;
        } else if (target == 2) {
            return 2;
        } else if (target == 1) {
            return 1;
        }
        return rectCover(target - 1) + rectCover(target - 2);
    }
}
