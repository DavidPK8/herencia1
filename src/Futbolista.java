public class Futbolista extends Personas{
    private String equipo;
    private String posicion;
    private int camiseta;
    private String representante;

    public Futbolista(){
        super();
    }
    //Constructor especial
    public Futbolista(int ci, String nombre, String apellido, String direccion, String telefono, String equipo, String posicion, int camiseta, String representante) {
        super(ci, nombre, apellido, direccion, telefono);
        //Atributos propios de la clase futbolista
        this.equipo = equipo;
        this.posicion = posicion;
        this.camiseta = camiseta;
        this.representante = representante;
    }
    //Metodos
    public void correr(){
        System.out.println("Este es el metodo de correr");
    }
    public void defender(){
        System.out.println("Este es el metodo de defender");
    }
}
