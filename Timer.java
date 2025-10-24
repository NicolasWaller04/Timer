import java.util.*;
public class Timer {
    public static void main(String[] args) {
        ArrayList <Double> ListaTiempos3x3x3 = new ArrayList <> ();
        ArrayList <Double> ListaTiempos2x2x2 = new ArrayList <> ();
        double MejorTiempo = 9999;
        double Tiempos;
        try (Scanner sc = new Scanner(System.in)){
            System.out.println("Vas a armar un 2x2x2 o un 3x3x3 responde (2x2x2 o 3x3x3)");
            String QueCubo = sc.nextLine().toLowerCase();
            if (QueCubo.equals("3x3x3")){
                for (int i = 0; i < 9999; i++){
                    int num = 1;
                    System.out.println("Mezcla:");
                    System.out.println(Scramble3x3x3.RandomMezcla3x3x3(20));
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
                    ListaTiempos3x3x3.add(i, Tiempos);
                    if (Tiempos < MejorTiempo){
                        MejorTiempo = Tiempos;
                    }
                    for (double N : ListaTiempos3x3x3){
                        System.out.println(num+": "+N);
                        num++;
                    }  
                    System.out.println("===============");
                    System.out.println("Tu mejor tiempo es de:");
                    System.out.println(MejorTiempo);
                    System.out.println("===============");
                }
            }else if (QueCubo.equals("2x2x2")){
                for (int i = 0; i < 9999; i++){
                    int num = 1;
                    System.out.println("Mezcla:");
                    System.out.println(Scramble2x2x2.RandomMezcla2x2x2(20));
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
                    ListaTiempos2x2x2.add(i, Tiempos);
                    if (Tiempos < MejorTiempo){
                        MejorTiempo = Tiempos;
                    }
                    for (double N : ListaTiempos2x2x2){
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
}
