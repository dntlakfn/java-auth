import java.util.ArrayList;

public class GetUserList {
    public static void getUserList(ArrayList<User> userList) {
        if (userList.isEmpty()) System.out.println("유저가 없습니다");
        else {
            for (int i = 0; i < userList.size(); i++) {
                User user = userList.get(i);
                String userDate = String.format(" 이메일 : %s, 비밀번호 : %s \n", user.getEmail(), user.getPW());
                System.out.println(userDate);
            }
        }
    }
}
