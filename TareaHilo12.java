import java.util.Random;
public abstract class TareaHilo12 implements Runnable{
    
    Avion avion;
    RegistroPendientes registroPendientes;
    Random n;
    public TareaHilo12(){
        n = new Random();
    }
    
    public void run(){

        while(true){
            Butaca butaca = avion.getButaca(n.nextInt(100));
            if(butaca.getDisponible() == true){
            butaca.setOcupado();
            registroPendientes.guardarButaca(butaca);
            }

            try {
                // Agregamos una pausa de 1 segundo entre iteraciones
                Thread.sleep(100); // Pausa de 1 segundo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}