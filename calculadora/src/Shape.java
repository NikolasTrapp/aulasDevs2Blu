import java.util.Scanner;

public class Shape {

    protected Double side;
    protected Double lateralArea;
    protected Double sideArea;
    protected Double totalArea;
    protected Double baseArea;
    protected Double totalVolume;

    public Shape() {}

    public Shape(Double side) {
        this.side = side;
    }

    public Shape(Double side, Double lateralArea, Double sideArea, Double totalArea, Double baseArea, Double totalVolume) {
        this.side = side;
        this.lateralArea = lateralArea;
        this.sideArea = sideArea;
        this.totalArea = totalArea;
        this.baseArea = baseArea;
        this.totalVolume = totalVolume;
    }

    protected Double calcuteSquareArea(Double side){
        return side * side;
    }

    protected Double calculateTriangleArea(Double base, Double heigth){
        return base * heigth / 2;
    }

    protected  Double calculateEquilateralTriangle(Double side){
        return Math.pow(side, 2) * Math.sqrt(3) / 4;
    }

    protected Double calculatePentagonArea(Double side){
        return (5 * Math.pow(side, 2)) / (4 * Math.sqrt(5 - 2 * Math.sqrt(5)));
    }

    protected Double calculateHexagonArea(Double side){
        return 3 * Math.pow(side, 2) * Math.sqrt(3) / 2;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "side=" + side +
                ", lateralArea=" + lateralArea +
                ", sideArea=" + sideArea +
                ", totalArea=" + totalArea +
                ", baseArea=" + baseArea +
                ", totalVolume=" + totalVolume +
                '}';
    }

    public Double getSide() {
        return side;
    }
    public void setSide(Double side) {
        this.side = side;
    }
    public Double getLateralArea() {
        return lateralArea;
    }
    public void setLateralArea(Double lateralArea) {
        this.lateralArea = lateralArea;
    }
    public Double getSideArea() {
        return sideArea;
    }
    public void setSideArea(Double sideArea) {
        this.sideArea = sideArea;
    }
    public Double getTotalArea() {
        return totalArea;
    }
    public void setTotalArea(Double totalArea) {
        this.totalArea = totalArea;
    }
    public Double getBaseArea() {
        return baseArea;
    }
    public void setBaseArea(Double baseArea) {
        this.baseArea = baseArea;
    }
    public Double getTotalVolume() {
        return totalVolume;
    }
    public void setTotalVolume(Double totalVolume) {
        this.totalVolume = totalVolume;
    }
}

