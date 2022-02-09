package interfacegraphique;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class StationMeteo implements IObservable {

	private Map<String, List<IObserver>> observers = new HashMap<>();
	private String nom;
	private int temperature;
	private String temps;

	
	public StationMeteo(String[] typeEvenements, String nom) {
		this.nom = nom;
		for(int i = 0; i < typeEvenements.length; i++) {
			observers.put(typeEvenements[i], new ArrayList<IObserver>());
		}

	}
	
	
	public void add(String typeEvenement, IObserver observer) {
		List<IObserver> abonnes = observers.get(typeEvenement);
		Telephone o = (Telephone)observer;
		
		o.setStation(this);
		System.out.println("j'ajoute " + (o.getModel() + " à l'evenemnt " + typeEvenement + " et a la station " + o.getStation().getNom()));
		abonnes.add(o);
		this.observers.put(typeEvenement, abonnes);

	}

	public void remove(String typeEvenement, IObserver observer) {
		List<IObserver> abonnes = observers.get(typeEvenement);
		abonnes.remove(observer);
		observers.replace(typeEvenement, abonnes);
	}

	public void notifier(String typeEvenement) {

		if(observers.get(typeEvenement) != null) {
			List<IObserver> abonnes = observers.get(typeEvenement);	
			for(int i = 0; i < abonnes.size(); i++) {

				switch(typeEvenement) {
				
				case "Temps":
					((Telephone) abonnes.get(i)).setTemps(this.temps);
					abonnes.get(i).update(typeEvenement);
					break;
				case "Température":
					((Telephone) abonnes.get(i)).setTemperature(this.temperature);
					abonnes.get(i).update(typeEvenement);
					break;
				}

			}
		}
	}



	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
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



}
