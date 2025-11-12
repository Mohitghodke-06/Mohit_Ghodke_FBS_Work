package Inheritance_1;

class Defence {
	String CountryName;
	String NameOfHeadQuators;
	String LocationOfHeadQuators;
	int noOfHeadQuator;
	int noOfTroofs;
	int budget;
	int noOfDepartment;
	int noOfVehicle;
	int ManPower;
	int noOfMissionPerformed;
	int noOfCasualtie;

	Defence() { // default Constructor
		this.CountryName = "India";
		this.NameOfHeadQuators = "Default Headquarters";
		this.LocationOfHeadQuators = "Default Name";
		this.noOfHeadQuator = 0;
		this.noOfTroofs = 0;
		this.budget = 0;
		this.noOfDepartment = 0;
		this.noOfVehicle = 0;
		this.ManPower = 0;
		this.noOfMissionPerformed = 0;
		this.noOfCasualtie = 0;
	}

	Defence(String a, String b, String c, int d, int e, int f, int g, int h, int i, int j, int k) {
		this.CountryName = a;
		this.NameOfHeadQuators = b;
		this.LocationOfHeadQuators = c;
		this.noOfHeadQuator = d;
		this.noOfTroofs = e;
		this.budget = f;
		this.noOfDepartment = g;
		this.noOfVehicle = h;
		this.ManPower = i;
		this.noOfMissionPerformed = j;
		this.noOfCasualtie = k;
	} // Parameterised Constructor

	String getCountryName() {
		return CountryName;
	}

	void setCountryName(String countryName) {
		CountryName = countryName;
	}

	String getNameOfHeadQuators() {
		return NameOfHeadQuators;
	}

	void setNameOfHeadQuators(String nameOfHeadQuators) {
		NameOfHeadQuators = nameOfHeadQuators;
	}

	String getLocationOfHeadQuators() {
		return LocationOfHeadQuators;
	}

	void setLocationOfHeadQuators(String locationOfHeadQuators) {
		LocationOfHeadQuators = locationOfHeadQuators;
	}

	int getNoOfHeadQuator() {
		return noOfHeadQuator;
	}

	void setNoOfHeadQuator(int noOfHeadQuator) {
		this.noOfHeadQuator = noOfHeadQuator;
	}

	int getNoOfTroofs() {
		return noOfTroofs;
	}

	void setNoOfTroofs(int noOfTroofs) {
		this.noOfTroofs = noOfTroofs;
	}

	int getBudget() {
		return budget;
	}

	void setBudget(int budget) {
		this.budget = budget;
	}

	int getNoOfDepartment() {
		return noOfDepartment;
	}

	void setNoOfDepartment(int noOfDepartment) {
		this.noOfDepartment = noOfDepartment;
	}

	int getNoOfVehicle() {
		return noOfVehicle;
	}

	void setNoOfVehicle(int noOfVehicle) {
		this.noOfVehicle = noOfVehicle;
	}

	int getManPower() {
		return ManPower;
	}

	void setManPower(int manPower) {
		ManPower = manPower;
	}

	int getNoOfMissionPerformed() {
		return noOfMissionPerformed;
	}

	void setNoOfMissionPerformed(int noOfMissionPerformed) {
		this.noOfMissionPerformed = noOfMissionPerformed;
	}

	int getNoOfCasualtie() {
		return noOfCasualtie;
	}

	void setNoOfCasualtie(int noOfCasualtie) {
		this.noOfCasualtie = noOfCasualtie;
	}

	void display() {
		System.out.println("CountryName:" + CountryName);
		System.out.println("NameofHeadQuarter:" + NameOfHeadQuators);
		System.out.println("LocationOfHeadQuarter:" + LocationOfHeadQuators);
		System.out.println("noOfHeadQuator:" + noOfHeadQuator);
		System.out.println("noOfTroofs:" + noOfTroofs);
		System.out.println("budget:" + budget);
		System.out.println("noOfDepartment:" + noOfDepartment);
		System.out.println("noOfVehicle:" + noOfVehicle);
		System.out.println("ManPower:" + ManPower);
		System.out.println("noOfMissionPerformed:" + noOfMissionPerformed);
		System.out.println("noOfCasualtie;:" + noOfCasualtie);
	}
}// class Defence ends here
//================= Army Class =================

class Army extends Defence {
	int noOfTanks;
	int noOfGuns;
	int noOfGranades;
	int noOfBattalion;

	Army() { // Default Constructor
		super();
		this.noOfTanks = 0;
		this.noOfGuns = 0;
		this.noOfGranades = 0;
		this.noOfBattalion = 0;
	}

