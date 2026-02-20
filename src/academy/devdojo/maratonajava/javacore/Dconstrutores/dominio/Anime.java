package academy.devdojo.maratonajava.javacore.Dconstrutores.dominio;

import academy.devdojo.maratonajava.javacore.Dconstrutores.test.AnimeTest01;

public class Anime {
    private String name;
    private String type;
    private String genre;
    private int episodes;
    private String studio;

    public Anime(String name, String type, int episodes, String genre) { // Construtor
        this();
        this.name = name;
        this.type = type;
        this.episodes = episodes;
        this.genre = genre;
    };

    public Anime(String name, String type, int episodes, String genre, String studio) { // Construtor
        this(name, type, episodes, genre);
        this.studio = studio;
    };


    public Anime() { // sobrecarga de Contrutor
        System.out.println("Dentro do construtor sem argumentos");
    }

    public void print() {
        System.out.println(this.name);
        System.out.println(this.genre);
        System.out.println(this.type);
        System.out.println(this.episodes);
        System.out.println(this.studio);
    }
}
