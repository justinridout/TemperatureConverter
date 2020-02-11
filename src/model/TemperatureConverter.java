package model;

public class TemperatureConverter {
	
	private double temperature;
	private double celsius;
	private double fahrenheit;
	
	public TemperatureConverter() {
		super();
	}
	
	public TemperatureConverter(double t) {
		super();
		this.temperature = t;
		setTemperatures(this.temperature);
	}

	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}
	
	public double getCelsius() {
		return celsius;
	}

	public void setCelsius(double celsius) {
		this.celsius = celsius;
	}

	public double getFahrenheit() {
		return fahrenheit;
	}

	public void setFahrenheit(double fahrenheit) {
		this.fahrenheit = fahrenheit;
	}

	public void setTemperatures(double t) {
		setFahrenheit((t * 9/5) + 32);
		setCelsius((t - 32) * 5/9);
	}
	
	public String fahrenheitToString() {
		return getTemperature() + " Fahrenheit is: " + getCelsius() + " Celsius";
	}
	
	public String celsiusToString() {
		return getTemperature() + " Celsius is: " + getFahrenheit() + " Fahreneit";
	}
}
