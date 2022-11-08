package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Color;

public class SelecioneCategoria extends JFrame {

	private JPanel contentPane;



	/**
	 * Create the frame.
	 */
	public SelecioneCategoria() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(10, 223, 69, 27);
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuPrincipal menu = new MenuPrincipal();
				menu.setVisible(true);
				dispose();
			}
		});
		contentPane.setLayout(null);
		btnVoltar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(btnVoltar);
		
		JPanel panel = new JPanel();
		panel.setBounds(253, 23, 1, 1);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnPremium = new JButton("Premium");
		btnPremium.setForeground(new Color(0, 128, 255));
		btnPremium.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnPremium.setBounds(140, 66, 216, 23);
		contentPane.add(btnPremium);
		
		JButton btnGold = new JButton("Gold");
		btnGold.setForeground(new Color(0, 0, 255));
		btnGold.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnGold.setBounds(140, 124, 216, 23);
		contentPane.add(btnGold);
		
		JButton btnPlatinum = new JButton("Platinum");
		btnPlatinum.setForeground(new Color(0, 0, 255));
		btnPlatinum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPlatinum.setBounds(140, 175, 216, 23);
		contentPane.add(btnPlatinum);
		
		JLabel lblNewLabel = new JLabel("  Selecione sua categoria");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel.setBounds(140, 11, 216, 32);
		contentPane.add(lblNewLabel);
	}
}
