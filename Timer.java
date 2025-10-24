import java.util.Scanner;

public class Timer {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {

            System.out.println("Mezcla:");
            System.out.println(Scramble.RandomMezcla(20));

            System.out.println("Presiona ENTER para iniciar el cronometro");
            entrada.nextLine();

            RelojContador timer = new RelojContador();
            timer.iniciar();

            System.out.println("Presiona ENTER para detener el cronometro");
            entrada.nextLine();

            timer.detener();
            System.out.println(timer.ObtenerTiempo() + " segundos");
        }
    }
}