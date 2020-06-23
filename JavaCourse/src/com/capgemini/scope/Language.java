package com.capgemini.scope;

import java.util.Scanner;

public class Language {
	public static void main(String[] args) {
		int t, rem = 0,arm=0;

		Scanner s = new Scanner(System.in);
		System.out.println("enter a num");
		int no = s.nextInt();

		t = no;
		while (t > 0) {

			rem =  t % 10;
			arm=arm+(rem*rem*rem);
			t = t / 10;
		}
		if (arm==no) {
			System.out.println("armstrong");
		} else {
			System.out.println("not a armstrong");
		}
	}

}
