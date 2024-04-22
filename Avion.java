import java.util.ArrayList;
public class Avion
{
    private Asiento asiento;
    private ArrayList<Asiento> asientos;
    public Avion(){
        asientos = new ArrayList<Asiento>();
        for(Integer i = 0; i<100; i++){
            asientos.add(asiento = new Asiento(i+1));
        }
    }

    public synchronized void ocuparAsiento(Asiento asiento){
        asiento.setOcupado();
    }

    public synchronized void descartarAsiento(Asiento asiento){
        asiento.setDescartado();
    }

    public synchronized void checkAsiento(Asiento asiento){
        asiento.setChecked();
    }

    public synchronized Asiento getUnAsientoDisponible(){
        for(Asiento asiento : asientos){
            if(verificarDisponible(asiento)){
                return asiento;
            }
        }
        return null;
    }

    public synchronized Boolean verificarDisponible(Asiento asiento){
        return asiento.isDisponible();
    }

    public synchronized Asiento getUnAsientoOcupado(){
        for(Asiento asiento : asientos){
            if(verificarOcupado(asiento)){
                return asiento;
            }
        }
        return null;
    }

    public synchronized Boolean verificarOcupado(Asiento asiento){
        return asiento.isOcupado();
    }

    public synchronized Asiento getUnAsientoCheckeado(){
        for(Asiento asiento : asientos){
            if(verificarChecked(asiento)){
                return asiento;
            }
        }
        return null;
    }

    public synchronized Boolean verificarChecked(Asiento asiento){
        return asiento.isChecked();
    }
}