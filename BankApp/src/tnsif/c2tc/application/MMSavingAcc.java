package tnsif.c2tc.application;

import tnsif.c2tc.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc {

	public MMSavingAcc(int accno, String accname, float accbal) {
		super(accno, accname, accbal);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deposite(float charges) {
		System.out.println("you have deposite of charges"+charges);
	}

	@Override
	public String toString() {
		return "MMSavingAcc [isSalary()=" + isSalary() + ", toString()=" + super.toString() + ", getAccno()="
				+ getAccno() + ", getAccname()=" + getAccname() + ", getAccbal()=" + getAccbal() + "]";
	}
	

}
