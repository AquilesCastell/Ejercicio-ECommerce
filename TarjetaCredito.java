import java.util.Map;
import java.util.HashMap;

public class TarjetaCredito extends MetodoDePago {
    
    private String fechaVencimiento, numeroTarjeta, nombreTarjeta;
    Map<String,String> tarjetasValidas = new HashMap<>();

    public TarjetaCredito(double montoPago,String fechaVencimiento, String numeroTarjeta, String nombreTarjeta) {
        super(montoPago);
        this.fechaVencimiento = fechaVencimiento;
        this.numeroTarjeta = numeroTarjeta;
        this.nombreTarjeta = nombreTarjeta;

        tarjetasValidas.put("400012348689900","0925");
        tarjetasValidas.put("7365849201475632","0412");
        tarjetasValidas.put("6492018374651280", "0512");
        tarjetasValidas.put("3028571946128304", "0423");
    }

    private boolean validacion(){
        if(tarjetasValidas.containsKey(numeroTarjeta)){
            String fechaValida = tarjetasValidas.get(numeroTarjeta);
            return fechaValida.equals(fechaVencimiento);
        }
        return false;
    }

    @Override
    public void procesarPago() {
        System.out.println("Validando numero de tarjeta...");
        if (validacion()){
            System.out.println("Autorizacion en proceso...");
            System.out.println("Pago recibido.");
        } 
        else{
            System.out.println("Numero de tarjeta o fecha de vencimiento invalidos");
        }
    }

    @Override
    public void mostrarMonto() {
        System.out.println("El monto de la transaccion es "+montoPago+"\n"+
        "Nombre de tarjeta: "+ nombreTarjeta+"\n"+
        "Numero de tarjeta: "+numeroTarjeta+"\n"+
        "Fecha de vencimiento: "+ fechaVencimiento+"\n"+
        "¿Quieres confirmar la operacion?"+"\n"+
        "a)Si b)No"
        );
    }
    
}
