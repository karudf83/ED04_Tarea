/**
 *
 * @author ferna
 * @since  14/02/2023
 */
public class CCuenta {

    /**
     * @return el nombre del titular de la cuenta
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre el nombre a pasarle como parámetro
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return el nº de cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta nº de cuenta a pasaele como parámetro
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return el saldo de la cuenta
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo  saldo a pasarle como parámetro
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return el  tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * @param tipoInterés  a pasarle como parámetro
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
    
/**
 * Atributos de la clase
 */

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
    
    /**
     * Constuctor vacío
     */

    public CCuenta()
    {
    }
/**
 * Constructor con los siguientes parámetros
 * @param nom String, nombre del titular
 * @param cue String, numero de cuennta
 * @param sal double, saldo de la cuenta
 * @param tipo double, tipo de interés
 */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
        tipoInterés=tipo;
    }
    /**
     * 
     * @return el saldo de la cuenta
     */

    public double estado()
    {
        return getSaldo();
    }
    
    /**
     * 
     * @param cantidad a ingresar en la cuenta
     * @throws Exception en caso de que la cantidad ingresada se negativa
     */

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
/**
 * 
 * @param cantidad a retitar de la cuenta
 * @throws Exception en caso de que la cantidad a retirar sea negativa
 * o la cantidad sea mayor al saldo
 */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}


