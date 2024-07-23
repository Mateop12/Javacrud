package daocontroller;

import conexion.conexion;
import modelo.Anime;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AnimeDAO {

    public static void createAnimeDAO(Anime anime){

        conexion conexion = new conexion();

        try(Connection connect = conexion.getConnectDB()){
            PreparedStatement ps = null;
            try {

                String query = "INSERT INTO anime(titulo, descripcion, genero)VALUES(?,?,?)";

                ps = connect.prepareStatement(query);

                ps.setString(1,anime.getTitulo());
                ps.setString(2,anime.getDescripcion());
                ps.setString(3,anime.getGenero());

                ps.executeUpdate();

            }catch (SQLException e){
                System.out.println(e);
            }

        }catch (SQLException e){
            System.out.println(e);
        }
    }

    public static void selectAnimeDAO( ){

        conexion conexion = new conexion();

        PreparedStatement ps = null;

        ResultSet rs = null;

        try(Connection connect = conexion.getConnectDB()){

            String query = "SELECT * FROM anime";

            ps = connect.prepareStatement(query);
            rs = ps.executeQuery();

            while (rs.next()){
                System.out.println("---------------");
                System.out.println("ID: " + rs.getInt("anime_id"));
                System.out.println("Titulo: " + rs.getString("titulo"));
                System.out.println("Descripción: " + rs.getString("descripcion"));
                System.out.println("Genero: " + rs.getString("genero"));
                System.out.println("Fecha estreno: " + rs.getString("fecha_estreno"));
            }

        }catch (SQLException e){
            System.out.println(e);
        }

    }

    public static void DeleteCategoryDAO(int animeid){

        conexion conexion = new conexion();

        try(Connection connect = conexion.getConnectDB()){

            PreparedStatement ps = null;

            try {

                String query = "DELETE FROM anime WHERE anime.anime_id = ? ";

                ps = connect.prepareStatement(query);

                ps.setInt(1,animeid);

                ps.executeUpdate();

                System.out.println("Se ha eliminado el anime de la compra correctamente");

            }catch (SQLException e){
                System.out.println(e);
            }

        }catch (SQLException e){
            System.out.println(e);
        }
    }
}
