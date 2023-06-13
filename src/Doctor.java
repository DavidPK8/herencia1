public class Doctor extends Personas{
    private int codigo;
    private String especialidad;
    private String horario;
    private String hospital;
    private int edad;
    private String signo;

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
        this.edad = edad;
        this.signo = signo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSigno() {
        return signo;
    }

    public void setSigno(String signo) {
        this.signo = signo;
    }

    //Metodos
    public void examinar(){
        System.out.println("Este es el metodo de examinar");
    }
    public void curar(){
        System.out.println("Este es el metodo de curar");
    }
}
