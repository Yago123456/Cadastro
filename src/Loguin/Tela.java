package Loguin;


import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class Tela extends JFrame {

	private JPanel contentPane;
	private JButton btSign;
	private JTextField txtLoguin;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela frame = new Tela();
					frame.setVisible(true);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	 
	public Tela() {
		setTitle("Login Maromba Rei");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\aluno\\Desktop\\Jogo html\\icons8_triceps_32.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 604, 423);
		contentPane = new JPanel();
		contentPane.setForeground(SystemColor.textHighlight);
		contentPane.setBackground(new Color(0, 51, 51));
		contentPane.setToolTipText("     Username");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel label = new JLabel("");
		
		JLabel lblUser = new JLabel("");
		lblUser.setIcon(new ImageIcon("C:\\Users\\aluno\\Desktop\\Jogo html\\icons8_gender_neutral_user_32.png"));
		
		JLabel lblEfw = new JLabel("");
		lblEfw.setForeground(SystemColor.textHighlight);
		lblEfw.setIcon(new ImageIcon("C:\\Users\\aluno\\Desktop\\Jogo html\\icons8_lock_32.png"));
		
		btSign = new JButton("Login");
		btSign.setToolTipText("Clique Para Logar");
		btSign.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtLoguin.getText().equals("admin") && passwordField.getText().equals("123")) {
					JOptionPane.showMessageDialog(null,"Conectado com sucesso!");
					 Fornecedores f = new Fornecedores();
					f.setVisible (true);
					dispose ();
				
					
				} else {
					JOptionPane.showMessageDialog(null,"Usuario Ou Senha Invalido");
					 
					txtLoguin.setText("");
					passwordField.setText("");
				}
			}
		});
		btSign.setForeground(SystemColor.menu);
		btSign.setBackground(SystemColor.textHighlight);
		btSign.setFont(new Font("Calibri", Font.ITALIC, 15));
		
		
		
		JRadioButton rdbtnRadion = new JRadioButton("Remember me");
		rdbtnRadion.setToolTipText("Me Lembre");
		rdbtnRadion.setFont(new Font("Tahoma", Font.ITALIC, 11));
		rdbtnRadion.setBackground(new Color(0, 51, 51));
		rdbtnRadion.setForeground(SystemColor.menu);
		
		JLabel lbFaca = new JLabel("Fa\u00E7a o Login");
		lbFaca.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbFaca.setForeground(SystemColor.textHighlight);
		
		JButton btesqueceu = new JButton("Criar Conta");
		btesqueceu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Crie sua conta");
		         Fornecedores f = new Fornecedores();
				f.setVisible(true);
				dispose();
						
				
			}
		});
		btesqueceu.setToolTipText("Esqueceu a Senha?");
		btesqueceu.setFont(new Font("Calibri", Font.ITALIC, 15));
		btesqueceu.setBackground(SystemColor.textHighlight);
		btesqueceu.setForeground(SystemColor.menu);
		
		txtLoguin = new JTextField();
		txtLoguin.setDisabledTextColor(SystemColor.textHighlight);
		txtLoguin.setCaretColor(SystemColor.textHighlight);
		txtLoguin.setToolTipText("Digite Seu Login");
		txtLoguin.setBorder(null);
		txtLoguin.setBackground(new Color(0, 51, 51));
		txtLoguin.setForeground(SystemColor.textHighlight);
		txtLoguin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtLoguin.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setCaretColor(SystemColor.textHighlight);
		passwordField.setDisabledTextColor(SystemColor.textHighlight);
		passwordField.setForeground(SystemColor.textHighlight);
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		passwordField.setBorder(null);
		passwordField.setBackground(new Color(0, 51, 51));
		passwordField.setToolTipText("Digite Sua Senha");
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPassword.setForeground(SystemColor.textHighlight);
		lblPassword.setBackground(SystemColor.textHighlight);
		
		JLabel lblUsername = new JLabel("Username :");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUsername.setForeground(SystemColor.textHighlight);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(78)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(label))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(76)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblUser)
										.addComponent(lblEfw))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(lblPassword)
										.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
										.addComponent(txtLoguin, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblUsername)))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addComponent(btSign, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
										.addComponent(rdbtnRadion))
									.addGap(28)
									.addComponent(btesqueceu, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)))))
					.addGap(177))
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addGap(169)
					.addComponent(lbFaca, GroupLayout.PREFERRED_SIZE, 329, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(151, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(34)
					.addComponent(lbFaca, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addGap(28)
					.addComponent(lblUsername)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(txtLoguin, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
							.addComponent(label)
							.addComponent(lblUser, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
					.addGap(16)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblEfw)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblPassword)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)))
					.addGap(26)
					.addComponent(rdbtnRadion)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btSign)
						.addComponent(btesqueceu, GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
					.addGap(67))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
