public class Personas {
    private int ci;
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;
    public Personas(){
    }
    //Constructores
    public Personas(int ci, String nombre, String apellido, String direccion, String telefono) {
        this.ci = ci;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
    }
    //Getters and setters


    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    //Metodos
    public void caminar(){
        System.out.println("Este es el metodo de caminar que pertenece a persona");
    }
    public void trabajar(){
        System.out.println("Este es el metodo de trabajar que pertenece a persona");
    }
}
