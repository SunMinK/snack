package com.kh.practice.snack.view;

import java.util.Scanner;

import com.kh.practice.snack.controller.SnackController;

public class SnackMenu {
	
	SnackController scr = new SnackController();
	
	
	public void menu() {
		System.out.println("스낵류를 입력하세요.");
		
	
	Scanner sc = new Scanner(System.in);
	System.out.print("종류 : ");
	String kind = sc.next();
	System.out.print("이름 : ");
	String name = sc.next();
	System.out.print("맛 : ");
	String flavor = sc.next();
	
	System.out.print("개수 : ");
	int numOf = sc.nextInt();
	System.out.print("가격 : ");
	int price = sc.nextInt();
	
	System.out.println(scr.saveData(kind, name, flavor, numOf, price));
	
	String input = sc.next();
	// if else문으로 y일 때 1개 15000원 출력 n일때 아무값도 출력 안됨
	if(input.equals("y")) { 
		System.out.println(scr.comfirmData());
		
		
	
	
	//} else {
		
	}
	}
}

