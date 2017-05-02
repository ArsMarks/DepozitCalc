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
 * Импортируем класс для графического интерфейса
 */
import java.awt.*;
/**
 * Импортируем класс для виджета выбора времени
 */
import org.jdesktop.swingx.JXDatePicker;
/**
 * Импортируем класс для форматирования даты и времени
 */
import java.text.SimpleDateFormat;
/**
 * Импортируем класс для преобразования времени и календарных полей
 */
import java.util.Calendar;
/**
 * Импортируем пакет классов для работы с различными типами событий
 */
import java.awt.event.*;
/**
 * Создаем класс и наследуем класс фрейма
 */
public class Sberegatel extends JFrame {
	/**
	 * Объявляем текстовые строки для ввода чисел
	 */
	private JTextField Deposit_textField;
	private JTextField Percent_textField;
	private JTextField end_textField;
	/**
	 * создаём форму
	 */
	public Sberegatel() {
		/**
		 * задаём заголовок для фрейма
		 */
		setTitle("Сберегательный депозит");
		/**
		 * задаём координаты и размеры панели
		 */
		setBounds(100, 100, 420, 191);
		/**
		 * указываем действие, которое необходимо выполнить когда пользователь закрывает фрейм нажатием на крестик. В данном случае закрыть фрейм
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
		 * задаём поле
		 */
		Deposit_textField.setColumns(10);
		/**
		 * задаём координаты
		 */
		Deposit_textField.setBounds(125, 11, 86, 20);
		/**
		 * добавляем текстовое поле на панель
		 */
		getContentPane().add(Deposit_textField);
		
		/**
		 * создаём надпись
		 */
		JLabel label = new JLabel("Сумма вклада");
		/**
		 * задаём координаты
		 */
		label.setBounds(10, 11, 105, 20);
		/**
		 * добавляем надпись на панель
		 */
		getContentPane().add(label);
		
		/**
		 * создаём надпись
		 */
		JLabel label_2 = new JLabel("Процентная ставка");
		/**
		 * задаём координаты
		 */
		label_2.setBounds(10, 36, 120, 25);
		/**
		 * добавляем надпись на панель
		 */
		getContentPane().add(label_2);
		
		/**
		 * создаём текстовое поле
		 */
		Percent_textField = new JTextField();
		/**
		 * задаём поле
		 */
		Percent_textField.setColumns(10);
		/**
		 * задаём координаты
		 */
		Percent_textField.setBounds(125, 38, 86, 20);
		/**
		 * добавляем текстовое поле на панель
		 */
		getContentPane().add(Percent_textField);
		
		/**
		 * создаём надпись
		 */
		JLabel lblC = new JLabel("C");
		/**
		 * задаём координаты
		 */
		lblC.setBounds(245, 11, 35, 20);
		/**
		 * добавляем надпись на панель
		 */
		getContentPane().add(lblC);
		
		/**
		 * создаём виджет для выбора даты
		 */
		JXDatePicker start_date = new JXDatePicker();
		/**
		 * устанавливаем начальное значение
		 */
		start_date.setDate(Calendar.getInstance().getTime());
		/**
		 * задаём формат даты
		 */
		start_date.setFormats(new SimpleDateFormat("dd.MM.yyyy"));
		/**
		 * задаём координаты
		 */
		start_date.setBounds(280, 11, 105, 20);
		/**
		 * добавляем компонент на панель
		 */
		getContentPane().add(start_date);
	     
		/**
		* создаём виджет для выбора даты
		*/
		JXDatePicker end_date = new JXDatePicker();
		/**
		 * устанавливаем конечное значение
		 */
		end_date.setDate(Calendar.getInstance().getTime());
		/**
		 * задаём формат даты
		 */
		end_date.setFormats(new SimpleDateFormat("dd.MM.yyyy"));
		 /**
		 * задаём координаты
		 */
		end_date.setBounds(280, 38, 105, 20);
		/**
		 * добавляем компонент на панель
		 */
		getContentPane().add(end_date);
		
		/**
		 * создаём надпись
		 */
		JLabel End_textField = new JLabel("Сумма на конец срока");
		/**
		 * задаём координаты
		 */
		End_textField.setBounds(135, 66, 145, 30);
		/**
		 * добавляем надпись на панель
		 */
		getContentPane().add(End_textField);
		
		/**
		 * создаём текстовое поле
		 */
		end_textField = new JTextField();
		/**
		 * устанавливаем запрет на редактирование текстового поля
		 */
		end_textField.setEditable(false);
		/**
		 * задаём поле
		 */
		end_textField.setColumns(10);
		/**
		 * задаём координаты
		 */
		end_textField.setBounds(145, 96, 86, 20);
		/**
		 * добавляем текстовое поле на панель
		 */
		getContentPane().add(end_textField);
		
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
				 * закрытие формы 
				 */
				setVisible(false);
			}
		});
		/**
		 * задаём координаты
		 */
		Exit_button.setBounds(10, 94, 120, 25);
		/**
		 * добавляем кнопку на панель
		 */
		getContentPane().add(Exit_button);
		
		/**
		 * создаём надпись
		 */
		JLabel label_1 = new JLabel("по");
		/**
		 * задаём координаты
		 */
		label_1.setBounds(245, 38, 18, 20);
		/**
		 * добавляем надпись на панель
		 */
		getContentPane().add(label_1);
		
		/**
		 * создаём надпись
		 */
		JLabel label_3 = new JLabel("Руб.");
		/**
		 * задаём координаты
		 */
		label_3.setBounds(212, 11, 25, 20);
		/**
		 * добавляем надпись на панель
		 */
		getContentPane().add(label_3);
		
		/**
		 * создаём надпись
		 */
		JLabel label_4 = new JLabel("%");
		/**
		 * задаём координаты
		 */
		label_4.setBounds(212, 38, 23, 20);
		/**
		 * добавляем надпись на панель
		 */
		getContentPane().add(label_4);
		
		/**
		 * создаём надпись
		 */
		JLabel label_5 = new JLabel("Руб.");
		/**
		 * задаём координаты
		 */
		label_5.setBounds(232, 96, 30, 20);
		/**
		 * добавляем надпись на панель
		 */
		getContentPane().add(label_5);
			
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
				 * рассчитываем по функции сберегательного депозита,
				 * считывая все переменные
				 */
					end_textField.setText(String.valueOf(c.calc_s(Integer.valueOf(Deposit_textField.getText()), 
							Integer.valueOf(Percent_textField.getText()), diffDays)));
			}
		});
		/**
		 * задаём координаты
		 */
		Calculate_Button.setBounds(10, 69, 120, 25);
		/**
		 * добавляем кнопку на панель
		 */
		getContentPane().add(Calculate_Button);
	}
}