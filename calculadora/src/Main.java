import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean flag = true;

        while (flag){
            menu();
            int opc = sc.nextInt();
            
            Shape s = null;

            if (opc == 6) flag = false;
            else if (opc == 5){
                s = new Prism();
                ((Prism) s).registerNewPrism();
                ((Prism) s).calculateEverything();
            }
            else if (opc == 4){
                s = new Pyramid();
                ((Pyramid) s).registerNewPyramid();
                ((Pyramid) s).calculateEverything();
            }
             else if (opc == 3){
                s = new Tetrahedron(sc.nextDouble());
                ((Tetrahedron) s).calculateEverything();
            }else if (opc == 2){
                s = new Dodecahedron(sc.nextDouble());
                ((Dodecahedron) s).calculateEverything();
                ((Dodecahedron) s).calculateEverything();
            }else if (opc == 1){
                s = new Cube(sc.nextDouble());
                ((Cube) s).calculateEverything();
                ((Cube) s).calculateEverything();
            } else {
                System.out.println("Wrong option!");
            }

            System.out.println(s);
        }
    }

    public static void menu(){
        System.out.println("-------------------------MENU-------------------------");
        System.out.println("1- Cube");
        System.out.println("2- Dodecahedron");
        System.out.println("3- Tetrahedron");
        System.out.println("4- Pyramid");
        System.out.println("5- Prism");
        System.out.println("6- Exit");
        System.out.println("------------------------------------------------------");
        System.out.print("O que deseja fazer: ");
    }
}