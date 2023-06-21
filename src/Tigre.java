public class Tigre extends Felinos{
    String tipo;
    String Habitad;

    public Tigre(double tamaño, String nombre, String tipo, String habitad) {
        super(tamaño, nombre);
        this.tipo = tipo;
        Habitad = habitad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getHabitad() {
        return Habitad;
    }

    public void setHabitad(String habitad) {
        Habitad = habitad;
    }

    public void vigilar (){
        System.out.println("El tigre esta vigilando la montaña");
    }

    public void asechar (){
        System.out.println("El tigre esta asechando a su presa");
    }
}
