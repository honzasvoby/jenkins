package cviceni;

/**
 * Obsahuje zamerne komplikovanou implementaci nasobeni
 * a dalsich pomocnych aritmetickych operaci. 
 * 
 * Trida je thread safe.
 * 
 * @author mhlavaty
 */
public class Ukol2 {
	
	/**
	 * Obrati znamenko na vstupu.
	 * 
	 * @param input cele cislo.
	 * @return 		input s opacnym znamenkem.
	 */
	public static int invert(int input) {
		return -input;
	}
	
	/**
	 * Absolutni hodnota.
	 * 
	 * @param input cele cislo.
	 * @return		je-li vstup nezaporny, pak vraci input, jinak -1*input.
	 */
	public static int abs(int input) {
		return (input >= 0) ? input : invert(input);
	}
	
	/**
	 * Implementace scitani.
	 * 
	 * @param a cele cislo.
	 * @param b cele cislo.
	 * @return  soucet parametru
	 */
	public static int plus(int a, int b) {
		return a + b;
	}
	
	/**
	 * Implementace nasobeni. Presne podle definice
	 * - implementovano jako iterovane scitani.
	 * 
	 * @param a cele cislo.
	 * @param b cele cislo.
	 * @return  soucin parametru
	 */
	public static int krat(int a, int b) {		
		int result = 0;
		
		// result = b + b + b ... (a-krat). Pokud a == 0 tak se neprovede
		for (int i = 0; i < abs(a); i++) {
			result = plus(result, b);
		}
		
		// osetreni nasobeni zapornym cislem
		return (a >= 0) ? result : invert(result);
	}	
}
