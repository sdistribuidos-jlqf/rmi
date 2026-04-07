import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Cliente {

   private Cliente() {}

   public static void main(String[] args) {
      try {
         // Se obtiene la referencia al registro en 192.168.2.7
         Registry registry = LocateRegistry.getRegistry("127.0.0.1");

         // Se busca en el registro el objeto remoto con el nombre Calculadora
         Operaciones stub = (Operaciones) registry.lookup("Calculadora");

         // Se invoca el metodo factorial
         System.out.println("Factorial de 30: " + stub.factorial(30));

      } catch (Exception e) {
         System.err.println("Exception en el cliente: " + e.toString());
         e.printStackTrace();
      }
   }
}
