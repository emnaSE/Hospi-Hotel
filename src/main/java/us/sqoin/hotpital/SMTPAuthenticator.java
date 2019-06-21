package us.sqoin.hotpital;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class SMTPAuthenticator extends javax.mail.Authenticator {
    String user;
    String password;

    public SMTPAuthenticator() {
        user = "admin@sqoin.us";
        password = "24a4BsE2xYDdq88CVRbJ";
    }

    public PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication(user, password);
    }

}