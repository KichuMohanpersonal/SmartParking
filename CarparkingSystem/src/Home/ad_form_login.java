package Home;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.ImageIcon;

public class ad_form_login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField password;

	/**
	 * Launch the application.
	 */
		
		

		 
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					form_login frame = new form_login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

/**
	 * Create the frame.
	 */
	public ad_form_login() {
	setTitle("Smart Parking");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 561);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(169, 188, 265, 28);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblUserName = new JLabel("User name");
		lblUserName.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblUserName.setBounds(20, 195, 139, 14);
		contentPane.add(lblUserName);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPassword.setBounds(20, 251, 139, 14);
		contentPane.add(lblPassword);
		
		JButton btnSubmit = new JButton("login");
		btnSubmit.setIcon(null);
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				ad_logincode obj=new ad_logincode();
				obj.log(textField.getText(),password.getText());
				dispose();
			}
		});
		btnSubmit.setBounds(369, 463, 155, 48);
		contentPane.add(btnSubmit);
		
		password = new JPasswordField();
		password.setBounds(169, 244, 265, 28);
		contentPane.add(password);
		
		JLabel lblPleaseEnterThe = new JLabel("Admin Login");
		lblPleaseEnterThe.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblPleaseEnterThe.setBounds(20, 24, 472, 38);
		contentPane.add(lblPleaseEnterThe);
		
		JLabel lblNewLabel = new JLabel(" ");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Apple\\Desktop\\Best-Background-1.jpg"));
		lblNewLabel.setBounds(0, 0, 534, 522);
		contentPane.add(lblNewLabel);
	}
}
