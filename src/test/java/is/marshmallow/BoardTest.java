package is.marshmallow;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BoardTest {

    @Test
    public void TestInitializedBoard()          // kannar hvort bord frumstillist rett
    {
        // Arrange:
        Board board = new Board();

        // Assert:
        assertEquals("[1][2][3]\n[4][5][6]\n[7][8][9]\n", board.getBoardString());
    }

	@Test
    public void TestUpdateBoard()
    {
        // Arrange:
        Board board = new Board();

        // Assert:
        assertEquals(true, board.updateBoard(1, "X"));
        assertEquals(false, board.updateBoard(21, "X"));
    }

}
