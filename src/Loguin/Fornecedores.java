package Loguin;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.SystemColor;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JToolBar;
import java.awt.Window.Type;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JInternalFrame;
import java.awt.Font;
import javax.swing.JTree;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Fornecedores extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtCity;
	private JTextField txtR;
	private JTextField txtNsc;
	private JTextField txtCp;
	private JTextField txtBRR;
	private JTextField txtCF;
	private JTextField txtIDD;
	private JTextField txtCLL;
	private JTextField txtEma;
	private final JLabel label = new JLabel("New label");
	private JTextField textField_10;
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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fornecedores frame = new Fornecedores();
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
	public Fornecedores() {
		setFont(new Font("Constantia", Font.BOLD, 13));
		setTitle("Maromba Rei");
		setIconImage(
				Toolkit.getDefaultToolkit().getImage("C:\\Users\\aluno\\Desktop\\Jogo html\\icons8_triceps_32.png"));
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 747, 473);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnCD = new JMenu("Cadastro dos Alunos:");
		mnCD.setForeground(SystemColor.textHighlight);
		menuBar.add(mnCD);

		JMenuItem mntmCancelar = new JMenuItem("Home");
		mntmCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tela t = new Tela();
				t.setVisible(true);
				dispose();

			}
		});
		mnCD.add(mntmCancelar);

		JMenuItem mntmFuncionarios = new JMenuItem("Funcionarios");
		mntmFuncionarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cadastro c = new Cadastro();
				c.setVisible(true);
				dispose();
			}
		});
		
		JMenuItem mntmAlunos = new JMenuItem("Alunos");
		mntmAlunos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Fornecedores f = new Fornecedores();
				f.setVisible(true);
				
			}
		});
		mnCD.add(mntmAlunos);
		mnCD.add(mntmFuncionarios);

		JMenuItem mntmCancelar_1 = new JMenuItem("Cancelar");
		mnCD.add(mntmCancelar_1);

		JMenu mnSexo = new JMenu("Sexo:");
		menuBar.add(mnSexo);

		JRadioButton rdbtnMasculino = new JRadioButton("Masculino");
		mnSexo.add(rdbtnMasculino);

		JRadioButton rdbtnFeminino = new JRadioButton("Feminino");
		mnSexo.add(rdbtnFeminino);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setForeground(SystemColor.text);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(221, 60, 48, 14);
		lblNome.setForeground(SystemColor.textHighlight);

		JLabel lblEmpresa = new JLabel("Bairro:");
		lblEmpresa.setBounds(427, 67, 44, 14);
		lblEmpresa.setForeground(SystemColor.textHighlight);

		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setBounds(221, 98, 54, 14);
		lblCidade.setForeground(SystemColor.textHighlight);

		JLabel lblRg = new JLabel("RG:");
		lblRg.setBounds(221, 129, 40, 14);
		lblRg.setForeground(SystemColor.textHighlight);

		JLabel lblNascimento = new JLabel("Nascimento:");
		lblNascimento.setBounds(202, 160, 73, 14);
		lblNascimento.setForeground(SystemColor.textHighlight);

		JCheckBox chckbxAtivo = new JCheckBox("Ativo");
		chckbxAtivo.setBounds(246, 226, 73, 23);
		chckbxAtivo.setForeground(SystemColor.textHighlight);

		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(427, 98, 44, 14);
		lblCpf.setForeground(SystemColor.textHighlight);

		JLabel lblProduto = new JLabel("Idade:");
		lblProduto.setBounds(427, 129, 55, 14);
		lblProduto.setForeground(SystemColor.textHighlight);

		JLabel lblCelular = new JLabel("Celular:");
		lblCelular.setBounds(427, 160, 55, 14);
		lblCelular.setForeground(SystemColor.textHighlight);

		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(427, 191, 55, 14);
		lblEmail.setForeground(SystemColor.textHighlight);

		JLabel lblCep = new JLabel("CEP:");
		lblCep.setBounds(231, 191, 30, 14);
		lblCep.setForeground(SystemColor.textHighlight);

		txtName = new JTextField();
		txtName.setBounds(279, 57, 86, 20);
		txtName.setColumns(10);

		txtCity = new JTextField();
		txtCity.setBounds(279, 95, 86, 20);
		txtCity.setColumns(10);

		txtR = new JTextField();
		txtR.setBounds(279, 126, 86, 20);
		txtR.setColumns(10);

		txtNsc = new JTextField();
		txtNsc.setBounds(279, 157, 86, 20);
		txtNsc.setColumns(10);

		txtCp = new JTextField();
		txtCp.setBounds(279, 188, 86, 20);
		txtCp.setColumns(10);

		txtBRR = new JTextField();
		txtBRR.setBounds(492, 64, 86, 20);
		txtBRR.setColumns(10);

		txtCF = new JTextField();
		txtCF.setBounds(492, 95, 86, 20);
		txtCF.setColumns(10);

		txtIDD = new JTextField();
		txtIDD.setBounds(492, 126, 86, 20);
		txtIDD.setColumns(10);

		txtCLL = new JTextField();
		txtCLL.setBounds(492, 157, 86, 20);
		txtCLL.setColumns(10);

		txtEma = new JTextField();
		txtEma.setBounds(492, 188, 86, 20);
		txtEma.setColumns(10);

		JSpinner spinner = new JSpinner();
		spinner.setBounds(536, 226, 42, 20);

		JLabel lblFornecidos = new JLabel("Meses Frequentado:");
		lblFornecidos.setBounds(427, 224, 112, 27);
		lblFornecidos.setForeground(SystemColor.textHighlight);

		JButton btnAdicionar = new JButton("Adicionar Aluno");
		btnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				if (txtName.getText() == null || txtName.getText() == "") {
			    JOptionPane.showMessageDialog(null,"Favor Inserir Todos os Campos");
				
			}
				JOptionPane.showMessageDialog(null, "Aluno Adicionado");
			    txtName.setText(null);
				txtEma.setText(null);
				txtCLL.setText(null);
				txtIDD.setText(null);
				txtCF.setText(null);
		        txtCp.setText(null);
		        txtBRR.setText(null);
		        txtNsc.setText(null);
		        txtR.setText(null);
		        txtCity.setText(null);	
		        chckbxAtivo.setSelected(false);
		        spinner.setValue(0);
				}
		});
		btnAdicionar.setBounds(231, 267, 155, 33);
		btnAdicionar.setBackground(SystemColor.text);
		btnAdicionar.setForeground(SystemColor.textHighlight);
		btnAdicionar.setIcon(new ImageIcon("C:\\Users\\aluno\\Desktop\\Jogo html\\plus_25px.png"));

		JButton btnNewButton = new JButton("Procurar por Nome");
		btnNewButton.setBounds(427, 267, 155, 33);
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setForeground(SystemColor.textHighlight);
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\aluno\\Desktop\\Jogo html\\search_25px.png"));
		label.setBounds(147, 10, 0, 0);
		label.setIcon(new ImageIcon("C:\\Users\\aluno\\Desktop\\Jogo html\\services_25px.png"));
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 198, 413);
		panel.setBackground(new Color(0, 153, 204));
		contentPane.add(panel);

		JMenu mnConfiguraes = new JMenu("Configura\u00E7\u00F5es:");
		mnConfiguraes.setBorder(null);
		mnConfiguraes.setIcon(new ImageIcon("C:\\Users\\aluno\\Desktop\\Jogo html\\api_settings_25px.png"));
		panel.add(mnConfiguraes);

		JLabel label_5 = new JLabel("");
		mnConfiguraes.add(label_5);

		JLabel label_7 = new JLabel("");
		panel.add(label_7);

		JLabel label_6 = new JLabel("");
		panel.add(label_6);

		JMenu mnFinanceiro = new JMenu("Financeiro:");
		mnFinanceiro.setBorder(null);
		mnFinanceiro.setIcon(new ImageIcon("C:\\Users\\aluno\\Desktop\\Jogo html\\launchpad_25px.png"));
		mnFinanceiro.setForeground(new Color(0, 0, 0));
		panel.add(mnFinanceiro);

		JMenu mnLucroDoMs = new JMenu("Lucro do Ano");
		mnFinanceiro.add(mnLucroDoMs);

		textField_10 = new JTextField();
		mnLucroDoMs.add(textField_10);
		textField_10.setColumns(10);

		JMenu mnLucroDoDia = new JMenu("Lucro do M\u00EAs");
		mnFinanceiro.add(mnLucroDoDia);

		textField_11 = new JTextField();
		mnLucroDoDia.add(textField_11);
		textField_11.setColumns(10);

		JMenu mnLucroDoDia_1 = new JMenu("Lucro do Dia");
		mnFinanceiro.add(mnLucroDoDia_1);

		textField_12 = new JTextField();
		mnLucroDoDia_1.add(textField_12);
		textField_12.setColumns(10);

		JMenu mnFuncionarios = new JMenu("Funcionarios:");
		mnFuncionarios.setBorder(null);
		mnFuncionarios.setIcon(new ImageIcon("C:\\Users\\aluno\\Desktop\\Jogo html\\user_group_man_man_25px.png"));
		panel.add(mnFuncionarios);

		JMenu mnProfessores = new JMenu("Professores");
		mnFuncionarios.add(mnProfessores);

		textField_24 = new JTextField();
		mnProfessores.add(textField_24);
		textField_24.setColumns(10);

		JMenu mnSupervisores = new JMenu("Supervisores");
		mnFuncionarios.add(mnSupervisores);

		textField_25 = new JTextField();
		mnSupervisores.add(textField_25);
		textField_25.setColumns(10);

		JMenu mnCaixa = new JMenu("Caixa");
		mnFuncionarios.add(mnCaixa);

		textField_26 = new JTextField();
		mnCaixa.add(textField_26);
		textField_26.setColumns(10);

		JMenu mnFinanceiro_1 = new JMenu("Financeiro");
		mnFuncionarios.add(mnFinanceiro_1);

		textField_27 = new JTextField();
		mnFinanceiro_1.add(textField_27);
		textField_27.setColumns(10);

		JMenu mnOramento = new JMenu("Or\u00E7amento");
		mnOramento.setBorder(null);
		mnOramento.setIcon(new ImageIcon("C:\\Users\\aluno\\Desktop\\Jogo html\\cydia_25px.png"));
		panel.add(mnOramento);

		JMenu mnPeso = new JMenu("Bolsa");
		mnOramento.add(mnPeso);

		JLabel lblBm = new JLabel("100 b/m");
		mnPeso.add(lblBm);

		JMenu mngua = new JMenu("\u00C1gua/M");
		mnOramento.add(mngua);

		textField_21 = new JTextField();
		mngua.add(textField_21);
		textField_21.setColumns(10);

		textField_23 = new JTextField();
		mngua.add(textField_23);
		textField_23.setColumns(10);

		JMenu mnLuz = new JMenu("Luz/M");
		mnOramento.add(mnLuz);

		textField_20 = new JTextField();
		mnLuz.add(textField_20);
		textField_20.setColumns(10);

		textField_22 = new JTextField();
		mnLuz.add(textField_22);
		textField_22.setColumns(10);

		JMenuBar menuBar_1 = new JMenuBar();
		mnLuz.add(menuBar_1);

		JMenu mnFlexor = new JMenu("Aparelhos");
		mnOramento.add(mnFlexor);

		JMenu mnQuebrados = new JMenu("Quebrados");
		mnFlexor.add(mnQuebrados);

		JMenu mnNecessarios = new JMenu("Necessarios");
		mnQuebrados.add(mnNecessarios);

		textField_16 = new JTextField();
		mnQuebrados.add(textField_16);
		textField_16.setColumns(10);

		textField_17 = new JTextField();
		mnQuebrados.add(textField_17);
		textField_17.setColumns(10);

		textField_18 = new JTextField();
		mnQuebrados.add(textField_18);
		textField_18.setColumns(10);

		textField_19 = new JTextField();
		mnQuebrados.add(textField_19);
		textField_19.setColumns(10);

		JMenuBar menuBar_4 = new JMenuBar();
		mnQuebrados.add(menuBar_4);

		JMenuBar menuBar_3 = new JMenuBar();
		mnQuebrados.add(menuBar_3);

		textField_13 = new JTextField();
		mnFlexor.add(textField_13);
		textField_13.setColumns(10);

		textField_14 = new JTextField();
		mnFlexor.add(textField_14);
		textField_14.setColumns(10);

		textField_15 = new JTextField();
		mnFlexor.add(textField_15);
		textField_15.setColumns(10);

		JMenuBar menuBar_2 = new JMenuBar();
		mnFlexor.add(menuBar_2);

		JMenu mnRelatorio = new JMenu("Relatorio");
		mnRelatorio.setBorder(null);
		mnRelatorio.setIcon(new ImageIcon("C:\\Users\\aluno\\Desktop\\Jogo html\\services_25px.png"));
		panel.add(mnRelatorio);

		JMenu mnProduo = new JMenu("Produ\u00E7\u00E3o");
		mnRelatorio.add(mnProduo);

		textField_28 = new JTextField();
		mnProduo.add(textField_28);
		textField_28.setColumns(10);

		JMenu mnGastos = new JMenu("Gastos");
		mnRelatorio.add(mnGastos);

		textField_29 = new JTextField();
		mnGastos.add(textField_29);
		textField_29.setColumns(10);

		JMenu mnAnaliseFinanceira = new JMenu("Analise Financeira");
		mnRelatorio.add(mnAnaliseFinanceira);

		textField_30 = new JTextField();
		mnAnaliseFinanceira.add(textField_30);
		textField_30.setColumns(10);

		JLabel lblNewLabel = new JLabel("");
		panel.add(lblNewLabel);
		contentPane.add(lblNome);
		contentPane.add(lblCidade);
		contentPane.add(lblRg);
		contentPane.add(txtR);
		contentPane.add(txtCp);
		contentPane.add(txtNsc);
		contentPane.add(lblEmail);
		contentPane.add(lblFornecidos);
		contentPane.add(lblCelular);
		contentPane.add(lblProduto);
		contentPane.add(txtCity);
		contentPane.add(lblCpf);
		contentPane.add(label);
		contentPane.add(txtName);
		contentPane.add(lblEmpresa);
		contentPane.add(lblCep);
		contentPane.add(chckbxAtivo);
		contentPane.add(lblNascimento);
		contentPane.add(txtIDD);
		contentPane.add(txtBRR);
		contentPane.add(txtCLL);
		contentPane.add(txtEma);
		contentPane.add(spinner);
		contentPane.add(txtCF);
		contentPane.add(btnAdicionar);
		contentPane.add(btnNewButton);

		JButton btnSairESalvar = new JButton("Sair e Salvar");
		btnSairESalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Salvo com Sucesso");
				Tela t = new Tela();
				t.setVisible(rootPaneCheckingEnabled);
				dispose();

			}
		});
		btnSairESalvar.setForeground(SystemColor.textHighlight);
		btnSairESalvar.setBackground(SystemColor.window);
		btnSairESalvar.setIcon(new ImageIcon("C:\\Users\\aluno\\Desktop\\Jogo html\\shutdown_25px.png"));
		btnSairESalvar.setBounds(536, 375, 166, 27);
		contentPane.add(btnSairESalvar);
		
		JLabel lblNewLabel_1 = new JLabel("Cadastro De Alunos");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setForeground(SystemColor.textHighlight);
		lblNewLabel_1.setBounds(310, 11, 204, 35);
		contentPane.add(lblNewLabel_1);
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
	}
	
	public void limparCampos() {
		
		
	}
}
