import java.util.Scanner;

public class Prism extends Shape{

    private Double x1;
    private Double x2;
    private Double x3;

    Scanner sc = new Scanner(System.in);

    public Prism(Double x1, Double x2, Double x3) {
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
    }

    public Prism(){}

    public Double calculatePrismTotalArea(){
        return x1 * x2 * 2 + x2 * x3 * 2 + x1 * x3 * 2;
    }

    public Double calculatePrismTotalVolume(){
        return x1 * x2 * x3;
    }

    public void registerNewPrism(){
        System.out.print("Type the value from base side 1: ");
        this.x1 = sc.nextDouble();
        System.out.print("Type the value from base side 2: ");
        this.x2 = sc.nextDouble();
        System.out.print("Type the value from lateral side: ");
        this.x3 = sc.nextDouble();
    }

    public void calculateEverything(){
        this.baseArea = x1*x2;
        this.lateralArea = x1*x3*2 + x2*x3*2;
        this.totalArea = calculatePrismTotalArea();
        this.totalVolume  = calculatePrismTotalVolume();
        this.sideArea = x2*x3;
    }


}
