package interfacegraphique;

import java.util.Random;

public class Telephone implements IObserver {

	private Random rand = new Random();
	private String model;
	private int id;
	int temperature;
	String temps;
	private StationMeteo station;


	public Telephone(String model) {
		this.id = rand.nextInt(99);
		this.model = model;
	}


	public void update(String typeEvenement) {
		System.out.print("Je suis le tel " + this.id + " model " + this.model + " - " );
		switch(typeEvenement) {
		case "Temps":
			System.out.println("j'affiche un temps " + this.temps);
			break;
		case "Température":
			System.out.println("j'affiche une température de " + this.temperature);
			break;
		}
	}


	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTemperature() {
		return temperature;
	}
	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}
	public String getTemps() {
		return temps;
	}
	public void setTemps(String temps) {
		this.temps = temps;
	}


	public StationMeteo getStation() {
		return station;
	}


	public void setStation(StationMeteo station) {
		this.station = station;
	}
	
	



}
