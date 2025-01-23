package yoking.exercise5;

public class funcion_numberMax {

	public static int getNumberMax(int[] number) {

		// Terminar logica
		int numberMax = number[0];
		boolean isAMax = false;
		while (isAMax == false) {

			for (int i = 0; i < number.length; i++) {
				if (number[i] > numberMax) {
					numberMax = number[i];
				}
			}
			isAMax = true;
		}

		return numberMax;
	}
}
