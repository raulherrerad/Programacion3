package tema4;

import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class EjemploSocketCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Definimos la variable socket
		Socket sock=null;
		DataInputStream din = null;
		DataOutputStream don = null;

		
		//Intentamos conectarnos con el servidor remoto
		try {
			sock = new Socket("localhost",12345);
			
			//Para poder escribir en el socket utilizamos un DataOutput
			din = new DataInputStream(sock.getInputStream());
			don = new DataOutputStream(sock.getOutputStream());
			
			//Enviamos la peticion de aterrizaje
			don.writeUTF("Solicitando plataforma de aterrizaje");
			
			String msg = din.readUTF();
			System.out.println("Señor, hemos recibido el mensaje de bienvenida de la base:\n" + msg);
			
			System.out.println("Señor, la plataforma asignada es " + din.readInt());
			
			
			
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//Nos desconectamos
		try {
			sock.close();
			don.close();
			din.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
