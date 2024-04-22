public class Proceso2Pago implements Runnable{
    private Avion avion;
    private Listas listas;

    public Proceso2Pago(Avion avion, Listas listas){
        this.avion = avion;
        this.listas = listas;
    }

@Override
public void run(){
    while(true){
        if (!listas.getRegPendientes().isEmpty()){ //mientras haya algo en el array en cuestión
            Asiento asiento = listas.getUnaReservaAleatoria(); //se accede al avión para tomar un asiento ocupado
                    if(verificarPago(asiento) == true){ //prueba si la probabilidad está dentro del 90%
                        listas.eliminarPendiente(asiento); //saca el asiento de registroPendientes
                        listas.registrarPago(asiento); //lo suma al array de registroConfirmadas
                        System.out.println(Thread.currentThread().getName() + " pagó la reserva del asiento " + asiento.getNumero());
                    }
                    else{
                        asiento.setDescartado(); //setea el estado del asiento como DESCARTADO
                        listas.eliminarPendiente(asiento); //saca el asiento de registroPendientes
                        listas.registrarCancelacion(asiento); //lo suma al array de registroCanceladas
                        System.out.println(Thread.currentThread().getName() + " canceló la reserva del asiento " + asiento.getNumero());
                    }
                }
        try {
            Thread.sleep(100);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
            }
    System.out.println(Thread.currentThread().getName() + " pagó exitosamente.");
        }
    }
