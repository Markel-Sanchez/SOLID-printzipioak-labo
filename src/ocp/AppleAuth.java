package ocp;

public class AppleAuth implements AuthenticationProvider{
	@Override
    public boolean signIn(String log, String pass) {
        // use the Apple api
        return true;
    }
}
