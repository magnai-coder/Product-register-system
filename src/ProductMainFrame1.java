import java.awt.EventQueue;





import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JMenu;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import javax.swing.JTabbedPane;
import javax.swing.*;
import java.awt.Window;
import java.awt.Button;
import java.awt.Window;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.SystemColor;


public class ProductMainFrame1 extends JFrame {

	private JFrame frmShoppingMall;
	private JTextField textField;
	private JTextField txt_search;
	private final JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
	private JTextField txt_1;
	private JTextField txt_5;
	private JTextField txt_4;
	private JTextField txt_3;
	private JTextField txt_2;
	public boolean key;
	protected ProductMainFrame1 reuslt;
	private JTable table;
	private JTable table_1;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProductMainFrame1 window = new ProductMainFrame1();
					window.frmShoppingMall.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ProductMainFrame1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmShoppingMall = new JFrame();
		frmShoppingMall.setTitle("Shopping Mall");
		frmShoppingMall.setBounds(100, 100, 707, 416);
		frmShoppingMall.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmShoppingMall.getContentPane().setLayout(null);
		
		
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(220, 220, 220));
		panel.setBounds(0, 0, 691, 160);
		frmShoppingMall.getContentPane().add(panel);
		panel.setLayout(null);
		
		txt_search = new JTextField();
		txt_search.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txt_search.setBounds(569, 3, 89, 23);
		panel.add(txt_search);
		txt_search.setColumns(10);
		
		JPanel panelMainContent = new JPanel();
		panelMainContent.setBounds(0, 189, 691, 188);
		frmShoppingMall.getContentPane().add(panelMainContent);
		panelMainContent.setLayout(null);
		getTabbedPane().setBounds(0, -29, 691, 217);
		panelMainContent.add(getTabbedPane());
		
		JPanel panel_4 = new JPanel();
		getTabbedPane().addTab("New tab", null, panel_4, null);
		JLabel lblNewLabel_1 = new JLabel("");
	    lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\shopping.PNG"));
	    panel_4.add(lblNewLabel_1);
		
		JPanel panel_3 = new JPanel();
		getTabbedPane().addTab("New tab", null, panel_3, null);
		panel_3.setLayout(null);
		
		JComboBox cmb_2 = new JComboBox();
		cmb_2.setModel(new DefaultComboBoxModel(new String[] {"Big", "Medium", "Small"}));
		cmb_2.setBounds(328, 94, 68, 22);
		panel_3.add(cmb_2);
		
		
		
		JButton btn_buy_2_1 = new JButton("Buy");
		btn_buy_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showConfirmDialog(null, "Do you want to buy?", "Авах" , JOptionPane.YES_NO_CANCEL_OPTION);
			}
		});
		btn_buy_2_1.setBackground(new Color(102, 205, 170));
		btn_buy_2_1.setBounds(458, 45, 131, 42);
		panel_3.add(btn_buy_2_1);
		
		txt_2 = new JTextField();
		txt_2.setColumns(10);
		txt_2.setBounds(328, 120, 77, 20);
		panel_3.add(txt_2);
		
		JLabel lblNewLabel_2_1_1_1_1_1 = new JLabel("Number:");
		lblNewLabel_2_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2_1_1_1_1_1.setBounds(242, 123, 86, 14);
		panel_3.add(lblNewLabel_2_1_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1_2_1 = new JLabel("size:");
		lblNewLabel_2_1_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2_1_1_2_1.setBounds(242, 98, 105, 14);
		panel_3.add(lblNewLabel_2_1_1_2_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("price:");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2_1.setBounds(242, 73, 86, 14);
		panel_3.add(lblNewLabel_2_1);
		
		JLabel lbl_2_2 = new JLabel("45000");
		lbl_2_2.setBounds(328, 73, 105, 14);
		panel_3.add(lbl_2_2);
		
		JLabel lbl_2 = new JLabel("Cake");
		lbl_2.setBounds(328, 48, 105, 14);
		panel_3.add(lbl_2);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Product:");
		lblNewLabel_2_2_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2_2_1.setBounds(242, 48, 86, 14);
		panel_3.add(lblNewLabel_2_2_1);
		
		JLabel lbl_pic_2_1 = new JLabel("");
		lbl_pic_2_1.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\food.PNG"));
		lbl_pic_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_pic_2_1.setBackground(new Color(144, 238, 144));
		lbl_pic_2_1.setBounds(33, 28, 146, 136);
		panel_3.add(lbl_pic_2_1);
		
		JPanel panel_5 = new JPanel();
		getTabbedPane().addTab("New tab", null, panel_5, null);
		panel_5.setLayout(null);
		
		JComboBox cmb_3 = new JComboBox();
		cmb_3.setModel(new DefaultComboBoxModel(new String[] {"Big", "medium ", "Small"}));
		cmb_3.setBounds(328, 94, 68, 22);
		panel_5.add(cmb_3);
		
		
		
		JButton btn_buy_2_5 = new JButton("Buy");
		btn_buy_2_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showConfirmDialog(null, "Do you want to buy?", "Авах" , JOptionPane.YES_NO_CANCEL_OPTION);
			}
		});
		btn_buy_2_5.setBackground(new Color(102, 205, 170));
		btn_buy_2_5.setBounds(458, 45, 131, 42);
		panel_5.add(btn_buy_2_5);
		
		txt_3 = new JTextField();
		txt_3.setColumns(10);
		txt_3.setBounds(328, 120, 77, 20);
		panel_5.add(txt_3);
		
		JLabel lblNewLabel_2_1_1_1_1_5 = new JLabel("Number:");
		lblNewLabel_2_1_1_1_1_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2_1_1_1_1_5.setBounds(242, 123, 86, 14);
		panel_5.add(lblNewLabel_2_1_1_1_1_5);
		
		JLabel lblNewLabel_2_1_1_2_5 = new JLabel("size:");
		lblNewLabel_2_1_1_2_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2_1_1_2_5.setBounds(240, 98, 105, 14);
		panel_5.add(lblNewLabel_2_1_1_2_5);
		
		JLabel lblNewLabel_2_6 = new JLabel("price:");
		lblNewLabel_2_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2_6.setBounds(242, 73, 86, 14);
		panel_5.add(lblNewLabel_2_6);
		
		JLabel lbl_3_3 = new JLabel("15000");
		lbl_3_3.setBounds(328, 73, 105, 14);
		panel_5.add(lbl_3_3);
		
		JLabel lbl_3 = new JLabel("Night cream");
		lbl_3.setBounds(328, 48, 105, 14);
		panel_5.add(lbl_3);
		
		JLabel lblNewLabel_2_2_5 = new JLabel("Product:");
		lblNewLabel_2_2_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2_2_5.setBounds(242, 48, 86, 14);
		panel_5.add(lblNewLabel_2_2_5);
		
		JLabel lbl_pic_2_5 = new JLabel("");
		lbl_pic_2_5.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\beauty.PNG"));
		lbl_pic_2_5.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_pic_2_5.setBackground(new Color(144, 238, 144));
		lbl_pic_2_5.setBounds(33, 28, 146, 136);
		panel_5.add(lbl_pic_2_5);
		
		JButton btn_3 = new JButton("Add to cart");
		btn_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!txt_3.getText().isBlank()) {
					String name = lbl_3.getText();
					double price = Double.parseDouble(lbl_3_3.getText());
					String size =(String)cmb_3.getSelectedItem().toString();
					int number =Integer.parseInt(txt_3.getText());
					ProductControl2 p = new ProductControl2();
					Added_product newpro = new Added_product(name, price, size, number);
					//p.addProduct(newpro); //true
					boolean result = p.addProduct(newpro);
					if(result) { 
						JOptionPane.showMessageDialog(null, "Successfully added");}
					else 
						JOptionPane.showMessageDialog(null, "Sorry there is a problem");
				}else   JOptionPane.showMessageDialog(null, "Please type in product number ");
			}
		});
		btn_3.setBackground(new Color(255, 140, 0));
		btn_3.setBounds(458, 94, 131, 42);
		panel_5.add(btn_3);
		
		
		JPanel panel_6 = new JPanel();
		getTabbedPane().addTab("New tab", null, panel_6, null);
		panel_6.setLayout(null);
		
		JComboBox cmb_4 = new JComboBox();
		cmb_4.setModel(new DefaultComboBoxModel(new String[] {"Big ", "Medium ", "Small"}));
		cmb_4.setBounds(329, 94, 68, 22);
		panel_6.add(cmb_4);
		
		
		JButton btn_buy_2_4 = new JButton("Buy");
		btn_buy_2_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showConfirmDialog(null, "Do you want to buy?", "Авах" , JOptionPane.YES_NO_CANCEL_OPTION);
			}
		});
		btn_buy_2_4.setBackground(new Color(102, 205, 170));
		btn_buy_2_4.setBounds(459, 45, 131, 42);
		panel_6.add(btn_buy_2_4);
		
		txt_4 = new JTextField();
		txt_4.setColumns(10);
		txt_4.setBounds(329, 120, 77, 20);
		panel_6.add(txt_4);
		
		JLabel lblNewLabel_2_1_1_1_1_4 = new JLabel("Number:");
		lblNewLabel_2_1_1_1_1_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2_1_1_1_1_4.setBounds(243, 123, 86, 14);
		panel_6.add(lblNewLabel_2_1_1_1_1_4);
		
		JLabel lblNewLabel_2_1_1_2_4 = new JLabel("size:");
		lblNewLabel_2_1_1_2_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2_1_1_2_4.setBounds(243, 98, 105, 14);
		panel_6.add(lblNewLabel_2_1_1_2_4);
		
		JLabel lblNewLabel_2_5 = new JLabel("price:");
		lblNewLabel_2_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2_5.setBounds(243, 73, 86, 14);
		panel_6.add(lblNewLabel_2_5);
		
		JLabel lbl_4_4 = new JLabel("1300000");
		lbl_4_4.setBounds(329, 73, 105, 14);
		panel_6.add(lbl_4_4);
		
		JLabel lbl_4 = new JLabel("Acer laptop");
		lbl_4.setBounds(329, 48, 105, 14);
		panel_6.add(lbl_4);
		
		JLabel lblNewLabel_2_2_4 = new JLabel("Product:");
		lblNewLabel_2_2_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2_2_4.setBounds(243, 48, 86, 14);
		panel_6.add(lblNewLabel_2_2_4);
		
		JLabel lbl_pic_2_4 = new JLabel("");
		lbl_pic_2_4.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\elect.PNG"));
		lbl_pic_2_4.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_pic_2_4.setBackground(new Color(144, 238, 144));
		lbl_pic_2_4.setBounds(34, 28, 146, 136);
		panel_6.add(lbl_pic_2_4);
		
		JButton btn_3_1 = new JButton("Add to cart");
		btn_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!txt_4.getText().isBlank()) {
					String name = lbl_4.getText();
					double price = Double.parseDouble(lbl_4_4.getText());
					String size =(String)cmb_4.getSelectedItem().toString();
					int number =Integer.parseInt(txt_4.getText());
					ProductControl2 p = new ProductControl2();
					Added_product newpro = new Added_product(name, price, size, number);
					//p.addProduct(newpro); //true
					boolean result = p.addProduct(newpro);
					if(result) { 
						JOptionPane.showMessageDialog(null, "Successfully added");}
					else 
						JOptionPane.showMessageDialog(null, "Sorry there is a problem");
				}else   JOptionPane.showMessageDialog(null, "Please type in product number ");
				
			}
		});
		btn_3_1.setBackground(new Color(255, 140, 0));
		btn_3_1.setBounds(459, 94, 131, 42);
		panel_6.add(btn_3_1);
		
		JPanel panel_7 = new JPanel();
		getTabbedPane().addTab("New tab", null, panel_7, null);
		panel_7.setLayout(null);
		
		JComboBox cmb_5 = new JComboBox();
		cmb_5.setModel(new DefaultComboBoxModel(new String[] {"Big ", "medium", "Smal"}));
		cmb_5.setBounds(329, 94, 68, 22);
		panel_7.add(cmb_5);
		
		
		JButton btn_buy_2_3 = new JButton("Buy");
		btn_buy_2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showConfirmDialog(null, "Do you want to buy?", "Авах" , JOptionPane.YES_NO_CANCEL_OPTION);
			}
		});
		btn_buy_2_3.setBackground(new Color(102, 205, 170));
		btn_buy_2_3.setBounds(459, 45, 131, 42);
		panel_7.add(btn_buy_2_3);
		
		txt_5 = new JTextField();
		txt_5.setColumns(10);
		txt_5.setBounds(329, 120, 77, 20);
		panel_7.add(txt_5);
		
		JLabel lblNewLabel_2_1_1_1_1_3 = new JLabel("Number:");
		lblNewLabel_2_1_1_1_1_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2_1_1_1_1_3.setBounds(243, 123, 86, 14);
		panel_7.add(lblNewLabel_2_1_1_1_1_3);
		
		JLabel lblNewLabel_2_1_1_2_3 = new JLabel("size:");
		lblNewLabel_2_1_1_2_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2_1_1_2_3.setBounds(243, 98, 105, 14);
		panel_7.add(lblNewLabel_2_1_1_2_3);
		
		JLabel lblNewLabel_2_4 = new JLabel("price:");
		lblNewLabel_2_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2_4.setBounds(243, 73, 86, 14);
		panel_7.add(lblNewLabel_2_4);
		
		JLabel lbl_5_5 = new JLabel("12000");
		lbl_5_5.setBounds(329, 73, 105, 14);
		panel_7.add(lbl_5_5);
		
		JLabel lbl_5 = new JLabel("Black hat");
		lbl_5.setBounds(329, 48, 105, 14);
		panel_7.add(lbl_5);
		
		JLabel lblNewLabel_2_2_3 = new JLabel("Product:");
		lblNewLabel_2_2_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2_2_3.setBounds(243, 48, 86, 14);
		panel_7.add(lblNewLabel_2_2_3);
		
		JLabel lbl_pic_2_3 = new JLabel("");
		lbl_pic_2_3.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\fashion.PNG"));
		lbl_pic_2_3.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_pic_2_3.setBackground(new Color(144, 238, 144));
		lbl_pic_2_3.setBounds(34, 28, 146, 136);
		panel_7.add(lbl_pic_2_3);
		
		JButton btn_3_2 = new JButton("Add to cart");
		btn_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!txt_5.getText().isBlank()) {
					String name = lbl_5.getText();
					double price = Double.parseDouble(lbl_5_5.getText());
					String size =(String)cmb_5.getSelectedItem().toString();
					int number =Integer.parseInt(txt_5.getText());
					ProductControl2 p = new ProductControl2();
					Added_product newpro = new Added_product(name, price, size, number);
					//p.addProduct(newpro); //true
					boolean result = p.addProduct(newpro);
					if(result) { 
						JOptionPane.showMessageDialog(null, "Successfully added");}
					else 
						JOptionPane.showMessageDialog(null, "Sorry there is a problem");
				}else   JOptionPane.showMessageDialog(null, "Please type in product number ");
				
			}
		});
		btn_3_2.setBackground(new Color(255, 140, 0));
		btn_3_2.setBounds(459, 94, 131, 42);
		panel_7.add(btn_3_2);
		
		JPanel panel_1 = new JPanel();
		getTabbedPane().addTab("New tab", null, panel_1, null);
		panel_1.setLayout(null);
		
		JComboBox cmb_1 = new JComboBox();
		cmb_1.setModel(new DefaultComboBoxModel(new String[] {"Big ", "Medium", "Small"}));
		cmb_1.setBounds(327, 96, 68, 22);
		panel_1.add(cmb_1);
		
		
		
		JButton btn_buy_2_2 = new JButton("Buy");
		btn_buy_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showConfirmDialog(null, "Do you want to buy?", "Авах" , JOptionPane.YES_NO_CANCEL_OPTION);
			}
		});
		btn_buy_2_2.setBackground(new Color(102, 205, 170));
		btn_buy_2_2.setBounds(457, 47, 131, 42);
		panel_1.add(btn_buy_2_2);
		
		txt_1 = new JTextField();
		txt_1.setColumns(10);
		txt_1.setBounds(327, 122, 77, 20);
		panel_1.add(txt_1);
		
		JLabel lblNewLabel_2_1_1_1_1_2 = new JLabel("Number:");
		lblNewLabel_2_1_1_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2_1_1_1_1_2.setBounds(241, 125, 86, 14);
		panel_1.add(lblNewLabel_2_1_1_1_1_2);
		
		JLabel lblNewLabel_2_1_1_2_2 = new JLabel("Size:");
		lblNewLabel_2_1_1_2_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2_1_1_2_2.setBounds(240, 100, 105, 14);
		panel_1.add(lblNewLabel_2_1_1_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("Price:");
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2_3.setBounds(241, 75, 86, 14);
		panel_1.add(lblNewLabel_2_3);
		
		JLabel lbl_1_2 = new JLabel("");
		lbl_1_2.setBounds(327, 75, 105, 14);
		panel_1.add(lbl_1_2);
		
		JLabel lbl_1_1 = new JLabel("");
		lbl_1_1.setBounds(327, 50, 105, 14);
		panel_1.add(lbl_1_1);
		
		JLabel lblNewLabel_2_2_2 = new JLabel("Product:");
		lblNewLabel_2_2_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2_2_2.setBounds(241, 50, 86, 14);
		panel_1.add(lblNewLabel_2_2_2);
		
		JLabel lbl_pic_2_2 = new JLabel("");
		lbl_pic_2_2.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\interior.PNG"));
		lbl_pic_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_pic_2_2.setBackground(new Color(144, 238, 144));
		lbl_pic_2_2.setBounds(32, 30, 146, 136);
		panel_1.add(lbl_pic_2_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		getTabbedPane().addTab("New tab", null, panel_2, null);
		
		JButton btnNewButton = new JButton("Buy products");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int songolt = JOptionPane.showConfirmDialog(null, "Are you sure to buy?", "Buy" , JOptionPane.YES_NO_CANCEL_OPTION);
			    if(songolt == 0) {
					int code = 1;
					ProductControl2 p = new ProductControl2();
					boolean result = p.deleteProduct(code);
							if(result)  
								JOptionPane.showMessageDialog(null, "You have successfully bought ");
							else 
								JOptionPane.showMessageDialog(null, "Sorry there is a problem");
			    }
			}
		});
		
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(20, 124, 180, 31);
		panel_2.add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("Products in cart");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(108, 11, 152, 14);
		panel_2.add(lblNewLabel_3);
		
		JButton btn_nemeh_hasah = new JButton("Edit");
		btn_nemeh_hasah.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ProductListFrame logframe = new ProductListFrame();
				 logframe.setVisible(true);
				
			}
		});
		btn_nemeh_hasah.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn_nemeh_hasah.setBounds(399, 124, 133, 31);
		panel_2.add(btn_nemeh_hasah);
		
		JButton btn_shinechleh = new JButton("Refresh");
		btn_shinechleh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					ProductControl proControl = new ProductControl();
					Product[] tempProduct = proControl.getProduct();
					DefaultTableModel model = (DefaultTableModel) table.getModel();
					model.setRowCount(0);
					for(int i=0; i<tempProduct.length; i++) {
						model.addRow(new Object[] {tempProduct[i].getPic(), tempProduct[i].getId(),tempProduct[i].getName(), tempProduct[i].getPrice()});
					}
					table.addRowSelectionInterval(0, 0);
				}
		});
		btn_shinechleh.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn_shinechleh.setBounds(542, 124, 133, 31);
		panel_2.add(btn_shinechleh);
		
		JLabel lblNewLabel_3_1 = new JLabel("Edit products");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3_1.setBounds(484, 11, 180, 14);
		panel_2.add(lblNewLabel_3_1);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(391, 30, 285, 83);
		panel_2.add(scrollPane_1);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"", "ID", "Name", "Price"
			}
		));
		scrollPane_1.setViewportView(table);
		
		
		
		//JLabel lblNewLabel_1 = new JLabel("");
		//lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\shopping.PNG"));
		//panel_1.add(lblNewLabel_1);
		
		JButton btn_search = new JButton("");
		btn_search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ProductControl proControl = new ProductControl();
				Product[] products = proControl.getProduct();
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.setRowCount(0);
				for(int i=0; i<products.length; i++) {
					if(products[i].getName().contains(txt_search.getText())) {
					model.addRow(new Object[] {products[i].getPic(), products[i].getId(),products[i].getName(), products[i].getPrice()});
					lbl_1_1.setText(products[i].getName());
					lbl_1_2.setText(String.valueOf(products[i].getPrice()));
				}
				} 
				txt_search.setText("");
				//table.addRowSelectionInterval(0, 0);
				
				
			}
				
		});
		btn_search.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\1.1.PNG"));
		btn_search.setBounds(657, 3, 24, 23);
		panel.add(btn_search);
		
		JLabel lblNewLabel = new JLabel("Search:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(525, 8, 46, 14);
		panel.add(lblNewLabel);
		
		JButton btn_home = new JButton("HOME");
		btn_home.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btn_home.setForeground(Color.BLACK);
		btn_home.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getTabbedPane().setSelectedIndex(0);
			}
		});
		btn_home.setBounds(0, 4, 89, 23);
		panel.add(btn_home);
		
		JButton btn_about = new JButton("ABOUT");
		btn_about.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btn_about.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Our services can approach you anything and give "
						                            + "    \n you satisfaction."
						                            +  "  Welcome to our application");
			}
		});
		btn_about.setBounds(94, 4, 89, 23);
		panel.add(btn_about);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\images.png"));
		lblNewLabel_1_1.setBounds(301, 31, 390, 140);
		panel.add(lblNewLabel_1_1);
		
		JPanel panel_8_1_1 = new JPanel();
		panel_8_1_1.setBackground(new Color(0, 206, 209));
		panel_8_1_1.setBounds(201, 37, 289, 123);
		panel.add(panel_8_1_1);
		panel_8_1_1.setLayout(null);
		
		JPanel panel_8_2 = new JPanel();
		panel_8_2.setBounds(140, 10, 1, 1);
		panel_8_2.setLayout(null);
		panel_8_2.setBackground(new Color(32, 178, 170));
		panel_8_1_1.add(panel_8_2);
		
		JPanel panel_8_1_1_2 = new JPanel();
		panel_8_1_1_2.setBackground(new Color(0, 128, 128));
		panel_8_1_1_2.setBounds(-75, 37, 300, 123);
		panel.add(panel_8_1_1_2);
		panel_8_1_1_2.setLayout(null);
		
		JPanel panel_8_2_2 = new JPanel();
		panel_8_2_2.setBounds(139, 5, 1, 1);
		panel_8_2_2.setLayout(null);
		panel_8_2_2.setBackground(new Color(32, 178, 170));
		panel_8_1_1_2.add(panel_8_2_2);
		
		JPanel panel_8_1 = new JPanel();
		panel_8_1.setBounds(174, 0, 303, 123);
		panel_8_1_1_2.add(panel_8_1);
		panel_8_1.setBackground(new Color(32, 178, 170));
		
		JPanel panel_8 = new JPanel();
		panel_8_1.add(panel_8);
		panel_8.setBackground(new Color(32, 178, 170));
		panel_8.setLayout(null);
		
		JButton btn_login_1 = new JButton("Sign up");
		btn_login_1.setBounds(421, 4, 89, 23);
		panel.add(btn_login_1);
		btn_login_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btn_login_1.setForeground(new Color(0, 0, 0));
		
		JButton btn_login = new JButton("Log in");
		btn_login.setBounds(337, 4, 83, 23);
		panel.add(btn_login);
		btn_login.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btn_login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_login.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				UserControlFrame logframe = new UserControlFrame();
				 logframe.setVisible(true);
			}
		});
		btn_login_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_login_1.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						UserFrame logframe = new UserFrame();
						 logframe.setVisible(true);
					}
				});
		
		JButton btn_huns = new JButton("Foods");
		btn_huns.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getTabbedPane().setSelectedIndex(1);
				
			}
		});
		btn_huns.setFont(new Font("Tahoma", Font.BOLD, 9));
		btn_huns.setBounds(0, 161, 95, 23);
		frmShoppingMall.getContentPane().add(btn_huns);
		
		JButton btn_goo = new JButton("Beauty");
		btn_goo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getTabbedPane().setSelectedIndex(2);
			}
		});
		btn_goo.setFont(new Font("Tahoma", Font.BOLD, 9));
		btn_goo.setBounds(93, 161, 103, 23);
		frmShoppingMall.getContentPane().add(btn_goo);
		
		JButton btn_Tsahilgaan = new JButton("Electronics");
		btn_Tsahilgaan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getTabbedPane().setSelectedIndex(3);
			}
		});
		btn_Tsahilgaan.setFont(new Font("Tahoma", Font.BOLD, 9));
		btn_Tsahilgaan.setBounds(190, 161, 146, 23);
		frmShoppingMall.getContentPane().add(btn_Tsahilgaan);
		
		JButton btn_huvtsas = new JButton(" Fashion ");
		btn_huvtsas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getTabbedPane().setSelectedIndex(4);
			}
		});
		btn_huvtsas.setFont(new Font("Tahoma", Font.BOLD, 9));
		btn_huvtsas.setBounds(334, 161, 95, 23);
		frmShoppingMall.getContentPane().add(btn_huvtsas);
		
		JButton btn_dotood = new JButton("House interior");
		btn_dotood.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getTabbedPane().setSelectedIndex(5);
			}
		});
		btn_dotood.setFont(new Font("Tahoma", Font.BOLD, 9));
		btn_dotood.setBounds(428, 161, 146, 23);
		frmShoppingMall.getContentPane().add(btn_dotood);
		
	    String result = String.valueOf(key);
	    //String result = "true";
		
		JButton btn_admin = new JButton("Admin page");
		btn_admin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getTabbedPane().setSelectedIndex(6);
				
			}	
		});
		btn_admin.setFont(new Font("Tahoma", Font.BOLD, 9));
		btn_admin.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Capture1.PNG"));
		btn_admin.setBounds(573, 161, 118, 23);
		frmShoppingMall.getContentPane().add(btn_admin);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 189, 681, 177);
		frmShoppingMall.getContentPane().add(scrollPane);
		
		JButton btn_add_2_2 = new JButton("Add to cart");
		btn_add_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!txt_1.getText().isBlank()) {
					String name = lbl_1_1.getText();
					double price = Double.parseDouble(lbl_1_2.getText());
					String size =(String)cmb_1.getSelectedItem().toString();
					int number =Integer.parseInt(txt_1.getText());
					ProductControl2 p = new ProductControl2();
					Added_product newpro = new Added_product(name, price, size, number);
					//p.addProduct(newpro); //true
					boolean result = p.addProduct(newpro);
					if(result) { 
						JOptionPane.showMessageDialog(null, "Successfully added");}
					else 
						JOptionPane.showMessageDialog(null, "Sorry there is a problem");
				}else   JOptionPane.showMessageDialog(null, "Please type in product number ");
			}
		});
		btn_add_2_2.setBackground(new Color(255, 140, 0));
		btn_add_2_2.setBounds(457, 97, 131, 42);
		panel_1.add(btn_add_2_2);
		
		JLabel lblNewLabel_2 = new JLabel("On this panel, you can buy the product you searched.");
		lblNewLabel_2.setBounds(219, 164, 303, 14);
		panel_1.add(lblNewLabel_2);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(10, 30, 345, 83);
		panel_2.add(scrollPane_2);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"Name", "Price", "Size", "Number"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, Double.class, String.class, Integer.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane_2.setViewportView(table_1);
		
		JButton btn_shinechleh_1 = new JButton("Refresh");
		btn_shinechleh_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ProductControl2 proControl = new ProductControl2();
				Added_product[] tempProduct = proControl.getProduct();
				DefaultTableModel model = (DefaultTableModel) table_1.getModel();
				model.setRowCount(0);
				for(int i=0; i<tempProduct.length; i++) {
					model.addRow(new Object[] {tempProduct[i].getName(), tempProduct[i].getPrice(),tempProduct[i].getSize(), tempProduct[i].getNumber()});
				}
				table.addRowSelectionInterval(0, 0);
			}
	});
		
		btn_shinechleh_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn_shinechleh_1.setBounds(210, 124, 133, 31);
		panel_2.add(btn_shinechleh_1);
		
		JButton btn_add_2_1 = new JButton("Add to card");
		btn_add_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!txt_2.getText().isBlank()) {
					String name = lbl_2.getText();
					double price = Double.parseDouble(lbl_2_2.getText());
					String size =(String)cmb_2.getSelectedItem().toString();
					int number =Integer.parseInt(txt_2.getText());
					ProductControl2 p = new ProductControl2();
					Added_product newpro = new Added_product(name, price, size, number);
					//p.addProduct(newpro); //true
					boolean result = p.addProduct(newpro);
					if(result) { 
						JOptionPane.showMessageDialog(null, "Successfully added");}
					else 
						JOptionPane.showMessageDialog(null, "Sorry there is a problem");
				}else   JOptionPane.showMessageDialog(null, "Please type in product number ");
				
			}
		});
		btn_add_2_1.setBackground(new Color(255, 140, 0));
		btn_add_2_1.setBounds(458, 95, 131, 42);
		panel_3.add(btn_add_2_1);
		
		
		
		
	}

	public JTabbedPane getTabbedPane() {
		return tabbedPane;
	}
}
