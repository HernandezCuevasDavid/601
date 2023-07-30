package CHAT;

import java.io.*;
import java.net.Socket;

public class cliente implements Runnable {

    //creamos los atributos de puerto y mensaje
    private final int puerto;
    private final String mensaje;

    public cliente(int puerto, String mensaje) {
        this.puerto = puerto;
        this.mensaje = mensaje;
    }

    @Override
    public void run() {
        //host de servidor

        final String HOST = "127.0.0.1";

        //mandar datos
        DataOutputStream salida;

        try {

            Socket socket = new Socket(HOST, puerto);
            salida = new DataOutputStream(socket.getOutputStream());

            //enviamos mensaje
            salida.writeUTF(mensaje);

        } catch (IOException Error) {
            System.out.println(Error);
        }

    }

}
