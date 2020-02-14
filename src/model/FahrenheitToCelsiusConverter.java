package model;

public class FahrenheitToCelsiusConverter {
	
	private double fahrenheit;
	private double celsius;
	
	public FahrenheitToCelsiusConverter() {
		
	}
	
	public FahrenheitToCelsiusConverter(double degrees, boolean isFahrenheit) {
		
		if (isFahrenheit) {
			this.fahrenheit = degrees;
			convertToCelsius(degrees);
		} else {
			this.celsius = degrees;
			convertToFahrenheit(degrees);
		}
		
	}

	public double getFahrenheit() {
		return fahrenheit;
	}
	
	public void setFahrenheit(double fahrenheit) {
		this.fahrenheit = fahrenheit;
	}
	
	public double getCelsius() {
		return celsius;
	}
	
	public void setCelsius(double celsius) {
		this.celsius = celsius;
	}
	
	public void convertToCelsius(double fahrenheit) {
		double calcCelsius = Math.round(((fahrenheit - 32) * 5) / 9);
		setCelsius(calcCelsius);
	}
	
	public void convertToFahrenheit(double celsius) {
		double calcFahrenheit = Math.round(((celsius * 9) / 5) + 32);
		setFahrenheit(calcFahrenheit);
	}
	
	@Override
	public String toString() {
		return "FahrenheitToCelsiusConverter [fahrenheit=" + fahrenheit + ", celsius=" + celsius + "]";
	}
	
}
