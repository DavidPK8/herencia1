public class Estudiante extends Personas{
    private int codigo;
    private String correo;
    private String semestre;
    private String carrera;

    public Estudiante(){
        super();
    }

    //Constructor especial
    public Estudiante(int ci, String nombre, String apellido, String direccion, String telefono, int codigo, String correo, String semestre, String carrera) {
        super(ci,nombre, apellido, direccion, telefono);
        //Atributos propios de la clase estudiante
        this.codigo = codigo;
        this.correo = correo;
        this.semestre = semestre;
        this.carrera = carrera;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    //Metodos
    public void estudiar(){
        System.out.println("Este es el metodo de estudiar que pertenece a estudiante");
    }
    public void memorizar(){
        System.out.println("Este es el metodo de memorizar que pertenece a estudiante");
    }
    public void leer(){
        System.out.println("Este es el metodo de leer");
    }
}
