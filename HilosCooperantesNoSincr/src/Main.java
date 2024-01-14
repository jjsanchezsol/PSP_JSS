public class Main {

    public static final int NUM_VECES=20;
    public static final int NUM_HILOS=5;

    public static void main(String[] args) {

        Contador contador=new Contador(0);


        for(int i=0;i<NUM_HILOS;i++){
            Hilo hilo=new Hilo(contador,NUM_VECES,(NUM_VECES/NUM_HILOS));
            hilo.run();
        }
    }
}