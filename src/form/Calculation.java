/**
 * Указываем, что класс принадлежит пакету form
 */
package form;
/**
 * Создаем класс
 */
public class Calculation {
	/**
	 * объявляем статичную общедоступную целочисленную функцию для вычисления
	 * сберегательного депозита
	 */
	public static int calc_s(int deposit, int percent, long days){
		/**
		 * обнуляем переменную summ
		 */
		int summ = 0;
			/**
			 * вычисляем по формуле
			 */
			summ = (int) (deposit + (deposit * percent * Math.abs(days)) / (365 * 100));
		/**
		* возвращаем переменную summ
		*/	
		return summ;
	}
	/**
	 * объявляем статичную общедоступную целочисленную функцию для вычисления
	 * накопительного депозита
	 */
	public static int calc_n(int deposit, int percent, int periodicity ,int ammount, long days){
		/**
		 * вычисляем переменную periodicity, которая отвечает за количество
		 * пополнений депозита
		 */
		periodicity = (int)((days/30)/periodicity);
		/**
		 * обнуляем переменную
		 */
		int summ = 0;
		/**
		 * формируем массив для вычисления накопительного депозита
		 */
		for(int i = 1; i <= days; i++){
			/**
			 * вычисляем переменную summ по формуле
			 */
			summ = (int)(deposit + (deposit * percent * days) / (365 * 100));
			/**
			 * проверка на необходимость суммирования суммы пополнения и основного
			 * депозита
			 */
			if(periodicity > 0){
				/**
				 * суммируются все значения и записываются в переменную deposit 
				 */
				deposit += ammount;
				/**
				 * уменьшаем количество пополнений	
				 */
				periodicity --;
				}
			}
		/**
		 * возвращаем переменную summ
		 */
		return summ;
	}
}
