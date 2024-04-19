public class Verificacion{
    public Verificacion(){
        TareaHilo41 tarea1 = new TareaHilo41();
        Thread t1 = new Thread(tarea1);
        t1.start();
        
        TareaHilo42 tarea2 = new TareaHilo42();
        Thread t2 = new Thread(tarea2);
        t2.start();
    }
}