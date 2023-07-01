package JavaModuleTest;

public class SalaryCaculate {


	public double bonuscalcul(double B) {
		double bonus=B;
		if(bonus<500) {
			return bonus;
		}else {
			return bonus=bonus+(bonus*0.2);
		}

	}

}
