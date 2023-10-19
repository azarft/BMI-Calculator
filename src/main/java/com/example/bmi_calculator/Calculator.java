package com.example.bmi_calculator;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
public class Calculator {
    private double weight;
    private double height;
    private double result;
    private String unit;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public void calculate()
    {
        if (this.unit == "English")
        {
            this.result = 703 * this.weight / Math.pow(this.height, 2);
        }
        if (this.unit == "Metric")
        {
            this.result = this.weight / Math.pow(this.height, 2);
        }
    }

    public String status()
    {
        if (this.result < 18.5)
        {
            return "Underweight";
        }
        if (this.result >= 18.5 && this.result <= 24.9)
        {
            return "Normal";
        }
        if (this.result >= 25 && this.result <= 29.9)
        {
            return "Overweight";
        }
        else
        {
            return "Obese";
        }
    }

}
