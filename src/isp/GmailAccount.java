package isp;

public class GmailAccount implements IEmailable {
    String name, emailAddress;
    
    public GmailAccount(String name, String emailAddress) {
        this.name = name;
        this.emailAddress = emailAddress;
    }

    // IEmailable interfazearen metodoa inplementatu
    @Override
    public String getEmail() {
        return emailAddress;
    }
}
