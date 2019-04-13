package Loguin;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButton;

public class Cadastro extends JFrame {
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField txtAdicionarFuncionario;
	private JTextField txtIdade;
	private JTextField txtEmail;
	private JTextField txtCPF;
	private JTextField txtRG;
	private JTextField txtANO;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField txtRSP;
	private JTextField txtCEP;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastro frame = new Cadastro();
					frame.setVisible(true);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Cadastro() {
		getContentPane().setBackground(Color.WHITE);
		setTitle("Cadastro de Funcionarios ");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\aluno\\Desktop\\Jogo html\\icons8_triceps_16.png"));
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setForeground(SystemColor.textHighlight);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.textHighlight);
		
		JLabel lblCargo = new JLabel("Cargo:");
		lblCargo.setForeground(SystemColor.textHighlight);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setForeground(SystemColor.textHighlight);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		JLabel lblIdade = new JLabel("Idade:");
		lblIdade.setForeground(SystemColor.textHighlight);
		
		JSpinner spinner = new JSpinner();
		
		JLabel lblSalario = new JLabel("CPF:");
		lblSalario.setForeground(SystemColor.textHighlight);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		JLabel lblCpf = new JLabel("Salario:");
		lblCpf.setForeground(SystemColor.textHighlight);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		
		txtAdicionarFuncionario = new JTextField();
		txtAdicionarFuncionario.setForeground(SystemColor.textHighlight);
		txtAdicionarFuncionario.setText("Adicionar Funcionario");
		txtAdicionarFuncionario.setColumns(10);
		
