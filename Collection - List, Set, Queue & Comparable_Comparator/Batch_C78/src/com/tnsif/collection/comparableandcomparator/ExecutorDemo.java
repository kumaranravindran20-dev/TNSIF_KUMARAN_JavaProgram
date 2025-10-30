package com.tnsif.collection.comparableandcomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class ExecutorDemo {

	public static void main(String[] args) {
		
		List<Student> studentsList = new ArrayList<Student>();
		
		Student s1 = new Student(11,"Kaviya",90);
		studentsList.add(s1);
		 s1 = new Student(22,"Deepa",60);
		studentsList.add(s1);
		s1 = new Student(15,"Neha",77);
		studentsList.add(s1);
		
		System.out.println("Before Sorting");
		System.out.println(studentsList);
		
		
		Collections.sort(studentsList);
		System.out.println("After Sorting");
		System.out.println(studentsList);
		
		List<Person> personList = new ArrayList<Person>();
		
		Person p1 = new Person("Shalini","Bangalore");
		personList.add(p1);
		p1 = new Person("Tharun","Chennai");
		personList.add(p1);
		p1 = new Person("Ramya","Dehli");
		personList.add(p1);
		
		System.out.println("Before Sorting Name");
		System.out.println(personList);
		
		
		Comparator<Person> pComp = new SortByName();
		Collections.sort(personList,pComp);
		System.out.println("After Sorting by Name");
		System.out.println(personList);
		
		
		pComp=new SortByCity();
		Collections.sort(personList, pComp);
		System.out.println("After Sorting by City");
		System.out.println(personList);
		
	}


}
