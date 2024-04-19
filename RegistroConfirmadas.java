import java.util.ArrayList;

public class RegistroConfirmadas {

    ArrayList<Butaca> butacas;

    public RegistroConfirmadas(){
        butacas = new ArrayList<Butaca>();
    }

    public void agregarButaca(Butaca butaca){
        butacas.add(butaca);
    }

    public Butaca getButaca(Integer n){
        return butacas.get(n);
    }

    public void eliminarButaca(Butaca butaca){
        butacas.remove(butaca);
    }
}