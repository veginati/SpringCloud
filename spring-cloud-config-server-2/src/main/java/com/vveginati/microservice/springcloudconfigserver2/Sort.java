package com.vveginati.microservice.springcloudconfigserver2;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

class Test{
	
	private String name;
	private Integer height;
	
	public Integer getHeight() {
		return height;
	}
	
	public String getName() {
		return name;
	}
	
	public Test(){
		
	}
	
	public Test(String name, Integer height) {
		this.name = name;
		this.height = height;
		
	}
}

public class Sort {
	
	public String[] sortByHeight(String[] names, int[] heights) {
		AtomicInteger index = new AtomicInteger();
 		List<Test> data = Arrays.stream(names).map(name -> new Test(name, heights[index.getAndIncrement()])).collect(Collectors.toList());		
 		String[] xinfo = data.stream().sorted((a,b)->Integer.compare(b.getHeight(), a.getHeight())).map(Test::getName).toArray(String[]::new);
		
		return xinfo;
	}

}
