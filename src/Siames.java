public class Siames extends Domesticos{
    String color;
    String tipoPelaje;

    public Siames(double tamaño, String nombre, String familia, double peso, String color, String tipoPelaje) {
        super(tamaño, nombre, familia, peso);
        this.color = color;
        this.tipoPelaje = tipoPelaje;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipoPelaje() {
        return tipoPelaje;
    }

    public void setTipoPelaje(String tipoPelaje) {
        this.tipoPelaje = tipoPelaje;
    }

    public void rasgar (){
        System.out.println("El siames esta rasgando la cortina");

    }
    public void jugar (){
        System.out.println("El siames esta jugando con el bebe");

    }
}
