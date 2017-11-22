package Sides;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

import Paket.StartLayout;
import Paket.User;

public class Layout_01Login implements ActionListener, KeyListener {
		
	private static JButton Login_IP_Connect = new JButton();
	private static JLabel Login_IP = new JLabel();
	private static JTextField Login_IP_Tf = new JTextField();
	
	private static JLabel Login_Name = new JLabel();
	private static JLabel Login_Keyword = new JLabel();
	
	private static JTextField Login_Name_Tf = new JTextField();
	private static JPasswordField Login_Keyword_Tf = new JPasswordField();

	private static JButton Login_Login = new JButton();
	
	public Layout_01Login() {
		
		// Labels
		
		Font Font_label = new Font("Arial", Font.BOLD, 20);
		
		Login_Name.setText("Nachname: ");
		Login_Name.setBounds(30,90,150,50);
		Login_Name.setFont(Font_label);
		Login_Name.setVisible(false);
		
		Login_Keyword.setText("Passwort: ");
		Login_Keyword.setBounds(30,140,150,50);
		Login_Keyword.setFont(Font_label);
		Login_Keyword.setVisible(false);
		
		Login_IP.setText("IP - Adresse: ");
		Login_IP.setBounds(30,90,150,50);
		Login_IP.setFont(Font_label);
		
		// TextField
		
		Font Font_textfield = new Font("Arial", Font.BOLD, 18);

		Login_Name_Tf.setText("");
		Login_Name_Tf.addKeyListener(this);
		Login_Name_Tf.setBounds(150,95,300,40);
		Login_Name_Tf.setFont(Font_textfield);
		Login_Name_Tf.setVisible(false);
		
		Login_Keyword_Tf.setText("");
		Login_Keyword_Tf.addKeyListener(this);
		Login_Keyword_Tf.setBounds(150,145,300,40);
		Login_Keyword_Tf.setFont(Font_textfield);
		Login_Keyword_Tf.setVisible(false);
		
		Login_IP_Tf.setText("144.76.167.70"); // 10.141.66.73 // 192.168.2.120
		Login_IP_Tf.addKeyListener(this);
		Login_IP_Tf.setBounds(200,95,250,40);
		Login_IP_Tf.setFont(Font_textfield);
		
		// Buttons
		
		Font Font_button = new Font("Arial", Font.BOLD, 18);

		Login_Login.setText("Einloggen");
		Login_Login.addActionListener(this);
		Login_Login.setBackground(new Color(167,210,168));
		Login_Login.setBounds(30,230,180,40);
		Login_Login.setFont(Font_button);
		Login_Login.setVisible(false);
		
		Login_IP_Connect.setText("Verbinden");
		Login_IP_Connect.addActionListener(this);
		Login_IP_Connect.setBackground(new Color(167,210,168));
		Login_IP_Connect.setBounds(267,155,180,40);
		Login_IP_Connect.setFont(Font_button);

		// Layout		

		StartLayout.L_Login.add(Login_IP);
		StartLayout.L_Login.add(Login_IP_Tf);
		StartLayout.L_Login.add(Login_IP_Connect);

		StartLayout.L_Login.add(Login_Name);
		StartLayout.L_Login.add(Login_Keyword);
		StartLayout.L_Login.add(Login_Name_Tf);
		StartLayout.L_Login.add(Login_Keyword_Tf);
		
		StartLayout.L_Login.add(Login_Login);
		
	}
	
	static void ResetAll() {

		Login_Name_Tf.setBackground(new Color(255,255,255));
		Login_Keyword_Tf.setBackground(new Color(255,255,255));

		Login_Name.setVisible(false);
		Login_Keyword.setVisible(false);
		Login_Name_Tf.setVisible(false);
		Login_Keyword_Tf.setVisible(false);
		Login_Login.setVisible(false);

		Login_IP.setVisible(true);
		Login_IP_Tf.setVisible(true);
		Login_IP_Connect.setVisible(true);
	}
	
	public static void OpenSide() {
		
		StartLayout.CloseAllSides();

		Paket.User.Side_ID = 1001;
		User.SetNewSide(Paket.User.Side_ID);
		
		StartLayout.L_Login.add(StartLayout.Headline);
		StartLayout.Headline.setText("Mit Server verbinden");
		
		StartLayout.L_Login.setVisible(true);
		StartLayout.ReloadFrame();
		ResetAll();
	}
	
	void Connecting() {

		try {
		
			StartLayout.ConnectingServer(Login_IP_Tf.getText());
						
			StartLayout.Headline.setText("Login");
		
			Login_Name.setVisible(true);
			Login_Keyword.setVisible(true);
			Login_Name_Tf.setVisible(true);
			Login_Keyword_Tf.setVisible(true);
			Login_Login.setVisible(true);

			Login_IP.setVisible(false);
			Login_IP_Tf.setVisible(false);
			Login_IP_Connect.setVisible(false);	
			
			SideBar.SideBar_Layout.InvisibleButtons();
	
		} catch (Exception e) { System.out.println("Error by try first FTP Connection"); }
	}
	
	@SuppressWarnings({ "deprecation", "resource" })
	static void CheckLoginData() {
			
		Login_Name_Tf.setBackground(new Color(255,255,255));
		Login_Keyword_Tf.setBackground(new Color(255,255,255));

		StartLayout.DownloadFile("Users/" + Login_Name_Tf.getText() + ".usr", "Users/" + Login_Name_Tf.getText() + ".usr");
		
		boolean Check = false;
		
		User.ReadUser(Login_Name_Tf.getText());
				
		if ( Login_Keyword_Tf.getText().equals(User.User_Data[0]) ) { Check = true; }
		
		if ( Check == true ) {
		
			Layout_03Start.OpenSide();

		} else {

			Login_Name_Tf.setBackground(new Color(200,0,10));
			Login_Keyword_Tf.setBackground(new Color(200,0,10));
		}
	}

	public void actionPerformed(ActionEvent e) {

		if ( e.getSource() == Login_Login ) {
			
			CheckLoginData();
		}
		
		if ( e.getSource() == Login_IP_Connect ) {
			
			if ( !Login_IP_Tf.getText().equals("") ) {
				
				Connecting();
			}
		}
	}

	public void keyPressed(KeyEvent e) {
	
		if ( e.getSource() == Login_Keyword_Tf && e.getKeyCode() == KeyEvent.VK_ENTER ) {
			
			CheckLoginData();
		}
		
	}

	public void keyReleased(KeyEvent e) {}

	public void keyTyped(KeyEvent e) {}

}
