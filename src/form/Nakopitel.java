/**
 * Указываем, что класс принадлежит пакету form.
 */
package form;
/**
 * Импортируем класс для запуска формы из потока очереди.
 */
import java.awt.EventQueue;
/**
 * Импортируем пакет классов для работы с графическими элементами
 */
import javax.swing.*;
/**
 * Импортируем класс для преобразования времени и календарных полей
 */
import java.util.Calendar;
/**
 * Импортируем пакет классов для работы с различными типами событий
 */
import java.awt.event.*;
/**
 * Импортируем класс для виджета выбора времени
 */
import org.jdesktop.swingx.JXDatePicker;
/**
 * Создаем класс и наследуем класс фрейма
 */
public class Nakopitel extends JFrame {
	/**
	 * Объявляем текстовые строки для ввода чисел
	 */
	private JTextField  Deposit_textField, 
						Percent_textField, 
						End_textField, 
						Ammount_textField,
					    Periodicity_textField;
	/**
	 * создаём форму
	 */
	public Nakopitel() {
		/**
		 * задаём заголовок для фрейма
		 */
		setTitle("Накопительный депозит");
		/**
		 * задаём координаты и размеры панели
		 */
		setBounds(100, 100, 420, 191);
		/**
		 * указываем действие, которое необходимо выполнить
		 * когда пользователь закрывает фрейм нажатием на крестик.
		 * В данном случае закрыть фрейм
		 */
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		/**
		 * указываем метод взаимного расположения элементов
		 */
		getContentPane().setLayout(null);
		
		/**
		 * создаём текстовое поле
		 */
		Deposit_textField = new JTextField();
		/**
		 * задаём координаты
		 */
		Deposit_textField.setBounds(125, 11, 86, 20);
		/**
		 * добавляем текстовое поле на панель
		 */
		getContentPane().add(Deposit_textField);
		/**
		 * задаём поле
		 */
		Deposit_textField.setColumns(10);
		
		/**
		 * создаём надпись
		 */
		JLabel lblNewLabel = new JLabel("Сумма вклада");
		/**
		 * задаём координаты
		 */
		lblNewLabel.setBounds(10, 11, 105, 20);
		/**
		 * добавляем надпись на панель
		 */
		getContentPane().add(lblNewLabel);
		
		/**
		 * создаём надпись
		 */
		JLabel lblNewLabel_2 = new JLabel("Процентная ставка");
		/**
		 * задаём координаты
		 */
		lblNewLabel_2.setBounds(10, 36, 120, 25);
		/**
		 * добавляем надпись на панель
		 */
		getContentPane().add(lblNewLabel_2);
		
		/**
		 * создаём текстовое поле
		 */
		Percent_textField = new JTextField();
		/**
		 * задаём координаты
		 */
		Percent_textField.setBounds(125, 38, 86, 20);
		/**
		 * добавляем текстовое поле на панель
		 */
		getContentPane().add(Percent_textField);
		/**
		 * задаём поле
		 */
		Percent_textField.setColumns(10);
		
		/**
		 * создаём надпись
		 */
		JLabel label = new JLabel("Сумма на конец срока:");
		/**
		 * задаём координаты
		 */
		label.setBounds(140, 97, 149, 30);
		/**
		 * добавляем надпись на панель
		 */
		getContentPane().add(label);
		
		/**
		 * создаём текстовое поле
		 */
		End_textField = new JTextField();
		/**
		 * устанавливаем нередактируемость текстового поля
		 */
		End_textField.setEditable(false);
		/**
		 * задаём координаты
		 */
		End_textField.setBounds(140, 125, 120, 20);
		/**
		 * добавляем текстовое поле на панель
		 */
		getContentPane().add(End_textField);
		/**
		 * задаём поле
		 */
		End_textField.setColumns(10);
		
		/**
		 * создаём надпись
		 */
		JLabel lblNewLabel_4 = new JLabel("Сумма пополнения:");
		/**
		 * задаём координаты
		 */
		lblNewLabel_4.setBounds(8, 64, 142, 25);
		/**
		 * добавляем надпись на панель
		 */
		getContentPane().add(lblNewLabel_4);
		
		/**
		 * создаём текстовое поле
		 */
		Ammount_textField = new JTextField();
		/**
		 * задаём координаты
		 */
		Ammount_textField.setBounds(125, 66, 86, 20);
		/**
		 * добавляем текстовое поле на панель
		 */
		getContentPane().add(Ammount_textField);
		/**
		 * задаём поле
		 */
		Ammount_textField.setColumns(10);
		
		/**
		 * создаём надпись
		 */
		JLabel lblNewLabel_5 = new JLabel("Периодичность");
		/**
		 * задаём координаты
		 */
		lblNewLabel_5.setBounds(289, 64, 95, 14);
		/**
		 * добавляем надпись на панель
		 */
		getContentPane().add(lblNewLabel_5);
		
		/**
		 * создаём кнопку
		 */
		JButton Exit_button = new JButton("Выход");
		/**
		 * Обрабатываем нажатие на кнопку
		 */
		Exit_button.addActionListener(new ActionListener() {
			/**
			 * Событие при нажатии на кнопку
			 */
			public void actionPerformed(ActionEvent e) {
				/**
				 * закрываем форму накопительного депозита
				 */
				setVisible(false);
			}
		});
		/**
		 * задаём координаты
		 */
		Exit_button.setBounds(10, 123, 120, 25);
		/**
		 * добавляем кнопку на панель
		 */
		getContentPane().add(Exit_button);
		
		/**
		 * создаём текстовое поле
		 */
		Periodicity_textField = new JTextField();
		/**
		 * задаём поле
		 */
		Periodicity_textField.setColumns(10);
		/**
		 * задаём координаты
		 */
		Periodicity_textField.setBounds(289, 81, 26, 20);
		/**
		 * добавляем текстовое поле на панель
		 */
		getContentPane().add(Periodicity_textField);
		
		/**
		 * создаём надпись
		 */
		JLabel label_1 = new JLabel("Руб.");
		/**
		 * задаём координаты
		 */
		label_1.setBounds(218, 14, 26, 14);
		/**
		 * добавляем надпись на панель
		 */
		getContentPane().add(label_1);
		
		/**
		 * создаём надпись
		 */
		JLabel label_2 = new JLabel("%");
		/**
		 * задаём координаты
		 */
		label_2.setBounds(218, 42, 26, 14);
		/**
		 * добавляем надпись на панель
		 */
		getContentPane().add(label_2);
		
		/**
		 * создаём надпись
		 */
		JLabel label_4 = new JLabel("Руб.");
		/**
		 * задаём координаты
		 */
		label_4.setBounds(218, 69, 26, 14);
		/**
		 * добавляем надпись на панель
		 */
		getContentPane().add(label_4);
		
		/**
		 * создаём надпись
		 */
		JLabel label_5 = new JLabel("Мес.");
		/**
		 * задаём координаты
		 */
		label_5.setBounds(321, 84, 35, 14);
		/**
		 * добавляем надпись на панель
		 */
		getContentPane().add(label_5);
		
		/**
		 * создаём надпись
		 */
		JLabel label_3 = new JLabel("C");
		/**
		 * задаём координаты
		 */
		label_3.setBounds(254, 11, 35, 20);
		/**
		 * добавляем надпись на панель
		 */
		getContentPane().add(label_3);
		
		/**
		 * создаём виджет для выбора даты
		 */
		JXDatePicker start_date = new JXDatePicker();
		/**
		 * присваиваем начальные значения
		 */
		start_date.setDate(Calendar.getInstance().getTime());
		/**
		 * задаём координаты
		 */
		start_date.setBounds(289, 11, 105, 20);
		/**
		 * добавляем компонент на панель
		 */
		getContentPane().add(start_date);
		
		/**
		 * создаём виджет для выбора даты
		 */
		JXDatePicker end_date = new JXDatePicker();
		/**
		 * присваиваем начальные значения
		 */
		end_date.setDate(Calendar.getInstance().getTime());
		/**
		 * задаём координаты
		 */
		end_date.setBounds(289, 38, 105, 20);
		/**
		 * добавляем компонент на панель
		 */
		getContentPane().add(end_date);
		
		/**
		 * создаём надпись
		 */
		JLabel label_6 = new JLabel("по");
		/**
		 * задаём координаты
		 */
		label_6.setBounds(254, 38, 18, 20);
		/**
		 * добавляем надпись на панель
		 */
		getContentPane().add(label_6);
		
		/**
		 * создаём кнопку
		 */
		JButton Calculate_Button = new JButton("Рассчитать");
		/**
		 * Обрабатываем нажатие на кнопку
		 */
		Calculate_Button.addActionListener(new ActionListener() {
			/**
			 * Событие при нажатии на кнопку
			 */
			public void actionPerformed(ActionEvent e) {
				/**
				 * рассчитываем сколько дней входит в промежуток
				 */
				long diff = start_date.getDate().getTime() - end_date.getDate().getTime();
				/**
				 * рассчитываем сколько дней входит в промежуток
				 */
				long diffDays = diff / (24 * 60 * 60 * 1000);
				/**
				 * выводим в консоль
				 */
				System.out.println(Math.abs(diffDays));
				/**
				 * создаем экземпляр класса калькулятора
				 */
				Calculation c = new Calculation();
				/**
				 * рассчитываем по функции накопительного депозита,
				 * считывая все переменные
				 */
				End_textField.setText(String.valueOf(c.calc_n(
							Integer.valueOf(Deposit_textField.getText()), 
							Integer.valueOf(Percent_textField.getText()), 
							Integer.valueOf(Periodicity_textField.getText()), 
							Integer.valueOf(Ammount_textField.getText()),
							Math.abs(diffDays))));
			}
		});
		/**
		 * задаём координаты
		 */
		Calculate_Button.setBounds(10, 99, 120, 25);
		/**
		 * добавляем кнопку на панель
		 */
		getContentPane().add(Calculate_Button);
	}
}
