import java.util.Arrays;
import java.util.List;

public class Player {

    public static final List<String> points = Arrays.asList("love", "fifteen", "thirty", "forty");
    String nome;
    private int punteggio = 0;
   
    public void setPunteggio(int punteggio) {
		this.punteggio = punteggio;
	}

	public int getPunteggio() {
        return punteggio;
    }
  
    public String getNome() {
        return nome;
    }

    public void winBall() {
        this.punteggio = this.punteggio + 1;
    }

    public Player(String nome) {
        this.nome = nome;
    }

    public String getDescrizionePunteggio(){
        return points.get(punteggio);
    }

}