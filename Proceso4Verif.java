import java.util.ArrayList;
import java.util.Random;
public class Proceso4Verif {
    private Random random;
    private Listas listas;
    private Avion avion;
    
    public Proceso4Verif(Avion avion, Listas listas){
        this.listas= listas;
        this.avion = avion;
    }

    @Override
    public void run(){
        Asiento asiento = getChecked();
        if(asiento.isChecked() == true){
            listas.eliminarConfirmada(asiento);
            listas.registrarVerificacion(asiento);
        }
    }

    /**
     * Método que selecciona de manera aleatoria
     * una reserva con estado "checked" del array registroConfirmadas
     */
    public Asiento getChecked()
    {
        int nroAleatorio = random.nextInt(listas.getRegConfirmadas().size()); //genero un nro aleatorio para buscar
        Asiento asiento = listas.getRegConfirmadas().get(nroAleatorio); //busca un asiento de forma aleatoria
        if(avion.verificarChecked(asiento) == true){ //si dicho asiento tiene estado "checked", entonces retorno el asiento
            return asiento;
        }
        return null;
    }
}
