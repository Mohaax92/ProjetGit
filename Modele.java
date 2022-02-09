package interfacegraphique;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JLabel;

public class Modele extends Observable {

	private String texteJlabel;

	
	public Modele() {
		super();
	}
	
	
	@Override
	public synchronized void addObserver(Observer label) {
		super.addObserver(label);
	}

	
	public void removeObserver(Observer label) {
		super.deleteObserver(label);
	}

 
	public void setTexteJLabel(String texte) {
		this.texteJlabel = texte;
		this.setChanged();
		this.notifyObservers(texte);
	}
    
    
    
	public String gettexteJlabel() {
		return texteJlabel;
	}








}
