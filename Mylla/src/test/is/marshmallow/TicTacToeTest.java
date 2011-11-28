package is.marshmallow;

import static org.junit.Assert.*;
import org.junit.Test;

public class TicTacToeTest {

	@Test
    public void TestPlaceMarker()               // kannar hvort notandi geti valid reit
    {
        // Arrange:
        TicTacToe t = new TicTacToe("John", "Lennon");

        // Act:
        t.placeMarker(5, "X");

        // Assert:
        assertEquals(false, t.placeMarker(5, "O"));     // reynir ad setja i upptekinn reit
        assertEquals(true, t.placeMarker(1, "O"));      // setur lausann reit
                                                        // NOTE: ekki haegt ad nota sama marker tvisvar i rod
                                                        //        - fall returnar annars false
    }

	@Test
    public void TestCorrectMarker() // kannar hvort placemarker() taki vid rettum marker
    {
        // Arrange:
        TicTacToe t = new TicTacToe("Hoho", "Bobo");

        // Act:
        t.placeMarker(5, "X");

        // Assert:
        assertEquals(false, t.placeMarker(4, "X"));     // reynir ad setja aftur X
        assertEquals(true, t.placeMarker(4, "O"));      // setur med rettum marker
                                                        // NOTE: ekki haegt ad nota sama marker tvisvar i rod
                                                        //        - fall returnar annars false
    }

	@Test
    public void TestCheckWinnerRow() // kannar hvort se buid ad vinna med rod (row)
    {
        // Arrange:
        TicTacToe t = new TicTacToe("Gunny", "Duder");

        // Act:
        t.placeMarker(1, "X");
        t.placeMarker(4, "O");
        t.placeMarker(2, "X");
        t.placeMarker(5, "O");
        t.placeMarker(3, "X");

        // Assert:
        assertEquals(true, t.checkWinner());
    }

	@Test
    public void TestCheckDraw() // kannar hvort checkDraw() finni jafntefli
    {
        // Arrange:
        TicTacToe t = new TicTacToe("Brandur", "Enni");

        // Act:
        t.placeMarker(1, "X");
        t.placeMarker(8, "O");
        t.placeMarker(2, "X");
        t.placeMarker(3, "O");
        t.placeMarker(6, "X");
        t.placeMarker(4, "O");
        t.placeMarker(5, "X");
        t.placeMarker(9, "O");
        t.placeMarker(7, "X");

        // Assert:
        assertEquals(true, t.checkDraw());
	}
    
    @Test
    public void TestSwitchPlayer() // kannar hvort ad thad skiptist a playerum eftir hvert turn
    {
        // Arrange:
        TicTacToe t = new TicTacToe("Halli", "Bjarni");

        // Act:
        t.placeMarker(1, "X");

        // Assert:
        assertEquals(false, t.placeMarker(4, "X"));
    }

}
