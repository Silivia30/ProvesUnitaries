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
final public class Party {
    private final String name;
    
    public Party(String name) { this.name = name; }
    
    public String getName() { return this.name; }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Party party1 = (Party) o;
        return this.name.equals(party1.name);
    }
    
    @Override
    public int hashCode() { return this.name.hashCode(); }
    
    @Override
    public String toString() {
        return "Party{" + "name='" + this.name + '\'' + '}';
    }
}
