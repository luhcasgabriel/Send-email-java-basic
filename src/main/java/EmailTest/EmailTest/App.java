package EmailTest.EmailTest;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 * Hello world!
 *
 */
public class App {

    public static void sendEmail(String recepient) throws Exception {
      
      System.out.println("preparing to send email");
      Properties properties = new Properties();
      
      properties.put("mail.smtp.auth", "true");
      properties.put("mail.smtp.starttls.enable", "true");
      properties.put("mail.smtp.host", "smtp.gmail.com");
      properties.put("mail.smtp.port", "587");
      
      final String myAccountEmail = "xxxxxx";
      final String password = "xxxxxx";
      
    
      Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
        @Override
        protected PasswordAuthentication getPasswordAuthentication() {
          return new PasswordAuthentication(myAccountEmail, password);
        }
      });
      
      Message message = prepareMessage(session, myAccountEmail, recepient);
      
      Transport.send(message);
      System.out.println("message sent successffuly");
      
    }
    
    private static Message prepareMessage(Session session, String myAccountEmail, String recepient) {
      
      try {
        
        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress(myAccountEmail));
        message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepient));
        message.setSubject("My First Email From java app");
        String htmlCode = "<h1>TEST SEND EMAIL </h1>";
        message.setContent(htmlCode, "text/html");
        
        return message;
      }
      catch (Exception e) {
//        Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, e);
        System.out.println("eroo: " + e.getMessage());
      }
      
      return null;
    }
    
}