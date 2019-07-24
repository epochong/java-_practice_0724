import java.util.Scanner;

/**
 * @author epochong
 * @date 2019/7/24 18:14
 * @email epochong@163.com
 * @blog epochong.github.io
 * @describe
 */
public class 乒乓球筐 {
    public static boolean isEquals(String a,String b, char c) {
        int aStart = a.indexOf(c);
        int aEnd = a.lastIndexOf(c);
        int bStart = b.indexOf(c);
        int bEnd = b.lastIndexOf(c);
        if (aStart == -1) {
            return false;
        }
        for (int i = bStart; i <= bEnd; i++) {
            if (b.charAt(i) != a.charAt(aStart) || aStart > aEnd) {
                return false;
            }
            aStart++;
        }
        return true;
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            String A = input.next();
            String B = input.next();
            boolean judge = true;
            for (int i = 0; i < B.length(); i++) {
                if (!isEquals(A,B,B.charAt(i))) {
                    judge = false;
                }
            }
            if (judge) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
