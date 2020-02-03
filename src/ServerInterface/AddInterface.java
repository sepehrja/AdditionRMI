package ServerInterface;

import java.rmi.*;

public interface AddInterface extends Remote{

	int add(int x, int y) throws RemoteException;
}
