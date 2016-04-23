package com.Karayvansky.Homework10;

public class MainClock {

	public static void main(String[] args) {
		int cycle = 1;
		AlarmClock alarmClock = new AlarmClock();
		alarmClock.setCurrentTimeNow();
		alarmClock.setAlarmTime(23, 54, 00);

		while (cycle == 1) {

			if (alarmClock.isAlarmTime()) {
				alarmClock.fireAlarm();
				alarmClock.printCurrentTime();
				break;
			}
		}
	}
}