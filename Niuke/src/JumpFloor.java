/**
 * Created by wangshuyang on 2018-9-4.
 */
public class JumpFloor {
    public int jumpFloor(int target) {
        if (target <= 0) {
            return 0;
        } else if (target == 1) {
            return 1;
        } else if (target == 2) {
            return 2;
        }
        return jumpFloor(target - 1) + jumpFloor(target - 2);
    }
}
