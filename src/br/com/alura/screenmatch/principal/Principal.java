package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso Chefão", 1970);
        //meuFilme.setNome("O poderoso Chefão");
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println("A média do filme é: " + meuFilme.pegaMedia());

        Serie lost = new Serie("Lost", 2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosporEpisodio(50);
        System.out.println("Duração para maratonar lost: " + lost.getDuracaoEmMinutos());

        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio1 = new Episodio();
        episodio1.setNumero(1);
        episodio1.setSerie(lost);
        episodio1.setTotalVisualizacoes(300);
        filtro.filtra(episodio1);

        var filmeDoJoao = new Filme("dogville", 2003);
        filmeDoJoao.setDuracaoEmMinutos(200);
        filmeDoJoao.avalia(10);

        ArrayList<Filme> lista = new ArrayList<>();
        lista.add(filmeDoJoao);
        lista.add(meuFilme);
        lista.add(outroFilme);
        System.out.println("Tamanho da lista: " + lista.size());
        System.out.println("Primeiro filme: " + lista.get(0).getNome());
        System.out.println(lista);






    }
}
