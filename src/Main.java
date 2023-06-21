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
                Tigre one = new Tigre(3.1,"Tigre de Bengala","Albino","Selvas");
                Leon two =new Leon(2,"Leon Salvaje","Sabana","Carnivora");
                System.out.println("********FELINOS SALVAJES********");
                System.out.println("-------------");
                System.out.println("El "+one.nombre+" tiene un tamaño de "+one.tamaño+" para los tigres albinos que mayormente viven es las"+one.getHabitad());
                System.out.println("Sus principales actividades son");
                one.asechar();
                one.vigilar();
                System.out.println("-------------");
                System.out.println("El "+two.nombre+" tiene un tamaño de "+two.tamaño+" viven es las"+two.Habitad+" y su dieta es "+two.dieta);
                System.out.println("Sus principales actividades son");
                two.rugir();
                two.cazar();
                break;
            case 3:

                break;
            default:
                System.out.println("Ninguna opcion seleccionada");
                break;
        }



    }
}
