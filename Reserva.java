public class Reserva
{
    public Reserva(){
        TareaHilo11 tarea1 = new TareaHilo11();
        Thread t1 = new Thread(tarea1);
        t1.start();
        
        TareaHilo12 tarea2 = new TareaHilo12();
        Thread t2 = new Thread(tarea2);
        t2.start();
        
        TareaHilo13 tarea3 = new TareaHilo13();
        Thread t3 = new Thread(tarea3);
        t3.start();
        
        Avion avion = new Avion();
    }
}