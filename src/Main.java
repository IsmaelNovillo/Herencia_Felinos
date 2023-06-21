import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        System.out.println("**********Menu************");
        System.out.println("1. Conocer que tienen en comun los felinos ");
        System.out.println("2. Conocer 2 tipos de felinos salvajes ");
        System.out.println("3. Registrar gato domestico siames o persa ");
        System.out.print("Ingrese una opcion:  ");
        int op = scan.nextInt();
        switch (op){
            case 1:
                Felinos uno = new Felinos(15.26,"Felidae");
                System.out.println( "INFORMACION");
                System.out.println("Van desdes "+ uno.tamaño+"cm hasta  3m dependiendo del tipo");
                System.out.println("Su nombre cientifico es " +uno.nombre);
                System.out.println("Habilidades");
                uno.correr();
                uno.comer();
                break;
            case 2:

                break;
            case 3:

                break;
            default:
                System.out.println("Ninguna opcion seleccionada");
                break;
        }



    }
}
