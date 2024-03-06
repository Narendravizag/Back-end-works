package oops1;

class Details {
	// instance variables
	String Name;
	int Accountnumber;
	long Cifnumber;
	String Ifsc;
	String Branchname;
	int Pincode;
	int Balance;
//	 Data or Initialization variable 

	void getData() {
		Name = " NARENDRA";
		Accountnumber = 364528963;
		Cifnumber = 349473254;
		Ifsc = "SBIN006529";
		Branchname = "VIZAG";
		Pincode = 506244;
		Balance = 10000000;
	}

//		  code or Initialization method
	void show() {
		System.out.println("Name:" + Name + "\n" + "Accountnumber:" + Accountnumber + "\n" + "Cifnumber:" + Cifnumber
				+ "\n" + "Ifsc:" + Ifsc + "\n" + "Branchname:" + Branchname + "\n" + "Pincode:" + Pincode + "\n"
				+ "Balance:" + Balance + "\n");
	}
}	
	

	public class accountdetails {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			// TODO Auto-generated method stub
			Details n = new Details();
			n.getData();

			n.show();

		}

	}

