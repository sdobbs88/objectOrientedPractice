public class Car {
	/** Constants for gear selection */
	public final static String PARK = "PARK";
	public final static String REVERSE = "REVERSE";
	public final static String DRIVE = "DRIVE";
	
	/** hold current gear selection, default to park */
	private String gear = Car.PARK;
	
	/** state of ignition */
	private boolean isOn = false;
	
	/** Information about the car */
	private int modelYear;
	private String make;
	private String model;
	
	/** Constructors */
	public Car() {
		/** set defaults here instead of variable declarations */
		this(2016, "Toyota", "Camry");
	}
	
	public Car(int year, String make) {
		this.setModelYear(year);
		this.setMake(make);
		String model;
		if (make.equals("Toyota")) {
			model = "Corolla";
		} else if (make.equals("Honda")) {
			model = "Civic";
		} else if (make.equals("Mazda")) {
			model = "3";
		} else {
			model = "Unknown";
		}
		this.setModel(model);
	}
	
	public Car(int year, String make, String model) {
		this.setModelYear(year);
		this.setMake(make);
		this.setModel(model);
	}
	
	public String toString() {
		String out = "The " + getModelYear() + " " + getMake() + " " + getModel() + " is currently in " + getGear() + ". The car is ";
		if (isOn) {
			out += "on.";
		} else {
			out += "off.";
		}
		
		return out;
	}
	
	public void startEngine() {
		this.setGear(Car.PARK);
		this.isOn = true;
	}
	
	public void stopEngine() {
		this.setGear(Car.PARK);
		this.isOn = false;
	}

	/**
	 * @return the gear
	 */
	public String getGear() {
		return gear;
	}

	/**
	 * @param gear the gear to set
	 */
	public void setGear(String gear) {
		this.gear = gear;
	}

	/**
	 * @return the modelYear
	 */
	public int getModelYear() {
		return modelYear;
	}
	
	/**
	 * @param modelYear the modelYear to set
	 */
	private void setModelYear(int modelYear) {
		this.modelYear = modelYear;
	}

	/**
	 * @return the make
	 */
	public String getMake() {
		return make;
	}
	
	/**
	 * @param make the make to set
	 */
	private void setMake(String make) {
		this.make = make;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}
	
	/**
	 * @param model the model to set
	 */
	private void setModel(String model) {
		this.model = model;
	}
}
