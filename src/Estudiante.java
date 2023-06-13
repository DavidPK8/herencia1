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
        super(ci, nombre, apellido, direccion, telefono);
        //Atributos propios de la clase estudiante
        this.codigo = codigo;
        this.correo = correo;
        this.semestre = semestre;
        this.carrera = carrera;
    }
    //Metodos
    public void estudiar(){
        System.out.println("Este es el metodo de estudiar");
    }
    public void memorizar(){
        System.out.println("Este es el metodo de memorizar");
    }
}
