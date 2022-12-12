package prog_boletin_16;

public class CuentaCorriente extends Cuenta {

    final static double intereses = 1.5;

    public CuentaCorriente() {
    }

    public CuentaCorriente(long numeroCuenta, Persona cliente) {
        super(numeroCuenta, cliente);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    
}
