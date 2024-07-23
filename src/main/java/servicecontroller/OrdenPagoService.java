package servicecontroller;

import daocontroller.MetodoPagoDAO;
import daocontroller.OrdenPagoDAO;
import daocontroller.UsuarioDAO;
import modelo.Anime;
import modelo.MetodoPago;
import modelo.Ordenpago;
import modelo.Usuario;

import java.sql.SQLException;
import java.util.Scanner;

public class OrdenPagoService {
    Scanner sc = new Scanner(System.in);

    private UsuarioDAO usuarioDAO;
    private MetodoPagoDAO metodoPagoDAO;
    private OrdenPagoDAO ordenPagoDAO;
    private UsuarioService usuarioService;
    private Usuario usuario;
    private MetodoPago metodoPago;


    public OrdenPagoService(UsuarioDAO usuarioDAO, MetodoPagoDAO metodoPagoDAO, OrdenPagoDAO ordenPagoDAO, UsuarioService usuarioService, Usuario usuario, MetodoPago metodoPago) {
        this.usuarioDAO = usuarioDAO;
        this.metodoPagoDAO = metodoPagoDAO;
        this.ordenPagoDAO = ordenPagoDAO;
        this.usuarioService = usuarioService;
        this.usuario = usuario;
        this.metodoPago = metodoPago;
    }

    public OrdenPagoService() {

    }

    public void crearNuevaOrden(Ordenpago ordenpago) {

            System.out.printf("******");
            ordenpago.getUsuario_id();
            ordenpago.getMetodo_pago_id();
            System.out.println("Ingrese fecha de pago");
            String fecha = sc.nextLine();
            ordenpago.setFecha_pago(fecha);
            System.out.println("Ingrese monto de pago");
            double montoPago = sc.nextDouble();
            ordenpago.setMonto(montoPago);

            OrdenPagoDAO.CreateOrdenPagoDAO(ordenpago);

            //System.out.println("Orden insertada con éxito.");
    }

    public  void DeleteOrdenPago(){
        System.out.println("Digite id a borrar");
        int idorden = sc.nextInt();

        OrdenPagoDAO.DeleteOrdenPagoDAO(idorden);
    }
}
