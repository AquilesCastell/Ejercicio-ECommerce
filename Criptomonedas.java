public class Criptomonedas extends MetodoDePago {

    private String direccionCrypto;
    private int direccion;
    public Criptomonedas(double montoPago) {
        super(montoPago);
    }

    @Override
    public void procesarPago() {
        direccion = direccionCrypto.hashCode();
    }

    @Override
    public void mostrarMonto() {
        System.out.println("El monto de la transaccion es "+montoPago+"\n"+
        "¿Quieres confirmar la operacion?");
    }
    
}
