public class Menu {
    public static void main(String[] args) {
       Personas miPersona = new Personas(1751808088, "David", "Vallejo", "Mi casa", "0984922077");
       Personas Pedro = new Personas();

       System.out.println(miPersona.getCi());
       System.out.println(Pedro.getCi());
       miPersona.caminar();

       Estudiante Mayerli = new Estudiante(1714400593, "Mayerli", "Casillas", "Mi chosa", "0979102077",
               /*Estos son atributos propios de estudiantes*/ 12332, "micorres.epn.edu.ec", "3ero", "Sistemas");
       Mayerli.estudiar();
    }
}