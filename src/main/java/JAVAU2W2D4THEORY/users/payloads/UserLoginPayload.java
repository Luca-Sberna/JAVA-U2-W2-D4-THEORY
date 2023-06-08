package JAVAU2W2D4THEORY.users.payloads;

import lombok.Getter;

@Getter
public class UserLoginPayload {
	String email;
	String password;
}