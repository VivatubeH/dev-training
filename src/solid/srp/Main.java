package solid.srp;

public class Main {
    public static void main(String[] args) {
        // User 객체 생성
        User user = new User("kim", "kim@test.com");

        // 필요한 서비스 객체 생성
        LogService logService = new LogService();
        EmailService emailService = new EmailService();
        EmailValidator emailValidator = new EmailValidator();

        // User 서비스 객체를 생성.
        UserService userService = new UserService(logService, emailService, emailValidator);
        // 회원가입 실행
        userService.join(user);

    }
}
