public class Dodecahedron extends Shape{

    public Dodecahedron(Double side){
        super(side);
    }

    public Double calculateDodecahedronLateralArea(){
        return 3 * Math.sqrt(25) + 10 * Math.sqrt(5) * side * 2;
    }

    public Double calculateDodecahedronSideArea(){
        return calculatePentagonArea(side);
    }

    public Double calculateDodecahedronTotalVolume(){
        return 1 / 4 * Math.pow(side, 3) * (15 + 7 * Math.sqrt(5));
    }

    public Double calculateDodecahedronTotalArea(){
        return calculatePentagonArea(side) * 10;
    }

    public void calculateEverything(){
        this.baseArea = calculatePentagonArea(side);
        this.lateralArea = calculateDodecahedronLateralArea();
        this.totalArea = calculateDodecahedronTotalArea();
        this.totalVolume  = calculateDodecahedronTotalVolume();
        this.sideArea = calculateDodecahedronSideArea();
    }
}
