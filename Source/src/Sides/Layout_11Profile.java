package Sides;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;

import javax.swing.*;

import Extern.SafeUser;
import Paket.StartLayout;
import Paket.User;

public class Layout_11Profile implements ActionListener {
		
	// SpielerID hinzufügen
	
	private static JLabel Profile_Picture = new JLabel();
	private static Icon Profile_Picture_img = new ImageIcon("");
	private static JButton  Profile_Picture_but = new JButton();
	public static String Pic_url = "";

	// Question
	private JLabel Profile_PersonID = new JLabel();
	
	private JLabel Profile_Firstname = new JLabel();
	private JLabel Profile_Secondname = new JLabel();
	
	private JLabel Profile_Place = new JLabel();
	private JLabel Profile_Town = new JLabel();
	
	private JLabel Profile_FirstLogin = new JLabel();
	private JLabel Profile_NumberofGames = new JLabel();

	// Answere
	private static JLabel Profile_PersonID_2 = new JLabel();

	private static JLabel Profile_Firstname_2 = new JLabel();
	private static JLabel Profile_Secondname_2 = new JLabel();
	
	private static JLabel Profile_Place_2 = new JLabel();
	private static JLabel Profile_Town_2 = new JLabel();
	
	private static JLabel Profile_FirstLogin_2 = new JLabel();
	private static JLabel Profile_NumberofGames_2 = new JLabel();
	
	// Edit
	
	private static JTextField Profile_Firstname_Tf = new JTextField();
	private static JTextField Profile_Secondname_Tf = new JTextField();

	private static JTextField Profile_Place_Tf = new JTextField();
	private static JTextField Profile_Town_Tf = new JTextField();

	// Lines
	private JLabel Profile_Line01 = new JLabel();
	private JLabel Profile_Line02 = new JLabel();
	private JLabel Profile_Line03 = new JLabel();
	
	// Buttons
	private static JButton Profile_Edit = new JButton();
	private static JButton Profile_Save = new JButton();
	private static JButton Profile_Close = new JButton();
	private static JButton Profile_Delete = new JButton();
	
	JFileChooser LoadPic = new JFileChooser();
	
