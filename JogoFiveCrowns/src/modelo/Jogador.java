package modelo;

public class Jogador implements Comparable<Jogador>{

    private Integer id;
    private String nome;
    private Integer pontos;

    public Jogador() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getPontos() {
        return pontos;
    }

    public void setPontos(Integer pontos) {
        this.pontos = pontos;
    }
    
    @Override
    public String toString(){
        return this.nome;
    }

    @Override
    public int compareTo(Jogador outroJogador) {
        return this.pontos.compareTo(outroJogador.pontos);
    }
    
}
