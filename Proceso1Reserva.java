public class Proceso1Reserva implements Runnable{
    private Avion avion;
    private Listas listas;

    //constructor del proceso de reserva
    public Proceso1Reserva(Avion avion, Listas listas){
        this.avion = avion;
        this.listas = listas;
    }

    //método run
    @Override
    public void run(){
        while(true){ //se debe ejecutar continuamente
            Asiento asiento = avion.getUnAsientoDisponible(); // saca un asiento del avion y lo guarda en un objeto de tipo Butaca
            if(asiento != null){ //si se pudo obtener un asiento DISPONIBLE
                avion.ocuparAsiento(asiento); //se setea el estado del asiento como OCUPADO
                listas.registrarReserva(asiento); //se registra la reserva en un array de PENDIENTES
                System.out.println(Thread.currentThread().getName() + "ha reservado el asiento " + asiento.getNumero());
            }
            try {
                Thread.sleep(100);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + " reservó exitosamente.");
    }

}
