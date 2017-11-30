package vehicle.hash;

import java.util.ArrayList;
import java.util.List;

public class HashChain {
	
	public int H3(int secret, int prime){
		int s = secret% prime;
		
		return s;
	}
}
