package frontend;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.GridLayout;
import java.util.List;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import model.Prueba;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Index extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField editSemilla;
	private JTable table;
	private Prueba p;
	private JLabel textGenerar;
	private JButton buttonStart;
	private JTextField editCantidad;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Index frame = new Index();
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
	public Index() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 578, 408);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.WEST);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblIngresaLaSemilla = new JLabel("Ingresa la semilla (de 3, 4 o 5 dígitos)");
		lblIngresaLaSemilla.setHorizontalAlignment(SwingConstants.CENTER);
		lblIngresaLaSemilla.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(lblIngresaLaSemilla);
		
		editSemilla = new JTextField();
		editSemilla.addActionListener(this);
		editSemilla.setBorder(new LineBorder(new Color(155, 38, 182)));
		editSemilla.setHorizontalAlignment(SwingConstants.CENTER);
		editSemilla.setFont(new Font("Tahoma", Font.PLAIN, 22));
		panel.add(editSemilla);
		editSemilla.setColumns(10);
		
		JLabel lblValoresATomar = new JLabel("Valores a Tomar:");
		lblValoresATomar.setHorizontalAlignment(SwingConstants.CENTER);
		lblValoresATomar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(lblValoresATomar);
		
		editCantidad = new JTextField();
		editCantidad.addActionListener(this);
		editCantidad.setHorizontalAlignment(SwingConstants.CENTER);
		editCantidad.setFont(new Font("Tahoma", Font.PLAIN, 22));
		editCantidad.setBorder(new LineBorder(new Color(115, 38, 182)));
		panel.add(editCantidad);
		editCantidad.setColumns(10);
		
		JLabel lblCantidadDeNmeros = new JLabel("Cantidad de números a generar:");
		lblCantidadDeNmeros.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCantidadDeNmeros.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblCantidadDeNmeros);
		
		textGenerar = new JLabel("");
		textGenerar.setHorizontalAlignment(SwingConstants.CENTER);
		textGenerar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(textGenerar);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(158, 38, 182));
		contentPane.add(panel_1, BorderLayout.NORTH);
		
		JLabel lblGeneradorDeNmeros = new JLabel("Generador de Números Aleatórios");
		lblGeneradorDeNmeros.setForeground(Color.WHITE);
		lblGeneradorDeNmeros.setFont(new Font("Tahoma", Font.PLAIN, 25));
		panel_1.add(lblGeneradorDeNmeros);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 16));
		scrollPane.setViewportView(table);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.SOUTH);
		
		buttonStart = new JButton("Start");
		buttonStart.addActionListener(this);
		buttonStart.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_2.add(buttonStart);
		p = new Prueba();
	}
	
//	public void mostrarLista(long mainSeed, String k) {
//		List<Long> list = p.generador(mainSeed, k);
//		showNumbers(list);
//	}
//	
//	public void showNumbers(List<Long> list) {
//		String[] titulos = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
//
//		DefaultTableModel modelo = new DefaultTableModel(titulos, 0);
//		int count = 0;
//		for(int i = 0; i < 10; i++) {
//			String[] tupla = new String[10];
//			for(int j = 0; j < 10; j++) {
//				tupla[j] = String.valueOf(list.get(count));
//				count++;
//			}
//			modelo.addRow(tupla);
//		}
//		table.setModel(modelo);
//	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == editSemilla) {
			editCantidad.requestFocus();
		}
		
//		if(e.getSource() == editCantidad) {
//			textGenerar.setText("100");
//			buttonStart.requestFocus();
//			mostrarLista(Long.valueOf(editSemilla.getText()), editCantidad.getText());
//		}
	}
}
