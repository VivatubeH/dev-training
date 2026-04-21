package solid.srp;

// 이메일 유효 여부를 검사하는 클래스
public class EmailValidator {

    // 이메일이 유효한지 검증하는 메서드
    // 이메일에 @가 포함되어 있어야 유효하다.
    public boolean isValid(String email) {
        return email.contains("@");
    }
}
