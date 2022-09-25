
package taller.pkg1;

public class Persona {
    private String Nombre;
     private String Direccion;

   

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }
    void correr(){
        System.out.println("corre 5.0Km durante 45min");
    }
    void dormir(){
        System.out.println("duerme durante 1h");
    }
}
