package Sides;

import Paket.StartLayout;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import Paket.User;

public class Layout_12Games implements ActionListener {
	
	private JLabel Games_Teamsize = new JLabel();
	private JLabel Games_Clock = new JLabel();
	private JLabel Games_Distance = new JLabel();

	private JButton Games_Teamsize01_But = new JButton();
	private JButton Games_Teamsize02_But = new JButton();
	private JButton Games_Teamsize03_But = new JButton();

	private JTextField Games_Clock_Tf = new JTextField();
	private JTextField Games_Distance_Tf = new JTextField();

	private JButton Games_Search = new JButton();
	
	public Layout_12Games() {
		
		// Labels
	
		Font Font_label = new Font("Arial", Font.BOLD, 20);
		
		Games_Teamsize.setText("Mannschaftsgröße:");
		Games_Teamsize.setBounds(30,90,350,50);
		Games_Teamsize.setFont(Font_label);

		Games_Clock.setText("Uhrzeit:");
		Games_Clock.setBounds(30,140,350,50);
		Games_Clock.setFont(Font_label);

		Games_Distance.setText("Entfernung (km):");
		Games_Distance.setBounds(30,190,350,50);
		Games_Distance.setFont(Font_label);
		
		// TextFields
		
		Font Font_textfield = new Font("Arial", Font.BOLD, 18);

		Games_Clock_Tf.setBounds(240,145,280,40);
		Games_Clock_Tf.setFont(Font_textfield);

		Games_Distance_Tf.setBounds(240,195,280,40);
		Games_Distance_Tf.setFont(Font_textfield);

		// Buttons
		
		Font Font_button = new Font("Arial", Font.BOLD, 18);

		Games_Teamsize01_But.setText("3 vs 3");
		Games_Teamsize01_But.setBackground(new Color(167,210,168));
		Games_Teamsize01_But.setBounds(240,95,110,40);
		Games_Teamsize01_But.setFont(Font_button);

		Games_Teamsize02_But.setText("4 vs 4");
		Games_Teamsize02_But.setBackground(new Color(167,210,168));
		Games_Teamsize02_But.setBounds(380,95,110,40);
		Games_Teamsize02_But.setFont(Font_button);

		Games_Teamsize03_But.setText("5 vs. 5");
		Games_Teamsize03_But.setBackground(new Color(167,210,168));
		Games_Teamsize03_But.setBounds(520,95,110,40);
		Games_Teamsize03_But.setFont(Font_button);

		Games_Search.setText("Suchen");
		Games_Search.setBackground(new Color(167,210,168));
		Games_Search.setBounds(30,255,110,40);
		Games_Search.setFont(Font_button);
		
		// Layout

		StartLayout.L_Games.add(Games_Teamsize);
		StartLayout.L_Games.add(Games_Clock);
		StartLayout.L_Games.add(Games_Distance);

		StartLayout.L_Games.add(Games_Teamsize01_But);
		StartLayout.L_Games.add(Games_Teamsize02_But);
		StartLayout.L_Games.add(Games_Teamsize03_But);
		StartLayout.L_Games.add(Games_Clock_Tf);
		StartLayout.L_Games.add(Games_Distance_Tf);

		StartLayout.L_Games.add(Games_Search);
	
	}

	public static void OpenSide() {
		
		StartLayout.CloseAllSides();

		Paket.User.Side_ID = 1005;
		User.SetNewSide(Paket.User.Side_ID);

		StartLayout.L_Games.add(StartLayout.Headline);
		StartLayout.Headline.setText("Spiele");
		
		StartLayout.L_Games.setVisible(true);
		StartLayout.ReloadFrame();
	}

	public void actionPerformed(ActionEvent e) {
		
			
	}

}
