import java.math.BigInteger;

// Implementando la interfaz remota
public class ImplOperaciones implements Operaciones {

   // Implementando el metodo factorial
   public BigInteger factorial(int num) {
      BigInteger f = BigInteger.ONE;

      for (int i = 1; i <= num; ++i) {
         f = f.multiply(BigInteger.valueOf(i));
      }

      return f;
   }
}
