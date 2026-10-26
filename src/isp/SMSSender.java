package isp;

public class SMSSender {
    public static void sendSMS(ISMSable c, String message){
    	System.out.println("SMS bat bidaltzen '" + c.getTelephone() + "' zenbakira.");
        System.out.println("Mezua: " + message);
    }
}
