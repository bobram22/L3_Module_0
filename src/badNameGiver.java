import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

public class badNameGiver {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ArrayList<String> adjective = new ArrayList<String>();
			ArrayList<String> nouns = new ArrayList<String>();
			adjective.add("slimy");
			nouns.add("donkey");
			adjective.add("puny");
			nouns.add("kangaroo");
			adjective.add("annoying");
			nouns.add("hamster");
			adjective.add("purple");
			nouns.add("chiken");
			
			Random ra = new Random();
			
			int nd = ra.nextInt(adjective.size());
			int an = ra.nextInt(nouns.size());
			String om = adjective.get(nd);
			String lol =nouns.get(an);
			JOptionPane.showMessageDialog(null,om + " "+ lol);
			
		
	}
}
