package com.qaguru.training;

public class TablePrint {
	
	public void DisplayTable(int tableNum) {
		for (int i=1; i<=10; i++){
			System.out.println(tableNum * i);
		}
	}

	public static void main(String[] args) {

		TablePrint tp = new TablePrint();
		System.out.println("Table of 5");
		tp.DisplayTable(5);
		System.out.println("Table of 10");
		tp.DisplayTable(10);

	}

}
