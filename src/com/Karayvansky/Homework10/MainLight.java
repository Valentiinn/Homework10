package com.Karayvansky.Homework10;

import java.util.Scanner;

public class MainLight {

	public static void main(String[] args) {
		Lantern Lamp = new Lantern();
		Scanner sc = new Scanner(System.in);
		Lamp.inputBattary(sc.nextInt());
		System.out.print("Select mode of lantern: ");
		Lamp.turnOnLantern(sc.next());
		sc.close();
	}
}
