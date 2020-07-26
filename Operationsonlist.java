package listcomp;

import java.util.*;
import java.lang.*;

public class Operationsonlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   Scanner sc = new Scanner(System.in);
	   while(true)
	   {
			System.out.println("enter your choice:1.Fetching\n 2.adding\n 3.removing\n 4.printing");
			int ch=sc.nextInt();
			Operations op = new Operations();
			switch(ch) 
			{
				case 1:
					System.out.println("enter the position to fetch:");
					int position=sc.nextInt();
					int res=op.fetchElement(position);
					System.out.println(res);
					break;
				case 2:
					System.out.println("Eneter an element to add into the arraylist: ");
					int l=sc.nextInt();
					op.AddElement(l);
					break;
				case 3:
					System.out.println("eneter the element to be removed: ");
					int m=sc.nextInt();
					op.delete(m);
					break;
				case 4:
					op.display();
					break;
				case 5:
					System.exit(0);
	 		} 
	 	}
		
	}

}
