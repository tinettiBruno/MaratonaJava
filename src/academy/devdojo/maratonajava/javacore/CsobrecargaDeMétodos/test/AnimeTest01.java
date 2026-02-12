package academy.devdojo.maratonajava.javacore.CsobrecargaDeMétodos.test;

import academy.devdojo.maratonajava.javacore.CsobrecargaDeMétodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        anime.init("One Piece", "TV", 1500, "Shounen");

        anime.print();
    }
}
