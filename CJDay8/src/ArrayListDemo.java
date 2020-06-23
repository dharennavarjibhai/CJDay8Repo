import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		//create the object of a collection
		ArrayList Friendslist=new ArrayList();
		Friendslist.add("Anu");
		Friendslist.add("Varun");
		Friendslist.add("Shruti");
		Friendslist.add("Lucky");
		System.out.println(Friendslist);
		
		//Using FOr Each LOOP
		for(Object obj:Friendslist)
		{
		System.out.println(obj);

	}

		/*//using iterator
		Iterator iterator =Friendslist.iterator();
		while(iterator.hasNext())
		{
		String str=(String)iterator.next();
		System.out.println(str);*/
	}
		
}
