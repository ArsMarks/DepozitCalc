package form;
import java.awt.EventQueue;
import javax.swing.*;
import java.awt.*;
import org.jdesktop.swingx.JXDatePicker;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.event.*;

public class Sberegatel extends JFrame {
	private JTextField Deposit_textField;
	private JTextField Percent_textField;
	private JTextField end_textField;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sberegatel frame = new Sberegatel();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public Sberegatel() {
		setTitle("Сберегательный депозит");
		setBounds(100, 100, 420, 191);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		getContentPane().setLayout(null);
		
		Deposit_textField = new JTextField();
		Deposit_textField.setColumns(10);
		Deposit_textField.setBounds(125, 11, 86, 20);
		getContentPane().add(Deposit_textField);
		
		JLabel label = new JLabel("Сумма вклада");
		label.setBounds(10, 11, 105, 20);
		getContentPane().add(label);
		
		JLabel label_2 = new JLabel("Процентная ставка");
		label_2.setBounds(10, 36, 120, 25);
		getContentPane().add(label_2);
		
		Percent_textField = new JTextField();
		Percent_textField.setColumns(10);
		Percent_textField.setBounds(125, 38, 86, 20);
		getContentPane().add(Percent_textField);
		
		JLabel lblC = new JLabel("C");
		lblC.setBounds(245, 11, 35, 20);
		getContentPane().add(lblC);
		
		JXDatePicker start_date = new JXDatePicker();
		start_date.setDate(Calendar.getInstance().getTime());
		start_date.setFormats(new SimpleDateFormat("dd.MM.yyyy"));
		start_date.setBounds(280, 11, 105, 20);
	    getContentPane().add(start_date);
	     
	  JXDatePicker end_date = new JXDatePicker();
	  end_date.setDate(Calendar.getInstance().getTime());
	  end_date.setFormats(new SimpleDateFormat("dd.MM.yyyy"));
	  end_date.setBounds(280, 38, 105, 20);
		getContentPane().add(end_date);
		
		JLabel End_textField = new JLabel("Сумма на конец срока");
		End_textField.setBounds(135, 66, 145, 30);
		getContentPane().add(End_textField);
		
		end_textField = new JTextField();
		end_textField.setEditable(false);
		end_textField.setColumns(10);
		end_textField.setBounds(145, 96, 86, 20);
		getContentPane().add(end_textField);
		
		JButton Exit_button = new JButton("Выход");
		Exit_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		Exit_button.setBounds(10, 94, 120, 25);
		getContentPane().add(Exit_button);
		
		JLabel label_1 = new JLabel("по");
		label_1.setBounds(245, 38, 18, 20);
		getContentPane().add(label_1);
		
		JLabel label_3 = new JLabel("Руб.");
		label_3.setBounds(212, 11, 25, 20);
		getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("%");
		label_4.setBounds(212, 38, 23, 20);
		getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("Руб.");
		label_5.setBounds(232, 96, 30, 20);
		getContentPane().add(label_5);
			
		JButton Calculate_Button = new JButton("Рассчитать");
		Calculate_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				long diff = start_date.getDate().getTime() - end_date.getDate().getTime();
				long diffDays = diff / (24 * 60 * 60 * 1000);
				System.out.println(Math.abs(diffDays));
				Calculation c = new Calculation();
					end_textField.setText(String.valueOf(c.calc_s(Integer.valueOf(Deposit_textField.getText()), 
							Integer.valueOf(Percent_textField.getText()), diffDays)));
			}
		});
		Calculate_Button.setBounds(10, 69, 120, 25);
		getContentPane().add(Calculate_Button);
	}
}

