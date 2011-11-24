import static org.junit.Assert.*;

import org.junit.Test;


public class testClass {
	
	@Test
	public void testPlaceMarker() {
		Player p = new Player();
		p.setName("Viktor");
		Player p2 = new Player();
		p.setName("Arnar");
		
		TicTacToe t = new TicTacToe();	
		t.player1 = p;
		t.player2 = p2;
		t.placeMarker(5);
		assertEquals(false,t.placeMarker(5));
	}

	@Test
	public void testSwitchPlayers() {
		Player p = new Player();
		p.setName("Viktor");
		Player p2 = new Player();
		p.setName("Arnar");

		TicTacToe tic = new TicTacToe();
		tic.player1 = p;
		tic.player2 = p2;
		tic.switchPlayers();
		
		assertEquals("Arnar",tic.currentPlayer.getName());
	}
	
	@Test
	public void testBoard() {
		Board board = new Board();
		StringBuilder b = new StringBuilder();
		b.append("Bord: \n");
		b.append("[1][2][3]\n");
		b.append("[4][5][6]\n");
		b.append("[7][8][9]\n");
		
		assertEquals(b.toString(),board.getBoard());
	}

}
