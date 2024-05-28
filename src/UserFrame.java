import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPasswordField;
import javax.swing.JTextPane;


public class UserFrame extends JFrame {

	private JPanel contentPane;
	private JTextField txt_code;
	private JTextField txt_name;
	private JPasswordField txt_type;
	private JPasswordField txt_repass;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					ProductFrame frame = new ProductFrame();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public UserFrame() {
		setTitle("Бүртгэл");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 278, 415);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 375, 698, -318);
		contentPane.add(scrollPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(192, 192, 192));
		panel.setBounds(10, 11, 247, 210);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel.setBounds(49, 34, 111, 14);
		panel.add(lblNewLabel);
		
		txt_code = new JTextField();
		txt_code.setBounds(91, 31, 126, 20);
		panel.add(txt_code);
		txt_code.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("User name:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(20, 74, 111, 14);
		panel.add(lblNewLabel_1);
		
		txt_name = new JTextField();
		txt_name.setColumns(10);
		txt_name.setBounds(91, 71, 126, 20);
		panel.add(txt_name);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1_1.setBounds(20, 107, 111, 14);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Re-password:");
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1_1_2.setBounds(10, 146, 111, 14);
		panel.add(lblNewLabel_1_1_2);
		
		txt_type = new JPasswordField();
		txt_type.setBounds(91, 104, 123, 20);
		panel.add(txt_type);
		
		txt_repass = new JPasswordField();
		txt_repass.setBounds(91, 143, 123, 20);
		panel.add(txt_repass);
		
		JButton btnNewButton_1 = new JButton("Add");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!txt_code.getText().isBlank()) {
				int code = Integer.parseInt(txt_code.getText());
				String name = txt_name.getText();
				String type =txt_type.getText();
				String price =txt_repass.getText();
				if(type.equals(price)) {
				UserEditControl p = new UserEditControl();
				users newpro = new users(code, name, type);
//				p.addProduct(newpro); //true
				boolean result = p.addProduct(newpro);
				if(result) { 
					JOptionPane.showMessageDialog(null, "Successfully added");
				    txt_code.setText("");
				    txt_code.setEditable(true);
				    txt_name.setText("");
				    txt_type.setText("");
				    txt_repass.setText("");}
				else {JOptionPane.showMessageDialog(null, "Sorry. There is a problem");}}
				else {JOptionPane.showMessageDialog(null, "Your re-password is invalid");}}
			else { JOptionPane.showMessageDialog(null, "Please type in ID");}
				
		}
		}
		);
		btnNewButton_1.setBounds(20, 300, 102, 52);
		contentPane.add(btnNewButton_1);
		
		JButton btn_delete = new JButton("Delete");
		btn_delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int songolt = JOptionPane.showConfirmDialog(null, "Are you sure to delete?", "Delete" , JOptionPane.YES_NO_CANCEL_OPTION);
			    if(songolt == 0) {
				if(!txt_code.getText().isBlank()) {
					int code = Integer.parseInt(txt_code.getText());
					UserEditControl p = new UserEditControl();
					boolean result = p.deleteProduct(code);
							if(result) { 
								JOptionPane.showMessageDialog(null, "Successfully deleted");
							    txt_code.setText("");
							    txt_name.setText("");
							    txt_type.setText("");
							    txt_repass.setText("");}
							else 
								JOptionPane.showMessageDialog(null, "Sorry there is a problem");
				}else JOptionPane.showMessageDialog(null,"There is a empty feild");
			    }
			}
		});
		btn_delete.setBounds(132, 300, 115, 52);
		contentPane.add(btn_delete);
		
		JTextPane txtpnIfYouWant = new JTextPane();
		txtpnIfYouWant.setText("             If you want to delete  ID\r\n                       fill ID field .");
		txtpnIfYouWant.setBounds(35, 249, 193, 40);
		contentPane.add(txtpnIfYouWant);
	}
}
