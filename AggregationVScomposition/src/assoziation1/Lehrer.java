package assoziation1;

import java.util.ArrayList;
import java.util.List;

public class Lehrer {
	
	private int id_Lehrer;
	private String _name;
	private String _vorname;
	private String _faecher;
	private List<Schueler> _SchuelerList;  // Assoziation 1 to * (in class 1 list added)
//	private Schueler schueler;        // Assoziation 1 to 1
	
	
	public Lehrer(int id_Lehrer, String _name, String _vorname, String _faecher) {
		this.id_Lehrer = id_Lehrer;
		this._name = _name;
		this._vorname = _vorname;
		this._faecher = _faecher;
		this._SchuelerList = new ArrayList<Schueler>();
	}
	
	
	public List<Schueler> get_SchuelerList() {
		return _SchuelerList;
	}


	public void set_SchuelerList(List<Schueler> _schuelerList) {
		this._SchuelerList = _schuelerList;
	}


	
	
	public int getId_Lehrer() {
		return id_Lehrer;
	}
	public void setId_Lehrer(int id_Lehrer) {
		this.id_Lehrer = id_Lehrer;
	}
	public String get_name() {
		return _name;
	}
	public void set_name(String _name) {
		this._name = _name;
	}
	public String get_vorname() {
		return _vorname;
	}
	public void set_vorname(String _vorname) {
		this._vorname = _vorname;
	}
	public String get_faecher() {
		return _faecher;
	}
	public void set_faecher(String _faecher) {
		this._faecher = _faecher;
	}


	@Override
	public String toString() {
		return "Lehrer [id_Lehrer=" + id_Lehrer + ", _name=" + _name + ", _vorname=" + _vorname + ", _faecher="
				+ _faecher + ", schuelern=" + _SchuelerList + "]";
	}

	
}
