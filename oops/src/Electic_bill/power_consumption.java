package Electic_bill;

class power_consumption1 {
	// here declaration of variables
	int uniq, id, serial_num, units;
	String coust_name, coust_num, coust_area, coust_ero;
	

	// creating instance method
	void address(int uniq) {
		// here we are initializing variables
		String date = "21/09/2023";
		String time = " 9.78 am";
		long bill_no = 984563;
		int ero_no = 456;
		String ero = "secendrabad";
		String ero_sec = "Hyderabad";
		String Area_code = "334er4530q";
		System.out.println("Dt:" + date + "     time" + time + "\n" + "Bill no :" + bill_no + "    ero_no :" + ero_no
				+ "\n" + "ero :" + ero + "   ero_esc" + ero_sec + "\n" + "area code :" + Area_code + "\n\n");

	}

	// we are initializing bill values
	void bill_details(int uniq) {
		// we are initializing bill details
		long sc_no = 440047434;
		long usc_no = 111223423;
		String coust_name = "mahindra foundation";
		String address = "34-8,Block 5, gayatri nagar, Gopalpuram ,secendrabad, hyd";
		int load = 5;
		int meter_no = 4353;

		// we are printing all the bill details in the format we want
		System.out.println("sc.NO :" + sc_no + "\n" + "USC NO :" + usc_no + "\n" + "Coustomer_name :" + coust_name
				+ "\n" + "Address" + address + "\n" + "concentrated load :" + load + "\n" + "meter no :" + meter_no
				+ "\n\n");
	}

	void calc_bill(int units) {
		// we adding a method called bill calculator
		// we are adding required charge bills here
		float EC = 24.98f;
		float ct = 50.67f;
		float ed = 6.98f;
		float EDint = 0.00f;
		float add_chage = 0.00f;
		float acd_surchagr = 34.87f;
		float gst_diff = 7.98f;
		float Bill_Charge = 78.9f;
		float net_worth = 78.9f;
// code for adding multiplications  to the bills more than 100 units is 1.3 and similar all.
		System.out.println("Energy Charges   :" + EC + "\n" + "Cust Charges     :" + ct + "\n" + "EletricDuty      :"
				+ ed + "\n" + "Edint            :" + EDint + "\n" + "ADDL Charges     :" + add_chage + "\n"
				+ "ADD_surcahrge    : " + acd_surchagr + "\n" + "GST / TRF/ DIFF  :" + gst_diff + "\n"
				+ "Bill charges     :" + Bill_Charge + "\n" + "net loss / gain  :" + net_worth + "\n\n");

		this.units = units;
		// Variable to calculate electricity bill to pay
		double billToPay = 0;

		// Check whether units are less than 100
		if (units < 100) {
			billToPay = units * 1.20;
		}
		// Check whether the units are less than 300
		else if (units < 300) {
			billToPay = 100 * 1.20 + (units - 100) * 2;
		}
		// Check whether the units are greater than 300
		else if (units > 300) {
			billToPay = 100 * 1.20 + 200 * 2 + (units - 300) * 3;

		}
		System.out.println("previous month due is : 0.000 ");

		System.out.println("this is bill amount is :" + billToPay);
	}

}

// main class preparation

public class power_consumption {

	public static void main(String[] args) {
		// we are creating new object here
		power_consumption1 Bill = new power_consumption1();
// invoking new object with methods along with parameters
		Bill.address(786);
		Bill.bill_details(786);
		Bill.calc_bill(400);
		// TODO Auto-generated method stub
	}

}
