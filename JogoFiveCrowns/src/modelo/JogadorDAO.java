package modelo;

import dados.Dados;
import java.util.ArrayList;

public class JogadorDAO {

    public ArrayList<Jogador> getLista() {
        return Dados.listaDeJogadores;
    }

    public Jogador getJogadorPorId(Integer id) {
        for (Jogador jogador : Dados.listaDeJogadores) {
            if (jogador.getId().equals(id)) {
                return jogador;
            }
        }
        return null;
    }

    public void inserir(String nome) {
        Jogador jogador = new Jogador();
        jogador.setId(Dados.geraId);
        Dados.geraId++;
        jogador.setNome(nome);
        jogador.setPontos(0);
        Dados.listaDeJogadores.add(jogador);
    }

    public void alterar(Integer id, String nome, Integer pontos) {
        Jogador jogador = getJogadorPorId(id);
        jogador.setNome(nome);
        jogador.setPontos(pontos);
        Integer indice = Dados.listaDeJogadores.indexOf(jogador);
        Dados.listaDeJogadores.set(indice, jogador);
    }

    public void remover(Integer id) {
        Jogador jogador = getJogadorPorId(id);
        Dados.listaDeJogadores.remove(jogador);
    }

}
