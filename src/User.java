public class User {
    private String email;
    private String PW;

    public User(String email, String PW) {
        this.email = email;
        this.PW = PW;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPW() {
        return PW;
    }

    public void setPW(String PW) {
        this.PW = PW;
    }
}
