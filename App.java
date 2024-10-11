import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("El monto a pagar es $450.0");
        System.out.println("Introduzca metodo de pago: ");
        System.out.println("a) Tarjeta de credito"+"\n"+
        "b) PayPal"+"\n"+
        "c) Criptomonedas"+"\n"
        );

        Scanner sc = new Scanner(System.in);
        String opcion = sc.nextLine();


        switch(opcion){
            case "a":
                TarjetaCredito tc = new TarjetaCredito(450, "0925", "400012348689900", "Andrea Fernanda Morel Aleman");    
                tc.mostrarMonto();
                opcion = sc.nextLine();
                if(opcion.equals("Si")){
                    tc.procesarPago();
                }
                else{
                    System.out.println("La operacion ha sido cancelada.");
                }
                break;
            case "b":
                PayPal pp = new PayPal(450,"amorel08@gmail.com");
                pp.mostrarMonto();
                if(opcion.equals("Si")){
                    pp.procesarPago();
                }
                else{
                    System.out.println("La operacion ha sido cancelada.");
                }
                break;
            case "c":
                Criptomonedas cm = new Criptomonedas());
                cm.mostrarMonto();
                if(opcion.equals("Si")){
                    cm.procesarPago();
                }
                else{
                    System.out.println("La operacion ha sido cancelada.");
                }
                break;
        }
    }
}
