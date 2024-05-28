import java.awt.BorderLayout;

import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Font;

public class UserControlFrame extends JFrame {

	private JPanel contentPane;
	private JTextField txt_name;
	private JPasswordField txt_pass;
	public  boolean result;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserControlFrame frame = new UserControlFrame();
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
	public UserControlFrame() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 384, 140);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Username:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(52, 23, 74, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(52, 48, 65, 14);
		contentPane.add(lblNewLabel_1);
		
		txt_name = new JTextField();
		txt_name.setBounds(126, 24, 108, 20);
		contentPane.add(txt_name);
		txt_name.setColumns(10);
		
		
		
		JButton btn_login = new JButton("Enter");
		btn_login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserControl u = new UserControl();
				 result = u.login(txt_name.getText(), txt_pass.getText());
				if(result) {
					JOptionPane.showMessageDialog(null, "Successfully logged in");
					dispose();
					
					
				}else {
					JOptionPane.showMessageDialog(null, "Sorry your username or password is wrong.");
				}
				
			}
		});
		
		
		    

		btn_login.setBounds(253, 28, 89, 41);
		contentPane.add(btn_login);
	
		txt_pass = new JPasswordField();
		txt_pass.setBounds(126, 49, 108, 20);
		contentPane.add(txt_pass);
		 
	
	}
	
	
	
	
	    
}


