package view;

import model.Mail;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class MailListReader {
    
    public static List<String> obtainValidMail(String file) throws FileNotFoundException, IOException {
        String line;
        Mail mail;
        List<String> validMails = new ArrayList<String>();
        FileReader f = new FileReader(file);
        BufferedReader b = new BufferedReader(f);
        while ((line = b.readLine())!= null){
            mail = new Mail(line);
            if(mail.getEmail().contains("@")){
                validMails.add(mail.getDomain());
            }
        }
        b.close();
        return validMails;
    }
    

}
