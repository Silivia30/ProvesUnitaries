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
final public class MailAdress {
    private final String mail;
    
    public MailAdress(String mail){this.mail = mail;}
    
    public String getMailAdress(){return this.mail;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MailAdress ma = (MailAdress) o;
        return this.mail.equals(ma.mail);
    }
    
    @Override
    public int hashCode() { return this.mail.hashCode(); }
    
    @Override
    public String toString() {
        return "Mail{" + "adress='" + this.mail + '\'' + '}';
    }
}
