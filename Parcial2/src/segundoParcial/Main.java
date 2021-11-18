public class Main {

    public static void main(String[] args) {

        //Objetos
        Profesor primerProfesor = new Profesor(100,"Jhon","Doe");
        Estudiante primerEstudiante= new Estudiante(44891421,"Luciano","Frasca","Analista");


        //Añadiendo materias
        primerEstudiante.getMateriasAprobadas().add("Poo");
        primerEstudiante.getMateriasAprobadas().add("Programacion Web");
        primerEstudiante.getMateriasAprobadas().add("Comunicacion Visual");

        primerEstudiante.getMateriasInscriptas().add("Poo");
        primerEstudiante.getMateriasInscriptas().add("Programacion Web");

        System.out.println("--Profesor--");
        System.out.println(primerProfesor);
        System.out.println("--Estudiante--");
        System.out.println(primerEstudiante);

        //Imprimiendo Materias
        System.out.println("-----------");
        primerEstudiante.imprimirMateriasAprobadas();
        System.out.println("-----------");
        primerEstudiante.imprimirMateriasInscriptas();






    }
}
