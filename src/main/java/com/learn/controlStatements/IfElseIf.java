package com.learn.controlStatements;

public class IfElseIf {

	public static void main(String[] args) {
		int marks = 55;
			if(marks < 40){
				System.out.println("failed");
			} else if(marks >=40 && marks< 60){
				System.out.println("2nd class");
			} else if(marks>=60 && marks <80){
				System.out.println("1st class");
			}else{
			System.out.println("distinction");
			}
		}
	}
