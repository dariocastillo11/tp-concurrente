public class Asiento
{
    private boolean disponible = true;
    private boolean ocupado = false;
    private boolean descartado = false;
    private boolean checked = false;
    private Integer numero = 0;
    /**
     * Contructor de la clase Asiento.
     * @param numero  El numero de asiento que se asigna
     */
    public Asiento(Integer numero){
        this.numero = numero;
    }

    /**
     * Devuelve el numero de asiento.
     * @return numero de asiento.
     */
    public int getNumero(){
        return numero;
    }

    /**
     * Devuelve true o false dependiendo si esta disponible
     * @return disponible
     */
    public boolean isDisponible(){
        return disponible;
    }

    /**
     * Devuelve true o false dependiendo si esta ocupado.
     * @return ocupado
     */
    public boolean isOcupado(){
        return ocupado;
    }

    /**
     * Devuelve true o false dependiendo si esta descartado.
     * @return descartado
     */
    public boolean isDescartado(){
        return descartado;
    }

    /**
     * Devuelve true o false dependiendo si esta checked.
     * @return checked
     */public boolean isChecked(){
        return checked;
    }

    /**
     * Cambia el estado del asiento a ocupado
     */
    public void setOcupado(){
        disponible = false;
        ocupado = true;
        descartado = false;
        checked = false;
    }

    /**
     * Cambia el estado del asiento a Descartado
     */
    public void setDescartado(){
        disponible = false;
        ocupado = false;
        descartado = true;
        checked = false;
    }

    /**
     * Cambia el estado del asiento a checked
     */
    public void setChecked(){
        disponible = false;
        ocupado = false;
        descartado = false;
        checked = true;
    }

    public void setN(int n){
        this.numero = n;
    }
}