package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.JLabel;

public class AdminManterCategoria extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminManterCategoria frame = new AdminManterCategoria();
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
	public AdminManterCategoria() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(32, 220, 89, 23);
		contentPane.add(btnSalvar);
		
		textField = new JTextField();
		textField.setBounds(78, 124, 328, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(75, 166, 328, 43);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setBounds(168, 220, 89, 23);
		contentPane.add(btnEditar);
		
		JButton btnDelatar = new JButton("Deletar");
		btnDelatar.setForeground(new Color(255, 0, 0));
		btnDelatar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDelatar.setBounds(335, 220, 89, 23);
		contentPane.add(btnDelatar);
		
		JCheckBox chckbxA = new JCheckBox("A");
		chckbxA.setBounds(75, 59, 46, 23);
		contentPane.add(chckbxA);
		
		JCheckBox chckbxB = new JCheckBox("B");
		chckbxB.setBounds(160, 59, 46, 23);
		contentPane.add(chckbxB);
		
		JCheckBox chckbxC = new JCheckBox("C");
		chckbxC.setBounds(234, 59, 38, 23);
		contentPane.add(chckbxC);
		
		JLabel lblNewLabel = new JLabel("Nome :");
		lblNewLabel.setBounds(19, 127, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblDescriçao = new JLabel("Descri\u00E7ao");
		lblDescriçao.setBounds(19, 165, 46, 14);
		contentPane.add(lblDescriçao);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(109, 9, 97, 26);
		contentPane.add(lblNome);
		
		textField_2 = new JTextField();
		textField_2.setBounds(161, 12, 143, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPesquisar.setBounds(335, 11, 89, 23);
		contentPane.add(btnPesquisar);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(10, 11, 65, 23);
		contentPane.add(btnVoltar);
	}
}
