package tnsif.c2tc.application;

import tnsif.c2tc.framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc {

	public MMCurrentAcc(int accno, String accname, float accbal) {
		super(accno, accname, accbal);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deposite(float charges) {
		System.out.println("you have deposite of charges"+charges+" along with transaction charges "+charges);
	}

}
