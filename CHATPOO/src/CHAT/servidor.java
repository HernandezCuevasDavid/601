package CHAT;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Observable;

public class servidor extends Observable implements Runnable {

    private final int puerto;

    public servidor(int puerto) {
        this.puerto = puerto;
    }

    @Override
    public void run() {

        ServerSocket servidor = null;
        Socket socket = null;
        DataInputStream entrada;

        try {
            //creamos el servidor del socket 
            servidor = new ServerSocket(puerto);
            System.out.println("servidor iniciado");

            //siempre estara escuchando peticiones
            while (true) {
                //aceptar las peticiones 
                socket = servidor.accept();
                System.out.println("cliente conectado");

                //recibir datos 
                entrada = new DataInputStream(socket.getInputStream());

                //leer datos e imprimir el mensaje 
                String mensaje = entrada.readUTF();
                System.out.println(mensaje);

                //establese el cambio
                this.setChanged();
                //notifica el cambio
                this.notifyObservers(mensaje);
                //limpia el cambio 
                this.clearChanged();

                socket.close();
                System.out.println("cliente desconectado");
            }
        } catch (IOException error) {
            System.out.println(error);
        }
    }

}
