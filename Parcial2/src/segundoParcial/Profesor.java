import java.util.ArrayList;

public class Profesor extends Usuario{

    public Profesor(int dni, String nombre, String apellido) {
        super(dni, nombre, apellido);
    }

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

    private ArrayList<String> comisiones = new ArrayList<String>();

    //Constructores


    public Profesor(int dni, String nombre, String apellido, ArrayList<String> comisiones) {
        super(dni, nombre, apellido);
        this.comisiones = comisiones;
    }

    //Metodos

    public ArrayList<String> getComisiones() {
        return comisiones;
    }

    public void setComisiones(ArrayList<String> comisiones) {
        this.comisiones = comisiones;
    }

    public void imprimirComisiones(){
        System.out.println("Comisiones: ");
        for (int i=0;i< comisiones.size();i++){
            System.out.println(comisiones.get(i));
        }
    }
}
