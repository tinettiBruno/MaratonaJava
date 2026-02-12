package academy.devdojo.maratonajava.javacore.Dconstrutores.test;

import academy.devdojo.maratonajava.javacore.Dconstrutores.dominio.Anime;


public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("One Piece", "TV", 1500, "Shounen");
        anime.print();
        Anime anime2 = new Anime(); // funciona sem parâmetros por conta da sobrecarga de construtor
        anime2.print();
    }
}
