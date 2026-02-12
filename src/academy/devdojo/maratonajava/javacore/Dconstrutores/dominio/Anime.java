package academy.devdojo.maratonajava.javacore.Dconstrutores.dominio;

import academy.devdojo.maratonajava.javacore.Dconstrutores.test.AnimeTest01;

public class Anime {
    private String name;
    private String type;
    private String genre;
    private int episodes;

    public Anime(String name, String type, int episodes, String genre) { // Construtor
        System.out.println("Dentro do construtor"); // o metodo construtor é sempre chamado na inicialização
        this.name = name;
        this.type = type;
        this.episodes = episodes;
        this.genre = genre;
    };

    public Anime() { // sobrecarga de Contrutor

    }

    public void print() {
        System.out.println(this.name);
        System.out.println(this.genre);
        System.out.println(this.type);
        System.out.println(this.episodes);
    }
}
