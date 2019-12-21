//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _04_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
		
			Random randomMaker = new Random();
		
		int randomNumber = randomMaker.nextInt(5);
		
		if(randomNumber == 1) {
			System.out.println("Thank's for the cheking my code!! :)");
			
		}else if(randomNumber == 2) {
		 System.out.println("You are awsome!!");
		
		
	}else if (randomNumber == 3) {
		System.out.println("Good job!!");
	}else if(randomNumber == 4) {
		System.out.println("Don't worry be happy!! :)");
	}else {
		System.out.println("Have a nice day.");
	}
		}}}
