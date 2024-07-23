package servicecontroller;

import daocontroller.AnimeDAO;
import modelo.Anime;

import java.util.Scanner;

public class AnimeService {
    Scanner sc = new Scanner(System.in);

    public void CreateAnime(Anime anime){
        System.out.println("Ingrese nombre de anime a crear: ");
        String animeName = sc.nextLine();
        anime.setTitulo(animeName);

        System.out.println("Ingrese descripción del anime");
        String descripcion = sc.nextLine();
        anime.setDescripcion(descripcion);

        System.out.println("Ingrese genero");
        String genero = sc.nextLine();
        anime.setGenero(genero);

        AnimeDAO.createAnimeDAO(anime);
    }

    public void SelectAnime(){
        AnimeDAO.selectAnimeDAO();
    }

    public void DeleteAnime(){
        System.out.println("Digite id a borrar");
        int idAnime = sc.nextInt();

        AnimeDAO.DeleteCategoryDAO(idAnime);
    }
}
