package vehicle.hash;

import java.util.ArrayList;
import java.util.List;

import vehicle.dto.CyclicDTO;
import vehicle.ecc.EllipticCurve;
import vehicle.ecc.Point;

public class HashChain {
	EllipticCurve eclip = new EllipticCurve(7,12,103);
	public CyclicDTO H3(int secret, int prime){
		int s = secret% prime;
		CyclicDTO cyclicDTO = new CyclicDTO();
		cyclicDTO = eclip.listMust1(new Point(13, 2, 1)).get(s);
		return cyclicDTO;
	}
}
