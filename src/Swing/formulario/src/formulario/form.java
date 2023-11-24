package formulario;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class form extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtyear;
	private JTextField txtname;
	private JTextField txtTelephone;
	private JTextField txtcpf;
	private JTextField txtdate;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					form frame = new form();
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
	public form() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 659, 461);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNamel = new JLabel("Nome:");
		lblNamel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNamel.setBounds(138, 63, 142, 49);
		contentPane.add(lblNamel);
		
		JLabel lblyear = new JLabel("Idade:");
		lblyear.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblyear.setBounds(138, 122, 62, 24);
		contentPane.add(lblyear);
		
		txtyear = new JTextField();
		txtyear.setBounds(251, 124, 129, 25);
		contentPane.add(txtyear);
		txtyear.setColumns(10);
		
		JRadioButton rdbtnfeminino = new JRadioButton("Feminino");
		rdbtnfeminino.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rdbtnfeminino.setBounds(251, 155, 115, 37);
		contentPane.add(rdbtnfeminino);
		
		JRadioButton rdbtnMasculino = new JRadioButton("Masculino");
		rdbtnMasculino.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rdbtnMasculino.setBounds(362, 155, 115, 37);
		contentPane.add(rdbtnMasculino);
		
		JLabel lblsex = new JLabel("Sexo:");
		lblsex.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblsex.setBounds(138, 155, 62, 37);
		contentPane.add(lblsex);
		
		txtname = new JTextField();
		txtname.setColumns(10);
		txtname.setBounds(251, 77, 129, 25);
		contentPane.add(txtname);
		
		JLabel lbltelephone = new JLabel("Telefone:");
		lbltelephone.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbltelephone.setBounds(138, 202, 75, 24);
		contentPane.add(lbltelephone);
		
		txtTelephone = new JTextField();
		txtTelephone.setBounds(251, 205, 158, 24);
		contentPane.add(txtTelephone);
		txtTelephone.setColumns(10);
		
		JLabel lblcpf = new JLabel("CPF:");
		lblcpf.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblcpf.setBounds(138, 247, 75, 24);
		contentPane.add(lblcpf);
		
		txtcpf = new JTextField();
		txtcpf.setBounds(250, 249, 159, 25);
		contentPane.add(txtcpf);
		txtcpf.setColumns(10);
		
		JLabel lbldate = new JLabel("Data de Nascimento: ");
		lbldate.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbldate.setBounds(138, 305, 155, 24);
		contentPane.add(lbldate);
		
		txtdate = new JTextField();
		txtdate.setBounds(303, 307, 106, 25);
		contentPane.add(txtdate);
		txtdate.setColumns(10);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEnviar.setBackground(Color.BLUE);
		btnEnviar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnEnviar.setBounds(251, 370, 138, 44);
		contentPane.add(btnEnviar);
		
		JLabel lblFormulario = new JLabel("Formulário");
		lblFormulario.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 24));
		lblFormulario.setBounds(251, 10, 158, 24);
		contentPane.add(lblFormulario);
	}
}
