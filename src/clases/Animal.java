/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;


public abstract class Animal {
    private Sexo sexo;
    
    public Animal(){
        sexo = Sexo.MACHO;
    }
    
    public Animal(Sexo sexo){
        this.sexo = sexo;
    }
    
    public Sexo getSexo(){
        return sexo;
    }
    
    public void setSexo(Sexo sexo){
        this.sexo = sexo;
    }
    
    @Override
    public String toString(){
        return "Sexo: " + this.sexo;
    }
    
    public void dormir(){
        System.out.println("zzzzzzz");
    }
    
    
    
}
