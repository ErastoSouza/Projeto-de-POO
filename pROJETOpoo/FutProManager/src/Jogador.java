public class Jogador extends Time {

    private String nomeJogador;
    private int idade;

    
    public Jogador(String nomeTime, String cidadeTime, String nomeJogador, int idade) {
        super(nomeTime, cidadeTime);
        this.nomeJogador = nomeJogador;
        this.idade = idade;
    }

   
    public String getNomeJogador() {
        return nomeJogador;
    }

    public void setNomeJogador(String nomeJogador) {
        this.nomeJogador = nomeJogador;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
    
