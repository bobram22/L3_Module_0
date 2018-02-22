import java.util.ArrayList;

public class arrayOverload {
public static void main(String[] args) {
	ArrayList<String> over = new ArrayList<String>();
	for (int i = 0; i < 90000000; i++) {
		over.add("hi");
		if(i%100==0) {
		System.out.println(i);
	}
	}
	System.out.println("over");
}
}
