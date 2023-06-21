public class Domesticos extends Felinos{
    String familia;
    double peso;

    public Domesticos(double tamaño, String nombre, String familia, double peso) {
        super(tamaño, nombre);
        this.familia = familia;
        this.peso = peso;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void maullar (){
        System.out.println("Esta maullando");
    }

    public void dormir (){
        System.out.println("Esta dormiendo");
    }
}
