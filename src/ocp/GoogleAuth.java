package ocp;

public class GoogleAuth implements AuthenticationProvider{
	@Override
    public boolean signIn(String log, String pass) {
        // use the google api
        return true;
    }
}
