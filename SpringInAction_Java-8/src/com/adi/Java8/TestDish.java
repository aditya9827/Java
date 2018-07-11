package com.adi.Java8;

import java.util.Arrays;
import java.util.List;

public class TestDish {

	public static void main(String[] args) {
		List<Dish> menu = Arrays.asList(
				new Dish("pork", false, 800, Type.MEAT),
				new Dish("beef", false, 700, Type.MEAT),
				new Dish("chicken", false, 400, Type.MEAT),
				
				new Dish("french fries", true, 530, Type.OTHER),
				new Dish("rice", true, 350, Type.OTHER),
				new Dish("season fruit", true, 120, Type.OTHER),
				new Dish("pizza", true, 550, Type.OTHER),
				new Dish("prawns", false, 300, Type.FISH),
				new Dish("salmon", false, 450, Type.FISH) 
				);
		
		
		//System.out.println(menu.stream().count());
		
		//System.out.println(menu.stream().filter(d -> d.getCalories() > 350) .collect(Collectors.toList()));
		
		//System.out.println(menu.stream().filter(d -> d.getCalories() > 500).map((d) -> d.getName()).collect(Collectors.toList()));
		
		//System.out.println(menu.stream().sorted().collect(Collectors.toList())); Thrwoing Comparable error stating Dish is not type of Comparable.
		
		//menu.stream().forEach((d) -> System.out.println(d.getType()));
	}

}
