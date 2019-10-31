package frontend;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import java.util.List;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import model.Usuario;

public class ListOfUsers extends JPanel {

	private JTable table;
	
	public ListOfUsers() {
		setBackground(Color.WHITE);
		setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable();
		table.setBackground(Color.WHITE);
		table.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 16));
		scrollPane.setViewportView(table);
	}
	
	public void showUsers(List<Usuario> list) {
		String[] titulos = {"ID", "Apellido Paterno", "Apellido Materno", "Nombre", "Edad", "CURP", "Escuela", "Categoría", "Equipo"};

		DefaultTableModel modelo = new DefaultTableModel(titulos, 0);
		for (Usuario user : list) {
			String tupla[] = {String.valueOf(user.getId()), user.getLastNameP(), user.getLastNameM(), user.getName(), 
					String.valueOf(user.getAge()), user.getCurp(), user.getSchool(), user.getCategoria(), user.getTeam()};
			modelo.addRow(tupla);
		}
		table.setModel(modelo);
	}
}