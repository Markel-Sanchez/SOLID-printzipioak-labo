package isp;

public class Main {
    public static void main(String[] args) {
        // GmailAccount objektu bat sortu
        GmailAccount myGmail = new GmailAccount("Jon", "jon@gmail.com");
        
        // EmailSender klaseko metodoari deitu
        EmailSender.sendEmail(myGmail, "Kaixo, hau proba mezu bat da!"); 
    }
}