		JButton btnCancelarCadastro = new JButton("Cancelar Cadastro");
		
	
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(SystemColor.textHighlight);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.activeCaption);
			
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 718, 512);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setForeground(SystemColor.textHighlight);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setForeground(SystemColor.textHighlight);
		
		JLabel lblNewLabel_2 = new JLabel("E-mail:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setForeground(SystemColor.textHighlight);
		
		JLabel lblCpf_1 = new JLabel("CPF:");
		lblCpf_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCpf_1.setForeground(SystemColor.textHighlight);
		
		JLabel lblIdade_1 = new JLabel("Idade:");
		lblIdade_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblIdade_1.setForeground(SystemColor.textHighlight);
		
		JTextField txtNome = new JTextField();
		txtNome.setColumns(10);
		
		txtIdade = new JTextField();
		txtIdade.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		
		txtCPF = new JTextField();
		txtCPF.setColumns(10);
		
		txtRG = new JTextField();
		txtRG.setColumns(10);
		
		JButton btnAdicionarFuncionario = new JButton("Enviar Formulario");
		btnAdicionarFuncionario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
		    JOptionPane.showMessageDialog(null, "Seu Formulario foi enviado");
				txtNome.setText(null);
				txtIdade.setText(null);
				txtEmail.setText(null);				
				txtCPF.setText(null);
				txtRG.setText(null);
		        txtCEP.setText(null);
				
				
			}
		});
		btnAdicionarFuncionario.setIcon(new ImageIcon("C:\\Users\\aluno\\Desktop\\Jogo html\\system_task_25px.png"));
		btnAdicionarFuncionario.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAdicionarFuncionario.setBackground(Color.WHITE);
		btnAdicionarFuncionario.setForeground(SystemColor.textHighlight);
		
		JButton btnNewButton = new JButton("Cancelar");
		btnNewButton.setBackground(SystemColor.text);
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\aluno\\Desktop\\Jogo html\\login_rounded_right_25px.png"));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Você voltou para tela inicial");
			    Tela t = new Tela();
			    t.setVisible(rootPaneCheckingEnabled);
				dispose();
			
			}
		});
		btnNewButton.setForeground(SystemColor.textHighlight);
		
		JLabel lblCargo_1 = new JLabel("Cargo:");
		lblCargo_1.setForeground(SystemColor.textHighlight);
		lblCargo_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblFormularioDeFuncionario = new JLabel("F\u00F3rmulario de Funcion\u00E1rio");
		lblFormularioDeFuncionario.setForeground(SystemColor.textHighlight);
		lblFormularioDeFuncionario.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBox.setBorder(null);
		comboBox.setBackground(SystemColor.text);
		comboBox.setForeground(SystemColor.textHighlight);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Faxineira", "Caixa", "Instrutor ", "Personal", "Financeiro", "Ajudante", "Mentor", "Jovem Aprendiz", "Temporario"}));
		
		JLabel lblRg = new JLabel("RG:");
		lblRg.setForeground(SystemColor.textHighlight);
		lblRg.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 153, 204));
		
		JMenu menu = new JMenu("Configura\u00E7\u00F5es:");
		menu.setIcon(new ImageIcon("C:\\Users\\aluno\\Desktop\\Jogo html\\api_settings_25px.png"));
		menu.setBorder(null);
		panel_2.add(menu);
		
		JLabel label = new JLabel("");
		menu.add(label);
		
		JLabel label_1 = new JLabel("");
		panel_2.add(label_1);
		
		JLabel label_2 = new JLabel("");
		panel_2.add(label_2);
		
		JMenu menu_1 = new JMenu("Financeiro:");
		menu_1.setIcon(new ImageIcon("C:\\Users\\aluno\\Desktop\\Jogo html\\launchpad_25px.png"));
		menu_1.setForeground(Color.BLACK);
		menu_1.setBorder(null);
		panel_2.add(menu_1);
		
		JMenu menu_2 = new JMenu("Lucro do Ano");
		menu_1.add(menu_2);
		
		txtANO = new JTextField();
		txtANO.setColumns(10);
		menu_2.add(txtANO);
		
		JMenu menu_3 = new JMenu("Lucro do M\u00EAs");
		menu_1.add(menu_3);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		menu_3.add(textField_11);
		
		JMenu menu_4 = new JMenu("Lucro do Dia");
		menu_1.add(menu_4);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		menu_4.add(textField_12);
		
		JMenu menu_5 = new JMenu("Funcionarios:");
		menu_5.setIcon(new ImageIcon("C:\\Users\\aluno\\Desktop\\Jogo html\\user_group_man_man_25px.png"));
		menu_5.setBorder(null);
		panel_2.add(menu_5);
		
		JMenu menu_6 = new JMenu("Professores");
		menu_5.add(menu_6);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		menu_6.add(textField_13);
		
		JMenu menu_7 = new JMenu("Supervisores");
		menu_5.add(menu_7);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		menu_7.add(textField_14);
		
		JMenu menu_8 = new JMenu("Caixa");
		menu_5.add(menu_8);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		menu_8.add(textField_15);
		
		JMenu menu_9 = new JMenu("Financeiro");
		menu_5.add(menu_9);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		menu_9.add(textField_16);
		
		JMenu menu_10 = new JMenu("Or\u00E7amento");
		menu_10.setIcon(new ImageIcon("C:\\Users\\aluno\\Desktop\\Jogo html\\cydia_25px.png"));
		menu_10.setBorder(null);
		panel_2.add(menu_10);
		
		JMenu menu_11 = new JMenu("Bolsa");
		menu_10.add(menu_11);
		
		JLabel label_3 = new JLabel("100 b/m");
		menu_11.add(label_3);
		
		JMenu menu_12 = new JMenu("\u00C1gua/M");
		menu_10.add(menu_12);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		menu_12.add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		menu_12.add(textField_18);
		
		JMenu menu_13 = new JMenu("Luz/M");
		menu_10.add(menu_13);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		menu_13.add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		menu_13.add(textField_20);
		
		JMenuBar menuBar = new JMenuBar();
		menu_13.add(menuBar);
		
		JMenu menu_14 = new JMenu("Aparelhos");
		menu_10.add(menu_14);
		
		JMenu menu_15 = new JMenu("Quebrados");
		menu_14.add(menu_15);
		
		JMenu menu_16 = new JMenu("Necessarios");
		menu_15.add(menu_16);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		menu_15.add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		menu_15.add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setColumns(10);
		menu_15.add(textField_23);
		
		textField_24 = new JTextField();
		textField_24.setColumns(10);
		menu_15.add(textField_24);
		
		JMenuBar menuBar_1 = new JMenuBar();
		menu_15.add(menuBar_1);
		
		JMenuBar menuBar_2 = new JMenuBar();
		menu_15.add(menuBar_2);
		
		textField_25 = new JTextField();
		textField_25.setColumns(10);
		menu_14.add(textField_25);
		
		textField_26 = new JTextField();
		textField_26.setColumns(10);
		menu_14.add(textField_26);
		
		textField_27 = new JTextField();
		textField_27.setColumns(10);
		menu_14.add(textField_27);
		
		JMenuBar menuBar_3 = new JMenuBar();
		menu_14.add(menuBar_3);
		
		JMenu menu_17 = new JMenu("Relatorio");
		menu_17.setIcon(new ImageIcon("C:\\Users\\aluno\\Desktop\\Jogo html\\services_25px.png"));
		menu_17.setBorder(null);
		panel_2.add(menu_17);
		
		JMenu menu_18 = new JMenu("Produ\u00E7\u00E3o");
		menu_17.add(menu_18);
		
		textField_28 = new JTextField();
		textField_28.setColumns(10);
		menu_18.add(textField_28);
		
		JMenu menu_19 = new JMenu("Gastos");
		menu_17.add(menu_19);
		
		textField_29 = new JTextField();
		textField_29.setColumns(10);
		menu_19.add(textField_29);
		
		JMenu menu_20 = new JMenu("Analise Financeira");
		menu_17.add(menu_20);
		
		textField_30 = new JTextField();
		textField_30.setColumns(10);
		menu_20.add(textField_30);
		
		JLabel label_4 = new JLabel("");
		panel_2.add(label_4);
		
		JLabel lblResponda = new JLabel("Responda:");
		lblResponda.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblResponda.setForeground(SystemColor.textHighlight);
		lblResponda.setBackground(SystemColor.textHighlight);
		
		txtRSP = new JTextField();
		txtRSP.setCaretColor(SystemColor.textHighlight);
		txtRSP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtRSP.setText(null);
			}
		});
		txtRSP.setBackground(SystemColor.text);
		txtRSP.setForeground(SystemColor.textHighlight);
		txtRSP.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtRSP.setText("                     O que faria pela Empresa?");
		txtRSP.setColumns(10);
		
		JLabel lblCep = new JLabel("CEP:");
		lblCep.setForeground(SystemColor.textHighlight);
		lblCep.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		txtCEP = new JTextField();
		txtCEP.setColumns(10);
		
		JLabel lblFolga = new JLabel("Folga:");
		lblFolga.setForeground(SystemColor.textHighlight);
		lblFolga.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBorder(null);
		comboBox_1.setBackground(SystemColor.text);
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBox_1.setForeground(SystemColor.textHighlight);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"1 dia", "2 dias", "3 dias", "4 dias", "1 semana"}));
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 219, GroupLayout.PREFERRED_SIZE)
					.addGap(28)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
							.addGroup(groupLayout.createSequentialGroup()
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
									.addGroup(groupLayout.createSequentialGroup()
										.addGap(18)
										.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
											.addComponent(lblNewLabel)
											.addComponent(lblIdade_1)
											.addComponent(lblNewLabel_2)
											.addComponent(lblFolga))
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
											.addGroup(groupLayout.createSequentialGroup()
												.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
													.addComponent(txtNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
													.addComponent(txtIdade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
												.addGap(47))
											.addGroup(groupLayout.createSequentialGroup()
												.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
													.addComponent(comboBox_1, Alignment.LEADING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
													.addComponent(txtEmail, Alignment.LEADING))
												.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(lblNewLabel_1)
												.addGap(66))))
									.addGroup(groupLayout.createSequentialGroup()
										.addGap(29)
										.addComponent(btnAdicionarFuncionario)
										.addPreferredGap(ComponentPlacement.RELATED)))
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
									.addGroup(groupLayout.createSequentialGroup()
										.addGap(2)
										.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
											.addGroup(groupLayout.createSequentialGroup()
												.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
													.addComponent(lblCpf_1)
													.addComponent(lblRg))
												.addGap(18)
												.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
													.addComponent(txtCPF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
													.addComponent(txtRG, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
											.addGroup(groupLayout.createSequentialGroup()
												.addComponent(lblCep)
												.addGap(18)
												.addComponent(txtCEP, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
											.addGroup(groupLayout.createSequentialGroup()
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(lblCargo_1)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(comboBox, 0, 0, Short.MAX_VALUE))))
									.addGroup(groupLayout.createSequentialGroup()
										.addGap(54)
										.addComponent(btnNewButton)))
								.addGap(862))
							.addGroup(groupLayout.createSequentialGroup()
								.addGap(88)
								.addComponent(lblFormularioDeFuncionario)
								.addContainerGap()))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(38)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(txtRSP, GroupLayout.PREFERRED_SIZE, 375, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblResponda))
							.addGap(841))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(51)
					.addComponent(lblFormularioDeFuncionario)
					.addGap(34)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(txtNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCpf_1, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtCPF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
									.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
									.addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblNewLabel_1))
							.addGap(103))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblIdade_1)
								.addComponent(txtIdade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblRg)
								.addComponent(txtRG, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(21)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblCep)
								.addComponent(txtCEP, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblCargo_1)
								.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblFolga)
								.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(60)))
					.addPreferredGap(ComponentPlacement.RELATED, 5, Short.MAX_VALUE)
					.addComponent(txtRSP, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
					.addGap(30)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnAdicionarFuncionario)
						.addComponent(btnNewButton))
					.addGap(21))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(291, Short.MAX_VALUE)
					.addComponent(lblResponda)
					.addGap(144))
				.addComponent(panel_2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
		);
		getContentPane().setLayout(groupLayout);
		
		JMenuBar menuBar_4 = new JMenuBar();
		setJMenuBar(menuBar_4);
		
		JMenu mnCadastroDeFuncionarios = new JMenu("Cadastro de Funcionarios:");
		mnCadastroDeFuncionarios.setForeground(SystemColor.textHighlight);
		menuBar_4.add(mnCadastroDeFuncionarios);
		
		JMenuItem mntmHome = new JMenuItem("Home");
		mntmHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tela t = new Tela();
				t.setVisible(true);
				dispose();
			}
		});
		mnCadastroDeFuncionarios.add(mntmHome);
		
		JMenuItem mntmAluno = new JMenuItem("Alunos");
		mntmAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Fornecedores f = new Fornecedores();
				f.setVisible(true);
				dispose();
			}
		});
		mnCadastroDeFuncionarios.add(mntmAluno);
		
		JMenuItem mntmFornecedores = new JMenuItem("Funcionarios");
		mntmFornecedores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mnCadastroDeFuncionarios.add(mntmFornecedores);
		
		JMenuItem mntmCancelar = new JMenuItem("Cancelar");
		mntmCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		mnCadastroDeFuncionarios.add(mntmCancelar);
		
		JMenu mnSexo = new JMenu("Sexo:");
		menuBar_4.add(mnSexo);
		
		JRadioButton rdbtnMasculino = new JRadioButton("Masculino");
		mnSexo.add(rdbtnMasculino);
		
		JRadioButton rdbtnFeminino = new JRadioButton("Feminino");
		mnSexo.add(rdbtnFeminino);
	}
}