	public Layout_11Profile() {
		
		// Labels
		
		Font Font_label = new Font("Arial", Font.BOLD, 20);
		
		Profile_PersonID.setText("Identifikationsnummer:");
		Profile_PersonID.setBounds(30,95,300,50);
		Profile_PersonID.setFont(Font_label);
		
		Profile_PersonID_2.setText("BeispielID");
		Profile_PersonID_2.setBounds(30+240,95,300,50);
		Profile_PersonID_2.setFont(Font_label);

		Profile_Firstname.setText("Name:");
		Profile_Firstname.setBounds(30,140,300,50);
		Profile_Firstname.setFont(Font_label);
		
		Profile_Firstname_2.setText("BeispielName");
		Profile_Firstname_2.setBounds(30+240,150,300,50);
		Profile_Firstname_2.setFont(Font_label);
		
		Profile_Secondname.setText("Nachname:");
		Profile_Secondname.setBounds(30,190,300,50);
		Profile_Secondname.setFont(Font_label);

		Profile_Secondname_2.setText("BeispielNachname");
		Profile_Secondname_2.setBounds(30+240,200,300,50);
		Profile_Secondname_2.setFont(Font_label);
		
		Profile_Line01.setText("____________________________________");
		Profile_Line01.setBounds(25,235,2000,30);
		Profile_Line01.setFont(Font_label);

		Profile_Place.setText("Postleitzahl:");
		Profile_Place.setBounds(30,270,300,50);
		Profile_Place.setFont(Font_label);

		Profile_Place_2.setText("Beispielnummer");
		Profile_Place_2.setBounds(30+240,270,300,50);
		Profile_Place_2.setFont(Font_label);

		Profile_Town.setText("Stadt:");
		Profile_Town.setBounds(30,320,300,50);
		Profile_Town.setFont(Font_label);

		Profile_Town_2.setText("Beispielstadt");
		Profile_Town_2.setBounds(30+240,320,300,50);
		Profile_Town_2.setFont(Font_label);

		Profile_Line02.setText("___________________________________________________________________");
		Profile_Line02.setBounds(25,355,2000,30);
		Profile_Line02.setFont(Font_label);
		
		Profile_FirstLogin.setText("Registriert seit:");
		Profile_FirstLogin.setBounds(30,390,300,50);
		Profile_FirstLogin.setFont(Font_label);

		Profile_FirstLogin_2.setText("Beispieldatum");
		Profile_FirstLogin_2.setBounds(30+240,390,300,50);
		Profile_FirstLogin_2.setFont(Font_label);

		Profile_NumberofGames.setText("Teilgenommene Spiele:");
		Profile_NumberofGames.setBounds(30,440,300,50);
		Profile_NumberofGames.setFont(Font_label);

		Profile_NumberofGames_2.setText("Beispielzahl");
		Profile_NumberofGames_2.setBounds(30+240,440,300,50);
		Profile_NumberofGames_2.setFont(Font_label);

		Profile_Line03.setText("___________________________________________________________________");
		Profile_Line03.setBounds(25,475,2000,30);
		Profile_Line03.setFont(Font_label);

		// Image
		
		Profile_Picture.setBounds(450, 30, 265, 330);
		Profile_Picture.setIcon(Profile_Picture_img);
		Profile_Picture.setOpaque(true);
		Profile_Picture.setBackground(new Color(255,255,255));

		// TextField
		
		Font Font_textfield = new Font("Arial", Font.BOLD, 20);
		
		Profile_Firstname_Tf.setBounds(265,150,150,40);
		Profile_Firstname_Tf.setFont(Font_textfield);

		Profile_Secondname_Tf.setBounds(265,200,150,40);
		Profile_Secondname_Tf.setFont(Font_textfield);

		Profile_Place_Tf.setBounds(265,270,150,40);
		Profile_Place_Tf.setFont(Font_textfield);

		Profile_Town_Tf.setBounds(265,320,150,40);
		Profile_Town_Tf.setFont(Font_textfield);

		// Chooser
		
		LoadPic.addActionListener(this);
		
		// Buttons
		
		Font Font_button = new Font("Arial", Font.BOLD, 18);

		Profile_Edit.setText("Bearbeiten");
		Profile_Edit.addActionListener(this);
		Profile_Edit.setBackground(new Color(167,210,168));
		Profile_Edit.setBounds(30,525,180,40);
		Profile_Edit.setFont(Font_button);		

		Profile_Save.setText("Speichern");
		Profile_Save.addActionListener(this);
		Profile_Save.setBackground(new Color(167,210,168));
		Profile_Save.setBounds(30,525,180,40);
		Profile_Save.setFont(Font_button);		

		Profile_Close.setText("Abbrechen");
		Profile_Close.addActionListener(this);
		Profile_Close.setBackground(new Color(167,210,168));
		Profile_Close.setBounds(237,525,180,40);
		Profile_Close.setFont(Font_button);		

		Profile_Delete.setText("Löschen");
		Profile_Delete.addActionListener(this);
		Profile_Delete.setBackground(new Color(167,210,168));
		Profile_Delete.setBounds(580,525,180,40);
		Profile_Delete.setFont(Font_button);		
		
		Profile_Picture_but.setBounds(0, 0, 304, 400);
		Profile_Picture_but.setOpaque(false);
		Profile_Picture_but.setContentAreaFilled(false);
		Profile_Picture_but.addActionListener(this);
		
		// Layout 
		
		StartLayout.L_Profile.add(Profile_Picture);
		Profile_Picture.add(Profile_Picture_but);

		StartLayout.L_Profile.add(Profile_PersonID);
		StartLayout.L_Profile.add(Profile_PersonID_2);
		StartLayout.L_Profile.add(Profile_Firstname);
		StartLayout.L_Profile.add(Profile_Firstname_2);
		StartLayout.L_Profile.add(Profile_Secondname);
		StartLayout.L_Profile.add(Profile_Secondname_2);

		StartLayout.L_Profile.add(Profile_Line01);
		
		StartLayout.L_Profile.add(Profile_Place);
		StartLayout.L_Profile.add(Profile_Place_2);
		StartLayout.L_Profile.add(Profile_Town);
		StartLayout.L_Profile.add(Profile_Town_2);

		StartLayout.L_Profile.add(Profile_Line02);

		StartLayout.L_Profile.add(Profile_FirstLogin);
		StartLayout.L_Profile.add(Profile_FirstLogin_2);
		StartLayout.L_Profile.add(Profile_NumberofGames);
		StartLayout.L_Profile.add(Profile_NumberofGames_2);

		StartLayout.L_Profile.add(Profile_Line03);
		
		StartLayout.L_Profile.add(Profile_Firstname_Tf);
		StartLayout.L_Profile.add(Profile_Place_Tf);
		StartLayout.L_Profile.add(Profile_Town_Tf);

		StartLayout.L_Profile.add(Profile_Edit);
		StartLayout.L_Profile.add(Profile_Save);
		StartLayout.L_Profile.add(Profile_Close);
		StartLayout.L_Profile.add(Profile_Delete);
		
		CloseEditor();
	}
	
