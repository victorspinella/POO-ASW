package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.FuncionarioController;
import controller.LoginController;

import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.JSplitPane;

import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginSenha extends JFrame {

	private JPanel contentPane;
	private JTextField txtLogin;
	private JPasswordField txtSenha;


	/**
	 * Create the frame.
	 */
	public LoginSenha() {
		setResizable(false);
		setTitle("LOGIN");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		contentPane.add(panel, gbc_panel);
		
		txtLogin = new JTextField();
		txtLogin.setBounds(125, 101, 201, 29);
		panel.add(txtLogin);
		txtLogin.setColumns(10);
		
		JLabel lblLogin = new JLabel("Nome");
		lblLogin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblLogin.setBounds(130, 73, 45, 13);
		panel.add(lblLogin);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSenha.setBounds(125, 137, 45, 13);
		panel.add(lblSenha);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		    login();
				
		
			}});
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnLogin.setBounds(107, 210, 85, 21);
		panel.add(btnLogin);
		
		txtSenha = new JPasswordField();
		txtSenha.setBounds(125, 161, 201, 29);
		panel.add(txtSenha);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(263, 211, 89, 23);
		panel.add(btnCancelar);
	}


	


	public JTextField getTxtLogin() {
		return txtLogin;
	}


	public void setTxtLogin(JTextField txtLogin) {
		this.txtLogin = txtLogin;
	}


	public JPasswordField getTxtSenha() {
		return txtSenha;
	}


	public void setTxtSenha(JPasswordField txtSenha) {
		this.txtSenha = txtSenha;
	}
	
	private void login () {
			
	try {   LoginController controller = new LoginController();
	    	ResultSet   login  =   controller.login(LoginSenha.this);
	if(  login.next()) {	
        int n = 1 ;	
		switch (n){	
			case 1 :
				MenuAdmin tela2 = new MenuAdmin();
				tela2.setVisible(true);
				dispose();
				break ;			
	}}
	
    else { JOptionPane.showMessageDialog(null,"login ou senha incorreto  "); 
    
    }}
	
	catch (Exception erro) {
	JOptionPane.showMessageDialog(null,"viewLogin "+erro);  
		
	
	}}}
