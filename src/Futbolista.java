public class Futbolista extends Personas{
    private String equipo;
    private String posicion;
    private int camiseta;
    private String representante;
    private int horas;

    public Futbolista(){
        super();
    }
    //Constructor especial
    public Futbolista(int ci, String nombre, String apellido, String direccion, String telefono, String equipo, String posicion, int camiseta, String representante, int horas) {
        super(ci, nombre, apellido, direccion, telefono);
        //Atributos propios de la clase futbolista
        this.equipo = equipo;
        this.posicion = posicion;
        this.camiseta = camiseta;
        this.representante = representante;
        this.horas = horas;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getCamiseta() {
        return camiseta;
    }

    public void setCamiseta(int camiseta) {
        this.camiseta = camiseta;
    }

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    //Metodos
    public void correr(){
        System.out.println("Este es el metodo de correr");
    }
    public void defender(){
        System.out.println("Este es el metodo de defender");
    }
}
