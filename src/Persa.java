public class Persa extends Domesticos{
    String colorOjos;
    String genero;

    public Persa(double tamaño, String nombre, String familia, double peso, String colorOjos, String genero) {
        super(tamaño, nombre, familia, peso);
        this.colorOjos = colorOjos;
        this.genero = genero;
    }

    public String getColorOjos() {
        return colorOjos;
    }

    public void setColorOjos(String colorOjos) {
        this.colorOjos = colorOjos;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void intimidar (){
        System.out.println("El persa esta intimidando al perro");
    }

    public void buscar (){
        System.out.println("El persa esta buscando un raton");
    }

}
