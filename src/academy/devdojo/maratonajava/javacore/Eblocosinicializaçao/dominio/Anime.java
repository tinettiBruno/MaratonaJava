package academy.devdojo.maratonajava.javacore.Eblocosinicializaçao.dominio;

public class Anime {
    private String name;
    private int[] episodes;
    /*
    * Ordem de execução quando um objeto é criado:
    * 1 - Aloca memória para o objeto
    * 2 - Inicializa os atributos com valores default ou atribuidos
    * 3 - Bloco de inicializaçõa
    * 4 - construtorres
    * */

    { // bloco de inicialização, pode ser colocado em qualquer lugar da classe, geralmente colocado no início
        episodes = new int[100];
        for (int i = 0; i < episodes.length; i++) {
            episodes[i] = i+1;
        }
    }



    public Anime(String name) {
        this.name = name;
    }

    public Anime() { // atributos são criados antes da chamada do construtor
        for(int episode: this.episodes) {
            System.out.print((episode + " "));
        }
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public int[] getEpisodes() {
        return episodes;
    }
}
