package br.com.spofly.musicas.modelo.principal;

import br.com.spofly.musicas.modelo.Musicas;
import br.com.spofly.musicas.modelo.Podcast;

public class Principal {
    public static void main(String[] args) {
     Musicas minhaMusica = new Musicas();
     minhaMusica.setTitulo("forever");
     minhaMusica.setCantor("kiss");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
        }
        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
        }
        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("BolhaDev");
        meuPodcast.setApresentador("marcos mendes");
        for (int i = 0; i < 5000; i++) {
            meuPodcast.reproduz();
        }
        for (int i = 0; i < 1000; i++) {
            meuPodcast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);
    }
}
