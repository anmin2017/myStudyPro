package com.it.enumeration.study;

enum Signal{
	GREEN, YELLOW, RED;
}

public class TrafficLight {
	Signal color = null;
	public TrafficLight(Signal color){
		this.color = color;
	}
	public void change() {
		switch (color) {
			case RED:
				color = Signal.GREEN;
				break;
			case YELLOW:
				color = Signal.RED;
				break;
			case GREEN:
				color = Signal.YELLOW;
				break;
			}
	}
	
	public static void main(String args[]){
		TrafficLight trafficLight = new TrafficLight(Signal.RED);
		trafficLight.change();
		System.out.println(trafficLight.color);
	}
}
