package clientPackage;
import java.net.Socket;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;
import java.net.InetAddress;
import java.net.InetSocketAddress;
public class Clinet {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("je suis un client pas encore connecter");
			InetAddress inetaddres=InetAddress.getByName("10.26.14.108");// l'objet de type inetaddress et utilise pour stocke le ip adresse de la server si il est existe 
			InetSocketAddress isa=new InetSocketAddress(inetaddres,600);//l'objet inetsocketaddress utilise pour stocke lip de la server et le port
			Socket s =new Socket();
			s.connect(isa);
		//Socket s=new Socket("localhost",1234);// creation d'un socket client
		System.out.println("je suis un client connecter");
		InputStream is= s.getInputStream();//utiliser pour lire un variable donne comme parametre 
		OutputStream os=s.getOutputStream();// utliser pour ecrire un variable donne comme parammetre
		Scanner scanner =new Scanner(System.in);// objet scanner pour ecrire un variable 
		int nb=scanner.nextInt();// le variable est de type int
		os.write(nb);// envoie le variable nb pour faire la multiplication dans le cote server
		int rep=is.read();// lire le variable calculer par le server
		System.out.println("reponse"+rep);
		s.close();
		
		
	}
	
	catch(IOException e) {
		e.printStackTrace();
	}
}
}
