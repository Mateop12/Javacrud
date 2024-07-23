package servicecontroller;

import daocontroller.UsuarioDAO;
import modelo.Usuario;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import java.util.Scanner;

public class UsuarioService {
    Scanner sc = new Scanner(System.in);

    public void CrearUsuario(Usuario usuario){
        System.out.println("Ingrese nombre de usuario");
        String nombreUsuario = sc.nextLine();
        usuario.setNombre(nombreUsuario);

        System.out.println("Ingrese apellido de usuario");
        String apellidoUsuario = sc.nextLine();
        usuario.setApellido(apellidoUsuario);

        System.out.println("Ingrese correo");
        String correoUsuario = sc.nextLine();
        usuario.setEmail(correoUsuario);

        System.out.println("Ingrese contraseña");
        String passUsuario = sc.nextLine();
        usuario.setPassword(passUsuario);

        System.out.println("Fecha de registro");
        LocalDateTime fechaRegistro = LocalDateTime.now();

        // Formateador para la fecha
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String fechaRegistroStr = fechaRegistro.format(formatter);
        System.out.println("Fecha registro: " + fechaRegistroStr);
        usuario.setFechaRegistro(fechaRegistroStr);

        UsuarioDAO.CreateUsuarioDAO(usuario);
    }

    public void SelectUsuario(){
        UsuarioDAO.selectUsuarioDAO();
    }

    public void DeleteUsuario(){
        System.out.println("Ingrese ID usuario a liminar");
        int idUsuario = sc.nextInt();

        UsuarioDAO.DeleteUsuarioDAO(idUsuario);
    }
}
