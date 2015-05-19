package funkTest;

import java.util.ArrayList;

public class klasse {
	
	private int classID ;
	private String klassenListe;
	private ArrayList<Schueler> pupils = new ArrayList<Schueler>();
	
	public klasse(int ID){
		classID = ID ;
	}
	
	
	public void createClass(String pupilList){
		String allPupil [] = pupilList.substring(3).split(";");
		
		Schueler pupil = new Schueler(allPupil[1],allPupil[2],Integer.parseInt(allPupil[3].substring(0, 2)),this.classID);
		pupils.add(pupil);
		
		if(allPupil.length%3 == 1){ //Prüfung ob der Array durch 3 Teilbar ist und 1 übrig bleibt für die ID 
			for(int i = 1 ; i < allPupil.length;i = i+3){
			
			//System.out.println(allPupil[i]+allPupil[i+1]+Integer.parseInt(allPupil[i+2].substring(0, 2)));
			Schueler s = new Schueler(allPupil[i],allPupil[i+1],Integer.parseInt(allPupil[i+2].substring(0, 2)),this.classID); //Schueler wird erzeugt, Array Index 0 ist für die ID Reserviert, danach sind immer 3 nachfolgende ArrayPlätze mit Name, Vorname und Schüler ID
			pupils.add(s);
			
			}
		}
		else{
			System.out.println("Dataset is incomplete!");
		}



	
		
		//System.out.println("Ende der Klasse  "+this.classID+ " ________________");

	}
	
	public void eintragZuordnen(){
		
	}
	
	
	public void addPupil(Schueler s){
		pupils.add(s);
	}
	
	public void setklassenListe(String s){
		klassenListe = s;
	}
	
	public int getID(){
		return this.classID;
	}
	
	public Schueler compareEindeutigeID(String ID){ //Prüft ob Eindeutige ID aus Register.txt mit der eines Sch+lers übereinstimmt
		
		Schueler s = null;
		
		for(int i =0; i < pupils.size() ; i++){
			if(pupils.get(i).geteindeutigeID() == ID){
				s = pupils.get(i);
			}
		}
		
		return s;
	}
	
	public Schueler arrayInfo(int i){
		
		return pupils.get(i);
	}

}
