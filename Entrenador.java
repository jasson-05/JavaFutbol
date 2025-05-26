public class Entrenador extends Persona {
private String idFederacion;

    public Entrenador() {
    }

    public Entrenador(Integer id, String nombre, String apellido, Integer edad, String idFederacion) {
        super(id, nombre, apellido, edad);
        this.idFederacion = idFederacion;
    }

    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }

    public void dirigirPartido() {
        System.out.println("Dirigiendo el partido... ");
    }

    public void dirigirEntrenamiento() {
        System.out.println("Concentrandose  futbolista... ");
    }

    @Override
    public void Concentrarse() {
        System.out.println("Concentrandose  futbolista... ");
    }

    @Override
    public void Viajar() {
        System.out.println("viajando futbolista... ");
    }
}
