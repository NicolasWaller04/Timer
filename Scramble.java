import java.util.Random;

public class Scramble {
    public static String RandomMezcla(int CantidadMoviminetos) {
        String[] movimientos = {"R", "R'", "R2", "L", "L'", "L2", "U", "U'", "U2", "D", "D'", "D2", "F", "F'", "F2", "B", "B'", "B2"};
        Random random = new Random();
        String mezcla = "";
        String ultimo = " ";

        for (int i = 0; i < CantidadMoviminetos; i++) {
            String movimiento;
            do {
                movimiento = movimientos[random.nextInt(movimientos.length)];
            } while (!ultimo.equals(" ") && movimiento.charAt(0) == ultimo.charAt(0));

            mezcla += movimiento + " ";
            ultimo = movimiento;
        }
        return mezcla.trim();
    }
}