	static void CloseEditor() {
		
		Profile_Firstname_Tf.setVisible(false);

		Profile_Place_Tf.setVisible(false);
		Profile_Town_Tf.setVisible(false);
	
		Profile_Firstname_2.setVisible(true);

		Profile_Place_2.setVisible(true);
		Profile_Town_2.setVisible(true);
		
		Profile_Edit.setVisible(true);
		Profile_Save.setVisible(false);
		Profile_Close.setVisible(false);
		Profile_Delete.setVisible(false);
		Profile_Picture_but.setVisible(false);
	}

	void OpenEditor() {
		
		Profile_Firstname_Tf.setVisible(true);

		Profile_Place_Tf.setVisible(true);
		Profile_Town_Tf.setVisible(true);
		
		Profile_Firstname_Tf.setText(User.User_Data[3]);
		Profile_Place_Tf.setText(User.User_Data[4]);
		Profile_Town_Tf.setText(User.User_Data[5]);
	
		Profile_Firstname_2.setVisible(false);

		Profile_Place_2.setVisible(false);
		Profile_Town_2.setVisible(false);

		Profile_Edit.setVisible(false);
		Profile_Save.setVisible(true);
		Profile_Close.setVisible(true);
		Profile_Delete.setVisible(true);
		Profile_Picture_but.setVisible(true);
	}

	public static void getPictureUrl(String url) {
		
		Pic_url = url;
		
		Profile_Picture_img = new ImageIcon(Pic_url + "");
		
		((ImageIcon) Profile_Picture_img).setImage(((ImageIcon) Profile_Picture_img).getImage().
				getScaledInstance(Profile_Picture.getWidth(), Profile_Picture.getHeight(), Image.SCALE_DEFAULT));
		Profile_Picture.setIcon(Profile_Picture_img);
	}

	@SuppressWarnings("resource")
	void CopyPicture(File f) {

		File p = new File("Users/" + Profile_Secondname_2.getText() + ".png");
		
		FileChannel inChannel = null; 
	    FileChannel outChannel = null; 
	    
	    try { 
	    	
	    	inChannel = new FileInputStream(f).getChannel(); 
	        outChannel = new FileOutputStream(p).getChannel(); 
	        inChannel.transferTo(0, inChannel.size(), outChannel); 
	        
	    } catch (Exception e1) { }
	}
	
