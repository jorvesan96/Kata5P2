package view;


import java.util.List;
import model.Histogram;

public class MailHistogramBuilder {
    
    public static Histogram<String> mailHistogram (List <String> mail){
        Histogram<String> histogram = new Histogram<>();
         
        for (String mailName : mail) {
            histogram.increment(mailName);
            
        }
        return histogram;
    }
}
