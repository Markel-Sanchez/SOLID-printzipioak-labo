package srp;

public class Bill {
	public String code;
    public String billDate;
    public float billAmount;
    public float VAT;
    public float billDeduction;
    public float billTotal;
    public int deductionPercentage;
    
    private final DeductionCalculator deductionCalculator;
    private final VatCalculator vatCalculator;

    //ardurak eraikitzailearen bidez injektatzen dira
    public Bill(DeductionCalculator deductionCalculator, VatCalculator vatCalculator) {
        this.deductionCalculator = deductionCalculator;
        this.vatCalculator = vatCalculator;
    }

    public void totalCalc() {
        //dedukzioaren kalkulua eskuordetu
        this.billDeduction = deductionCalculator.calculateDeduction(this.billAmount, this.deductionPercentage);
        
        //VAT kalkulua eskuordetu
        this.VAT = vatCalculator.calculateVat(this.billAmount, this.code);
        
        //Bill klasea bere egoera propioa eguneratzeaz soilik arduratzen da
        this.billTotal = (this.billAmount - this.billDeduction) + this.VAT;
    }
}