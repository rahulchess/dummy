class InsufficientBal extends Exception{	
	public String toString(){
		return "Balance Should be more than 500";
	}
}

class SavingAccount{
	long ac_no;
	double bal;
	String name;
	public SavingAccount() {
		bal = ac_no = 0;
		name = null;
	}
	public SavingAccount(long a, double b, String n){
		ac_no = a;
		bal = b;
		name = n;
	}
	public String toString(){
		return "Account Number: "+ac_no+"\nOwners Name: "+name+"\nBalance: "+bal+"\n";
	}
}
public class Saving {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
