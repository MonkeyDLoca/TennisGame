import static org.junit.Assert.*;

import org.junit.Before;

import static org.hamcrest.MatcherAssert.assertThat;


import org.junit.Test;

public class TennisGameTest {
	
	Player genoveffo;
	Player ermenegildo;
	TennisGame partita;
	
	@Before
	public void primaDiIniziare(){
		genoveffo = new Player("genoveffo");
		ermenegildo = new Player("ermenegildo");
		partita = new TennisGame(genoveffo,ermenegildo);
	}

	@Test
	public void inziaLaPartitaZeroAZero() {
		assertEquals("love,love",partita.getPunteggio());
	}

}


