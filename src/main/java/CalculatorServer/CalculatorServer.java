package CalculatorServer;

import java.rmi.*;
import Calculator.Calculator;
import Calculator.CalculatorImpl;
import java.rmi.registry.*;
//import java.lang.*;


// Fue conpilado y corrido usando jdk-1.2.2

public class CalculatorServer {
    
    private int port;

    public CalculatorServer(int port) {
		try {
			this.port = port;
			Calculator c = new CalculatorImpl();

				((CalculatorImpl)c).hello();
			// Registra con el nombre CalculatorService al objeto c 
			// en el Registry que se encuentra el el host <localhost>
			// y puerto <port>

			Naming.rebind("rmi://localhost:" + port + "/CalculatorService", c);
		} 
		catch (Exception e) {
			System.out.println("Trouble: " + e);
		}
    }
    
    public static void main(String args[]) {
	int port = 0;

	if (!((0 < args.length) && (args.length < 2))) {
	    System.err.print("Parametros incorrectos: ");
	    System.err.println("CalculatorServer <port>");
	    System.exit(1);
	}

	try {
	    port = Integer.parseInt(args[0]);

	    // Crea un Registry en el puerto especificado
	    LocateRegistry.createRegistry(port);	    
	}
	catch (RemoteException re) {
	    System.out.println();
	    System.out.println("RemoteException");
	    System.out.println(re);
	}
	catch (Exception e) {
	    System.out.println();
	    System.out.println("java.lang.Exception");
	    System.out.println(e);
	}

	new CalculatorServer(port);
    }
}
