import java.util.ArrayList;
/**
 * La clase RegistroPendientes representa la clase registro
 * 
 */
public class RegistroPendientes{
    
    ArrayList<Butaca> butacas;
    
    public RegistroPendientes(){
        butacas = new ArrayList<>();
        
    }
    
    public void guardarButaca(Butaca butaca){
        butacas.add(butaca);
    }

    public Butaca getButaca(Integer numero){
        return butacas.get(numero);
    }

    public Integer tamanioConjunto(){
        return butacas.size();
    }

    public void eliminarButaca(Butaca butaca){
        butacas.remove(butaca);
    }
}
