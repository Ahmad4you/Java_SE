package enumEx1;

enum FloorTyp{in, out; }

public enum Floor {
	F1(1, "Floor 1"),F2(2),F3(3),F4(4),F5();
	
	private static final Floor[] ENUMS = Floor.values();
	
	public static Floor of(int floor) {
		if(floor < 1 || floor > 4) {
			System.out.println("out of Range!");
			return null;
		}else {
			return ENUMS[floor -1];
		}
	}
	
	public int num;
	public String name;
	public FloorTyp type;
	
	private Floor() {
		System.out.println("Enum Floor");
	}
	
	private Floor(int num) {
		System.out.println("Enum Floor with Int");
		this.num = num;
	}
	
	private Floor(int num, String str) {
		System.out.println("Enum Floor with Itn & String");
		this.num = num;
		this.name = str;
	}
}
