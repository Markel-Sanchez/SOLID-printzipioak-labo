package srp;

public class DeductionCalculator {
	public float calculateDeduction(float billAmount, int deductionPercentage) {
        //1. galderan eskatutako baldintza berriaren inplementazioa
        if (billAmount > 50000) {
            return (billAmount * deductionPercentage + 5) / 100;
        } else {
            return (billAmount * deductionPercentage) / 100;
        }
    }
}
