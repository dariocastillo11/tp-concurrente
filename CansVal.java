public class CansVal{
    public CansVal(){                               //Prueba Cambio para creacion de Rama
        TareaHilo31 tarea1 = new TareaHilo31();
        Thread t1 = new Thread(tarea1);
        t1.start();
        
        TareaHilo32 tarea2 = new TareaHilo32();
        Thread t2 = new Thread(tarea2);
        t2.start();
        
        TareaHilo33 tarea3 = new TareaHilo33();
        Thread t3 = new Thread(tarea3);
        t3.start();
    }
}