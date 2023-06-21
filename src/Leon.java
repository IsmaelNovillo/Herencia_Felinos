public class Leon extends Felinos{
    String Habitad;
    String dieta;

    public Leon(double tamaño, String nombre, String habitad, String dieta) {
        super(tamaño, nombre);
        Habitad = habitad;
        this.dieta = dieta;
    }

    public String getHabitad() {
        return Habitad;
    }

    public void setHabitad(String habitad) {
        Habitad = habitad;
    }

    public String getDieta() {
        return dieta;
    }

    public void setDieta(String dieta) {
        this.dieta = dieta;
    }

    public void rugir (){
        System.out.println("El leon esta rugiendo");
    }

    public void cazar (){
        System.out.println("El leon esta cazando");
    }
}
