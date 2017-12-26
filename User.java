import java.io.*;   
import java.util.*;

public class User{



	public static void main(String[] args){
		InputStreamReader isr = new InputStreamReader( System.in );
    	BufferedReader in = new BufferedReader( isr );
    	String answer = "";

		System.out.println("Wanna generate a hand??");
		Hand newHand = new Hand();

		try {
	    answer = in.readLine();
    	} catch ( IOException e ) { }

    	while((answer.equals("yes")) || (answer.equals("Yes"))) {
    		newHand = new Hand();
    		System.out.println(newHand);
    		System.out.println("Wanna generate another hand??");
			try {
	    	answer = in.readLine();
    		} catch ( IOException e ) { }
    	}
    	System.out.println("Okay bye");
	}

}