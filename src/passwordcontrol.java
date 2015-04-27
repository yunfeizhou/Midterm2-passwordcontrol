import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;


public class passwordcontrol extends JFrame {
	
	private static String OK = "ok";
	private static String HELP = "help";
	private JFrame frame;
	private JPasswordField passwordField;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					passwordcontrol window = new passwordcontrol();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	

	public passwordcontrol() {
		initialize();
	}
	
	private void initialize() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 450, 300);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter the password:");
		lblNewLabel.setBounds(20, 110, 140, 16);
		frame.getContentPane().add(lblNewLabel);
	}
	
	private boolean passwordcontrol(char[] input) {
		char[] correctPassword = { 'b', 'u', 'g', 'a', 'b', 'o', 'o' };
		boolean password = true;
		if (input.length != correctPassword.length) {
			password = false;
		}

		else {
			password = true;
		}

		Arrays.fill(correctPassword, '0');
		return password;
	};

}
