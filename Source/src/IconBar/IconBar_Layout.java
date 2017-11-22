package IconBar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import Paket.StartLayout;
import Paket.User;
import Sides.Layout_01Login;
import Sides.Layout_03Start;
import Sides.Layout_11Profile;

public class IconBar_Layout implements ActionListener {
	
	JLabel IconBar = new JLabel();
	Icon Icons = new ImageIcon(getClass().getResource(("/_drawable/Iconbar.png")));
	
	private JButton Icon_Back = new JButton();
	private JButton Icon_Logout = new JButton();
	private JButton Icon_Home = new JButton();

	static Timer t = new Timer(3000, new ShowGroupMember());
	
	public IconBar_Layout() {
		
		// Labels
		
		IconBar.setBounds(0,0,2000,30);
		IconBar.setIcon(Icons);
		
		// Buttons
		
		Icon_Back.setOpaque(false);
		Icon_Back.setContentAreaFilled(false);
		Icon_Back.addActionListener(this);
		Icon_Back.setBounds(0+40*0,0,40,30);

		Icon_Logout.setOpaque(false);
		Icon_Logout.setContentAreaFilled(false);
		Icon_Logout.addActionListener(this);
		Icon_Logout.setBounds(0+40*1,0,40,30);

		Icon_Home.setOpaque(false);
		Icon_Home.setContentAreaFilled(false);
		Icon_Home.addActionListener(this);
		Icon_Home.setBounds(0+40*2,0,40,30);
		
		// Layout
		
		StartLayout.IconHeader.add(IconBar);
		StartLayout.IconHeader.add(Icon_Back);
		StartLayout.IconHeader.add(Icon_Logout);
		StartLayout.IconHeader.add(Icon_Home);
	}
	
	public static void Enter_Group() {
		
		
		
	}
	
	static void startReloader() {
		
		t.start();		
	}
	
	public void actionPerformed(ActionEvent e) {

		if ( e.getSource() == Icon_Back ) {
			
			Layout_11Profile.OpenSide();
		}
		
		if ( e.getSource() == Icon_Logout ) {
			
			User.Login = false;
			SideBar.SideBar_Layout.InvisibleAllButtons();
			GroupBar.GroupBar_Layout.CloseSide();
			Layout_01Login.OpenSide();
		}

		if ( e.getSource() == Icon_Home && User.Login == true ) {
			
			Layout_03Start.OpenSide();
		}
		
	}
	
	static class ShowGroupMember implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			
			
		}
	}

}
