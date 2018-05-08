package sample;

import javafx.fxml.FXML;
import javafx.scene.chart.ScatterChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;



public class SampleController {

    @FXML
    private ScatterChart<Number, Number> chart;

    @FXML
    private Label label;


    private Point[] points;
    private int number;
    private XYChart.Series series1 = new XYChart.Series();
    private XYChart.Series series2 = new XYChart.Series();


    void generatePoints(int number) {
        this.number = number;
        this.points = new Point[number];
        for(int i = 0; i < number; i++)
            points[i] = new Point();
        addPointsToChart();
    }

    private void addPointsToChart() {
        for(int i = 0; i < number; i++) {
            if(points[i].getLabel()){
                series1.getData().add(new XYChart.Data(points[i].getX(), points[i].getY()));
            } else {
                series2.getData().add(new XYChart.Data(points[i].getX(), points[i].getY()));
            }
        }
        chart.getData().addAll(series1, series2);
    }


    @FXML
    private void activatePoints(){
        for(int i = 0; i < number; i++)
            points[i].activate();
        chart.getData().removeAll(series1, series2);
        for(int i = 0; i < number; i++) {
            if(points[i].getLabel()){
                series1.getData().add(new XYChart.Data(points[i].getX(), points[i].getY()));
            } else {
                series2.getData().add(new XYChart.Data(points[i].getX(), points[i].getY()));
            }
        }
        chart.getData().addAll(series1, series2);
    }

}
