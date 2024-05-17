package snippet;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class TestStreams {
	
	@Test
	public void Regular()
	{
		ArrayList<String> a = new ArrayList<String>();
		a.add("Abcd");
		a.add("Abi");
		a.add("Emil");
		a.add("Adam");
		a.add("Riya");
		a.add("Tina");
		int count=0;
		for(int i=0;i<a.size();i++) {
			String actual = a.get(i);
			if(actual.startsWith("A"))
			{
				count++;
			}
		}
		System.out.println(count);
	}
	
	

}
