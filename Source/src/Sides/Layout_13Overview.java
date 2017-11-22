package Sides;

import Paket.StartLayout;
import Paket.User;
import javax.swing.*;

public class Layout_13Overview {

	private JLabel Overview_Clock = new JLabel();
	private JLabel Overview_Hall = new JLabel();
	private JLabel Overview_Place = new JLabel();
	private JLabel Overview_Town = new JLabel();
	private JLabel Overview_GameKind = new JLabel();

	private JLabel Overview_Clock_02 = new JLabel();
	private JLabel Overview_Hall_02 = new JLabel();
	private JLabel Overview_Place_02 = new JLabel();
	private JLabel Overview_Town_02 = new JLabel();
	private JLabel Overview_GameKind_02 = new JLabel();
	
	public Layout_13Overview() {
		
		// Labels
		
		
	}

	public static void OpenSide() {
		
		StartLayout.CloseAllSides();

		Paket.User.Side_ID = 1006;
		User.SetNewSide(Paket.User.Side_ID);

		StartLayout.L_Overview.add(StartLayout.Headline);
		StartLayout.Headline.setText("Übersicht");
		
		StartLayout.L_Overview.setVisible(true);
		StartLayout.ReloadFrame();
	}

}