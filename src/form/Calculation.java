package form;

public class Calculation {
	public static int calc_s(int deposit, int percent, long days){
		int summ = 0;
			summ = (int) (deposit + (deposit * percent * Math.abs(days)) / (365 * 100));
		return summ;
	}
	public static int calc_n(int deposit, int percent, int periodicity ,int ammount, long days){
		periodicity = (int)((days/30)/periodicity);
		int summ = 0;
		for(int i = 1; i <= days; i++){
			summ = (int)(deposit + (deposit * percent * days) / (365 * 100));
				if(periodicity > 0){
					deposit += ammount;
					periodicity --;
				}
			}
		return summ;
	}
}
