package isp;

public class EmailSender {
    public static void sendEmail(IEmailable c, String message){
    	System.out.println("Email bat bidaltzen '" + c.getEmail() + "' helbidera.");
        System.out.println("Mezua: " + message);
    }
}

