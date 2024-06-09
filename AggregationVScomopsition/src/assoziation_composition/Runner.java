package assoziation_composition;

public class Runner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Motorrad meinMotorrad = new Motorrad(new Motor(62, 0.6), new Reifen(60, 2.5, "Sommer"),
				new Reifen(65, 2.5, "Sommer"));
//		System.out.println(meinMotorrad.getVorderreifen().getDurchmesser());
		meinMotorrad.schreibeInfo();
		
	}

}
