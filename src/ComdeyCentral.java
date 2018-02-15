import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

public class ComdeyCentral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ArrayList<String> joke = new ArrayList<String>();
			ArrayList<String> punchline = new ArrayList<String>();
			joke.add("This joke is kinda chessy but...");
			punchline.add("it's GUDA enough for me");
			joke.add("Why are flamingos always happy?");
			punchline.add("Because they're never blue");
			joke.add("What do you call a magic owl?");
			punchline.add("HOO-dini");
			joke.add("Why do chicken coops only have two doors?");
			punchline.add("Because if they had four, they would be chicken sedans!");
			
			Random ra = new Random();
			
			int nd = ra.nextInt(joke.size());
			String om = joke.get(nd);
			JOptionPane.showMessageDialog(null,om);
			String lol =punchline.get(nd);
			JOptionPane.showMessageDialog(null, lol);
	}

}
