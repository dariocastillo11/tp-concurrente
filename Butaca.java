/**
 * La clase Butaca representa el objeto butaca.
 * El objeto butaca contrendra la el estado de el mismo (disponible, ocupado,
 * descartado). Ademas contendra un numero unico de identificacion.
 * @version 1.0.0
 * @author Maximiliano Brullo/
 * Nombre1/
 * Nombre2/
 * Nombre3/
 * Nombre4
 */
public class Butaca
{
    private Boolean disponible = true;
    private Boolean ocupado = false;
    private Boolean descartado = false;
    private Boolean checked = false;
    private Integer numero = 0;
    /**
     * Contructor de la clase Butaca.
     * @param numero  El numero de butaca que se asigna
     */
    public Butaca(Integer numero){
        this.numero = numero;
    }
    
    /**
     * Devuelve el numero de butaca.
     * @return numero de butaca.
     */
    public Integer getNumero(){
        return numero;
    }
    
    /**
     * Devuelve true o flase dependiendo si esta disponible
     * @return disponible
     */
    public Boolean getDisponible(){
        return disponible;
    }
    
    /**
     * Devuelve true o flase dependiendo si esta ocupado.
     * @return ocupado
     */
    public Boolean getOcupado(){
        return ocupado;
    }
    
    /**
     * Devuelve true o flase dependiendo si esta descartado.
     * @return descartado
     */
    public Boolean getDescartado(){
        return descartado;
    }
    
    /**
     * Devuelve true o flase dependiendo si esta checked.
     * @return checked
     */public Boolean getChecked(){
        return checked;
    }
    
    /**
     * Cambia el estado de la butaca a ocupado
     */
    public void setOcupado(){
        disponible = false;
        ocupado = true;
        descartado = false;
        checked = false;
    }
    
    /**
     * Cambia el estado de la butaca a Descartado
     */
    public void setDescartado(){
        disponible = false;
        ocupado = false;
        descartado = true;
        checked = false;
    }
    
    /**
     * Cambia el estado de la butaca a checked
     */
    public void setChecked(){
        disponible = false;
        ocupado = false;
        descartado = false;
        checked = true;
    }

    public void setN(Integer n){
        this.numero = n;
    }
}