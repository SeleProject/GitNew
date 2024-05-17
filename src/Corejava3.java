
public class Corejava3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String literal
		//String a = "Emil mariya ns";
		String b = "Emil mariya ns";
		String c = "Hello";
		
		//new
		String a1 = new String("Welcome");
		String a2 = new String("Welcome");
		
//*****************
		String a = "Emil mariya ns";
		//Split
		String[] splitvalue = a.split("mariya");
		System.out.println(splitvalue[0]);
		System.out.println(splitvalue[1].trim());
		//System.out.println(splitvalue[2]);
		for(int i=0;i<a.length();i++)
		{
			System.out.println(a.charAt(i));
			
		}
	}

}
