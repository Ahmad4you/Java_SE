package kundenverwaltung;

public class Kunde {
	private Long _KundeNr;
	private String _Vorname;
	private String _Nachname;
	private String _Bezeichnung;
	
	
	public Long get_KundeNr() {
		return _KundeNr;
	}
	public void set_KundeNr(Long _KundeNr) {
		this._KundeNr = _KundeNr;
	}
	public String get_Vorname() {
		return _Vorname;
	}
	public void set_Vorname(String _Vorname) {
		this._Vorname = _Vorname;
	}
	public String get_Nachname() {
		return _Nachname;
	}
	public void set_Nachname(String _Nachname) {
		this._Nachname = _Nachname;
	}
	public String get_Bezeichnung() {
		return _Bezeichnung;
	}
	public void set_Bezeichnung(String _Bezeichnung) {
		this._Bezeichnung = _Bezeichnung;
	}
	@Override
	public String toString() {
		return "Kunde [_KundeNr=" + _KundeNr + ", _Vorname=" + _Vorname + ", _Nachname=" + _Nachname + ", _Bezeichnung="
				+ _Bezeichnung + "]";
	}
	
	

}
