import java.text.SimpleDateFormat;
import java.util.Date;

public class proj2 {

	public static void main(String[] args) {
		
		
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("sdf: " + sdf);
		System.out.println(d);
//		int jearNow = Integer.parseInt(sdf.format(d));
//		int jearBD = Integer.parseInt(sdf.format(dcBDate.getDate()));
		System.out.println("jearNow"+ sdf.format(d));
	}

}
