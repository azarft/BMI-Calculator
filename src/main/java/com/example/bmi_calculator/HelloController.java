package com.example.bmi_calculator;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class HelloController {
    Calculator calc = new Calculator();

    @FXML
    private TextField inputWeight;
    @FXML
    private TextField inputHeight;
    @FXML
    private RadioButton unitEnglish;
    @FXML
    private RadioButton unitMetric;
    @FXML
    private Label label;

    @FXML
    public void onButtonClearClick()
    {
        inputHeight.setText("");
        inputWeight.setText("");
        label.setText("");
    }
    @FXML
    public void onButtonCalculateClick()
    {
        if (unitEnglish.isSelected())
        {
            calc.setUnit("English");
        }
        if (unitMetric.isSelected())
        {
            calc.setUnit("Metric");
        }

        String weightText = inputWeight.getText();
        String heightText = inputHeight.getText();

        double weightNumber = Double.parseDouble(weightText);
        double heightNumber = Double.parseDouble(heightText);

        calc.setWeight(weightNumber);
        calc.setHeight(heightNumber);

        calc.calculate();

        String status = calc.status();
        label.setText(status);

    }
/*    protected void onRadioButtonClickEnglish()
    {
        calc.setUnit("English");

        unitEnglish.isSelected()

    }*/





}