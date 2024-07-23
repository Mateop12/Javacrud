package daocontroller;

import conexion.conexion;
import modelo.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO {

    public static void CreateUsuarioDAO(Usuario usuario){
        conexion conexion = new conexion();

        try(Connection connect = conexion.getConnectDB()){
            PreparedStatement ps = null;
            try {

                String query = "INSERT INTO usuario(nombre, apellido, correo_electronico, password, fecha_registro)VALUES(?,?,?,?,?)";

                ps = connect.prepareStatement(query);

                ps.setString(1,usuario.getNombre());
                ps.setString(2,usuario.getApellido());
                ps.setString(3,usuario.getEmail());
                ps.setString(4,usuario.getPassword());
                ps.setString(5, usuario.getFechaRegistro());

                ps.executeUpdate();

            }catch (SQLException e){
                System.out.println(e);
            }

        }catch (SQLException e){
            System.out.println(e);
        }
    }

    public static void selectUsuarioDAO( ){

        conexion conexion = new conexion();

        PreparedStatement ps = null;

        ResultSet rs = null;

        try(Connection connect = conexion.getConnectDB()){

            String query = "SELECT * FROM usuario";

            ps = connect.prepareStatement(query);
            rs = ps.executeQuery();

            while (rs.next()){
                System.out.println("---------------");
                System.out.println("ID: " + rs.getInt("usuario_id"));
                System.out.println("Nombre: " + rs.getString("nombre"));
                System.out.println("Apellido: " + rs.getString("apellido"));
                System.out.println("Correo: " + rs.getString("correo_electronico"));
                System.out.println("Fecha Registro: " + rs.getString("fecha_registro"));
            }

        }catch (SQLException e){
            System.out.println(e);
        }

    }

    public static void DeleteUsuarioDAO(int usuarioid){

        conexion conexion = new conexion();

        try(Connection connect = conexion.getConnectDB()){

            PreparedStatement ps = null;

            try {

                String query = "DELETE FROM usuario WHERE usuario.usuario_id = ? ";

                ps = connect.prepareStatement(query);

                ps.setInt(1,usuarioid);

                ps.executeUpdate();

                System.out.println("Se ha eliminado el usuario correctamente");

            }catch (SQLException e){
                System.out.println(e);
            }

        }catch (SQLException e){
            System.out.println(e);
        }
    }
}
