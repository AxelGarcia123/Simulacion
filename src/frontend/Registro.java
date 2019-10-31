package frontend;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

import model.Prueba;
import model.Usuario;
import java.awt.Color;
import java.awt.Cursor;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import java.util.List;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

@SuppressWarnings("serial")
public class Registro extends JFrame implements ActionListener{

	private JPanel contentPane;
	private Usuario user;
	private NewUser newUser;
	private List<Usuario> userList;
	private Prueba p;
	private ListOfUsers listOfUsers;
	private JMenuBar menuBar;
	private JMenu mnUsuarios;
	private JMenuItem buttonAddUser;
	private JMenuItem buttonShowUsers;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registro frame = new Registro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Registro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 770, 482);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnUsuarios = new JMenu("Usuarios");
		mnUsuarios.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		mnUsuarios.setHorizontalAlignment(SwingConstants.CENTER);
		mnUsuarios.setBackground(Color.WHITE);
		menuBar.add(mnUsuarios);
		
		buttonAddUser = new JMenuItem("Agregar nuevo usuario");
		buttonAddUser.addActionListener(this);
		buttonAddUser.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		buttonAddUser.setHorizontalAlignment(SwingConstants.CENTER);
		buttonAddUser.setBackground(Color.WHITE);
		mnUsuarios.add(buttonAddUser);
		
		buttonShowUsers = new JMenuItem("Lista de usuarios");
		buttonShowUsers.addActionListener(this);
		buttonShowUsers.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		buttonShowUsers.setHorizontalAlignment(SwingConstants.CENTER);
		buttonShowUsers.setBackground(Color.WHITE);
		mnUsuarios.add(buttonShowUsers);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		userList = new ArrayList<Usuario>();
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(102, 31, 255));
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblHackathon = new JLabel("Hackathon");
		lblHackathon.setForeground(Color.WHITE);
		lblHackathon.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		panel.add(lblHackathon);
		p = new Prueba();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == buttonAddUser) {
			addNewUser();
		}
		
		if(e.getSource() == buttonShowUsers) {
			if(!userList.isEmpty())
				showUsers();
			else
				JOptionPane.showMessageDialog(null, "No hay usuarios registrados", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void addNewUser() {
		contentPane.removeAll();
		listOfUsers = null;
		repaint();
		if(user == null) {
			newUser = new NewUser();
			newUser.getButtonRegistrar().addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					user = new Usuario();
					user = newUser.getUsuario();
					String dato = newUser.getSemilla().getSelectedItem().toString();
					long id = p.generador(dato);
					user.setId(id);
					userList.add(user);
					JOptionPane.showMessageDialog(null, "Usuario agregado.\nID: "+ user.getId());
				}
			});
			contentPane.add(newUser, BorderLayout.CENTER);
			setVisible(true);
		}
	}
	
	public void showUsers() {
		contentPane.removeAll();
		user = null;
		repaint();
		if(listOfUsers == null) {
			listOfUsers = new ListOfUsers();
			listOfUsers.showUsers(userList);
			contentPane.add(listOfUsers, BorderLayout.CENTER);
			setVisible(true);
		}
	}
}