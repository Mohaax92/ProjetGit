package interfacegraphique;

import java.util.Observable;
import java.util.Observer;
import javax.swing.JLabel;

public class MonJlabel extends JLabel implements Observer  {
	


	public MonJlabel(String text) {
		super(text);
	}

	@Override
	public void update(Observable o, Object texte) {
		this.setText((String) texte);
	}
	
	
}
