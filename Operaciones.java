import java.rmi.Remote;
import java.rmi.RemoteException;
import java.math.BigInteger;

// Creando una interfaz remota para nuestra aplicacion
public interface Operaciones extends Remote {
   BigInteger factorial(int num) throws RemoteException;
}
