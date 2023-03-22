package Model;

public class Calculator {
    private double fahrenheit;
    private double celcius;

    private double answer;

    public double getFahrenheit() {
        return fahrenheit;
    }

    public double getAnswer() {
        return answer;
    }

    public void setAnswer(double answer) {
        this.answer = answer;
    }

    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public double getCelcius() {
        return celcius;
    }

    public void setCelcius(double celcius) {
        this.celcius = celcius;
    }

    public Calculator(double fahrenheit, double celcius) {
        this.fahrenheit = fahrenheit;
        this.celcius = celcius;
    }

    public Calculator() {
    }


}
