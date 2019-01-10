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
final public class DigitalSignature {
    private final String signature;
    
    public DigitalSignature(String s){this.signature = s;}
    
    public String getDigitalSignature(){return this.signature;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DigitalSignature ds = (DigitalSignature) o;
        return this.signature.equals(ds.signature);
    }
    
    @Override
    public int hashCode() { return this.signature.hashCode(); }
    
    @Override
    public String toString() {
        return "DigitalSignature{" + "signature='" + this.signature + '\'' + '}';
    }
}
