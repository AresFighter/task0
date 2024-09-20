package com.example.demo3;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    // Объявление глобальных переменных
    @FXML
    public Button big_ch;
    @FXML
    public Label big;
    @FXML
    public Button sred_ch;
    @FXML
    public Label sred;
    @FXML
    public Button mal_ch;
    @FXML
    public Label mal;
    @FXML
    public TextField summa;

    Procent procent = new Procent();

    // Метод для расчета малых чаевых (3%)
    public void mal_chai() {
        double sum = Double.parseDouble(summa.getText());
        mal.setText("Сумма с чаевыми: " + procent.countSumTrunc(sum, 3));
    }

    // Метод для расчета обычных чаевых (10%) bjrgegrhghr
    public void sred_chai() {
        double sum = Double.parseDouble(summa.getText());
        sred.setText("Сумма с чаевыми: " + procent.countSumTrunc(sum, 10));
    }

    // Метод для расчета больших чаевых (15%)
    public void big_chai() {
        double sum = Double.parseDouble(summa.getText());
        big.setText("Сумма с чаевыми: " + procent.countSumTrunc(sum, 15));
    }
}
