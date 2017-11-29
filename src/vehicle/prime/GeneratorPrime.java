package vehicle.prime;

import java.util.Random;

public class GeneratorPrime {
	
	private int prime;
	public GeneratorPrime(int prime){
		this.prime = prime;
	}
	
	public int randomPrime(){
		int num;
		Random random = new Random();
		
		num = random.nextInt(prime)+1;
		if(checkPrime(num)==true){
			return num;
		}
		else
			return randomPrime();
		
	}
	public Boolean checkPrime(int num){
		for(int i=2;i<num;i++){
			if(num % i == 0)
				return false;
		}
		return true;
	} 
	
}
