import java.util.ArrayList;

public class RegistroCanceladas {

    ArrayList<Butaca> butacas;
    
    public RegistroCanceladas(){
        butacas = new ArrayList<Butaca>();
    }

    public void agregarButaca(Butaca butaca){
        butacas.add(butaca);
    }

    public Butaca getButaca(Integer n){
        return butacas.get(n);
    }
}