import java.util.*;
public class Timer {
    public static void main(String[] args) {
        ArrayList <Double> ListaTiempos = new ArrayList <> ();
        double MejorTiempo = 9999;
        double Tiempos;
        for (int i = 0; i < 9999; i++){
            int num = 1;
            try (Scanner sc = new Scanner(System.in);) {
                System.out.println("Mezcla:");
                System.out.println(Scramble.RandomMezcla(20));
                System.out.println("Presiona ENTER para iniciar el cronometro");
                sc.nextLine();
                RelojContador timer = new RelojContador();
                timer.iniciar();
                System.out.println("Presiona ENTER para detener el cronometro");
                sc.nextLine();
                timer.detener();
                System.out.println(timer.ObtenerTiempo()+" s");
                System.out.println("===============");
                Tiempos = timer.ObtenerTiempo(); 
                ListaTiempos.add(i, Tiempos);
                if (Tiempos < MejorTiempo){
                    MejorTiempo = Tiempos;
                }
                for (double N : ListaTiempos){
                    System.out.println(num+": "+N);
                    num++;
                }  
                System.out.println("===============");
                System.out.println("Tu mejor tiempo es de:");
                System.out.println(MejorTiempo);
                System.out.println("===============");
            }
        }
    }
}
