package com.learn.controlStatements;

public class NestedIfElseExample {

	public static void main(String[] args) {
		int age = 64;
			if(age>19){
				if(age>65){
				System.out.println("you are a senior citizen");
				}
				else{
				System.out.println("you are an adult");
				}
			}
			else{
			System.out.println("you're not an adult");
		}
	}
}
