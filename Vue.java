package interfacegraphique;
import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.Observer;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class Vue {
	
	//private JLabel texteLabel;
	private JPanel panneau;
	private JPanel panneau2;
	private JButton bouton;
	private JTextField text;
	private JFrame frame;
	List<MonJlabel> jlabels = new ArrayList<MonJlabel>();		

	public Vue(int largeur, int hauteur, int x, int y ) {
		
		
		//this.texteLabel = new JLabel();
		this.text = new JTextField("Ceci est un test");
		this.panneau = new JPanel();
		this.bouton = new JButton();
		this.frame = new JFrame("Test MVC");

		
		this.bouton.setText("Mon bouton");
		
		for(int i = 0; i < 6 ; i++) {
			MonJlabel tmp = new MonJlabel("");
			tmp.setBorder(new LineBorder(Color.black, 2));
			this.jlabels.add(tmp);
			this.frame.add(jlabels.get(i));
		}
		

		this.frame.setLayout(new GridLayout(5,5));
		this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.frame.setTitle("Cadre principal"); 
		this.frame.setSize(largeur, hauteur);
		this.frame.setLocation(x, y);
		//this.frame.add(texteLabel, BorderLayout.PAGE_START);
		this.frame.add(text, BorderLayout.LINE_START);
		this.frame.add(bouton, BorderLayout.CENTER);
		
//		this.panneau.setBackground(Color.yellow);
//		this.panneau.add(texte,BorderLayout.CENTER);
//		
		
		//getContentPane().add(panneau2);
		this.frame.setVisible(true);
		this.frame.pack();


		}
	
	
	public JPanel getPanneau() {
		return panneau;
	}


	public void setPanneau(JPanel panneau) {
		this.panneau = panneau;
	}


	public JPanel getPanneau2() {
		return panneau2;
	}


	public void setPanneau2(JPanel panneau2) {
		this.panneau2 = panneau2;
	}

	public JButton getBouton() {
		return bouton;
	}


	public void setBouton(JButton bouton) {
		this.bouton = bouton;
	}


	public JTextField getTexte() {
		return text;
	}


	public void setTexte(JTextField text) {
		this.text = text;
	}



	public JFrame getFrame() {
		return frame;
	}


	public void setFrame(JFrame frame) {
		this.frame = frame;
	}


	public List<MonJlabel> getJlabels() {
		return jlabels;
	}


	public void setJlabels(List<MonJlabel> jlabels) {
		this.jlabels = jlabels;
	}

	
	
	
	



}
