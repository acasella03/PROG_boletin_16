package prog_boletin_16;

import javax.swing.JOptionPane;

public class Cuenta {

    private long numeroCuenta;
    private double saldo;
    private Persona cliente;

    public Cuenta() {

    }

    public Cuenta(long numeroCuenta, Persona cliente) {
        this.numeroCuenta = numeroCuenta;
        this.cliente = cliente;
    }

    public long getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(long numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Persona getCliente() {
        return cliente;
    }

    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }

    public void ingresar(double ingreso) {
        ingreso = Integer.parseInt(JOptionPane.showInputDialog("Ingresa dinero: "));
        saldo = saldo + ingreso;
    }

    public void retirar(double retiro) {
        retiro= Integer.parseInt(JOptionPane.showInputDialog("Retira dinero: "));
        saldo = saldo - Math.max(0, retiro);
            }

    public double actualizarSaldo (Cuenta cuenta, double importe){
        
    }
    
}
