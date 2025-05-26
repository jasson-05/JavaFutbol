public class Masajista  extends Persona{
   private String Titulacion;
    private Integer aniosExperiencia;

    public Masajista() {
    }

    public Masajista(Integer id, String nombre, String apellido, Integer edad, String titulacion,
            Integer aniosExperiencia) {
        super(id, nombre, apellido, edad);
        Titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getTitulacion() {
        return Titulacion;
    }

    public void setTitulacion(String titulacion) {
        Titulacion = titulacion;
    }

    public Integer getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(Integer aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public void darMasae() {
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
