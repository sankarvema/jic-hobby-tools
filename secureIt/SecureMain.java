import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class SecureMain {
	private Frame mainFrame;
	private Label headerLabel;
	private Label statusLabel;
	private Panel controlPanel;
	private Label msglabel;
	
	private JTextField loginText;
	private JPasswordField pwdText;
	private JButton loginButton;

	public SecureMain(){
		ScanFiles scanner = new ScanFiles();
		scanner.initScan();
		prepareGUI();
	}

	public static void main(String[] args){
		SecureMain  SecureMain = new SecureMain();  
		SecureMain.showGridLayoutDemo();       
	}
      
   private void prepareGUI(){
		mainFrame = new Frame("Secure Disk");
		mainFrame.setSize(750,480);
		mainFrame.setLayout(null);

		mainFrame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent){
				System.exit(0);
			}        
		});   

		JPanel leftPanel = new JPanel();
		leftPanel.setBounds(5,5,280,470);
		leftPanel.setBackground(new Color(255,0,255));
		
		JPanel rightPanel = new JPanel();
		rightPanel.setBounds(290,5,420,470);
		rightPanel.setBackground(new Color(255,255,255));
		
		mainFrame.add(leftPanel);
		mainFrame.add(rightPanel);
		
		rightPanel.setLayout(null);
		
		headerLabel = new Label();
		headerLabel.setAlignment(Label.LEFT);
		headerLabel.setText("Secure Disk");
		headerLabel.setBounds(5,20,400,40);
		
		Label encLabel = new Label();
		encLabel.setAlignment(Label.LEFT);
		encLabel.setText("Encryption Level");
		encLabel.setBounds(5,70,100,40);
		
		String[] encStrings = { "Select", "Basic", "Privileged", "Admin" };

		JComboBox encList = new JComboBox(encStrings);
		encList.setBounds(110,70,300,40);
		encList.setSelectedIndex(1);
		encList.addActionListener(new ActionListener() {
 
            public void actionPerformed(ActionEvent e)
            {
				return;
            }
        });
		
		Label loginLabel = new Label();
		loginLabel.setAlignment(Label.LEFT);
		loginLabel.setText("User ID");
		loginLabel.setBounds(5,120,100,40);
		
		loginText = new JTextField();
		loginText.setBounds(110,120,300,40);
		loginText.setText("sans");
		
		Label pwdLabel = new Label();
		pwdLabel.setAlignment(Label.LEFT);
		pwdLabel.setText("Password");
		pwdLabel.setBounds(5,170,100,40);
		
		pwdText = new JPasswordField();
		pwdText.setBounds(110,170,300,40);
		pwdText.setText("sans");
		
		loginButton = new JButton();
		loginButton.setBounds(110,220,100,40);
		loginButton.setText("Unlock Disc");
		loginButton.addActionListener(new ActionListener() {
 
            public void actionPerformed(ActionEvent e)
            {
				JOptionPane.showMessageDialog(null, loginText.getText() + " : " + pwdText.getText(), "InfoBox: ", JOptionPane.INFORMATION_MESSAGE);
				if(loginText.getText().equals("sans") && pwdText.getText().equals("sans"))
				{
					loginButton.setText("Lock Disc");
					JOptionPane.showMessageDialog(null, "Login successful", "InfoBox: ", JOptionPane.INFORMATION_MESSAGE);
				}
            }
        });  
		
		JButton cancelButton = new JButton();
		cancelButton.setBounds(220,220,100,40);
		cancelButton.setText("Cancel");
		cancelButton.addActionListener(new ActionListener() {
 
            public void actionPerformed(ActionEvent e)
            {
				loginText.setText("");
				pwdText.setText("");
            }
        });     
		
		Label lblCopyright = new Label("");
		lblCopyright.setText("Copyright SecureDisc (c) 2014. All rights reserved");
		//lblCopyright.setPreferredSize(new Dimension(175, 100));
		lblCopyright.setBounds(5,420,380,60);
		
		rightPanel.add(headerLabel);
		rightPanel.add(encLabel);
		rightPanel.add(encList);
		rightPanel.add(loginLabel);
		rightPanel.add(loginText);
		rightPanel.add(pwdLabel);
		rightPanel.add(pwdText);
		rightPanel.add(loginButton);
		rightPanel.add(cancelButton);
		rightPanel.add(lblCopyright);

		statusLabel = new Label();        
		statusLabel.setAlignment(Label.CENTER);
		statusLabel.setSize(350,100);

		msglabel = new Label();
		msglabel.setAlignment(Label.CENTER);
		msglabel.setText("Welcome to TutorialsPoint AWT Tutorial.");
	  
	  		//Add left image
		ImagePanel panel = new ImagePanel(new ImageIcon(".\\usblock.bmp").getImage());
		panel.setBackground(new Color(255,0,255));
		panel.setBounds(40,40,200,500);
		//splashFrame.getContentPane().add(panel);
		
/* 		Label lblCopyright = new Label("");
		lblCopyright.setText("Copyright SecureDisc (c) 2014. All rights reserved");
		lblCopyright.setPreferredSize(new Dimension(175, 100));
		lblCopyright.setBounds(10,10,20,50);
		//splashFrame.getContentPane().add(lblCopyright); */

/* 		controlPanel = new Panel();
		controlPanel.setLayout(new FlowLayout()); */


		
/* 		mainFrame.add(panel);
		mainFrame.add(lblCopyright);
		mainFrame.add(headerLabel);
		mainFrame.add(controlPanel);
		mainFrame.add(statusLabel); */
		mainFrame.setVisible(true);  
	}

	private void showGridLayoutDemo(){
		//headerLabel.setText("Layout in action: GridLayout");      

/* 		Panel panel = new Panel();
		panel.setBackground(Color.darkGray);
		panel.setSize(300,300);
		GridLayout layout = new GridLayout(0,3);
		layout.setHgap(10);
		layout.setVgap(10);

		panel.setLayout(layout);        
		panel.add(new Button("Button 1"));
		panel.add(new Button("Button 2")); 
		panel.add(new Button("Button 3")); 
		panel.add(new Button("Button 4")); 
		panel.add(new Button("Button 5")); 
		controlPanel.add(panel);
		mainFrame.setVisible(true);   */
	}
}