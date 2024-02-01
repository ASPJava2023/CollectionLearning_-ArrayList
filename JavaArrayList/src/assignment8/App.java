package assignment8;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * ArrayList Modification:

Given an ArrayList of integers, 
write a program that doubles the value of each element in the list.
*/
public class App {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		System.out.println(al);
		for(int i=0;i<al.size();i++) {
		al.set(i,(al.get(i)*2));
		}
		System.out.println(al);
	}
}