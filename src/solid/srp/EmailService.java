package solid.srp;

// 이메일 발송을 담당할 클래스
public class EmailService {

    public void sendEmail(User user) {
        System.out.println("[이메일] " + user.getEmail() + " 로 가입 환영 메일을 발송했습니다.");
    }
}
