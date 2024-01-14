public class Hilo implements Runnable{
    private Thread hilo=null;
    Contador contador;
    int veces;
    int numHilo;

    public Hilo(Contador contador, int veces, int numHilo) {
        hilo=new Thread(this);
        this.contador = contador;
        this.veces = veces;
        this.numHilo = numHilo;
    }

    public Contador getContador() {
        return contador;
    }

    public void setContador(Contador contador) {
        contador.incrementar();
        this.contador = contador;
    }

    @Override
    public void run() {
        for(int i=0;i<veces;i++){
            System.out.println(hilo.getName()+""+contador);
            contador.incrementar();
        }
    }
}
