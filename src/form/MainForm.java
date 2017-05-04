/**
 * Указываем, что класс принадлежит пакету form
 */
package form;
/**
 * импортируем класс для запуска формы из потока очереди
 */
import java.awt.EventQueue;
/**
 * Импортируем класс для создания фрейма
 */
import javax.swing.JFrame;
/**
 * Импортируем класс для создания надписи
 */
import javax.swing.JLabel;
/**
 * импортируем класс для формы
 */
import form.Sberegatel;
/**
 * импортируем класс для формы
 */
import form.Nakopitel;
/**
 * Импортируем класс для кнопки
 */
import javax.swing.JButton;
/**
 * Импортируем класс для обработки нажатий 
 */
import java.awt.event.ActionListener;
/**
 * Импортируем класс-слушатель для передачи информации о событии
 */
import java.awt.event.ActionEvent;
/**
 * создаем общедоступный класс и наследуем класс фрейма для главной формы
 */
public class MainForm extends JFrame {
	/**
	 * главный метод, с которого начинается запуск программы
	 */
	public static void main(String[] args) {
		/**
		 * Запускаем форму из очереди потоков
		 */
		EventQueue.invokeLater(new Runnable() {
			/**
			 * Запуск
			 */
			public void run() {
				/**
				 * отмечаем начала блока кода, который потенциально может привести к ошибке
				 */
				try {
					/**
					 * создаём переменную типа MainForm
					 */
					MainForm frame = new MainForm();
					/**
					 * задаём видимость для фрейма
					 */
					frame.setVisible(true);
				/**
				* указание на исключение
				*/
				} catch (Exception e) {
					/**
					 * отображает трассировку стека
					 */
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * объявление метода, в котором объявляются элементы экранной формы и ее события
	 */
	public MainForm() {
		/**
		 * устанавливаем название фрейма
		 */
		setTitle("Выбор типа депозита");
		/**
		 * задаем координаты фрейма
		 */
		setBounds(100, 100, 386, 274);
		/**
		 * указываем действие, которое необходимо выполнить когда 
		 * пользователь закрывает фрейм нажатием на крестик, 
		 * то есть здесь закрыть фрейм
		 */
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		/**
		 * указываем метод взаимного расположения элементов
		 */
		getContentPane().setLayout(null);
		/**
		 * создаем и задаем надпись
		 */
		JLabel label = new JLabel("Выберите тип депозита");
		/**
		 * задаем координаты  надписи
		 */
		label.setBounds(131, 11, 191, 34);
		/**
		 * добавляем надпись на фрейм
		 */
		getContentPane().add(label);
		/**
		 * создаем кнопку и название кнопки
		 */
		JButton btnNewButton = new JButton("Сберегательный");
		/**
		 * Обрабатываем нажатие на кнопку
		 */
		btnNewButton.addActionListener(new ActionListener() {
			/**
			 * событие при нажатии на кнопку
			 */
			public void actionPerformed(ActionEvent e) {
				/**
				 * задаем видимость для формы сберегательного депозита
				 */
				new Sberegatel().setVisible(true);
			}
		});
		/**
		 * задаем координаты
		 */
		btnNewButton.setBounds(102, 50, 191, 51);
		/**
		 * добавляем кнопку на фрейм
		 */
		getContentPane().add(btnNewButton);
		
		/**
		 * создаем кнопку и название кнопки
		 */
		JButton btnNewButton_1 = new JButton("Накопительный");
		/**
		 * обрабатываем нажатие на кнопку
		 */
		btnNewButton_1.addActionListener(new ActionListener() {
			/**
			 * событие при нажатии на кнопку
			 */
			public void actionPerformed(ActionEvent arg0) {
				/**
				 * задаем видимость для формы накопительнго депозита
				 */
				new Nakopitel().setVisible(true);
			}
		});
		/**
		 * задаем координаты
		 */
		btnNewButton_1.setBounds(102, 101, 191, 51);
		/**
		 * добавляем кнопку на фрейм
		 */
		getContentPane().add(btnNewButton_1);
		/**
		 * создаем кнопку и название кнопки
		 */
		JButton Exit_button = new JButton("Выход");
		/**
		 * обрабатываем нажатие на кнопку
		 */
		Exit_button.addActionListener(new ActionListener() {
			/**
			 * событие при нажатии на кнопку
			 */
			public void actionPerformed(ActionEvent e) {
				/**
				 * программа закрывается
				 */
				System.exit(0);
			}
		});
		/**
		 * задаем координаты
		 */
		Exit_button.setBounds(102, 152, 191, 51);
		/**
		 * добавляем кнопку на фрейм
		 */
		getContentPane().add(Exit_button);
	}
}