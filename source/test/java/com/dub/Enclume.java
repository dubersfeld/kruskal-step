package com.dub;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.dub.site.minimumSpanningTree.UWEdge;

public class Enclume {

	public static void main(String[] args) {
		
		UWEdge edge1 = new UWEdge(0, 3, 66);
		UWEdge edge2 = new UWEdge(0, 3, 55);
		UWEdge edge3 = new UWEdge(0, 3, 44);
		UWEdge edge4 = new UWEdge(0, 3, 88);
		UWEdge edge5 = new UWEdge(0, 3, 22);
		UWEdge edge6 = new UWEdge(0, 3, 11);
		
		List<UWEdge> list = new ArrayList<>();
		
		list.add(edge1);
		list.add(edge2);
		list.add(edge3);
		list.add(edge4);
		list.add(edge5);
		list.add(edge6);
		
		Collections.sort(list);
		
		for (int i = 0; i < 6; i++) {
			System.out.println(list.get(i));
		}
		

	}

}
