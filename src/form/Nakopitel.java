package form;
import java.awt.EventQueue;
import javax.swing.*;
import java.util.Calendar;
import java.awt.event.*;
import org.jdesktop.swingx.JXDatePicker;

public class Nakopitel extends JFrame {
	private JTextField  Deposit_textField, 
						Percent_textField, 
						End_textField, 
						Ammount_textField,
					    Periodicity_textField;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Nakopitel frame = new Nakopitel();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public Nakopitel() {
		setTitle("Накопительный депозит");
		setBounds(100, 100, 420, 191);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		getContentPane().setLayout(null);
		
		Deposit_textField = new JTextField();
		Deposit_textField.setBounds(125, 11, 86, 20);
		getContentPane().add(Deposit_textField);
		Deposit_textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Сумма вклада");
		lblNewLabel.setBounds(10, 11, 105, 20);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Процентная ставка");
		lblNewLabel_2.setBounds(10, 36, 120, 25);
		getContentPane().add(lblNewLabel_2);
		
		Percent_textField = new JTextField();
		Percent_textField.setBounds(125, 38, 86, 20);
		getContentPane().add(Percent_textField);
		Percent_textField.setColumns(10);
		
		JLabel label = new JLabel("Сумма на конец срока:");
		label.setBounds(140, 97, 149, 30);
		getContentPane().add(label);
		
		End_textField = new JTextField();
		End_textField.setEditable(false);
		End_textField.setBounds(140, 125, 120, 20);
		getContentPane().add(End_textField);
		End_textField.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Сумма пополнения:");
		lblNewLabel_4.setBounds(8, 64, 142, 25);
		getContentPane().add(lblNewLabel_4);
		
		Ammount_textField = new JTextField();
		Ammount_textField.setBounds(125, 66, 86, 20);
		getContentPane().add(Ammount_textField);
		Ammount_textField.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Периодичность");
		lblNewLabel_5.setBounds(289, 64, 95, 14);
		getContentPane().add(lblNewLabel_5);
		
		JButton Exit_button = new JButton("Выход");
		Exit_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		Exit_button.setBounds(10, 123, 120, 25);
		getContentPane().add(Exit_button);
		
		Periodicity_textField = new JTextField();
		Periodicity_textField.setColumns(10);
		Periodicity_textField.setBounds(289, 81, 26, 20);
		getContentPane().add(Periodicity_textField);
		
		JLabel label_1 = new JLabel("Руб.");
		label_1.setBounds(218, 14, 26, 14);
		getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("%");
		label_2.setBounds(218, 42, 26, 14);
		getContentPane().add(label_2);
		
		JLabel label_4 = new JLabel("Руб.");
		label_4.setBounds(218, 69, 26, 14);
		getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("Мес.");
		label_5.setBounds(321, 84, 35, 14);
		getContentPane().add(label_5);
		
		JLabel label_3 = new JLabel("C");
		label_3.setBounds(254, 11, 35, 20);
		getContentPane().add(label_3);
		
		JXDatePicker start_date = new JXDatePicker();
		start_date.setDate(Calendar.getInstance().getTime());
		start_date.setBounds(289, 11, 105, 20);
		getContentPane().add(start_date);
		
		JXDatePicker end_date = new JXDatePicker();
		end_date.setDate(Calendar.getInstance().getTime());
		end_date.setBounds(289, 38, 105, 20);
		getContentPane().add(end_date);
		
		JLabel label_6 = new JLabel("по");
		label_6.setBounds(254, 38, 18, 20);
		getContentPane().add(label_6);
		
		JButton Calculate_Button = new JButton("Рассчитать");
		Calculate_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				long diff = start_date.getDate().getTime() - end_date.getDate().getTime();
				long diffDays = diff / (24 * 60 * 60 * 1000);
				System.out.println(Math.abs(diffDays));
				Calculation c = new Calculation();
					End_textField.setText(String.valueOf(c.calc_n(
							Integer.valueOf(Deposit_textField.getText()), 
							Integer.valueOf(Percent_textField.getText()), 
							Integer.valueOf(Periodicity_textField.getText()), 
							Integer.valueOf(Ammount_textField.getText()),
							Math.abs(diffDays))));
			}
		});
		Calculate_Button.setBounds(10, 99, 120, 25);
		getContentPane().add(Calculate_Button);
	}
}
