import java.util.SortedMap;

public class UI {
    public static int mainUI() {
        System.out.println("서비스에 오신것을 환영 합니다.");
        System.out.println("1. 로그인");
        System.out.println("2. 회원가입");
        System.out.println("3. 사용자 조회");
        System.out.println("4. 종료");
        System.out.print("숫자 입력 : ");
        return Input.inputInt(4);
    }

    public static User signInUI() {
        System.out.print("이메일 입력");
        String email = Input.InputStr();
        System.out.print("비밀번호 입력");
        String password = Input.InputStr();
        return new User(email, password);
    }
    public static User signUpUI() {
        System.out.print("이메일 입력");
        String email = Input.InputStr();
        System.out.print("비밀번호 입력");
        String password = Input.InputStr();
        System.out.print("비밀번호 다시입력");
        String rePassword = Input.InputStr();
        if (!password.equals(rePassword)) return new User("", "");
        return new User(email, password);
    }
}
