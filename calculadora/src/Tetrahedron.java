public class Tetrahedron extends Shape{

    public Tetrahedron(Double side) {
        super(side);
    }

    public Double calculateTetrahedronLateralArea(){
        return calculateEquilateralTriangle(side) * 3;
    }

    public Double calculateTetrahedronBaseArea(){
        return calculateEquilateralTriangle(side);
    }

    public Double calculateTetrahedronTotalArea(){
        return calculateEquilateralTriangle(side) * 4;
    }

    public Double calculateTetrahedronTotalVolume(){
        return Math.sqrt(2) / 12 * Math.pow(side, 3);
    }

    public void calculateEverything(){
        this.baseArea = calculateTetrahedronBaseArea();
        this.lateralArea = calculateTetrahedronLateralArea();
        this.totalArea = calculateTetrahedronTotalArea();
        this.totalVolume  = calculateTetrahedronTotalVolume();
        this.sideArea = calculateEquilateralTriangle(side);
    }
}
