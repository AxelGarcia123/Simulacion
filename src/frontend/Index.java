package frontend;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Index extends JFrame {

	private JPanel contentPane;
	private JTextField editCantidad;
	private JTextField editSemilla;
	private JTable table;

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
		
		JLabel lblIngresaLaSemilla = new JLabel("Ingresa la semilla");
		lblIngresaLaSemilla.setHorizontalAlignment(SwingConstants.CENTER);
		lblIngresaLaSemilla.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(lblIngresaLaSemilla);
		
		editSemilla = new JTextField();
		editSemilla.setBorder(new LineBorder(new Color(155, 38, 182)));
		editSemilla.setHorizontalAlignment(SwingConstants.CENTER);
		editSemilla.setFont(new Font("Tahoma", Font.PLAIN, 22));
		panel.add(editSemilla);
		editSemilla.setColumns(10);
		
		JLabel lblValoresATomar = new JLabel("Valores a Tomar:");
		lblValoresATomar.setHorizontalAlignment(SwingConstants.CENTER);
		lblValoresATomar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(lblValoresATomar);
		
		JLabel label = new JLabel("4");
		label.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(label);
		
		JLabel lblCantidadDeNmeros = new JLabel("Cantidad de números a generar:");
		lblCantidadDeNmeros.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCantidadDeNmeros.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblCantidadDeNmeros);
		
		editCantidad = new JTextField();
		editCantidad.setFont(new Font("Tahoma", Font.PLAIN, 22));
		editCantidad.setBorder(new LineBorder(new Color(155, 38, 182)));
		panel.add(editCantidad);
		editCantidad.setColumns(10);
		
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
		scrollPane.setViewportView(table);
	}
	
	public void mostrarResurtidos() {
		String[] titulos = {"n", "Semilla 1", "Semilla 2", "Resultado", "Número tomado", "Número aleatorio"};

		DefaultTableModel modelo = new DefaultTableModel(titulos, 0);

		/*for (Resurtir resurtir : resurtidos) {
			String[] tupla = {tabla.nombreProducto(resurtir.getCodigoProducto()), String.valueOf(resurtir.getFechaResurtido()), 
					String.valueOf(resurtir.getCantidadResurtirda()), String.valueOf(resurtir.getPrecioUnidad()),
					String.valueOf(resurtir.getFechaCaducidad())};
			modelo.addRow(tupla);
		}*/
		table.setModel(modelo);
	}
}
