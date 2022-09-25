
package taller.pkg1;


public class Estudiante extends Persona{
    private String Instituto;
    private int Grado;


    public String getInstituto() {
        return Instituto;
    }

    public void setInstituto(String Instituto) {
        this.Instituto = Instituto;
    }

    public int getGrado() {
        return Grado;
    }

    public void setGrado(int Grado) {
        this.Grado = Grado;
    }
   void estudiar(){
       System.out.println("Estudia de 12 a 6pm");
   }
    
    }

   
    

   

