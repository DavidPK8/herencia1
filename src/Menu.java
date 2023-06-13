public class Menu {
    public static void main(String[] args) {
        Personas miPersona = new Personas(1751808088, "David", "Vallejo", "Mi casa", "0984922077");
        Personas Pedro = new Personas();

        System.out.println(miPersona.getCi());
        System.out.println(Pedro.getCi());
        miPersona.caminar();


        Estudiante Mayerli = new Estudiante(1714400593, "Mayerli", "Casillas", "Mi chosa", "0979102077",
                /*Estos son atributos propios de estudiantes*/ 12332, "micorres.epn.edu.ec", "3ero", "Sistemas");
        Estudiante David = new Estudiante();

        System.out.println("Mayerli: " + Mayerli.getCi());
        Mayerli.estudiar();
        Mayerli.memorizar();
        Mayerli.leer();
        Mayerli.trabajar();
        Mayerli.caminar();

        David.setNombre("David");
        System.out.println("Nombre: " + David.getNombre());
        David.estudiar();
        David.memorizar();
        David.leer();
        David.trabajar();
        David.caminar();

        //Ejercicio en Clase
        Doctor Ana = new Doctor();
        Ana.setNombre("Ana");
        Ana.setEdad(33);
        Ana.setSigno("Acuario");
        System.out.println("\n" + Ana.getNombre() + " es Doctora");
        System.out.println("Tiene " + Ana.getEdad() + " anios");
        System.out.println("Es de signo " + Ana.getSigno());
        Ana.examinar();

        Empleado Pablo = new Empleado();
        Pablo.setNombre("Pablo");
        Pablo.setTelefono("123456");
        System.out.println("\n" + Pablo.getNombre() + " es Empleado Publico");
        System.out.println("Su telefono es " + Pablo.getTelefono());
        Pablo.tramitar();

        Futbolista Maritza = new Futbolista();;
        Maritza.setNombre("Maritza");
        Maritza.setHoras(5);
        System.out.println("\n" + Maritza.getNombre() + " es Futbolista");
        System.out.println("Entrena " + Maritza.getHoras() + " horas diarias");
        Maritza.correr();

        Estudiante Melani = new Estudiante();
        Melani.setNombre("Melanie");
        Melani.setSemestre("3er Semestre");
        System.out.println("\n" + Melani.getNombre() + " es Estudiante");
        System.out.println("Esta en " + Melani.getSemestre());
        Melani.leer();
    }
}