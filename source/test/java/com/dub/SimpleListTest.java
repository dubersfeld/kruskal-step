package com.dub;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

import com.dub.site.minimumSpanningTree.UWEdge;
import com.dub.util.SimpleList;
import com.dub.util.SimpleListIterator;

public class SimpleListTest {

	public static void main(String[] args) {
		
		System.out.println("main begin");
		
		SimpleList<String> list = new SimpleList<>();
		
		System.out.println("empty " + list.isEmpty());
		
		System.out.println(list.add("sator"));
		
		System.out.println("empty " + list.isEmpty());
		
		System.out.println(list.add("arepo"));
		System.out.println(list.add("tenet"));
		
		Object[] array = list.toArray();
		System.out.println("grunge " + array.length);
		
		for (int i = 0; i < array.length; i++) {
			System.out.print((String)array[i] + " ");
		}
		System.out.println();
	
		System.out.println(list.contains("sator"));
		System.out.println(list.contains("opera"));
		
		
		list.add("opera");
		list.add("rotas");
		
		
		array = list.toArray();
		//System.out.println("grunge " + array.length);
		
		for (int i = 0; i < array.length; i++) {
			System.out.print((String)array[i] + " ");
		}
		System.out.println();
		
		System.out.println("sator " + list.indexOf("sator"));
		System.out.println("tenet " + list.indexOf("tenet"));
		System.out.println("rotas " + list.indexOf("rotas"));
		System.out.println("grunge " + list.indexOf("grunge"));
		
		System.out.println(list.get(0));
		System.out.println(list.get(2));
		System.out.println(list.get(4));
		System.out.println(list.get(5));
		
		list.remove("sator");
		array = list.toArray();
		for (int i = 0; i < array.length; i++) {
			System.out.print((String)array[i] + " ");
		}
		System.out.println();
		
		list.remove("rotas");
		array = list.toArray();
		for (int i = 0; i < array.length; i++) {
			System.out.print((String)array[i] + " ");
		}
		System.out.println();
		
		list.remove("tenet");
		array = list.toArray();
		for (int i = 0; i < array.length; i++) {
			System.out.print((String)array[i] + " ");
		}
		System.out.println();
		
		list.remove("opera");
		array = list.toArray();
		for (int i = 0; i < array.length; i++) {
			System.out.print((String)array[i] + " ");
		}
		System.out.println();
		
		list.remove("arepo");
		array = list.toArray();
		System.out.println("null " + (array == null));
	
		System.out.println();
		System.out.println("empty " + list.isEmpty());
		
	
		
		list.add("AA");
		list.add("BB");
		list.add("CC");
		array = list.toArray();
		for (int i = 0; i < array.length; i++) {
			System.out.print((String)array[i] + " ");
		}
		System.out.println();
		
		ListIterator<String> it = new SimpleListIterator<>(list);
		System.out.println("hasNext " + it.hasNext());
		System.out.println("next " + it.next());
		System.out.println("next " + it.next());
		System.out.println("hasNext " + it.hasNext());
		System.out.println("next " + it.next());
		System.out.println("hasNext " + it.hasNext());
		
		it = new SimpleListIterator<>(list);
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("hasPrevious " + it.hasPrevious());
		System.out.println("previous " + it.previous());
		System.out.println("hasPrevious " + it.hasPrevious());
		System.out.println("previous " + it.previous());
		System.out.println("hasPrevious " + it.hasPrevious());
		//System.out.println("previous " + it.previous());
		
		list.clear();
		//array = list.toArray();
		
		System.out.println("empty " + list.isEmpty());
		
		System.out.println();
		
		System.out.println("main completed");
	}// main
		

}
