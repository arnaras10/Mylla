package is.marshmallow;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TicTacToeTest extends TestCase {
	/**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public TicTacToeTest( String testName )
    {
        super(testName);
    }
    
    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( TicTacToeTest.class );
    }


	public void TestSwitchPlayer()
	{
		// Arrange:
	    TicTacToe t = new TicTacToe("Halli", "Bjarni");

	    // Act:
	    t.placeMarker(1, "X");

	    // Assert:
	    assertEquals(false, t.placeMarker(4, "X"));
	}
        /*

	        public void TestInitializedBoard()
	        {
	            // Arrange:
	            TicTacToe t = new TicTacToe("John", "Hancock");

	            // Act:

	            // Assert:
	            assertEquals("[1][2][3]\n[4][5][6]\n[7][8][9]\n", t.getBoard());
	            //"Bord birtist EKKI rett";
	        }

	        public void TestPlaceMarker()
	        {
	            // Arrange:
	            TicTacToe t = new TicTacToe("John", "Lennon");

	            // Act:
	            t.placeMarker(5, "X");

	            // Assert:
	            assertEquals(false, t.placeMarker(5, "O"));
	            assertEquals(true, t.placeMarker(1, "O"));
	        }

	        public void TestCorrectMarker() // kemur réttur marker á réttum player
	        {
	            // Arrange:
	            TicTacToe t = new TicTacToe("Hoho", "Bobo");

	            // Act:
	            t.placeMarker(5, "X");

	            // Assert:
	            assertEquals(false, t.placeMarker(4, "X"));
	            assertEquals(true, t.placeMarker(4, "O"));
	        }

	        public void TestCheckWinnerRow() // kannar hvort sé búið að vinna með röð
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

	        public void TestCheckDraw()
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
      }*/
}
