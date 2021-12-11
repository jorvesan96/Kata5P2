package view;


import java.util.List;
import model.Histogram;
import model.Mail;

public class MailHistogramBuilder {
    
    public static Histogram<String> build (List <Mail> mail){
        Histogram<String> histogram = new Histogram<>();
         
        for (Mail mailName : mail) {
            histogram.increment(mailName.getDomain());
        }
        return histogram;
    }
}
