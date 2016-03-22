package wq.gdky005;

/**
 * 将"I am a student!" 按照单词反转的方式 转换为 "student! a am I",不考虑标点符号
 *
 * Created by WangQing on 16/3/22.
 */
public class WordLesson {
    public static void main(String[] args) {
        String str = "I am a student!";
        char[] s = str.toCharArray();
        System.out.println(traverseStr(s, s.length));
    }

    public static char[] rotate(char[] s, int from, int to){

        while (from < to) {
            char t = s[from];
            s[from++] = s[to];
            s[to--] = t; //这里总是一不小心写成"--", 切记这里是从字符 子串 的最后位置往前遍历
        }

        return s;
    }

    public static char[] traverseStr(char[] s, int n) {

        int i = 0;
        int start = 0;
        int end = 0;
        char space = " ".charAt(0);

        s = rotate(s, 0, n - 1);

        while (n-- > 0) {
            char t = s[i];

            if (t == space) {
                end = i - 1;
                rotate(s, start, end);
                start = i + 1;
            }

                i++;
        }

        return s;
    }

}






















