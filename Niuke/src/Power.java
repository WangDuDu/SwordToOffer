/**
 * Created by wangshuyang on 2018-9-3.
 * 熟知的整数次方
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 */
public class Power {
    public double power(double base, int exponent) {
        int n = exponent;
        double result = -1;
        if (n < 0) {
            n = -exponent;
        }
        if (base != 0 && exponent == 0) {
            return 1;
        }
        if (n == 1) {
            return base;
        }
        result = power(base, n >> 1) * power(base, n >> 1);
        if ((n & 1) == 1) {
            result = result * base;
        }
        return exponent < 0 ? 1 / result : result;
    }
}
