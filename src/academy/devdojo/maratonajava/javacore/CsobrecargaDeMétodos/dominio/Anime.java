package academy.devdojo.maratonajava.javacore.CsobrecargaDeMétodos.dominio;

public class Anime {
    private String name;
    private String type;
    private String genre;
    private int episodes;

    public void print() {
        System.out.println(this.name);
        System.out.println(this.genre);
        System.out.println(this.type);
        System.out.println(this.episodes);
    }

    public void init(String name, String type, int episodes) {
        this.name = name;
        this.type = type;
        this.episodes = episodes;
    }

    public void init(String name, String type, int episodes, String genre) {
        this.init(name, type, episodes);
        this.genre = genre;
    }


    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public String getType() {
        return type;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
