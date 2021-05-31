package paketti1;

import java.util.Scanner;
import java.util.Random;

public class Metaseikkailu {
	// Motivaatio loppui kesken, pelistä tuli lyhyempi kuin suunnittelin
	public static void main(String[] args) {
		int valinta0 = 0;
		Scanner lukija = new Scanner(System.in);

		// Tässä loopissa tulostetaan sopiva vastaus, kunnes pelaaja aloittaa pelin.
		do {
			System.out.println("Aloita uusi peli: 1 | Ohje: 2");
			System.out.print("Valitse toiminta: ");
			valinta0 = lukija.nextInt();

			switch (valinta0) {
			case 1:
				// Hypätään itse peliin
				alunAlku();
				break;
			case 2:
				// Pelaajalle tulostetaan ohjeet
				System.out.println("Tekstiseikkailut eivät vaadi lukutaitoa ja näppäimistöä enempää.");
				System.out.println("Jos haluat pelata uudestaan, käynnistä ohjelma uuteen ikkunnaan.");
				break;
			default:
				// Pelaaja ei vastannut 1/2
				System.out.println("Et antanut loogista syötettä");
			}
		} while (valinta0 != 1);
	}

	public static void alunAlku() {
		int valinta1 = 0;
		int HP = 20;
		String pNimi = "Nimi";
		String sulkija = "Moi";
		Scanner lukija = new Scanner(System.in);

		// Kertoja kysyy pelaajalta, mitä hän haluaa tehdä
		System.out.print("Anna nimesi: ");
		pNimi = lukija.next();

		// Pieni vitsi, jos pelaaja antaa nimekseen "Moi":
		if (pNimi.equals(sulkija)) {
			System.out.println(":)");
			System.exit(1000000);
		}

		System.out.println("Moi " + pNimi + "!" + "\nSinulla on seuraavat toimet käytössäsi:");
		System.out.println("Mene ulos: 1 | Tarkista laukku: 2 | Hauku: 3");
		System.out.println("Teko: ");
		valinta1 = lukija.nextInt();

		do {
			switch (valinta1) {
			case 1:
				System.out.println("Lähdit ulos.");
				valitseSuunta1(valinta1);
				break;
			case 2:
				System.out.println("Sinulla on laukussasi:\nAvaimet \nVesipullo \nSwiss-army veitsi");
				System.out.println("Teko: ");
				valinta1 = lukija.nextInt();
				break;
			case 3:
				System.out.println("No jo nyt on kaverilla otsaa! Tules tänne.");
				// Pelaaja siirretään metodiin, joka voi päättyä Game Over -tulosteeseen.
				Looppeja.taisteluLooppi1(HP);
				// Jos pelaaja voittaa, hän siirtyy alta löytyvään metodiin.
				alunLoppu();
				break;
			default:
				System.out.println("En ymmärrä, voisitko valita oikean vaihtoehdon?");
				System.out.println("Teko: ");
				valinta1 = lukija.nextInt();
			}
		} while (valinta1 != 1 | valinta1 != 2 | valinta1 != 3);
	}

	public static void alunLoppu() {
		int valinta2 = 0;
		Scanner lukija = new Scanner(System.in);

		// Tämä metodi toimii pitkälti samalla tavalla kuin alunAlku()
		System.out.println("Hei, koska sä tarviit kertojaa tässä seikkailussa, "
				+ "mä tulin tuuraamaan. Okei. Mitä sä haluut tehdä?");
		System.out.println("Mene ulos: 1 | Tarkista laukku: 2 | Hauku: 3");
		valinta2 = lukija.nextInt();
		do {
			switch (valinta2) {
			case 1:
				System.out.println("Lähdit ulos.");
				valitseSuunta2();
				break;
			case 2:
				System.out.println("Laukussa on:\navaimet \npullo \nveitsi");
				break;
			case 3:
				System.out.println("Sä et vastannut mun kysymykseen. Mitä sä haluut tehdä?");
				break;
			default:
				System.out.println("Häh?");
			}
		} while (valinta2 != 1 | valinta2 != 3);
	}

	public static void valitseSuunta1(int valinta1) {
		int valinta3 = 0;
		Scanner lukija = new Scanner(System.in);

		System.out.println("Menetkö 1: kaupunkiin vai 2: metsään?");
		valinta3 = lukija.nextInt();

		do {
			if (valinta3 == 1) {
				Alueet.kaupunki();
				pelinLoppu();
			} else if (valinta3 == 2) {
				Alueet.metsä();
				pelinLoppu();
			} else {
				System.out.println("En ymmärrä vastaustasi.");
			}
		} while (valinta3 != 1 || valinta3 != 2);
	}

	public static void valitseSuunta2() {
		// Sama metodi, eri kertoja
		int valinta4 = 0;
		int valinta5 = 0;

		Scanner lukija = new Scanner(System.in);

		System.out.println("Menetkö 1: metsään vai 2: kaupunkiin?");
		valinta4 = lukija.nextInt();
		do {
			if (valinta4 == 1) {
				Alueet.kaupunki();
				pelinLoppu();
			} else if (valinta4 == 2) {
				Alueet.metsä();
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
