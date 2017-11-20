package com.learn.controlStatements;

public class LabeledContinue {

	public static void main(String[] args) {
		int intArray[][] = {{1 , 2 , 4 },{2 , 3 , 5 },{4,6,2}};
		found:
		for(int i=0; i <=2 ; i ++){
			for(int j=0; j<=2; j++){
			if(intArray[i][j] == 3)
				continue found;
			System.out.println( intArray[i][j]);
			}
		}
	}
}



