
package taller.pkg1;

public class EstudianteInternacional extends Estudiante {
    private String Pais;

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }
    void aprenderIdioma(){
        System.out.println("Estudia Frances todos los sabados");
    }
}
