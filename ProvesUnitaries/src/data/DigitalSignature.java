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
    private final byte[] key;
    
    public DigitalSignature(byte[] s) throws Exception{
        if(s != null){this.key = s;}
        else{throw new Exception("Invalid Digital Signature on DigitalSignature().");}
    }
    
    public byte[] getDigitalSignature() {return this.key;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DigitalSignature ds = (DigitalSignature) o;
        return this.key.equals(ds.key);
    }
    
    @Override
    public int hashCode() { return this.key.hashCode(); }
    
    @Override
    public String toString() {
        return "DigitalSignature{" + "key='" + this.key + '\'' + '}';
    }
}
