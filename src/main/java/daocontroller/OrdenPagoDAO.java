package daocontroller;

import conexion.conexion;
import modelo.MetodoPago;
import modelo.Ordenpago;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class OrdenPagoDAO {

    public static void CreateOrdenPagoDAO(Ordenpago ordenpago){
        conexion conexion = new conexion();

        try(Connection connect = conexion.getConnectDB()){
            PreparedStatement ps = null;
            try {

                String query = "INSERT INTO pagos(usuario_id, metodo_pago_id, fecha_pago, monto)VALUES(?,?,?,?)";

                ps = connect.prepareStatement(query);

                ps.setInt(1,ordenpago.getUsuario_id());
                ps.setInt(2,ordenpago.getMetodo_pago_id());
                ps.setString(3,ordenpago.getFecha_pago());
                ps.setDouble(4,ordenpago.getMonto());


                ps.executeUpdate();

            }catch (SQLException e){
                System.out.println(e);
            }

        }catch (SQLException e){
            System.out.println(e);
        }
    }

    public static void DeleteOrdenPagoDAO(int ordenid){

        conexion conexion = new conexion();

        try(Connection connect = conexion.getConnectDB()){

            PreparedStatement ps = null;

            try {

                String query = "DELETE FROM pagos WHERE pagos.pago_id = ? ";

                ps = connect.prepareStatement(query);

                ps.setInt(1,ordenid);

                ps.executeUpdate();

                System.out.println("Se ha eliminado la orden de compra correctamente");

            }catch (SQLException e){
                System.out.println(e);
            }

        }catch (SQLException e){
            System.out.println(e);
        }
    }
}
