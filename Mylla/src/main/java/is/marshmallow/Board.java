package is.marshmallow;

public class Board
{
	String [][]board;

    public Board()
	{
		board = new String[3][3];
		int counter = 1;

		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 3; j++)
			{
				board[i][j] = String.valueOf(counter);
				counter++;
			}
		}
	}


    public String getBoardString()
	{
		String tempBoard = "";

		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 3; j++)
			{
				tempBoard += "[" + board[i][j] + "]";
			}
			tempBoard += "\n";
		}

		return tempBoard;
	}

	public String[][] getBoardArray()
	{
		return board;
	}

	/*
	public boolean updateBoard(int place, char marker)
	{
	    for (int i = 0; i < 3; i++)
	    {
	        for (int j = 0; j < 3; j++)
	        {
	            if (board[i][j] == place)
	            {
	                board[i][j] = marker;
	                return true;
	            }
	        }
	    }

	    return false;
	}


	public String getBoard()
	{
	    StringBuilder builder = new StringBuilder("Bord: \n");

	    for (int i = 0; i < 3; i++)
	    {

	        for (int j = 0; j < 3; j++)
	        {
	            builder.append("[" + board[i][j] + "]");
	        }

	        builder.append("\n");
	    }

	    return builder.toString();
	} */
}
