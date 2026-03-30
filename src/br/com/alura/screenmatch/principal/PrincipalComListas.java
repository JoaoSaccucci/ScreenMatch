package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {

        Filme meuFilme = new Filme("O poderoso Chefão", 1970);
        meuFilme.avalia(6);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(8);
        var filmeDoJoao = new Filme("dogville", 2003);
        filmeDoJoao.avalia(10);
        Serie lost = new Serie("Lost", 2000);

        Filme f1 = filmeDoJoao;

        List<Titulo> lista = new LinkedList<>();
        lista.add(filmeDoJoao);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);
        for (Titulo item : lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme) {
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("The Rock");
        buscaPorArtista.add("Kevin Hart");
        System.out.println(buscaPorArtista);
        Collections.sort(buscaPorArtista);
        System.out.println("Derpois da ordenação");
        System.out.println(buscaPorArtista);

        System.out.println("Lista de filmes depois da ordenação");
        Collections.sort(lista);
        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano");
        System.out.println(lista);
    }
}
