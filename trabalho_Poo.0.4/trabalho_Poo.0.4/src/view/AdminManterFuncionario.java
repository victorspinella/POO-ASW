package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.JTextComponent;


import controller.FuncionarioController;
import modelo.dao.FuncionarioDao;
import modelo.entidade.Funcionario;

import modelo.service.FuncionarioService ;

import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.DropMode;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;

public class AdminManterFuncionario extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtMatricula;
	private JTextField txtCargo;
	private JTextField txtSenha;
	private JTextField txtPesquisar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminManterFuncionario frame = new AdminManterFuncionario();
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
	public AdminManterFuncionario() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtMatricula = new JTextField();
		txtMatricula.setBounds(148, 113, 252, 20);
		txtMatricula.setDropMode(DropMode.INSERT);
		contentPane.add(txtMatricula);
		txtMatricula.setColumns(10);
		
		
		
		
		
		
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(72, 227, 79, 23);
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				 FuncionarioController controller = new FuncionarioController();
		         controller.executa(AdminManterFuncionario.this);
				
				
				
				
				
			}
		});
		btnSalvar.setVerticalAlignment(SwingConstants.TOP);
		contentPane.add(btnSalvar);
		
		
		
		
		
		
		
		
		
		
		txtNome = new JTextField();
		txtNome.setBounds(148, 82, 252, 20);
		txtNome.setDropMode(DropMode.INSERT);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setBounds(55, 83, 46, 14);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Matricula");
		lblNewLabel_1.setBounds(43, 114, 80, 14);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(lblNewLabel_1);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setBounds(192, 227, 73, 23);
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				 FuncionarioController controller = new FuncionarioController();
		         controller.editar (AdminManterFuncionario.this);	
				
				
				
			}
		});
		contentPane.add(btnEditar);
		
		JLabel lblNewLabel_2 = new JLabel("Cargo");
		lblNewLabel_2.setBounds(55, 139, 46, 23);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(lblNewLabel_2);
		
		txtCargo = new JTextField();
		txtCargo.setBounds(148, 144, 252, 20);
		contentPane.add(txtCargo);
		txtCargo.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Senha");
		lblNewLabel_3.setBounds(55, 176, 46, 14);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(lblNewLabel_3);		
		
		txtSenha = new JTextField();
		txtSenha.setBounds(148, 175, 252, 20);
		contentPane.add(txtSenha);
		txtSenha.setColumns(10);
		
		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.setBounds(345, 11, 79, 23);
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			
				
		try {		
			 
			  FuncionarioController controller = new FuncionarioController();
	          Funcionario f =	  controller.pesquisar (AdminManterFuncionario.this);
	          
	          if( f== null) { 
	        	  JOptionPane.showMessageDialog(null,"nao encontrado");  
	        	  	 
	        	  
	          }else {  
		         
		      txtNome.setText(f.getNome());
		      txtMatricula.setText(String.valueOf(f.getMatricula()));
		      txtCargo.setText(f.getCargo());
		      txtSenha.setText(f.getSenha());
		         
		         
		         
	          }}	catch (Exception erro) {
			JOptionPane.showMessageDialog(null,"manter funcionario"+erro);  
			
			
		} 
		     
		      	
		       
				
				
			}
		});
		contentPane.add(btnPesquisar);
		
		txtPesquisar = new JTextField();
		txtPesquisar.setBounds(231, 11, 104, 22);
		contentPane.add(txtPesquisar);
		txtPesquisar.setColumns(10);
		
		JButton btnNewButton = new JButton("Deletar");
		btnNewButton.setBounds(335, 227, 89, 23);
		btnNewButton.setForeground(Color.RED);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				 FuncionarioController controller = new FuncionarioController();
		         controller.deleta(AdminManterFuncionario.this);
		         
		         txtNome.setText("");
			     txtMatricula.setText("");
			     txtCargo.setText("");
			     txtSenha.setText("");
		         
		         
			
			
			
			
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(btnNewButton);
		
		
		
		JLabel lblNewLabel_4 = new JLabel("Ensira a matricula");
		lblNewLabel_4.setBounds(100, 11, 134, 19);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(lblNewLabel_4);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(0, 11, 89, 23);
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				MenuAdmin tela2 = new MenuAdmin();
				tela2.setVisible(true);
				dispose();
			
				
			}
		});
		contentPane.add(btnVoltar);
	}

	
	

	public JTextField getTxtNome() {
		return txtNome;
	}

	public void setTxtNome(JTextField txtNome) {
		this.txtNome = txtNome;
	}

	public JTextField getTxtMatricula() {
		return txtMatricula;
	}

	public void setTxtMatricula(JTextField txtMatricula) {
		this.txtMatricula = txtMatricula;
	}

	public JTextField getTxtCargo() {
		return txtCargo;
	}

	public void setTxtCargo(JTextField txtCargo) {
		this.txtCargo = txtCargo;
	}

	public JTextField getTxtSenha() {
		return txtSenha;
	}

	public void setTxtSenha(JTextField txtSenha) {
		this.txtSenha = txtSenha;
	}

	public JTextField getTxtPesquisar() {
		return txtPesquisar;
	}

	public void setTxtPesquisar(JTextField txtPesquisar) {
		this.txtPesquisar = txtPesquisar;
	}
}
