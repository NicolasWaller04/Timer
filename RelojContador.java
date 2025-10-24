public class RelojContador {
    private long inicio;
    private long fin;
    private boolean corriendo = true;

    public void iniciar() {
        inicio = System.currentTimeMillis();
        corriendo = true;
    }

    public void detener() {
        fin = System.currentTimeMillis();
        corriendo = false;
    }

    public double ObtenerTiempo() {
        long tiempo = corriendo ? System.currentTimeMillis() - inicio : fin - inicio;
        return tiempo / 1000.0;
    }
}
