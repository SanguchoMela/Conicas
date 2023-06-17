import Conicas2. *;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner entrada = new Scanner(System.in);

        boolean salir = false;
        int opcion;

        while (!salir){

            System.out.println("---------- Menu Principal ----------");
            System.out.println("1. Circunferencia");
            System.out.println("2. Elipse");
            System.out.println("3. Hiperbole");
            System.out.println("4. Parabola");
            System.out.println("5. Salir");

            System.out.print("Ingrese la opcion escogida: ");
            opcion = entrada.nextInt();

            switch (opcion){
                case 1:
                    Circunferencia miCircunferencia = new Circunferencia(5,8);
                    System.out.println("\nCIRCUNFERENCIA");

                    miCircunferencia.mostrarInfo();

                    System.out.println();
                    break;
                case 2:
                    Elipse miElipse = new Elipse(5.2,2.1);
                    System.out.println("\nELIPSE");

                    miElipse.mostrarInfo();

                    System.out.println();
                    break;
                case 3:
                    Hiperbole miHiperbole = new Hiperbole(7.4,2.4);
                    System.out.println("\nHIPERBOLE");

                    System.out.println("Datos registrados:");
                    System.out.println("\tParametro a = "+miHiperbole.getA());
                    System.out.println("\tParametro b = "+miHiperbole.getB());

                    miHiperbole.variables();

                    System.out.println();
                    break;
                case 4:
                    Parabola miParabola = new Parabola(5,4,3,4,1);
                    System.out.println("\nPARABOLA");

                    miParabola.mostrarInfo();

                    System.out.println();
                    break;
                case 5:
                    salir = true;
                    System.out.println("\nPrograma terminado!\n");
                    break;
                default:
                    System.out.println("\nError\n");
            }
        }
    }
}
