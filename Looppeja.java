package paketti1;

import java.util.Random;
import java.util.Scanner;

public class Looppeja {

	public static void main(String[] args) {

	}

	public static int taisteluLooppi1(int HP) {
		int kertojanHP = 15;
		int vVahinko = 5;

		int lHP = HP;
		int pVahinko = 3;

		int toiminta = 0;

		Scanner lukija = new Scanner(System.in);

		System.out.println("");
		System.out.println("(Kertoja haastoi sinut tappeluun!)");
		System.out.println("");

		while (kertojanHP > 0 || HP > 0) {
			System.out.println("-------------------------------------------------");
			System.out.println("(Mit� teet?)");
			System.out.println("(1: Hy�kk�� | 2: Tarkista | 3: Juokse pakoon)");

			String input = lukija.nextLine();
			if (input.equals("1")) {
				int osumisMahd = new Random().nextInt(3);

				if (osumisMahd == 1 | osumisMahd == 2) {
					kertojanHP -= pVahinko;
					lHP -= vVahinko;
					System.out.println("(Kertoja menetti " + pVahinko + " HP)");
					System.out.println("(Sin� menetit " + vVahinko + "HP)");
				} else if (osumisMahd == 3) {
					System.out.println("(Kertoja menetti " + pVahinko + " HP)");
					System.out.println("(V�istit kertojan hy�kk�yksen!)");

				} else if (input.equals("2")) {
					System.out.println("(Sinun HP: " + lHP + ")");
					System.out.println("(Kertojan HP: " + kertojanHP + ")");
					System.out.println("(Kertoja joutuu sirist�m��n silmi��n koko ajan.)");

				} else if (input.equals("3")) {
					System.out.println("(Et p��ssyt pakoon!)");
				}

			} else {
				System.out.println("(Virheellinen sy�te.)");
			}

			if (kertojanHP <= 0) {
				System.out.println("(Voitit taistelun.)");
				System.out.println("-------------------------------------------------");
				return HP;
			} else if (lHP <= 0) {
				System.out.println("Game over.");
				System.exit(1000000);
			}

		}

		return HP;

	}

	public static int taisteluLooppi2() {
		int kissanHP = 15;
		int kissaVahinko = 3;

		int HP = 20;
		int pVahinko = 5;

		int toiminta = 0;

		Scanner lukija = new Scanner(System.in);

		System.out.println("");
		System.out.println("(Aloitit taistelun!)");
		System.out.println("");

		while (kissanHP > 0 || HP > 0) {
			System.out.println("-------------------------------------------------");
			System.out.println("(Mit� teet?)");
			System.out.println("(1: Hy�kk�� | 2: Tarkista | 3: Juokse pakoon)");

			String input = lukija.nextLine();
			if (input.equals("1")) {
				int osumisMahd = new Random().nextInt(3);

				if (osumisMahd == 1 | osumisMahd == 2) {
					kissanHP -= pVahinko;
					HP -= kissaVahinko;
					System.out.println("(Kissa menetti " + pVahinko + " HP)");
					System.out.println("(Sin� menetit " + kissaVahinko + "HP)");
				} else if (osumisMahd == 3) {
					System.out.println("(Kissa v�isti sinun hy�kk�yksen!)");
					System.out.println("(Sin� menetit " + kissaVahinko + " HP)");

				}
				if (input.equals("2")) {
					System.out.println("Sinun HP: " + HP + ")");
					System.out.println("(Kissan:n HP: " + kissanHP + ")");
					System.out.println("(Jostain syyst� kissat eiv�t pid� sinusta...)");

				}
				if (input.equals("3")) {
					System.out.println("(L�hdit pakoon!)");
					return HP;
				}

			} else {
				System.out.println("(Virheellinen sy�te.)");
			}

			if (kissanHP <= 0) {
				System.out.println("(Voitit taistelun.)");
				System.out.println("-------------------------------------------------");
				return HP;
			} else if (HP <= 0) {
				System.out.println("Game over.");
				System.exit(1000000);
			}

		}

		return HP;

	}
}