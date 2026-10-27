package srp;

public class VatCalculator {
	//fakturaren kodea pasatzen da 3. galderako baldintza betetzeko
    public float calculateVat(float billAmount, String billCode) {
        if ("0".equals(billCode)) {
            return 0f; //ez da VAT-ik aplikatzen kodea 0 bada
        }
        //2. galderan eskatutako %18-ko aplikazioa
        return (float) (billAmount * 0.18);
    }
}
