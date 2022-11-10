import java.util.Scanner;

public class Pyramid extends  Shape{

    private Double baseSide;
    private Double lateralSide;

    Scanner sc = new Scanner(System.in);

    public Pyramid(){}

    public Pyramid(Double baseSide, Double lateralSide) {
        this.baseSide = baseSide;
        this.lateralSide = lateralSide;
    }

    public Double calculatePyramidLateralArea(){
        return calculateTriangleArea(baseSide, getTriangleHeigth(baseSide/2, lateralSide)) * 4;
    }

    public Double calculatePyramidSideArea(){
        return getTriangleHeigth(baseSide/2, lateralSide) * baseSide / 2;
    }

    public Double calculatePyramidTotalArea(){
        return calculatePyramidLateralArea() + calcuteSquareArea(baseSide);
    }

    public Double calculatePyramidTotalVolume(){
        return calculatePyramidHeigth() * calcuteSquareArea(baseSide) / 3;
    }

    public Double calculatePyramidHeigth(){
        return Math.sqrt(Math.pow(getTriangleHeigth(baseSide/2, lateralSide), 2) - Math.pow(baseSide/2, 2));
    }

    private Double getTriangleHeigth(Double base, Double a){
        return Math.sqrt(a * a - base * base);
    }

    public void registerNewPyramid(){
        System.out.print("Type the value from base side: ");
        this.baseSide = sc.nextDouble();
        System.out.print("Type the value from lateral side: ");
        this.lateralSide = sc.nextDouble();
    }

    public void calculateEverything(){
        this.baseArea = calcuteSquareArea(baseSide);
        this.lateralArea = calculatePyramidLateralArea();
        this.totalArea = calculatePyramidTotalArea();
        this.totalVolume  = calculatePyramidTotalVolume();
        this.sideArea = calculatePyramidSideArea();
    }

    @Override
    public String toString() {
        return "Pyramid{" +
                "baseSide=" + baseSide +
                ", lateralSide=" + lateralSide +
                ", lateralArea=" + lateralArea +
                ", sideArea=" + sideArea +
                ", totalArea=" + totalArea +
                ", baseArea=" + baseArea +
                ", totalVolume=" + totalVolume +
                '}';
    }
}
