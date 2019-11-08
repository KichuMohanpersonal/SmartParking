package Home;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;

import javax.swing.JTabbedPane;
import javax.swing.JToolBar;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ButtonGroup;
import java.awt.Toolkit;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class tab extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
String c,b;

private final ButtonGroup buttonGroup = new ButtonGroup();
private JTextField textField_6;
public static JTextField textField_13;
public static JTextField textField_14;
public static JTextField textField_15;
public static JTextField textField_16;
public static JTextField textField_17;
public static JTextField textField_19;
public static JTextField textField_20;
public static JTextField textField_21;
public static JTextField textField_22;
public static JTextField textField_23;
public static JTextField textField_24;
public static JTextField textField_25;
public static JTextField textField_26;
private final ButtonGroup buttonGroup_1 = new ButtonGroup();
private final ButtonGroup buttonGroup_2 = new ButtonGroup();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tab frame = new tab();
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
	public tab() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Apple\\Desktop\\download (3).jpg"));
		
		setTitle("Smart Parking");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 752, 630);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 743, 627);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Insert Information", null, panel, null);
		panel.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setForeground(Color.BLACK);
		panel_3.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel_3.setBackground(SystemColor.activeCaption);
		panel_3.setBounds(10, 0, 741, 610);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(467, 79, 199, 20);
		textField.setForeground(Color.BLACK);
		textField.setColumns(10);
		textField.setBackground(Color.LIGHT_GRAY);
		panel_3.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setBounds(467, 110, 199, 20);
		textField_1.setForeground(Color.BLACK);
		textField_1.setColumns(10);
		textField_1.setBackground(Color.LIGHT_GRAY);
		panel_3.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(467, 141, 199, 20);
		textField_2.setForeground(Color.BLACK);
		textField_2.setColumns(10);
		textField_2.setBackground(Color.LIGHT_GRAY);
		panel_3.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setBounds(467, 172, 199, 20);
		textField_3.setForeground(Color.BLACK);
		textField_3.setColumns(10);
		textField_3.setBackground(Color.LIGHT_GRAY);
		panel_3.add(textField_3);
		//fare
		
		JLabel lblfare = new JLabel("Rs:30/-");
		lblfare.setBounds(467, 204, 246, 19);
		lblfare.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_3.add(lblfare);
		
	/*	
		textField_4 = new JTextField();
		textField_4.setBounds(467, 203, 199, 20);
		textField_4.setForeground(Color.BLACK);
		textField_4.setColumns(10);
		textField_4.setBackground(Color.LIGHT_GRAY);
		panel_3.add(textField_4);
		*/
		JRadioButton radioButton = new JRadioButton("Slot 1");
		radioButton.setBounds(150, 306, 80, 23);
		radioButton.setFont(new Font("Tahoma", Font.ITALIC, 15));
		buttonGroup.add(radioButton);
		radioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c="1";
				b="Booked";
			}
		});
		radioButton.setBackground(SystemColor.activeCaptionBorder);
		panel_3.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("Slot 2");
		radioButton_1.setBounds(240, 306, 80, 23);
		radioButton_1.setFont(new Font("Tahoma", Font.ITALIC, 15));
		buttonGroup.add(radioButton_1);
		radioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c="2";
				b="Booked";
			}
		});
		radioButton_1.setBackground(SystemColor.activeCaptionBorder);
		panel_3.add(radioButton_1);
		//slot 3 created
		JRadioButton radioButton_2 = new JRadioButton("Slot 3");
		radioButton_2.setBounds(330, 306, 80, 23);
		radioButton_2.setFont(new Font("Tahoma", Font.ITALIC, 15));
		buttonGroup.add(radioButton_2);
		radioButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c="3";
				b="Booked";
			}
		});
		radioButton_2.setBackground(SystemColor.activeCaptionBorder);
		panel_3.add(radioButton_2);
		
		//slot 4 created
		JRadioButton radioButton_3 = new JRadioButton("Slot 4");
		radioButton_3.setBounds(420, 306, 80, 23);
		radioButton_3.setFont(new Font("Tahoma", Font.ITALIC, 15));
		buttonGroup.add(radioButton_3);
		radioButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c="4";
				b="Booked";
			}
		});
		radioButton_3.setBackground(SystemColor.activeCaptionBorder);
		panel_3.add(radioButton_3);
		
		
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(435, 446, 188, 34);
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				information obj=new information();
				obj.insert(textField.getText(),textField_1.getText(),textField_2.getText(),c,b);
			}
		});
		panel_3.add(btnSubmit);
		
		JLabel lblCostumerNo = new JLabel("Car Registration Number: ");
		lblCostumerNo.setBounds(139, 80, 246, 14);
		lblCostumerNo.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_3.add(lblCostumerNo);
		
		JLabel lblCarNo = new JLabel("Brand: ");
		lblCarNo.setBounds(139, 111, 232, 14);
		lblCarNo.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_3.add(lblCarNo);
		
		JLabel lblDate = new JLabel("Hours");
		lblDate.setBounds(139, 173, 232, 14);
		lblDate.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_3.add(lblDate);
		
		JLabel lblTime = new JLabel("Contact");
		lblTime.setBounds(139, 142, 232, 14);
		lblTime.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_3.add(lblTime);
		
		JLabel lblDay = new JLabel("Fare");
		lblDay.setBounds(139, 204, 246, 19);
		lblDay.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_3.add(lblDay);
		
		JLabel label_6 = new JLabel("Parking Slot");
		label_6.setBounds(139, 257, 168, 19);
		label_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_3.add(label_6);
		
		JLabel lblEnterInfo = new JLabel("Enter Info");
		lblEnterInfo.setBounds(277, 25, 285, 28);
		lblEnterInfo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		panel_3.add(lblEnterInfo);
		
		JButton button_2 = new JButton("Cancel");
		button_2.setBounds(201, 446, 155, 35);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		panel_3.add(button_2);
		
	/*	
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Delete Information", null, panel_1, null);
		panel_1.setLayout(null);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel_5.setBackground(SystemColor.activeCaption);
		panel_5.setBounds(0, 0, 728, 599);
		panel_1.add(panel_5);
		
		JButton button_1 = new JButton("Delete");
		button_1.setBounds(407, 327, 89, 23);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				delete obj=new delete();
				obj.delete(textField_6.getText());
			}
		});
		panel_5.setLayout(null);
		panel_5.add(button_1);
		
		textField_6 = new JTextField();
		textField_6.setBounds(407, 155, 243, 20);
		textField_6.setBackground(SystemColor.activeCaptionBorder);
		textField_6.setColumns(10);
		panel_5.add(textField_6);
		
		JLabel lblEnterCarNo = new JLabel("Enter Car ID#");
		lblEnterCarNo.setBounds(162, 152, 168, 23);
		lblEnterCarNo.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_5.add(lblEnterCarNo);
		
		JLabel lblDeleteOrder = new JLabel("Delete ID");
		lblDeleteOrder.setBounds(267, 33, 422, 32);
		lblDeleteOrder.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		panel_5.add(lblDeleteOrder);
		
		JButton button_4 = new JButton("Cancel");
		button_4.setBounds(280, 327, 89, 23);
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		panel_5.add(button_4);
		*/
		JPanel panel_6 = new JPanel();
		tabbedPane.addTab("Show Information", null, panel_6, null);
		panel_6.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel_9.setBackground(SystemColor.activeCaption);
		panel_6.add(panel_9, BorderLayout.CENTER);
		panel_9.setLayout(null);
		
		textField_13 = new JTextField();
		textField_13.setBackground(SystemColor.activeCaptionBorder);
		textField_13.setBounds(308, 68, 231, 20);
		textField_13.setColumns(10);
		panel_9.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setBackground(SystemColor.activeCaptionBorder);
		textField_14.setBounds(308, 169, 231, 20);
		textField_14.setColumns(10);
		panel_9.add(textField_14);
		/*
		textField_15 = new JTextField();
		textField_15.setBackground(SystemColor.activeCaptionBorder);
		textField_15.setBounds(308, 141, 231, 20);
		textField_15.setColumns(10); 
		panel_9.add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setBackground(SystemColor.activeCaptionBorder);
		textField_16.setBounds(308, 177, 231, 20);
		textField_16.setColumns(10);
		panel_9.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setBackground(SystemColor.activeCaptionBorder);
		textField_17.setBounds(308, 218, 231, 20);
		textField_17.setColumns(10);
		panel_9.add(textField_17);
		*/
		JButton button_5 = new JButton("show info");
		button_5.setBounds(330, 439, 142, 23);
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				select obj=new select();
				obj.selection(textField_13.getText());
			}
		});
		panel_9.add(button_5);
		
		JLabel lblCarId = new JLabel("Slot Number:");
		lblCarId.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCarId.setBounds(96, 71, 119, 14);
		panel_9.add(lblCarId);
		/*
		JLabel lblTokenNo = new JLabel("Token No#");
		lblTokenNo.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTokenNo.setBounds(96, 102, 165, 14);
		panel_9.add(lblTokenNo);
		
		JLabel lblData = new JLabel("Data");
		lblData.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblData.setBounds(96, 144, 119, 14);
		panel_9.add(lblData);
		
		JLabel lblTime_1 = new JLabel("Time");
		lblTime_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTime_1.setBounds(96, 179, 109, 17);
		panel_9.add(lblTime_1);
		
		JLabel lblDay_1 = new JLabel("Day");
		lblDay_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDay_1.setBounds(96, 221, 119, 14);
		panel_9.add(lblDay_1);
		
		JRadioButton radioButton_4 = new JRadioButton("Male");
		radioButton_4.setBackground(SystemColor.activeCaptionBorder);
		radioButton_4.setBounds(308, 270, 109, 23);
		buttonGroup_2.add(radioButton_4);
		panel_9.add(radioButton_4);
		
		JRadioButton radioButton_5 = new JRadioButton("Female");
		radioButton_5.setBackground(SystemColor.activeCaptionBorder);
		radioButton_5.setBounds(430, 270, 109, 23);
		buttonGroup_2.add(radioButton_5);
		panel_9.add(radioButton_5);
		
		JLabel label_24 = new JLabel("Gender");
		label_24.setFont(new Font("Tahoma", Font.ITALIC, 15));
		label_24.setBounds(96, 263, 155, 32);
		panel_9.add(label_24);
		*/
		JButton button_8 = new JButton("Cancel");
		button_8.setBounds(159, 439, 89, 23);
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		panel_9.add(button_8);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Logout", null, panel_4, null);
		panel_4.setLayout(null);
		
		JButton btnLogout = new JButton("");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				first obj=new first(); 
				obj.setVisible(true);
				dispose();
			}
		});
		btnLogout.setIcon(new ImageIcon("C:\\Users\\Apple\\Desktop\\i.png"));
		btnLogout.setBackground(new Color(255, 0, 0));
		btnLogout.setBounds(153, 127, 419, 315);
		panel_4.add(btnLogout);
	}

}
