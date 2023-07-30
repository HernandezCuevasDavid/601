package dao;

import CONEXIONBD.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class conversacionImpl implements conversacion {

    conexion instanciaMySQL = conexion.getInstance();

    @Override
    public void registrarConversacion1(String mensaje) {

        PreparedStatement consulta = null;
        Connection conexion = null;

        try {
            conexion = instanciaMySQL.conectar();
            consulta = conexion.prepareStatement("INSERT INTO mensajes(cliente, fecha) VALUES(?,CURDATE())");
            
            consulta.setString(1, mensaje);
            consulta.executeUpdate();
        } catch (SQLException error) {
            System.out.println(error);
        }
    }

    @Override
    public void registrarConversacion2(String mensaje) {
        PreparedStatement consulta = null;
        Connection conexion = null;

        try {
            conexion = instanciaMySQL.conectar();
            consulta = conexion.prepareStatement("INSERT INTO mensajes(cliente2, fecha) VALUES(?,CURDATE())");
            consulta.setString(1, mensaje);
            consulta.executeUpdate();
        } catch (SQLException error) {
            System.out.println(error);
        }
    }

}
