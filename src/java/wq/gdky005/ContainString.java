package wq.gdky005;

/**
 *
 * 给定一长串a, 短串b, 快速判断出短串b的所有字符都在长串a中
 *
 *  1.a是“ABCD”， b是“BAD” --> true;
 *  2.a是“ABCD”， b是“BCE” --> false;
 *  3.a是“ABCD”， b是“AA” --> true;
 *
 * Created by wangqing on 16/3/22.
 */
public class ContainString {
    public static void main(String[] args) {

        char[] a = "ABCD".toCharArray();
        char[] b = "BCE".toCharArray();

        System.out.println(StringContain2(a, b));
    }

    /**
     *
     * @param a
     * @param b
     * @return
     */
    private static boolean StringContain2(char[] a, char[] b) {
        return false;
    }





    /**
     * 1.蛮力轮询
     *
     * 时间复杂度为： O(mn)
     *
     * @param a
     * @param b
     * @return
     */
    public static boolean StringContain1(char[] a, char[] b) {

        for (int i = 0; i < b.length; i++) {
            int j;

            for ( j = 0; j < a.length && a[j] != b[i]; j++);

            if (j >= a.length){
                return false;
            }
        }


        return true;
    }

}
