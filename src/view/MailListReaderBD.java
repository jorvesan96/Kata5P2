package view;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Mail;


// HAY QUE PILLARLOS DE LA BASE DE DATOS
public class MailListReaderBD {
    public static List<Mail> read () throws FileNotFoundException, IOException{
        List<Mail> validMails = new ArrayList<>();
        String sql = "SELECT * FROM DIRECC_EMAIL";
        Mail mail;
        String url = "jdbc:sqlite:KATA5.db";
        
        try(Connection conn = DriverManager.getConnection(url);
            Statement state = conn.createStatement();
            ResultSet resultSet = state.executeQuery(sql)){
            
            while(resultSet.next()){
                
                mail = new Mail(resultSet.getString("Direccion"));
                if(mail.getDomain()!="")validMails.add(mail);
            }
        }catch(SQLException exe){
            System.out.println(exe.getMessage());
        }
        
        
        return validMails;
    }
}
