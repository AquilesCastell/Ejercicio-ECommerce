public class PayPal extends MetodoDePago {

    private String email;

    public PayPal(double montoPago, String email) {
        super(montoPago);
        this.email = email;
    }


    @Override
    public void procesarPago() {
        System.out.println("Redirigiendo a PayPal");
        System.out.println("");
    }

    @Override
    public void mostrarMonto() {
        System.out.println("El monto de la transaccion es "+montoPago+"\n"+
        "¿Quieres confirmar la operacion?");
    }
    
}
