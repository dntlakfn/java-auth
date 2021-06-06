import java.nio.file.LinkPermission;
import java.util.Scanner;

public class Input {
    final static Scanner S = new Scanner(System.in);

    public static int  inputInt(int max) {
        try {
            int select = Integer.parseInt(S.next());
            if (select < 0 || select > max) {
                throw new Exception("범위가 틀립니다");
            }
            return select;
        }catch(Exception e) {
            System.out.println("잘못 입력 : " + e.getMessage());
            return -1;
        }
    }

    public static String InputStr() {
        try {
            String select = S.next();
            return select;
        }catch(Exception e) {
            System.out.println("잘못 입력 : " + e.getMessage());
            return "";
        }
    }
}
