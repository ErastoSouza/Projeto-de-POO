import java.util.ArrayList;
import java.util.List;

public class Cadastrar {

    private List<Time> times;
    private List<Jogador> jogadores;

    public Cadastrar() {
        this.times = new ArrayList<>();
        this.jogadores = new ArrayList<>();
    }

    public void cadastrarTime(Time time) {
        times.add(time);
    }

    public void cadastrarJogador(Jogador jogador) {
        jogadores.add(jogador);
    }
    public boolean existeTime(String nome, String cidade) {
        for (Time time : times) {
            if (time.getNome().equals(nome) && time.getCidade().equals(cidade)) {
                return true;
            }
        }
        return false;
    }

    
}
    

