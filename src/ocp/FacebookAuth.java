package ocp;

public class FacebookAuth implements AuthenticationProvider{
	@Override
    public boolean signIn(String log, String pass) {
        // use the FB api
        return true;
    }
}
