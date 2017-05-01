package form;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import form.Sberegatel;
import form.Nakopitel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class MainForm extends JFrame {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainForm frame = new MainForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public MainForm() {
		setTitle("Выбор типа депозита");
		setBounds(100, 100, 386, 274);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel label = new JLabel("Выберите тип депозита");
		label.setBounds(131, 11, 191, 34);
		getContentPane().add(label);
		
		JButton btnNewButton = new JButton("Сберегательный");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton.setBounds(102, 50, 191, 51);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Накопительный");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

			}
		});
		btnNewButton_1.setBounds(102, 101, 191, 51);
		getContentPane().add(btnNewButton_1);
		
		JButton Exit_button = new JButton("Выход");
		Exit_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		Exit_button.setBounds(102, 152, 191, 51);
		getContentPane().add(Exit_button);
	}
}

