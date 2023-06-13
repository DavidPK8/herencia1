public class Doctor extends Personas{
    private int codigo;
    private String especialidad;
    private String horario;
    private String hospital;

    public Doctor(){
        super();
    }
    //Constructor especial
    public Doctor(int ci, String nombre, String apellido, String direccion, String telefono, int codigo, String especialidad, String horario, String hospital) {
        super(ci, nombre, apellido, direccion, telefono);
        //Atributos propios de la clase doctor
        this.codigo = codigo;
        this.especialidad = especialidad;
        this.horario = horario;
        this.hospital = hospital;
    }
    //Metodos
    public void examinar(){
        System.out.println("Este es el metodo de examinar");
    }
    public void curar(){
        System.out.println("Este es el metodo de curar");
    }
}
