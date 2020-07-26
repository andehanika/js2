package listcomp;
import java.util.ArrayList;
import java.util.Iterator;
public class Operations 
{
	static ArrayList arr = new ArrayList(10);
	int fetchElement(int index)
	{
		
		return (Integer) arr.get(index);
		
	}
	void AddElement(int ele)
	{
		arr.add(ele);
		System.out.println("Element is successfully added");
		Iterator i = arr.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}

	}
	void delete(int ele)
	{
		arr.remove(ele);
	}
	void display()
	{
		Iterator i = arr.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
 	}
}
