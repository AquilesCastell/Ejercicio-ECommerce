public abstract class MetodoDePago {
    protected double montoPago;
    

    public MetodoDePago(double montoPago) {
        this.montoPago = montoPago;
    }
    
    public abstract void procesarPago();
    public abstract void mostrarMonto();
    
    public double getMontoPago() {
        return montoPago;
    }
    public void setMontoPago(double montoPago) {
        this.montoPago = montoPago;
        System.out.println("Pago recibido.");
    }
    
}
