package serverPackage;
import java.net.Socket;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
public class Server {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		ServerSocket ss =new ServerSocket(1234);// creation d'un socket server w le localiser dans le poste de porte numero 1234
		Socket s=ss.accept();// attend le interaction avec le client
		System.out.println("je suis server en attend de client");
		InputStream is= s.getInputStream();
		OutputStream os=s.getOutputStream();
		System.out.println("j'attend un nombre");
		int nb=is.read();// lire le variable envoie par le client pour faire le multiplier
		int res =nb*5;
		System.out.println("la reponse:");
		os.write(res);// ecrire le resulta et l'envoie
		ss.close();
		s.close();

	}
	
	catch(IOException e) {
		e.printStackTrace();
	}
	}

}
