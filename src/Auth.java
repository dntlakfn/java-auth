import java.util.ArrayList;

public class Auth {
    public static void signIn(ArrayList<User> userList) {
        User user = UI.signInUI();
        boolean isUser = false;
       for (int i = 0; i< userList.size(); i++) {
           User realUser = userList.get(i);
           // 이메일 비교
           if (!realUser.getEmail().equals(user.getEmail())) {
               isUser = false;
               continue;

           }
            isUser = true;
           // 비밀번호 비교
           if (!realUser.getPW().equals(user.getPW())) {
               System.out.println("비밀번호가 틀렸습니다");
           }
           else {
               System.out.println("로그인 성공");
           }
       }
       if (!isUser) System.out.println("가입한 사용자가 아닙니다");

    }

    public static void signUp(ArrayList<User> userList) {
        User user =  UI.signUpUI();
        if (user.getEmail().equals("")) {
            System.out.println("비밀번호가 서로 다릅니다");
        } else {
            userList.add(user);
        }
    }
}
