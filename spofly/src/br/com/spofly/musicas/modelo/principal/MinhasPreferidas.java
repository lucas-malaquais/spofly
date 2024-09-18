package br.com.spofly.musicas.modelo.principal;

import br.com.spofly.musicas.modelo.Audio;

import javax.sound.sampled.AudioFileFormat;

public class MinhasPreferidas {

    public void inclui(Audio audio){
        if (audio.getClassificacao() >= 9) {
            System.out.println(audio.getTitulo() + " é considerado sucesso absoluto" + " e preferido por todos!");
        }else{
            System.out.println(audio.getTitulo() + " tambem e um dos que todo mundo está " +
                    " curtindo");
        }
    }


}