	Army(String a, String b, String c, int d, int e, int f, int g, int h, int i, int j, int k, int w, int x, int y,
			int z) { // Parameterised Constructor

		super(a, b, c, d, e, f, g, h, i, j, k);
		this.noOfTanks = w;
		this.noOfGuns = x;
		this.noOfGranades = y;
		this.noOfBattalion = z;
	} // Parameterised Constructor

	int getNoOfTanks() {
		return noOfTanks;
	}

	void setNoOfTanks(int noOfTanks) {
		this.noOfTanks = noOfTanks;
	}

	int getNoOfGuns() {
		return noOfGuns;
	}

	void setNoOfGuns(int noOfGuns) {
		this.noOfGuns = noOfGuns;
	}

	int getNoOfGranades() {
		return noOfGranades;
	}

	void setNoOfGranades(int noOfGranades) {
		this.noOfGranades = noOfGranades;
	}

	int getNoOfBattalion() {
		return noOfBattalion;
	}

	void setNoOfBattalion(int noOfBattalion) {
		this.noOfBattalion = noOfBattalion;
	}

	void display() {
		super.display();
		System.out.println("Number of Tanks: " + noOfTanks);
		System.out.println("Number of Guns: " + noOfGuns);
		System.out.println("Number of Grenades: " + noOfGranades);
		System.out.println("Number of Battalions: " + noOfBattalion);
	}
} // Army class ends here

//================= Navy Class =================
class Navy extends Defence {
	int noOfships;
	int noOfSubmarines;
	int noOfTorpedos;

	Navy() { // Defult Constructor
		this.noOfships = 0;
		this.noOfSubmarines = 0;
		this.noOfTorpedos = 0;
	}

	Navy(String a, String b, String c, int d, int e, int f, int g, int h, int i, int j, int k, int jo, int pm, int mp) {
		super(a, b, c, d, e, f, g, h, i, j, k);
		this.noOfships = jo;
		this.noOfSubmarines = pm;
		this.noOfTorpedos = mp;
	} // Parameterised Constructor

	int getNoOfships() {
		return noOfships;
	}

	void setNoOfships(int noOfships) {
		this.noOfships = noOfships;
	}

	int getNoOfSubmarines() {
		return noOfSubmarines;
	}

	void setNoOfSubmarines(int noOfSubmarines) {
		this.noOfSubmarines = noOfSubmarines;
	}

	int getNoOfTorpedos() {
		return noOfTorpedos;
	}

	void setNoOfTorpedos(int noOfTorpedos) {
		this.noOfTorpedos = noOfTorpedos;
	} // Parameterised Constructor

	void display() {
		super.display();
		System.out.println("noOfships: " + noOfships);
		System.out.println("noOfSubmarines: " + noOfSubmarines);
		System.out.println("noOfTorpedos: " + noOfTorpedos);
	}

} // Navy class ends here
//================= AirForce Class =================

class AirForce extends Defence {
	int noOfMissiles;
	int noOfAirCrafts;

	AirForce() { // Default Constructor
		this.noOfMissiles = 0;
		this.noOfAirCrafts = 0;
	}

	AirForce(String a, String b, String c, int d, int e, int f, int g, int h, int i, int j, int k, int ll, int pp) {
		super(a, b, c, d, e, f, g, h, i, j, k);
		this.noOfMissiles = ll;
		this.noOfAirCrafts = pp;
	}

	int getNoOfMissiles() {
		return noOfMissiles;
	}

	void setNoOfMissiles(int noOfMissiles) {
		this.noOfMissiles = noOfMissiles;
	}

	int getNoOfAirCrafts() {
		return noOfAirCrafts;
	}

	void setNoOfAirCrafts(int noOfAirCrafts) {
		this.noOfAirCrafts = noOfAirCrafts;
	} // Parameterised Constructor

	void display() {
		super.display();
		System.out.println("NoOfMissiles: " + noOfMissiles);
		System.out.println("NoOfAirCrafts: " + noOfAirCrafts);
	}

}


//================= Main Class =================
 public class RegisterDefence {
	public static void main(String[] args) {

		System.out.println("---- Army Details ----");
		Army a1 = new Army("India", "Army HQ", "New Delhi", 
			5, 120000, 750000, 12, 85000, 1350000, 320, 210,
			5000, 20000, 15000, 25);
		a1.display();

		System.out.println("\n---- Navy Details ----");
		Navy n1 = new Navy("India", "Naval HQ", "Mumbai", 
			3, 95000, 650000, 8, 50000, 900000, 200, 150,
			180, 25, 90);
		n1.display();

		System.out.println("\n---- Air Force Details ----");
		AirForce af1 = new AirForce("India", "Air HQ", "New Delhi", 
			4, 110000, 800000, 10, 65000, 1000000, 250, 180,
			300, 600);
		af1.display();
	}
}