package paketti1;

import java.util.Random;
import java.util.Scanner;

public class Alueet {

	public static void main(String[] args) {

	}

	public static void mets�() {
		int randomNumero = new Random().nextInt(2);

		int dialogi1A = 0;
		int dialogi1A1 = 0;
		int dialogi1A2 = 0;

		int dialogi1B = 0;
		int dialogi1B1 = 0;

		String enter = "";

		Scanner lukija = new Scanner(System.in);

		System.out.println("Saavuit mets��n. Ilmassa tuoksuu kuiva hiekka ja sahanpuru.");

		if (randomNumero == 1) {
			System.out.println("K�velless�si pitkin tuttuja maisemia, polulle ilmestyi korppi.");
			System.out.println("Korppi:\"Kraa! Kerro mulle vitsi!\"");
			System.out.println("1: \"Kop kop...\"");
			System.out.println("2: \"Mit� savolainen talitintti sanoi toiselle?\"");
			System.out.println("3: \"Ei minun tarvitse, el�m� on jo aikamoinen vitsi.\"");
			dialogi1A = lukija.nextInt();

			do {
				switch (dialogi1A) {
				case 1:
					System.out.println("\"Kuka siell�?\"");
					System.out.println("1: \"Verokarhu.\"");
					System.out.println("2: \"Candice.\"");
					dialogi1A1 = lukija.nextInt();
					if (dialogi1A1 == 1) {
						System.out.println("Korppi: Kraa! Minua sin� et nappaa!");
						System.out.println("Korppi lensi pois... mutta sen kireisess� pyr�hdyksess� tippui jotain.");
						System.out.println("Sait hopeasormuksen! (Et saa selv��, kenen nimi siin� lukee.)");
					}
					if (dialogi1A1 == 2) {
						System.out.println("Korppi: Candice kuka?");
						dialogi1A2 = lukija.nextInt();
						System.out.println(
								"Ennen kuin ehdit sanoa vitsin loppuun, Korppi muisti vitsisi jostain toisesta asiayhteydest�.");
						enter = lukija.nextLine();
						System.out.println("Hyvin pettyneen� itseens�, se l�hti lentoon eik� palannut takaisin.");
						enter = lukija.nextLine();
						System.out.println("Sait korpin sulan!");
					}
					break;
				case 2:
					System.out.println("Korppi: \"No kerr-roppas.\"");
					dialogi1A1 = lukija.nextInt();
					System.out.println("\"Titi hyvinniin tyy.\"");
					enter = lukija.nextLine();
					System.out.println("Korppi: \"Kraa ha haa!\"");
					enter = lukija.nextLine();
					System.out.println("Korpin makea nauru sai sinutkin nauramaan.");
					enter = lukija.nextLine();
					break;
				case 3:
					System.out.println("...");
					enter = lukija.nextLine();
					System.out.println("Korppi: \"Onks sul kaikki hyvin?\"");
					enter = lukija.nextLine();
					System.out.println("Hetken tuijottamisen j�lkeen, korppi lent�� pois kiusallisesta tilanteesta.");
					enter = lukija.nextLine();
					break;
				default:
					System.out.println("(Anna kunnon sy�te, t�� alkaa k�ym��n vanhaksi.)");
				}
			} while (dialogi1A < 1 | dialogi1A > 3);

			System.out.println("");
			return;
		}

		if (randomNumero == 2) {
			System.out.println("Mets�lenkkisi varrella t�rm��tkin metrsuriin ja tielle kaatuneeseen puuhun.");
			System.out.println("1: \"Tarvitsetko apua puun hakkaamisessa?\" \n2: \"Hieno ilma, eik�s?\" \n3: \"Moi.\"");
			enter = lukija.nextLine();
			System.out.println("Metsuri:\"Sori, en muista mit� mun piti sanoa.\"");
			enter = lukija.nextLine();
			System.out.println("Repliikit unohtui...");
			System.out.println("1: \"Jahas, mun vastauksilla ei n�k�j��n ole v�li�?\"");
			System.out.println("2: \"Mihin kertoja h�visi?\"");
			System.out.println("3: \"Ehk� m� vaan k�velen t�st� l�pi, nyt kun nelj�s sein� on murskattu...\"");
			enter = lukija.nextLine();
		}

		System.out.println("");
		return;
	}

	public static void kaupunki() {
		int dialogi2 = 0;
		int taistelu = 0;
		String enter = "";

		Scanner lukija = new Scanner(System.in);

		System.out.println(
				"Saavuit kaupunkiin. Y� on jo on laskeutunut, eik� kaduilla kulje ristin sieluakaan... Hetkinen?");

		System.out.println("Joku tulee sinua vastaan kadulla.");
		System.out.println("Saippuakauppias:\"Terve! Onkos kaverilla tarve ostoo saippuaa?\"");
		System.out.println("1: \"Kyll�, mutta mulla ei ole rahaa.\" \n2: \"Ei.\"");
		dialogi2 = lukija.nextInt();
		if (dialogi2 == 1) {
			System.out.println(
					"El� h�tt�ile mokomia. Saat ottaa t�st� samppelin. Muista vuan laittaa hyv� sana eti�pp�in.");
			enter = lukija.nextLine();
			System.out.println("");
			enter = lukija.nextLine();
		} else if (dialogi2 == 2) {
			System.out.println("No eip� mittee. Y�n jatkoja vuan.");
			enter = lukija.nextLine();
			System.out.println("");
			enter = lukija.nextLine();
		}
		System.out.println("Eteesi tepastelee kissa. Se mulkoilee sinua vihaisesti.");
		System.out.println("N�ytt�� silt�, ett� se haastaa riitaa. Aloitatko tappelun?");
		System.out.println("1: Kyll� | 2: Ei");
		taistelu = lukija.nextInt();
		if (taistelu == 1) {
			Looppeja.taisteluLooppi2();
		} else if (taistelu == 2) {
			System.out.println("Tarpeeksi mulkoiltuaan, kissa k�velee pois.");
		}
		return;
	}

}
