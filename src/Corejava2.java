import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Corejava2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
			System.out.println(arr[i]);
			break;
			}
			else
			{
			System.out.println(arr[i]+" is not a multiple of 2");
			}
		}
		//Arraylist
		ArrayList<String> a = new ArrayList<String>();
		a.add("Emil");
		a.add("Mariya");
		a.add("Selenium");
		System.out.println(a.get(2));
		//iteration of array list
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
		//enhanced version of array list iteration
		for(String Val:a)
		{
			System.out.println(Val);
		}
		System.out.println(a.contains("Selenium"));
		System.out.println("*******************");
		//converting old array to arrayList
		String[] name1 = {"Emil","mariya","ns"};
		List<String> Arraylist = Arrays.asList(name1);
		System.out.println(Arraylist.contains("ns"));
		
	}

}
