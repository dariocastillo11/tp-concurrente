import java.util.ArrayList;
public class Avion
{
    Butaca butaca;  //Prueba de maxi nueva rama
    ArrayList<Butaca> butacas;
    public Avion(){
        butacas = new ArrayList<Butaca>();
        for(Integer i = 0; i<100; i++){
            butacas.add(butaca = new Butaca(i+1));
        }
    }
    
    public synchronized void butacaOcupada(Butaca butaca){
        butaca.setOcupado();
    }
    
    public synchronized void butacaDescartada(Butaca butaca){
        butaca.setDescartado();
    }
    
    public synchronized void butacaCheckeada(Butaca butaca){
        butaca.setChecked();
    }
    
    public synchronized Butaca getButaca(int n){
        return butacas.get(n);
    }
    
}