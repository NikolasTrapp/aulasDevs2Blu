public class Cube extends Shape{

    public Cube(Double side) {
        super(side);
    }

    public Double calculateCubeSideArea(){
        return calcuteSquareArea(side);
    }

    public Double calculateCubeBaseArea(){
        return calcuteSquareArea(side);
    }

    public Double calculateCubeLateralArea(){
        return 6 * calcuteSquareArea(side);
    }

    public Double calculateCubeTotalArea(){
        return 6 * calcuteSquareArea(side);
    }

    public Double calculateCubeTotalVolume(){
        return Math.pow(side, 3);
    }

    public void calculateEverything(){
        this.baseArea = calculateCubeBaseArea();
        this.lateralArea = calculateCubeLateralArea();
        this.totalArea = calculateCubeTotalArea();
        this.totalVolume  = calculateCubeTotalVolume();
        this.sideArea = calculateCubeSideArea();
    }
}
