import java.util.ArrayList;


public class App {
    static ArrayList<User> userList = new ArrayList<>();

    public static void main(String[] args) {

        while (true) {
            int select = UI.mainUI();
            if (select == 1) {
                Auth.signIn(userList);
            }
            if (select == 2) {
                Auth.signUp(userList);
            } // 회원가입
            if (select == 3) {
                GetUserList.getUserList(userList);
            }
            if (select == 4) break;

        }
    }
}
