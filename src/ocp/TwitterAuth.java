package ocp;

public class TwitterAuth implements AuthenticationProvider{
	@Override
	public boolean signIn(String log, String pass) {
		// use the Twitter api
		return true;
	}
}
