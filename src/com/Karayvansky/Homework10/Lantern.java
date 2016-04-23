package com.Karayvansky.Homework10;

public class Lantern {
	private int battary;

	public Lantern() {
		battary = 0;
		System.out.print("Input number of battarays: ");
	}

	public void inputBattary(int battary) {
		if (battary > 0 && battary <= 3) {
			this.battary = battary;
			System.out.println("You insert " + battary + " battery");
		} else {
			System.out.println("You can insert 3 batteries");
		}

	}

	public void redLight() {
		if (battary > 2 || battary <= 3) {
			System.out.print("The red light is on.");
		} else {
			System.out.print("Insert the 2 batteries batteries and you will be able to enable the lamp to red");
		}
	}

	public void whiteLight() {
		if (battary > 1 || battary <= 3) {
			System.out.print("The white light is on.");
		} else {
			System.out.print("Insert the 1 batteries batteries and you will be able to enable the lamp to white");
		}
	}

	public void flashingLight() {
		if (battary == 3) {
			System.out.print("The flicker mode is on");
		} else {
			System.out.print("Insert the 3 batteries and you will be able to enable the lamp to flicker");
		}

	}

	public void turnOnLantern(String mode) {
		switch (mode) {
		case "red":
			redLight();
			break;
		case "white":
			whiteLight();
		case "flicker":
			flashingLight();
			break;
		default:
			System.out.print("You have entered an incorrect mode");
		}

	}
}
