package vanschie.app.domain;

/**
 * Created by carl on 25/06/17.
 */
public class Calculation {

    private double firstValue;
    private double secondValue;
    private String calculationType;
    private double result;

    public Calculation() {

    }

    public Calculation(double firstValue, double secondValue, String calculationType) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.calculationType = calculationType;
    }

    public Calculation(double firstValue, String calculationType) {
        this.firstValue = firstValue;
        this.secondValue = -1;
        this.calculationType = calculationType;
    }

    public double getFirstValue() {
        return firstValue;
    }

    public double getSecondValue() {
        return secondValue;
    }

    public String getCalculationType() {
        return calculationType;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
}

