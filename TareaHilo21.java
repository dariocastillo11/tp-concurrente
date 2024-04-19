import java.util.Random;

public abstract class TareaHilo21 implements Runnable{
    Random n;
    RegistroPendientes registroPendientes;
    RegistroConfirmadas registroConfirmadas;
    RegistroCanceladas registroCanceladas;
    public TareaHilo21(){
        n = new Random();
    }

    public void run(){

        while(true){
            Butaca butaca = registroPendientes.getButaca(n.nextInt(registroPendientes.tamanioConjunto()));
            registroPendientes.eliminarButaca(butaca);
            if(n.nextInt(10)<=8){
                registroConfirmadas.agregarButaca(butaca);
            }else{
                butaca.setDescartado();
                registroCanceladas.agregarButaca(butaca);
            }
        }
    }
}