package ocp;

public interface AuthenticationProvider {
	boolean signIn(String log, String pass);
}
