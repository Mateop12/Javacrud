package daocontroller;

import conexion.conexion;
import modelo.MetodoPago;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MetodoPagoDAO {

    public static void CreateMetodoPagoDAO(MetodoPago metodoPago){
        conexion conexion = new conexion();

        try(Connection connect = conexion.getConnectDB()){
            PreparedStatement ps = null;
            try {

                String query = "INSERT INTO metodopago(descripcion)VALUES(?)";

                ps = connect.prepareStatement(query);

                ps.setString(1,metodoPago.getDescripcion());


                ps.executeUpdate();

            }catch (SQLException e){
                System.out.println(e);
            }

        }catch (SQLException e){
            System.out.println(e);
        }
    }

    public static void DeleteMetodoPagoDAO(int idpago){
        conexion conexion = new conexion();

        try(Connection connect = conexion.getConnectDB()){
            PreparedStatement ps = null;
            try {

                String query = "DELETE FROM metodopago WHERE metodopago.metodo_pago_id = ? ";

                ps = connect.prepareStatement(query);

                ps.setInt(1,idpago);

                ps.executeUpdate();

                System.out.println("Se ha eliminado el metodo de pago correctamente");


            }catch (SQLException e){
                System.out.println(e);
            }

        }catch (SQLException e){
            System.out.println(e);
        }
    }
}
