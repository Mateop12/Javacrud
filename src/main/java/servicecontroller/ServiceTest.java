package servicecontroller;

import modelo.Anime;
import modelo.MetodoPago;
import modelo.Ordenpago;
import modelo.Usuario;

public class ServiceTest {

    public static void main(String[] args) {
        Anime anime = new Anime();
        AnimeService as = new AnimeService();

        Usuario usuario = new Usuario();
        UsuarioService us = new UsuarioService();

        MetodoPago metodoPago = new MetodoPago();
        MetodoPagoService mps = new MetodoPagoService();

        Ordenpago ordenpago = new Ordenpago();              //objetos
        OrdenPagoService ops = new OrdenPagoService();


        as.CreateAnime(anime);
        as.SelectAnime();

        //us.CrearUsuario(usuario);
        //us.SelectUsuario();
        //us.DeleteUsuario();

        //mps.CreateMetodoPago(metodoPago);
        //mps.DeleteMetodoPago();

        //ops.crearNuevaOrden(ordenpago);
        //ops.DeleteOrdenPago();
    }

}
