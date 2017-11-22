package Sides;

import java.awt.Font;

import javax.swing.*;

import Paket.StartLayout;
import Paket.User;

public class Layout_03Start {
	
	private JLabel TextLine01 = new JLabel();
	private JLabel TextLine02 = new JLabel();
	private JLabel TextLine03 = new JLabel();
	private JLabel TextLine04 = new JLabel();
	private JLabel TextLine05 = new JLabel();

	private JLabel TextLine06 = new JLabel();
	private JLabel TextLine07 = new JLabel();
	private JLabel TextLine08 = new JLabel();

	public Layout_03Start() {
		
		// Labels

		Font Font_label = new Font("Arial", Font.BOLD, 20);
		
		TextLine01.setText("Diese Software ist Teil eines Projektes aus Wirtschaftsinformatikern im 5. Semester.");
		TextLine01.setBounds(30,90+50*0,950,50);
		TextLine01.setFont(Font_label);

		TextLine02.setText("Jeder der Mitglieder hatte seine eigenen Aufgaben. Darunter gehörten:");
		TextLine02.setBounds(30,90+50*1,950,50);
		TextLine02.setFont(Font_label);

		TextLine03.setText("-> Das Sammeln von Ideen und dem Erstellen der ersten Skizzen und Grafiken,");
		TextLine03.setBounds(30,110+50*2,950,50);
		TextLine03.setFont(Font_label);

		TextLine04.setText("-> die Dokumentation der zu entwickelnden Software und");
		TextLine04.setBounds(30,110+50*3,950,50);
		TextLine04.setFont(Font_label);

		TextLine05.setText("-> die Programmierung der Software.");
		TextLine05.setBounds(30,110+50*4,950,50);
		TextLine05.setFont(Font_label);

		Font Font_label_extra = new Font("Arial", Font.PLAIN, 21);

		TextLine06.setText("In der Menüleiste links können nun die Funktionen des Progranmms ausgeführt");
		TextLine06.setBounds(30,150+50*5,1200,50);
		TextLine06.setFont(Font_label_extra);

		TextLine07.setText("und gestartet werden.");
		TextLine07.setBounds(30,150+50*6,1200,50);
		TextLine07.setFont(Font_label_extra);

		TextLine08.setText("Viele Grüße wünschen Adam, Max, Christina und Marvin.");
		TextLine08.setBounds(30,150+50*7,950,50);
		TextLine08.setFont(Font_label_extra);
		
		// Layout 
		
		StartLayout.L_Start.add(TextLine01);
		StartLayout.L_Start.add(TextLine02);
		StartLayout.L_Start.add(TextLine03);
		StartLayout.L_Start.add(TextLine04);
		StartLayout.L_Start.add(TextLine05);
		StartLayout.L_Start.add(TextLine06);
		StartLayout.L_Start.add(TextLine07);
		StartLayout.L_Start.add(TextLine08);
		
	}
	
	public static void OpenSide() {
		
		User.Login = true;
		SideBar.SideBar_Layout.VisibleButtons();
		
		StartLayout.CloseAllSides();

		Paket.User.Side_ID = 1003;
		User.SetNewSide(Paket.User.Side_ID);

		StartLayout.L_Start.add(StartLayout.Headline);
		StartLayout.Headline.setText("Willkommen " + Paket.User.User_Data[3]);
		
		StartLayout.L_Start.setVisible(true);
		StartLayout.ReloadFrame();
	}

}
