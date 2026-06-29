package exception;

public class UserRequest {
    private String username;
    private int age;

    public UserRequest() {}

    public UserRequest(String username, int age) {
        this.username = username;
        this.age = age;
    }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
}
