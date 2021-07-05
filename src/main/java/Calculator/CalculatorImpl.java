// este ejemplo fue realizado con fines ilustrativos
// no se hace enfasis en todas las verificaciones que
// que una aplicacion deberia tener.

// Fue compilado y corrido usando jdk-1.2.2
package Calculator;
public class CalculatorImpl
    extends 
	java.rmi.server.UnicastRemoteObject
    implements Calculator {

    // Implementations must have an 
    //explicit constructor
    // in order to declare the 
    //RemoteException exception
    public CalculatorImpl()
	throws java.rmi.RemoteException {
	super();
    }

    public long add(final long a,final  long b)
	throws java.rmi.RemoteException {
	System.out.println("Sumando " + a + " " + b);
	return a + b;
    }

    public long sub(final long a,final long b)
	throws java.rmi.RemoteException {
	System.out.println("Restando " + a + " " + b);
	return a - b;
    }

    public long mul(final long a,final long b)
	throws java.rmi.RemoteException {
	System.out.println("Multiplicando " + a + " " + b);
	return a * b;
    }

    public long div(final long a,final long b)
	throws java.rmi.RemoteException {
	System.out.println("Dividiendo " + a + " " + b);

	return a / b;
    }
	
	public long negativo(final long a)
	throws java.rmi.RemoteException {
	System.out.println(")Invirtiendo numero " + a);	
		return a*(-1);
	}
	
  public void hello() {
      System.out.println("NANA");
  }
}

