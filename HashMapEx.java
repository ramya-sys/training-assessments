package assignment4;

import java.util.HashMap;
import java.util.Map.Entry;


public class HashMapEx{

	public static void main(String[] args)
	{
	HashMap<Integer,String>hm=new HashMap<Integer,String>();
	hm.put(33,"ram");
	hm.put(44,"nik");
	hm.put(54,"min");
	hm.put(65,"jak");
	System.out.println("Initial list of elements");
	for(Entry<Integer, String> m:hm.entrySet())
	{
		System.out.println(m.getKey()+" "+m.getValue());
	}
	
	System.out.println("Update list of elements");
	hm.replace(44,"raj");
	for(Entry<Integer, String> m:hm.entrySet())
	{
		System.out.println(m.getKey()+" "+m.getValue());
	}
	System.out.println("Update list of elements:");
	
		hm.replace(44,"raj","mik");
		for(Entry<Integer, String> m:hm.entrySet())

		{
			
		System.out.println(m.getKey()+" "+m.getValue());
		}
	
		System.out.println("Update list of elements:");
		hm.replaceAll((k,v)->"vim");
		for(Entry<Integer, String> m:hm.entrySet())
	
	{
			System.out.println(m.getKey()+" "+m.getValue());
}
	
	}
}
