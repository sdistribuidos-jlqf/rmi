import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

public class Servidor {

   public Servidor() {}

   public static void main(String args[]) {
      try {
         // Objeto con el metodo remoto
         ImplOperaciones obj = new ImplOperaciones();

         // Se crea el objeto que recibira las llamadas remotas
         Operaciones stub = (Operaciones) UnicastRemoteObject.exportObject(obj, 0);

         // Se obtiene la referencia al registro
         Registry registro = LocateRegistry.getRegistry();

         // Se registra el objeto remoto con el nombre Calculadora
         registro.bind("Calculadora", stub);

         System.err.println("Servidor listo");
      } catch (Exception e) {
         System.err.println("Exception en el servidor: " + e.toString());
         e.printStackTrace();
      }
   }
}
