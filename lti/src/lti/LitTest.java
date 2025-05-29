package lti;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LitTest {

	public static void main(String[] args) {

		
		String str="Java articles are Awesome";
		
		
		//output => find first nonrepeatedcharacter using java8?
		//List<String> char= .split(input);
		
		Map<Character, Long> occranceofChar = str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(s->s,Collectors.counting()));
		System.out.println("occrance of Char => "+occranceofChar);
			System.out.println("*************\nNon Repeated Character Only\n*********************");
		occranceofChar.forEach((k,v)->{
			
			if(k>1 && v<=1) {
				System.out.printf(k+":"+v+",");
			}
		});
		List<String> word = Arrays.stream(str.split(" ")).collect(Collectors.toList());
		
		
		Map<String, Long> occranceOfWords = word.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println("\nOccrance Of Words==> "+occranceOfWords);
		
			int[] numbers = {10, 20, 4, 45, 99, 99, 67};
		
			
		List<int[]>  secondNum = Arrays.asList(numbers);
		
		//secondNum.stream().sorted(Comparator.naturalOrder().reversed()).skip(1);
		

		
		
	}

}
