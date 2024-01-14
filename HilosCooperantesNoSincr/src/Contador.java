public class Contador {
    private int contador;

    public Contador(int contador) {
        this.contador = contador;
    }

    public int getContador() {
        return contador;
    }

    public void incrementar() {
        this.contador +=1;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("      Contador");
        sb.append(contador);
        return sb.toString();
    }
}
