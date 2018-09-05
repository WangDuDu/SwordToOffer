/**
 * Created by wangshuyang on 2018-9-4.
 * 变态跳台阶
 */
public class JumpFloorII {
    public int jumpFloor(int target) {
        if (target <= 0) {
            return 0;
        } else if (target == 1) {
            return 1;
        }
        return 2 * jumpFloor(target - 1);
    }
}
