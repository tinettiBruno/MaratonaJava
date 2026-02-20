package academy.devdojo.maratonajava.javacore.Eblocosinicializaçao.test;

import academy.devdojo.maratonajava.javacore.Eblocosinicializaçao.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        if (anime.getName() != null) {
            System.out.println(anime.getName());
        }

        for (int episode : anime.getEpisodes()) {
            System.out.print(episode + " ");
        }
        System.out.println();

    }
}
