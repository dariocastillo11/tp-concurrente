import java.util.Random;
public class Proceso3CancValid implements Runnable {
    private Avion avion;
    private Listas listas;
    private Random nroAleatorio;


    public Proceso3CancValid(Avion avion, Listas listas){
    this.avion =avion;
    this.listas=listas;
    this.nroAleatorio = new Random();
    }

    @Override
    public void run()
    {
        while(true){
            if(!listas.getRegConfirmadas().isEmpty()){
            Asiento asiento = listas.getUnaReservaAleatoria();
                    if(cancelarReserva() == true){
                        listas.eliminarConfirmada(asiento);
                        listas.registrarCancelacion(asiento);
                        asiento.setDescartado();
                        System.out.println(Thread.currentThread().getName() + " canceló exitosamente la reserva del asiento " + asiento.getNumero());
                    }
                    else{
                        asiento.setChecked();
                        System.out.println(Thread.currentThread().getName() + " no pudo cancelar la reserva del asiento " + asiento.getNumero() + ". Reserva checkeada.");
                    }
                }
            try {
                Thread.sleep(100);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            }
        System.out.println(Thread.currentThread().getName() + " canceló/checkeó exitosamente.");
        }
    /**
     * Método que cancela la reserva con una probabilidad del 10% de éxito
     */
    private Boolean cancelarReserva(){
        return nroAleatorio.nextDouble() < 0.1;
    }
}


