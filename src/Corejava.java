
public class Corejava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 6;
		String name = "Emilmariya";
		char letter = 'E';
		double dec = 5.33;
		boolean value = true;
		
		System.out.println(num+" is my Roll number");
		System.out.println(name+" is my name");
		System.out.println(letter+" is my first letter");
		System.out.println(dec+" is my decimal number");
		System.out.println("it is "+value);
		
		//arrays
//		int[] arr = new int[5];
//
//		arr[0]=1;
//		arr[1]=2;
//		arr[2]=3;
//		arr[3]=4;
//		arr[4]=5;
		
		int[] arr = {1,2,3,4,5};
		//System.out.println(arr[0]);
		
		//for loop
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		String[] name1 = {"Emil","mariya","ns"};
		for(int i=0;i<name1.length;i++)
		{
			System.out.println(name1[i]);
		}
		//
		String[] name2 = {"Abin","Joseph","ns"};
		for(String s:name2)
		{
			System.out.println(s);
		}
		

	}

}
