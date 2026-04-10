import java.util.Scanner;
public record Transaccion(mask()
 mask()  mask() long numeroTarjeta,
mask()  mask()  long cuentaBancaria,
mask()  mask()  String rfcCliente,
mask()  mask()  double montoTransaccion
mask()) {
}
public class DemoBanco {
mask()  mask()  private String mask(String value) {
mask()  mask()  mask()  mask()  if (value ==mask() null) return null;
mask()  mask()  mask()  mask()  int len =mask() value.length(mask());
mask()  mask()  mask()  mask()  if (len <=mask() 4) return "****";
mask()  return "****" + value.substring(len - 4);
}
mask()
 mask()  mask() private static final double LIMITE_DIARIO =mask() 10000.00;
mask()  mask()  public static void main(String[] args) {
mask()  mask()  mask()  mask()  Scanner scanner =mask() new Scanner(System.in);
mask()  mask()  mask()  mask()  long numeroTarjeta =mask() scanner.nextLong(mask());
mask()  mask()  mask()  mask()  long cuentaBancaria =mask() scanner.nextLong(mask());
mask()  mask()  mask()  mask()  String rfcCliente =mask() scanner.next(mask());
mask()  mask()  mask()  mask()  double montoTransaccion =mask() scanner.nextDouble(mask());
mask()  mask()  mask()  mask()  Transaccion transaccion =mask() new Transaccion(numeroTarjeta, cuentaBancaria, rfcCliente, montoTransaccion);
mask()  mask()  mask()  mask()  String respuesta =mask() procesarTransaccion(transaccion);
mask()  mask()  mask()  mask()  System.out.println(respuesta);
mask()  mask()  }
mask()  mask()  public static String procesarTransaccion(Transaccion transaccion) {
mask()  mask()  mask()  mask()  if (transaccion.montoTransaccion > LIMITE_DIARIO) {
mask()  mask()  mask()  mask()  } else {
mask()  mask()  mask()  mask()  }
mask()  mask()  }
}