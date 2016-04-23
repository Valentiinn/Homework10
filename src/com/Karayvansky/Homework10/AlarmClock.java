package com.Karayvansky.Homework10;

import java.util.Calendar;

public class AlarmClock {
	String name;
	private int hours;
	private int minutes;
	private int seconds;

	private int hoursAlarm;
	private int minutesAlarm;
	private int secondsAlarm;

	Calendar calendar = Calendar.getInstance();

	public AlarmClock() {
		name = "Samsung";
		hours = calendar.get(Calendar.HOUR_OF_DAY);
		minutes = calendar.get(Calendar.MINUTE);
		seconds = calendar.get(Calendar.SECOND);
		hoursAlarm = minutesAlarm = secondsAlarm = 0;
		System.out.println("Current time:" + hours + ":" + minutes + ":" + seconds);
	}

	public void setHours(int hours) {
		if (hours > 23 || hours < 0) {
			System.out.println("Yoe enterd the wrong hours for the " + name);
		} else {
			this.hours = hours;
		}
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCurrentTime(int hours, int minutes, int seconds) {
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}

	public void setAlarmTime(int hours, int minutes, int seconds) {
		hoursAlarm = hours;
		minutesAlarm = minutes;
		secondsAlarm = seconds;
	}

	public void fireAlarm() {
		System.out.println("The " + name + " Alarm!!!Wake up!!!!");
	}

	public boolean isAlarmTime() {
		setCurrentTimeNow();
		if (hours == hoursAlarm && minutes == minutesAlarm && seconds == secondsAlarm) {
			return true;
		}
		return false;
	}

	public void printCurrentTime() {
		System.out.println(hours + ":" + minutes + ":" + seconds);
	}

	public void setCurrentTimeNow() {
		calendar = Calendar.getInstance();
		hours = calendar.get(Calendar.HOUR_OF_DAY);
		minutes = calendar.get(Calendar.MINUTE);
		seconds = calendar.get(Calendar.SECOND);
	}

}
