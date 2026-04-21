package solid.srp;

// 회원가입을 담당할 클래스
public class UserService {
    private final LogService logService;
    private final EmailService emailService;
    private final EmailValidator emailValidator;

    public UserService(LogService logService, EmailService emailService, EmailValidator emailValidator) {
        this.logService = logService;
        this.emailService = emailService;
        this.emailValidator = emailValidator;
    }
    // 회원가입 메서드
    public void join(User user) {
        // 이메일 유효성 검사
        if (!emailValidator.isValid(user.getEmail())) {
            System.out.println("[회원가입 실패] 이메일 형식이 올바르지 않습니다.");
            return;
        }
        // 사용자 정보 등록
        register(user);
        // 가입 환영 이메일 발송
        emailService.sendEmail(user);
        // 가입 로그 저장
        logService.saveLog(user);
    }

    // 사용자 정보 등록 메서드
    private void register(User user) {
        System.out.println("[회원가입] 사용자 등록 완료: " + user.getName() + ", "  + user.getEmail());
    }
}
