public class Futbolista extends Persona{
     private Integer dorsal;
    private String demarcacion;

    public Futbolista() {

    }

    public Futbolista(Integer id, String nombre, String apellido, Integer edad, Integer dorsal, String demarcacion) {
        super(id, nombre, apellido, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public Integer getDorsal() {
        return dorsal;
    }

    public void setDorsal(Integer dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    public void jugarPartido() {
        System.out.println("jugando partido... ");
    }

    public void entrenar() {
        System.out.println("entrenando... ");
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