	static void setPofilData() {
		
		Profile_PersonID_2.setText(User.User_Data[1]);
		Profile_Secondname_2.setText(User.User_Data[2]);
		Profile_Firstname_2.setText(User.User_Data[3]);
		Profile_Place_2.setText(User.User_Data[4]);
		Profile_Town_2.setText(User.User_Data[5]);
		Profile_FirstLogin_2.setText(User.User_Data[6]);
		Profile_NumberofGames_2.setText(User.User_Data[7]);
		
		try {
			
			Profile_Picture_img = new ImageIcon("Users/" + User.User_Data[1] + ".png");
			Profile_Picture.setIcon(Profile_Picture_img);
			
			((ImageIcon) Profile_Picture_img).setImage(((ImageIcon) Profile_Picture_img).getImage().
					getScaledInstance(Profile_Picture.getWidth(), Profile_Picture.getHeight(), Image.SCALE_DEFAULT));
			
		} catch(Exception e) { }
	}
	
	public static void OpenSide() {
		
		StartLayout.CloseAllSides();

		Paket.User.Side_ID = 1003;
		User.SetNewSide(Paket.User.Side_ID);

		StartLayout.L_Profile.add(StartLayout.Headline);
		StartLayout.Headline.setText("Profil");
		
		StartLayout.L_Profile.setVisible(true);
		StartLayout.ReloadFrame();
		
		CloseEditor();
		setPofilData();
	}

	public void actionPerformed(ActionEvent e) {

		if ( e.getSource() == Profile_Edit ) {
			
			OpenEditor();
		}

		if ( e.getSource() == Profile_Close ) {
			
			CloseEditor();
		}

		if ( e.getSource() == Profile_Delete ) {
			
			User.Login = false;
			SideBar.SideBar_Layout.InvisibleButtons();
			Sides.Layout_01Login.OpenSide();
			
			File f1 = new File("Users/"+ User.User_Data[1] + ".usr");
			f1.delete();

			File f2 = new File("Users/"+ User.User_Data[1] + ".png");
			f2.delete();	
		}
		
		if ( e.getSource() == Profile_Save ) {
			
			boolean CreateUser = true;

			Profile_Firstname_Tf.setBackground(new Color(255,255,255));
			Profile_Place_Tf.setBackground(new Color(255,255,255));
			Profile_Town_Tf.setBackground(new Color(255,255,255));
			
			if ( Profile_Firstname_Tf.getText().equals("") ) { CreateUser = false; Profile_Firstname_Tf.setBackground(new Color(200,0,10)); }
			if ( Profile_Place_Tf.getText().equals("") ) { CreateUser = false; Profile_Place_Tf.setBackground(new Color(200,0,10)); }
			if ( Profile_Town_Tf.getText().equals("") ) { CreateUser = false; Profile_Town_Tf.setBackground(new Color(200,0,10)); }
						
			if ( CreateUser == true ) {
				
				try {
				
					User.ReadUser(User.User_Data[2]);
					
					User.User_Data[3] = Profile_Firstname_Tf.getText();
					User.User_Data[4] = Profile_Place_Tf.getText();
					User.User_Data[5] = Profile_Town_Tf.getText();
					
					SafeUser.SafeUserFromEdit();
					CloseEditor();
					setPofilData();
					
					String file = "Users/" + User.User_Data[2] + ".usr";			
					StartLayout.UploadFile(file, file);
		
				} catch (Exception e1) { System.out.println("Try not work"); }
				
			} else { System.out.println("Not all Field are texted"); }
	
		}
		
		if ( e.getSource() == Profile_Picture_but ) {
			
			LoadPic.showOpenDialog(null);
		}

		if ( e.getSource() == LoadPic ) {
			
			File f = new File(LoadPic.getSelectedFile() + "");							
			getPictureUrl(f.getPath());
			CopyPicture(f);
		}
	}

}