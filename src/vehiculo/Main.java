package vehiculo;

/**
 *
 * @author IES Aguadulce Sergio Aliaga Sanchez
 */
public class Main {

    public static void main(String[] args) {
        VehiculoAliagaSánchezSergio2223 miVehiculoAliagaSanchezSergio2223;

        miVehiculoAliagaSanchezSergio2223 = new VehiculoAliagaSánchezSergio2223("Seat", 18000, 100);
    }

    public void operativaVehiculosAliagSanchezSergio2223(VehiculoAliagaSánchezSergio2223 miVehiculoAliagaSanchezSergio2223) {
        int stockActual;
        int cantidad = 50;
        // Sentencias
        try {
            System.out.println("Venta de Vehiculos");
            miVehiculoAliagaSanchezSergio2223.vender(20);
        } catch (Exception e) {
            System.out.print("Fallo al vender");
        }

        try {
            System.out.println("Compra de Vehiculos");
            miVehiculoAliagaSanchezSergio2223.comprar(100);
        } catch (Exception e) {
            System.out.print("Fallo al comprar");
        }
        stockActual = miVehiculoAliagaSanchezSergio2223.obtenerStock();
        System.out.println("El stock actual es" + stockActual);
    }

}
