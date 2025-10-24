import java.util.Random;

public class Scramble {
    public static String RandomMezcla(int CantidadMoviminetos) {
        String[] movimientos = {"R", "R'", "L", "L'", "U", "U'", "D", "D'", "F", "F'", "B", "B'"};
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