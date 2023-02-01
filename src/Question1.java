import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question1 {

	public static void main(String[] args) {
		List<String> l = Arrays.asList("12Word", "Lemons", "Dog", "Orange", "Cat", "Royal Bengal TIger");
		List<String> newL = new ArrayList<String>();
		newL = l.stream().filter(s->s.length() > 5 && s.length() < 8).collect(Collectors.toList());
		
		System.out.println("Strings with length > 5 and < 8:");
		System.out.println(newL);
	}
}
