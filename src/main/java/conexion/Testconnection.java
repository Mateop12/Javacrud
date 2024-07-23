package conexion;

import java.sql.Connection;
import java.sql.SQLException;

public class Testconnection {

    public static void main(String[] args) {

        conexion conexion = new conexion();

        try(Connection connect = conexion.getConnectDB()){

        }catch (SQLException e){
            System.out.println(e);
        }

    }
}
