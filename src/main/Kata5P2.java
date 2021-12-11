package main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import view.MailListReaderBD;
import model.Histogram;
import model.Mail;
import view.HistogramDisplay;
import view.MailHistogramBuilder;

public class Kata5P2 {
    
    private List <String> mails = new ArrayList<>();
    private Histogram<String> histo = new Histogram<>();
    private HistogramDisplay  display;
    
    public static void main(String[] args) throws IOException, Exception {
        Kata5P2 kata = new Kata5P2();
        kata.execute();
    }
    private void execute() throws IOException{
        input();
        process();
        output();
    }
    
    
    private void input() throws IOException{
        List<Mail> b = MailListReaderBD.read();

        for (Mail mail : b) {
            mails.add(mail.toString()); // NO LO PIDE EL PROFE (TOSTRING)
        }
    }
     
    private void process()throws  IOException{
        List<Mail> c = new ArrayList<>();
        for (String mail : mails) {
            c.add(new Mail(mail));
        }

        histo = MailHistogramBuilder.build(c);
    }
    
    private void output(){
        display = new HistogramDisplay(histo);
        display.execute();
        
    }

}
