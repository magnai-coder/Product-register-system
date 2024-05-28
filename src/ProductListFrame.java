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
import javax.swing.JTextPane;


public class ProductListFrame extends JFrame {

	private JPanel contentPane;
	private JTextField txt_pic;
	private JTextField txt_id;
	private JTextField txt_name;
	private JTextField txt_price;

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
	public ProductListFrame() {
		setTitle("Product");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 301, 400);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			System.exit(EXIT_ON_CLOSE);
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenu mnNewMenu_1 = new JMenu("");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("");
		mnNewMenu_1.add(mntmNewMenuItem_1);
		
		JMenu mnNewMenu_2 = new JMenu("");
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"");
			}
		});
		mnNewMenu_2.add(mntmNewMenuItem_3);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 375, 698, -318);
		contentPane.add(scrollPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(192, 192, 192));
		panel.setBounds(20, 11, 247, 166);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Product number");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel.setBounds(10, 34, 111, 14);
		panel.add(lblNewLabel);
		
		txt_pic = new JTextField();
		txt_pic.setBounds(111, 31, 126, 20);
		panel.add(txt_pic);
		txt_pic.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Product Id:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(10, 63, 111, 14);
		panel.add(lblNewLabel_1);
		
		txt_id = new JTextField();
		txt_id.setColumns(10);
		txt_id.setBounds(111, 60, 126, 20);
		panel.add(txt_id);
		
		JLabel lblNewLabel_1_1 = new JLabel("Name:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1_1.setBounds(10, 91, 111, 14);
		panel.add(lblNewLabel_1_1);
		
		txt_name = new JTextField();
		txt_name.setColumns(10);
		txt_name.setBounds(111, 88, 126, 20);
		panel.add(txt_name);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Price:");
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1_1_2.setBounds(10, 119, 111, 14);
		panel.add(lblNewLabel_1_1_2);
		
		txt_price = new JTextField();
		txt_price.setColumns(10);
		txt_price.setBounds(111, 119, 126, 20);
		panel.add(txt_price);
		
		JButton btnNewButton_1 = new JButton("Add product ");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!txt_pic.getText().isBlank()) {
				int code = Integer.parseInt(txt_pic.getText());
				String name = txt_id.getText();
				String type =txt_name.getText();
				double price =Double.parseDouble(txt_price.getText());
				ProductControl p = new ProductControl();
				Product newpro = new Product(code, name, type, price);
//				p.addProduct(newpro); //true
				boolean result = p.addProduct(newpro);
				if(result) { 
					JOptionPane.showMessageDialog(null, "Succesfully added");
				    txt_pic.setText("");
				    txt_pic.setEditable(true);
				    txt_id.setText("");
				    txt_name.setText("");
				    txt_price.setText("");}
				else 
					JOptionPane.showMessageDialog(null, "Sorry there is a problem");
			}else   JOptionPane.showMessageDialog(null, "there is something omitted");
		}
		}
		);
		btnNewButton_1.setBounds(20, 247, 247, 33);
		contentPane.add(btnNewButton_1);
		
		JButton btn_delete = new JButton("Delete product");
		btn_delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int songolt = JOptionPane.showConfirmDialog(null, "Та устгахдаа итгэлтэй байна уу?", "Устгах" , JOptionPane.YES_NO_CANCEL_OPTION);
			    if(songolt == 0) {
				if(!txt_pic.getText().isBlank()) {
					int code = Integer.parseInt(txt_id.getText());
					ProductControl p = new ProductControl();
					boolean result = p.deleteProduct(code);
							if(result) { 
								JOptionPane.showMessageDialog(null, "Successfully deleted");
							    txt_pic.setText("");
							    txt_id.setText("");
							    txt_name.setText("");
							    txt_price.setText("");}
							else 
								JOptionPane.showMessageDialog(null, "There is a problem");
				}else JOptionPane.showMessageDialog(null,"Fill empty the field");
			    }
			}
		});
		btn_delete.setBounds(20, 294, 247, 33);
		contentPane.add(btn_delete);
		
		JTextPane txtpnIfYouWant = new JTextPane();
		txtpnIfYouWant.setText("                    If you want to delete  ID\r\n                                fill ID field.");
		txtpnIfYouWant.setBounds(30, 196, 225, 40);
		contentPane.add(txtpnIfYouWant);
	}
}
