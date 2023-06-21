public class Felinos {
    double tamaño;
    String nombre;

    public Felinos(double tamaño, String nombre) {
        this.tamaño = tamaño;
        this.nombre = nombre;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void correr (){
        System.out.println("Esta corriendo");
    }

    public void comer (){
        System.out.println("Esta comiendo el felino ");
    }
}
