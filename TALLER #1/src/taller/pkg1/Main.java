//esteban gonzalez y jose manuel donado
package taller.pkg1;


public class Main {
 
    public static void main(String[] args) {
        EstudianteInternacional e1;
        e1 = new EstudianteInternacional();
        
        e1.setNombre("Juan"); 
        e1.setDireccion("Calle 80 #55-23 de Soledad ");
        e1.setInstituto("Sagrado corazon");
        e1.setGrado(11);
        e1.setPais("Colombia");

        
        System.out.println(e1.getNombre()+ " vive en la " +e1.getDireccion()+", estudio en "+ e1.getInstituto()+", curso "+e1.getGrado()+" grado"+", soy de "+e1.getPais());
        e1.correr();
        e1.dormir();
        e1.estudiar();
        e1.aprenderIdioma();
    }
    
}
