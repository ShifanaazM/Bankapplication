package tnsif.c2tc;

import tnsif.c2tc.application.MMCurrentAcc;
import tnsif.c2tc.application.MMSavingAcc;
import tnsif.c2tc.application.MMBankFactory;
import tnsif.c2tc.framework.CurrentAcc;
import tnsif.c2tc.framework.SavingAcc;
import tnsif.c2tc.framework.BankFactory;

public class Client {

	public static void main(String[] args) {
		BankFactory bf=new MMBankFactory();
		SavingAcc sa=new MMSavingAcc(123,"shifu",2000);
		sa.withdraw(500);
		CurrentAcc ca=new CurrentAcc(1234,"suhana",0);
		ca.withdraw(1000);
	}

}
