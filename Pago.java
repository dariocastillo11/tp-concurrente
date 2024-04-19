public class Pago{

    public Pago(){
        TareaHilo21 tarea1 = new TareaHilo21();
        Thread t1 = new Thread(tarea1);
        t1.start();
        
        TareaHilo2
        2 tarea2 = new TareaHilo22();
        Thread t2 = new Thread(tarea2);
        t2.start();
    }
}