
package clases;

public class Gato extends Animal{
    private String raza;
    
    
    public Gato(){
        super(Sexo.MACHO);
        this.raza = "siames";
    }
    
    public Gato(Sexo sexo){
        super(sexo);
        this.raza = "siames";
    }
    
    
    public Gato(String raza){
        super(Sexo.MACHO);
        this.raza = raza;
    }
    
    public Gato(Sexo sexo, String raza){
        super(sexo);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    public void maulla(){
        System.out.println("miauuuuuu");
    }
    
    public void ronronea(){
        System.out.println("grgrgrgr");
    }
    
    @Override
    public String toString(){
        return super.toString() + "nRaza: " + raza;
        
    }
    
    public void pelearCon(Gato contra){
        if(this.getSexo()== contra.getSexo()){ 
            if(this.getSexo() == Sexo.HEMBRA){
                System.out.println("Se pelean");
            } else {
                System.out.println("Los gatos se insultan");
            }
        } else {
            System.out.println("No se pelean");
        }
    }
    
    
    public void comer(String comida){
        if(comida.equals("pescado")){
            System.out.println("mmm, muchas gracias"); 
        }else {
            System.out.println("No gracias, no me gusta la comidad.");
        }
    }
}




