package model;

public class Mail {
    
    private final String mail;

    public Mail(String mail) {
        this.mail = mail;
    }
    
    public String getDomain(){
        try{
            String[] domain = this.mail.split("@");
            return domain[1];
        }catch(Exception e){
            return "";
        }
    }
    
    @Override
    public String toString(){
        return mail;
    }

}
