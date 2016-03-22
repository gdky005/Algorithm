package wq.gdky005;

/**
 * 将字符串 "abcdef" 转换为 "defabc"
 * <p>
 * Created by WangQing on 16/3/22.
 */
public class MoveCharLesson {
    public static void main(String[] args) {
        String s = "abcdef";
        char[] c = s.toCharArray();
        System.out.println(getStringRotate(c, c.length, 3));
    }

    public static char[] rotate(char[] s, int from, int to) {
        while (from < to) {
            char t = s[from]; //这里一定要注意,是从from位置开始,不能从0开始,否则就失去旋转的意义了
            s[from++] = s[to];
            s[to--] = t;
        }
        return s;
    }

    public static char[] getStringRotate(char[] s, int n, int m) {
        m %= n;

        rotate(s, 0, m - 1);
        rotate(s, m, n - 1);
        rotate(s, 0, n - 1);
        return s;
    }

}
























