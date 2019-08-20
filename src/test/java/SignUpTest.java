import org.junit.jupiter.api.Test;

import controller.users.SignUpMB;

public class SignUpTest {

	@Test
	public void verifyPasswordIsTheSame() {
		SignUpMB mb = new SignUpMB();
		mb.setPassword("123");
		mb.setPassword("12");
		mb.verifyPasswordIsTheSame();
	}
}
