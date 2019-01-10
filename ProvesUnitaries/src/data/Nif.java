/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import static java.lang.Integer.parseInt;

/**
 *
 * @author sbp5
 */
final public class Nif {
    private final String nif;
    
    public Nif(String nif) throws Exception {
        if(isValid(nif)){
            this.nif = nif.toUpperCase();
        }else{
            throw new Exception("Invalid NIF on Nif().");
        }  
    }
    
    private boolean isValid(String nif){ //valid nif -> 8 numbers + 1 letter: 00000000A
        if(nif == null || nif.length()!=9) return false; //incorrect amount of characters, not valid
        String numbers = nif.substring(0, 8);
        String letter = nif.substring(8, 9);
        try{
            parseInt(numbers);
        }catch(Exception e){ return false; } //first 8 chars cannot be converted to int, not valid
        if(!letter.matches("[a-zA-z]{1}"))return false; //last char is not a letter, not valid
        return true;
    }
    
    public String getNIF(){return this.nif;} 
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Nif nif1 = (Nif) o;
        return this.nif.toUpperCase().equals(nif1.nif.toUpperCase()); //To ignore case
    }    
    
    @Override
    public int hashCode() { return this.nif.hashCode();} 
     
    @Override
    public String toString() {
        return "NIF{" + "nif='" + this.nif + '\'' + '}';
    }
}
