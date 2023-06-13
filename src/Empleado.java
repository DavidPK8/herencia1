public class Empleado extends Personas{
    private String cargo;
    private String puesto;

    public Empleado(){
        super();
    }

    //Constructor especial
    public Empleado(int ci, String nombre, String apellido, String direccion, String telefono, String cargo, String puesto) {
        super(ci, nombre, apellido, direccion, telefono);
        //Atributos propios de la clase empleado
        this.cargo = cargo;
        this.puesto = puesto;
    }
    //Metodos
    public void tramitar(){
        System.out.println("Este es el metodo de tramitar");
    }
}
