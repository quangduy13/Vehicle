package vehicle.main;

import vehicle.ecc.EllipticCurve;
import vehicle.ecc.Point;
import vehicle.prime.GeneratorPrime;

public class CallVehicle {
	private static long a = 7;
	private static long b = 12;
	private static long p = 103; /* initial curve: E(F_103) : y^2 = x^3 + 7x + 12 */
	private static long Gx = 102; /* initial generator: G = (102, 2) */
	private static long Gy = 2;
	private static long Px = 9; /* initially P = (9, 17) */
	private static long Py = 17;
	private static long Qx = 19; /* initially Q = (19, 0) */
	private static long Qy = 0;
	private static long k = 7; /* initially k = 33 */
	private static int n = 100; /* initially n = 100 random curves */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EllipticCurve el = new EllipticCurve(a, b, p);
		System.out.println("Generator G: ");
		System.out.println(el.listMust(new Point(Gx, Gy, 1)));
		
		System.out.println("Generator P");
		System.out.println(el.listPoints());
		
		System.out.println("Generator secret key");
		GeneratorPrime ge= new GeneratorPrime(103);
		System.out.println(ge.randomPrime());
		
	}

}
