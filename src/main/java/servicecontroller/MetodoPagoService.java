package servicecontroller;

import daocontroller.AnimeDAO;
import daocontroller.MetodoPagoDAO;
import modelo.MetodoPago;

import java.util.Scanner;

public class MetodoPagoService {
    Scanner sc = new Scanner(System.in);

    public void CreateMetodoPago(MetodoPago metodoPago){
        System.out.println("Ingrese metodo de pago: ");
        String metodoPag = sc.nextLine();
        metodoPago.setDescripcion(metodoPag);

        MetodoPagoDAO.CreateMetodoPagoDAO(metodoPago);

    }

    public void DeleteMetodoPago(){
        System.out.println("Digite id a borrar");
        int idpago = sc.nextInt();

        MetodoPagoDAO.DeleteMetodoPagoDAO(idpago);
    }


}
