package funkTest;
/**
 * Class to read the datasets and assigning them.
 * 
 * @author Vera Gögelein 9267625
 * @author Simon Bayer 5601000
 * @author Robert Leipelt 9469264
 * @author Patrice Bender 1176484
 *
 *@version 1.0
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Klassenbuch {
	/**
	 * Creating of ArrayLists to save the datasets from the different users.
	 * 
	 */
	ArrayList<String> KlassenArray = new ArrayList<String>();
	ArrayList<String> SchuelerArray = new ArrayList<String>();
	ArrayList<klasse> dieKlassen = new ArrayList<klasse>();
	ArrayList<Schueler> dieSchueler = new ArrayList<Schueler>();

	public static void main(String[] args) {
		Klassenbuch k1 = new Klassenbuch();
		k1.ReadData();
		//k1.eintragzuOrdnen();
	}

	private void ReadData() {
/**
 * Trying to read the infomations of the text file student.txt.
 * 
 * @param myfile The File that would be read.
 * @param filescanner Is a scanner to read the text file.
 * @param helper[i] A helper array to find positions in the ArrayList.
 * @param k New object to bring informations from the text file.
 */
		try {

			StringBuilder sb = new StringBuilder();

			File myfile = new File(
					"/Users/Patrice/Documents/workspace/funk/src/funkTest/student.txt");

			Scanner fileScanner = new Scanner(myfile);

			String s = new String();
			Schueler p;

			while (fileScanner.hasNextLine()) {
				s = fileScanner.nextLine();
				// System.out.println(s);  new line have to be
				sb.append(s + "\n");

			}
			// String der Textdatei wird im Array helper nach Klassen aufgeteilt
			String[] helper = sb.toString().split("<class>");

			// es werden Klassenobjekte erzeugt die die Klassenlisten speichern

			for (int i = 1; i < helper.length; i++) {
			
				String classID = new String(helper[i].substring(0, 3));
				klasse k = new klasse(Integer.parseInt(helper[i]
						.substring(0, 3))); // Holt ID der Klassen aus Textdatei
				k.setklassenListe(helper[i]);

				k.createClass(helper[i]);
				dieKlassen.add(k);
			}

			// Test, alle Klassen werden mit allen Schülern ausgegeben,
			// zusätzlich zu jedem Schüler die Eindeutige ID

			for (int i = 0; i < dieKlassen.size(); i++) {

				for (int o = 1; o < dieKlassen.size(); o++) {
					System.out
							.println(dieKlassen.get(i).arrayInfo(o).getName());
					System.out.println(dieKlassen.get(i).arrayInfo(o)
							.geteindeutigeID());
				}
				System.out.println("ENDE der Klasse________"
						+ dieKlassen.get(i).getID());
			}

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public void eintragzuOrdnen() {
				/**
		 * Trying to read the informations of the text file register.txt.
		 * Every entry will assingned to a register.
		 * 
		 * @param myRegister The file that would be read.
		 * 
		 */
		File myRegister = new File(
				"/Users/Patrice/Documents/workspace/funk/src/funkTest/register.txt");
		Scanner fileScanner;
		try {
			fileScanner = new Scanner(myRegister);
			StringBuilder sb = new StringBuilder();

			while (fileScanner.hasNextLine()) {

				
				sb.append(fileScanner.nextLine() + "\n");

			}
			String klassen [] = sb.toString().split(";"); //teilt Register.txt in einzelne klassenbereiche
			
			
			String einzelne [] = klassen[1].split(";") ;
			
			//Hier muss die eindeutige ID mit der Klassen ID verglichen werden, wenn klassenID mit einer EintragsID zusammenpasst kann man diesen zuordnen
			for(int i = 0; i < klassen.length;i++){
				System.out.println(klassen[0]);
				
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
}
