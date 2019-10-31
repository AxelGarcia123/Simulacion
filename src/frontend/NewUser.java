package frontend;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import model.Usuario;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class NewUser extends JPanel implements ActionListener{
	private JTextField editPaterno;
	private JTextField editCurp;
	private JTextField editMaterno;
	private JTextField editEscuela;
	private JTextField editNombre;
	private JTextField editCategoria;
	private JTextField editEdad;
	private JTextField editEquipo;
	private JButton buttonRegistrar;
	private JComboBox<String> semilla;

	public NewUser() {
		setBackground(Color.WHITE);
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		add(panel, BorderLayout.SOUTH);
		
		buttonRegistrar = new JButton("Registrar");
		buttonRegistrar.setBackground(Color.WHITE);
		buttonRegistrar.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 18));
		buttonRegistrar.addActionListener(this);
		buttonRegistrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel.add(buttonRegistrar);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(5, 4, 30, 80));
		
		JLabel label = new JLabel("Apellido Paterno:");
		label.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 20));
		panel_1.add(label);
		
		editPaterno = new JTextField();
		editPaterno.setHorizontalAlignment(SwingConstants.CENTER);
		editPaterno.addActionListener(this);
		editPaterno.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		editPaterno.setColumns(10);
		panel_1.add(editPaterno);
		
		JLabel label_1 = new JLabel("Curp:");
		label_1.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 20));
		panel_1.add(label_1);
		
		editCurp = new JTextField();
		editCurp.setHorizontalAlignment(SwingConstants.CENTER);
		editCurp.addActionListener(this);
		editCurp.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		editCurp.setColumns(10);
		panel_1.add(editCurp);
		
		JLabel label_2 = new JLabel("Apellido Materno:");
		label_2.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 20));
		panel_1.add(label_2);
		
		editMaterno = new JTextField();
		editMaterno.setHorizontalAlignment(SwingConstants.CENTER);
		editMaterno.addActionListener(this);
		editMaterno.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		editMaterno.setColumns(10);
		panel_1.add(editMaterno);
		
		JLabel label_3 = new JLabel("Escuela:");
		label_3.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 20));
		panel_1.add(label_3);
		
		editEscuela = new JTextField();
		editEscuela.setHorizontalAlignment(SwingConstants.CENTER);
		editEscuela.addActionListener(this);
		editEscuela.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		editEscuela.setColumns(10);
		panel_1.add(editEscuela);
		
		JLabel label_4 = new JLabel("Nombre:");
		label_4.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 20));
		panel_1.add(label_4);
		
		editNombre = new JTextField();
		editNombre.setHorizontalAlignment(SwingConstants.CENTER);
		editNombre.addActionListener(this);
		editNombre.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		editNombre.setColumns(10);
		panel_1.add(editNombre);
		
		JLabel label_5 = new JLabel("Categoría:");
		label_5.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 20));
		panel_1.add(label_5);
		
		editCategoria = new JTextField();
		editCategoria.setHorizontalAlignment(SwingConstants.CENTER);
		editCategoria.addActionListener(this);
		editCategoria.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		editCategoria.setColumns(10);
		panel_1.add(editCategoria);
		
		JLabel label_6 = new JLabel("Edad:");
		label_6.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 20));
		panel_1.add(label_6);
		
		editEdad = new JTextField();
		editEdad.setHorizontalAlignment(SwingConstants.CENTER);
		editEdad.addActionListener(this);
		editEdad.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		editEdad.setColumns(10);
		panel_1.add(editEdad);
		
		JLabel label_7 = new JLabel("Nombre del equipo:");
		label_7.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 20));
		panel_1.add(label_7);
		
		editEquipo = new JTextField();
		editEquipo.setHorizontalAlignment(SwingConstants.CENTER);
		editEquipo.addActionListener(this);
		editEquipo.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		editEquipo.setColumns(10);
		panel_1.add(editEquipo);
		
		JLabel lblNmeroDeBoleto = new JLabel("Número de Boleto:");
		lblNmeroDeBoleto.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 20));
		panel_1.add(lblNmeroDeBoleto);
		
		semilla = new JComboBox<String>();
		semilla.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		semilla.setModel(new DefaultComboBoxModel(new String[] {"Entre 100 y 1000", "Entre 1000 y 10000", "Entre 10000 y 100000"}));
		semilla.setBackground(Color.WHITE);
		panel_1.add(semilla);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == editPaterno) {
			if(!editPaterno.getText().isEmpty()) 
				editMaterno.requestFocus();
			else
				JOptionPane.showMessageDialog(null, "No debe quedar vacio el campo", "¡Error!", JOptionPane.ERROR_MESSAGE);
		}
		
		if(e.getSource() == editMaterno) {
			if(!editMaterno.getText().isEmpty()) 
				editNombre.requestFocus();
			else
				JOptionPane.showMessageDialog(null, "No debe quedar vacio el campo", "¡Error!", JOptionPane.ERROR_MESSAGE);
		}
		
		if(e.getSource() == editNombre) {
			if(!editNombre.getText().isEmpty()) 
				editEdad.requestFocus();
			else
				JOptionPane.showMessageDialog(null, "No debe quedar vacio el campo", "¡Error!", JOptionPane.ERROR_MESSAGE);
		}
		
		if(e.getSource() == editEdad) {
			if(!editEdad.getText().isEmpty()) 
				editCurp.requestFocus();
			else
				JOptionPane.showMessageDialog(null, "No debe quedar vacio el campo", "¡Error!", JOptionPane.ERROR_MESSAGE);
		}
		
		if(e.getSource() == editCurp) {
			if(!editCurp.getText().isEmpty()) 
				editEscuela.requestFocus();
			else
				JOptionPane.showMessageDialog(null, "No debe quedar vacio el campo", "¡Error!", JOptionPane.ERROR_MESSAGE);
		}
		
		if(e.getSource() == editEscuela) {
			if(!editEscuela.getText().isEmpty()) 
				editCategoria.requestFocus();
			else
				JOptionPane.showMessageDialog(null, "No debe quedar vacio el campo", "¡Error!", JOptionPane.ERROR_MESSAGE);
		}
		
		if(e.getSource() == editCategoria) {
			if(!editCategoria.getText().isEmpty()) 
				editEquipo.requestFocus();
			else
				JOptionPane.showMessageDialog(null, "No debe quedar vacio el campo", "¡Error!", JOptionPane.ERROR_MESSAGE);
		}
		
		if(e.getSource() == editEquipo) {
			if(!editEquipo.getText().isEmpty()) 
				buttonRegistrar.requestFocus();
			else
				JOptionPane.showMessageDialog(null, "No debe quedar vacio el campo", "¡Error!", JOptionPane.ERROR_MESSAGE);
		}
		
		if(e.getSource() == buttonRegistrar) {
			limpiar();
		}
	}
	
	public Usuario getUsuario() {
		Usuario user = new Usuario();
		user.setLastNameP(editPaterno.getText());
		user.setLastNameM(editMaterno.getText());
		user.setName(editNombre.getText());
		user.setAge(Integer.parseInt(editEdad.getText()));
		user.setCurp(editCurp.getText());
		user.setSchool(editEscuela.getText());
		user.setCategoria(editCategoria.getText());
		user.setTeam(editEquipo.getText());
		user.setId(0);
		return user;
	}
	
	public void limpiar() {
		editPaterno.setText(null);
		editMaterno.setText(null);
		editNombre.setText(null);
		editEdad.setText(null);
		editCurp.setText(null);
		editEscuela.setText(null);
		editCategoria.setText(null);
		editEquipo.setText(null);
	}
	
	public JButton getButtonRegistrar() {
		return buttonRegistrar;
	}
	
	public JComboBox<String> getSemilla() {
		return semilla;
	}
}