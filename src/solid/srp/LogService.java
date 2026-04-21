package solid.srp;

// 로그 저장을 담당할 클래스
public class LogService {

    public void saveLog(User user) {
        System.out.println("[로그] USER_JOIN - name=" + user.getName() + ", email=" + user.getEmail());
    }
}
