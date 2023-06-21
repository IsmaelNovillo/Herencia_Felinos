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
                System.out.println("Registro de 1) Siames , 2) persa: ");
                int t = scan.nextInt();
                switch (t){
                    case 1:
                        Siames first = new Siames(0,"","",0,"","");
                        System.out.println("Registrar Nombre: ");
                        String q=scan.nextLine();
                        first.setNombre(q);
                        System.out.println("Registrar Tamaño: ");
                        first.setTamaño(scan.nextDouble());
                        System.out.println("Registrar Familia a la que pertenece:");
                        first.setFamilia(scan.nextLine());
                        System.out.println("Registrar Peso del Felino: ");
                        first.setPeso(scan.nextDouble());
                        System.out.println("Registrar Tipo de pelaje: ");
                        first.setTipoPelaje(scan.nextLine());
                        System.out.println("Registrar Combre: ");
                        first.setColor(scan.nextLine());
                        break;
                    case 2:
                        Persa Second = new Persa(0,"","",0,"","");
                        System.out.println("Registrar Nombre: ");
                        Second.setNombre(scan.nextLine());
                        System.out.println("Registrar Tamaño: ");
                        Second.setTamaño(scan.nextDouble());
                        System.out.println("Registrar Familia a la que pertenece:");
                        Second.setFamilia(scan.nextLine());
                        System.out.println("Registrar Peso del Felino: ");
                        Second.setPeso(scan.nextDouble());
                        System.out.println("Registrar Color de Ojos: ");
                        Second.setColorOjos(scan.nextLine());
                        System.out.println("Registrar Genero del Felino: ");
                        Second.setGenero(scan.nextLine());

                        break;
                }//arreglar
                break;
            default:
                System.out.println("Ninguna opcion seleccionada");
                break;
        }



    }
}
