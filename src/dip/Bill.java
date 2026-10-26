package dip;

import java.util.Date;

public class Bill {
    public String code;
    public Date billDate;
    public float billAmount;
    public float VATAmount; 
    public float billDeduction;
    public float billTotal;
    public int deductionPercentage;

    public void totalCalc(DeductionAbstraction d, VATAbstraction vat) {
        
        billDeduction = d.calcDeduction(billAmount, deductionPercentage);
        
        VATAmount = vat.calcVAT(billAmount);
        
        billTotal = (billAmount - billDeduction) + VATAmount;
    }
}