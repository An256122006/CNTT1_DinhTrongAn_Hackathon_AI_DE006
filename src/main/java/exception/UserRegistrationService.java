package exception;

public class UserRegistrationService {

    public User registerUser(UserRequest request) {
        if (request.getAge() < 18) {
            throw new IllegalArgumentException("Tuổi của người dùng phải từ 18 trở lên");
        }

        if (request.getUsername() == null || request.getUsername().isEmpty()) {
            throw new IllegalArgumentException("Tên đăng nhập không được để trống");
        }

        return new User(request.getUsername(), request.getAge());
    }
}
