public class TennisGame {

    private Player player1;
    private Player player2;

    public TennisGame(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public String getPunteggio() {
        if (player1.getPunteggio() >= 3 && player2.getPunteggio() >= 3) {
            if (Math.abs(player2.getPunteggio() - player1.getPunteggio()) >= 2) {
                return getVincitore().getNome() + " vince";
            } else if (player1.getPunteggio() == player2.getPunteggio()) {
                return "pareggio";
            } else {
                return "vantaggio " + getVincitore().getNome();
            }
        } else {
            return player1.getDescrizionePunteggio() + ", " + player2.getDescrizionePunteggio();
        }
    }

    public Player getVincitore() {
        return (player1.getPunteggio() > player2.getPunteggio()) ? player1 : player2;
    }

}