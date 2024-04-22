import java.util.ArrayList;
import java.util.Random;

public class Listas {
    private ArrayList<Asiento> pendientes;
    private ArrayList<Asiento> confirmadas;
    private ArrayList<Asiento> canceladas;
    private ArrayList<Asiento> verificadas;
    private Random random;

    public Listas() {
        pendientes = new ArrayList<>();
        confirmadas = new ArrayList<>();
        canceladas = new ArrayList<>();
        verificadas = new ArrayList<>();

    }

    /**
     * Con este método se accede al array correspondiente
     */
    public ArrayList<Asiento> getRegPendientes(){
        return pendientes;
    }

    public ArrayList<Asiento> getRegConfirmadas(){
        return confirmadas;
    }

    public ArrayList<Asiento> getRegCanceladas(){
        return canceladas;
    }

    public ArrayList<Asiento> getRegVerificadas(){
        return verificadas;
    }

    /**
     * Estos métodos agregan un asiento al array correspondiente
     */
    public void registrarReserva(Asiento asiento){
        pendientes.add(asiento);
    }

    public void registrarPago(Asiento asiento){
        confirmadas.add(asiento);
    }

    public void registrarCancelacion(Asiento asiento){
        canceladas.add(asiento);
    }

    public void registrarVerificacion(Asiento asiento){
        verificadas.add(asiento);
    }


    /**
     * Este método elimina una asiento del array correspondiente
     */
    public void eliminarPendiente(Asiento asiento){
        pendientes.remove(asiento);
    }

    public void eliminarConfirmada(Asiento asiento){
        confirmadas.remove(asiento);
    }

    /**
     * Este método se utiliza para obtener una de las reservas de cualquiera
     * de las listas que necesite. Es decir de la lista que pase por parámetro
     */
    public Asiento getUnaReservaAleatoria(ArrayList<Asiento> lista)
    {
        if(!lista.isEmpty()){
            int indiceAleatorio = random.nextInt(pendientes.size());
            return lista.get(indiceAleatorio);
        }
        return null;
    }
}
