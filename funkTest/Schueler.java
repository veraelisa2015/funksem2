package funkTest;

import java.util.ArrayList;

public class Schueler {
	
	private String name = new String();
	private String vorname = new String();

	private ArrayList<eintrag> eintraege = new ArrayList<eintrag>() ;
	private klasse classID;
	private String eindeutigeID;
	private int ID ;
	
	public Schueler(String n, String firstName, int ID, int klassenID){
		name = n ;
		vorname = firstName;
		this.ID = ID;
		StringBuilder sg = new StringBuilder();
		sg.append(Integer.toString(klassenID));
		sg.append(Integer.toString(this.ID)); //Hier wird die eindeutige ID aus KlassenID und Schüler ID zusammengesetzt
		eindeutigeID = sg.toString();
	}
	
	public void addEintrag(eintrag e){
		eintraege.add(e);
	}
	
	public void setID(int dieseID){
		ID = dieseID ;
	}
	
	public void setFirstName(String n){
		vorname = n ;
	}

	public String getName() {
		return name;
	}

	public String getVorname() {
		return vorname;
	}

	public int getID() {
		return ID;
	}
	public String geteindeutigeID() {
		return eindeutigeID;
	}

}
