package assoziation1;


public class Schueler {
	private int id_Schueler;
	private String _name;
	private String _vorname;
	private String _lehrjahr;
	
	

	public Schueler(int id_Schueler, String _name, String _vorname, String _lehrjahr) {
		super();
		this.id_Schueler = id_Schueler;
		this._name = _name;
		this._vorname = _vorname;
		this._lehrjahr = _lehrjahr;
		
	}
	
	public int getId_Schueler() {
		return id_Schueler;
	}
//	public void setId_Schueler(int id_Schueler) {
//		this.id_Schueler = id_Schueler;
//	}
	public String get_name() {
		return _name;
	}
//	public void set_name(String _name) {
//		this._name = _name;
//	}
	public String get_vorname() {
		return _vorname;
	}
//	public void set_vorname(String _vorname) {
//		this._vorname = _vorname;
//	}
	public String get_lehrjahr() {
		return _lehrjahr;
	}
//	public void set_lehrjahr(String _lehrjahr) {
//		this._lehrjahr = _lehrjahr;
//	}
	

	@Override
	public String toString() {
		return "Schueler [id_Schueler=" + id_Schueler + ", _name=" + _name + ", _vorname=" + _vorname + ", _lehrjahr="
				+ _lehrjahr  + "]";
	}
	
	
	
	

	
	
	
	

}
