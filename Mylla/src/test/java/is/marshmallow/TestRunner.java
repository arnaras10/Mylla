package is.marshmallow;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
	public static void main(String[] args) {
		System.out.println("----- Test Runner fyrir TicTacToe -----");
		
		Result result = JUnitCore.runClasses(TicTacToeTest.class);

		System.out.println("Fjoldi profana: " + result.getRunCount());
		System.out.println("Fjoldi fails: " + result.getFailureCount());
		
		for (Failure failure : result.getFailures()) {
			System.out.println("Fail skilabod: " + failure.toString());
			}
	}	
}
