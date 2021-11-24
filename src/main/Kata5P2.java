package main;

import java.io.IOException;
import java.util.List;
import view.MailListReader;
import model.Histogram;
import view.HistogramDisplay;
import view.MailHistogramBuilder;

public class Kata5P2 {
    
    public List <String> mails;
    Histogram<String> histo = new Histogram<>();
    
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
        String fileName = "email.txt";
        mails = MailListReader.obtainValidMail(fileName);

    }
     
    private void process()throws  IOException{
        histo = MailHistogramBuilder.mailHistogram(mails);
    }
    
    private void output(){
        HistogramDisplay  display = new HistogramDisplay(histo);
        display.execute();
        
    }

}
