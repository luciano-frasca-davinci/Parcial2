import java.util.ArrayList;

public class Estudiante extends Usuario {

    @Override
    public int getDni() {
        return super.getDni();
    }

    @Override
    public void setDni(int dni) {
        super.setDni(dni);
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    @Override
    public String getApellido() {
        return super.getApellido();
    }

    @Override
    public void setApellido(String apellido) {
        super.setApellido(apellido);
    }

    //Atributos

    private String carrera;
    private ArrayList<String> materiasAprobadas = new ArrayList<String>();
    private ArrayList<String> materiasInscriptas = new ArrayList<String>();

    //Constructor

    public Estudiante(int dni, String nombre, String apellido, String carrera) {
        super(dni, nombre, apellido);
        this.carrera = carrera;
    }

    //Metodos


    public ArrayList<String> getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public void setMateriasAprobadas(ArrayList<String> materiasAprobadas) {
        this.materiasAprobadas = materiasAprobadas;
    }

    public ArrayList<String> getMateriasInscriptas() {
        return materiasInscriptas;
    }

    public void setMateriasInscriptas(ArrayList<String> materiasInscriptas) {
        this.materiasInscriptas = materiasInscriptas;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void imprimirMateriasAprobadas(){
        System.out.println("Materias aprobadas: ");
        for (int i=0;i< materiasAprobadas.size();i++){
            System.out.println(materiasAprobadas.get(i));
        }
    }
    public void imprimirMateriasInscriptas(){
        System.out.println("Materias Inscriptas: ");
        for (int i=0;i< materiasInscriptas.size();i++){
            System.out.println(materiasInscriptas.get(i));
        }
    }
}
