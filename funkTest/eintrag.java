package funkTest;
/**
 * Class for all entries. 
 * This class has no general functions.
 * 
 * @author Vera Gögelein 9267625
 * @author Simon Bayer 5601000
 * @author Robert Leipelt 9469264
 * @author Patrice Bender 1176484
 * 
 * @version 1.0
 *
 */
public class eintrag {

	private String notiz;
	private String datum;
	private String IDofPupil;
	
	public eintrag(String n, String date, String ID){
		notiz = n;
		datum = date;
		IDofPupil = ID;
	}

	public String getNotiz() {
		return notiz;
	}

	public void setNotiz(String notiz) {
		this.notiz = notiz;
	}

	public String getDatum() {
		return datum;
	}

	public void setDatum(String datum) {
		this.datum = datum;
	}

	public String getIDofPupil() {
		return IDofPupil;
	}

	public void setIDofPupil(String iDofPupil) {
		IDofPupil = iDofPupil;
	}
	
}
