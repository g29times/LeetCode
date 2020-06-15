package highFrequencyLeetcode.leetcode_509;

/**
 * . _________         .__   _____   __
 * ./   _____/__  _  __|__|_/ ____\_/  |_
 * .\_____  \ \ \/ \/ /|  |\   __\ \   __\
 * ./        \ \     / |  | |  |    |  |
 * /_______  /  \/\_/  |__| |__|    |__|
 * .       \/
 * <p>
 * <a href="https://leetcode.com/problems/fibonacci-number/">fibonacci-number</a>
 *
 * @author li tong
 * @description: Given N, calculate F(N).
 * @date 2020/06/15 08:29
 * @see Object
 * @since 1.0
 */
public class FibonacciNumber {

    public static void main(String[] args) {  // 1 1 2 3 5 8
        System.out.println(recursion(6));
    }

    /**
     * 解法1 递归
     * <p>
     * 遍历每个元素 x，
     * <p>
     * 时间复杂度 O(n²)
     * 空间复杂度 O(1)
     */
    public static int recursion(int n) {
        // TODO
        if (n <= 1) {
            return n;
        }
        return recursion(n - 1) + recursion(n - 2);
    }

    /**
     * 解法4 矩阵
     * <p>
     * 遍历每个元素 x，
     * <p>
     * 时间复杂度 O(n²)
     * 空间复杂度 O(1)
     */
    public static int matrix(int n) {
        // TODO
        throw new RuntimeException("No solution");
    }

}
