/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author sbp5
 */
final public class MailAddress {
    private final String mail;
    
    public MailAddress(String mail) throws Exception{
        if(isValid(mail)){this.mail = mail;}
        else{
            throw new Exception("Invalid mail adress on MailAddress().");
        }
    }
    
    private boolean isValid(String mail){ //found on StackOverflow https://stackoverflow.com/questions/624581/what-is-the-best-java-email-address-validation-method
           String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
           java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
           java.util.regex.Matcher m = p.matcher(mail);
           return m.matches();
    }
    
    public String getMailAdress(){return this.mail;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MailAddress ma = (MailAddress) o;
        return this.mail.equals(ma.mail);
    }
    
    @Override
    public int hashCode() { return this.mail.hashCode(); }
    
    @Override
    public String toString() {
        return "Mail{" + "adress='" + this.mail + '\'' + '}';
    }
}
