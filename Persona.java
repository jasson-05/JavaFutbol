public  abstract class Persona {
private Integer id;
private String Nombre;
private String Apellidos;
private Integer Edad;

public Persona() {
}

public Persona(Integer id, String nombre, String apellidos, Integer edad) {
    this.id = id;
    Nombre = nombre;
    Apellidos = apellidos;
    Edad = edad;
}

public Integer getId() {
    return id;
}

public void setId(Integer id) {
    this.id = id;
}

public String getNombre() {
    return Nombre;
}

public void setNombre(String nombre) {
    Nombre = nombre;
}

public String getApellidos() {
    return Apellidos;
}

public void setApellidos(String apellidos) {
    Apellidos = apellidos;
}

public Integer getEdad() {
    return Edad;
}

public void setEdad(Integer edad) {
    Edad = edad;
}

public abstract void Concentrarse();
    

    public abstract void Viajar();
       


}
