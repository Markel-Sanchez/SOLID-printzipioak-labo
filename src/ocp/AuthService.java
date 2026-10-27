package ocp;

public class AuthService {
	public boolean signIn(AuthenticationProvider provider, String log, String pass) {
        return provider.signIn(log, pass);
    }
}
