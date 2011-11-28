package is.marshmallow;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner
{
	public static void main(String[] args)
    {
        System.out.println("-- TicTacToeTest --");
		Result result = JUnitCore.runClasses(TicTacToeTest.class);
		System.out.println("Fjoldi profana: " + result.getRunCount());
		System.out.println("Fjoldi fails: " + result.getFailureCount());
		
		for (Failure failure : result.getFailures()) {
			System.out.println("Fail skilabod: " + failure.toString());
			}

        System.out.println();

        System.out.println("-- BoardTest --");
        Result result2 = JUnitCore.runClasses(BoardTest.class);
        System.out.println("Fjoldi profana: " + result2.getRunCount());
		System.out.println("Fjoldi fails: " + result2.getFailureCount());

		for (Failure failure : result2.getFailures()) {
			System.out.println("Fail skilabod: " + failure.toString());
			}
	}	
}
