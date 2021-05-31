package paketti1;

import java.util.Scanner;
import java.util.Random;

public class Metaseikkailu {
	// Motivaatio loppui kesken, pelist� tuli lyhyempi kuin suunnittelin
	public static void main(String[] args) {
		int valinta0 = 0;
		Scanner lukija = new Scanner(System.in);

		// T�ss� loopissa tulostetaan sopiva vastaus, kunnes pelaaja aloittaa pelin.
		do {
			System.out.println("Aloita uusi peli: 1 | Ohje: 2");
			System.out.print("Valitse toiminta: ");
			valinta0 = lukija.nextInt();

			switch (valinta0) {
			case 1:
				// Hyp�t��n itse peliin
				alunAlku();
				break;
			case 2:
				// Pelaajalle tulostetaan ohjeet
				System.out.println("Tekstiseikkailut eiv�t vaadi lukutaitoa ja n�pp�imist�� enemp��.");
				System.out.println("Jos haluat pelata uudestaan, k�ynnist� ohjelma uuteen ikkunnaan.");
				break;
			default:
				// Pelaaja ei vastannut 1/2
				System.out.println("Et antanut loogista sy�tett�");
			}
		} while (valinta0 != 1);
	}

	public static void alunAlku() {
		int valinta1 = 0;
		int HP = 20;
		String pNimi = "Nimi";
		String sulkija = "Moi";
		Scanner lukija = new Scanner(System.in);

		// Kertoja kysyy pelaajalta, mit� h�n haluaa tehd�
		System.out.print("Anna nimesi: ");
		pNimi = lukija.next();

		// Pieni vitsi, jos pelaaja antaa nimekseen "Moi":
		if (pNimi.equals(sulkija)) {
			System.out.println(":)");
			System.exit(1000000);
		}

		System.out.println("Moi " + pNimi + "!" + "\nSinulla on seuraavat toimet k�yt�ss�si:");
		System.out.println("Mene ulos: 1 | Tarkista laukku: 2 | Hauku: 3");
		System.out.println("Teko: ");
		valinta1 = lukija.nextInt();

		do {
			switch (valinta1) {
			case 1:
				System.out.println("L�hdit ulos.");
				valitseSuunta1(valinta1);
				break;
			case 2:
				System.out.println("Sinulla on laukussasi:\nAvaimet \nVesipullo \nSwiss-army veitsi");
				System.out.println("Teko: ");
				valinta1 = lukija.nextInt();
				break;
			case 3:
				System.out.println("No jo nyt on kaverilla otsaa! Tules t�nne.");
				// Pelaaja siirret��n metodiin, joka voi p��tty� Game Over -tulosteeseen.
				Looppeja.taisteluLooppi1(HP);
				// Jos pelaaja voittaa, h�n siirtyy alta l�ytyv��n metodiin.
				alunLoppu();
				break;
			default:
				System.out.println("En ymm�rr�, voisitko valita oikean vaihtoehdon?");
				System.out.println("Teko: ");
				valinta1 = lukija.nextInt();
			}
		} while (valinta1 != 1 | valinta1 != 2 | valinta1 != 3);
	}

	public static void alunLoppu() {
		int valinta2 = 0;
		Scanner lukija = new Scanner(System.in);

		// T�m� metodi toimii pitk�lti samalla tavalla kuin alunAlku()
		System.out.println("Hei, koska s� tarviit kertojaa t�ss� seikkailussa, "
				+ "m� tulin tuuraamaan. Okei. Mit� s� haluut tehd�?");
		System.out.println("Mene ulos: 1 | Tarkista laukku: 2 | Hauku: 3");
		valinta2 = lukija.nextInt();
		do {
			switch (valinta2) {
			case 1:
				System.out.println("L�hdit ulos.");
				valitseSuunta2();
				break;
			case 2:
				System.out.println("Laukussa on:\navaimet \npullo \nveitsi");
				break;
			case 3:
				System.out.println("S� et vastannut mun kysymykseen. Mit� s� haluut tehd�?");
				break;
			default:
				System.out.println("H�h?");
			}
		} while (valinta2 != 1 | valinta2 != 3);
	}

	public static void valitseSuunta1(int valinta1) {
		int valinta3 = 0;
		Scanner lukija = new Scanner(System.in);

		System.out.println("Menetk� 1: kaupunkiin vai 2: mets��n?");
		valinta3 = lukija.nextInt();

		do {
			if (valinta3 == 1) {
				Alueet.kaupunki();
				pelinLoppu();
			} else if (valinta3 == 2) {
				Alueet.mets�();
				pelinLoppu();
			} else {
				System.out.println("En ymm�rr� vastaustasi.");
			}
		} while (valinta3 != 1 || valinta3 != 2);
	}

	public static void valitseSuunta2() {
		// Sama metodi, eri kertoja
		int valinta4 = 0;
		int valinta5 = 0;

		Scanner lukija = new Scanner(System.in);

		System.out.println("Menetk� 1: mets��n vai 2: kaupunkiin?");
		valinta4 = lukija.nextInt();
		do {
			if (valinta4 == 1) {
				Alueet.kaupunki();
				pelinLoppu();
			} else if (valinta4 == 2) {
				Alueet.mets�();
				pelinLoppu();
			} else {
				System.out.println("?");
			}
		} while (valinta4 != 1 || valinta4 != 2);

	}

	public static void pelinLoppu() {
		System.out.print("Onneksi olkoon, sait seikkailun loppuun.");
		System.exit(1000000);
	}

}
