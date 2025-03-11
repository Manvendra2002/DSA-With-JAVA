public class Patterns {
    public static void main(String[] args) {
        squere();
        System.out.println();
        rightAngle();
        System.out.println();
        reverseRightAngle();

        numberTriangle();
        System.out.println();
        revNumberTriangle();

        revNumberTriangle2();
    }

    public static void squere(){
        int num = 5;
        for(int row=1; row <= num; row++){
            for(int col = 1; col <= num; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void rightAngle(){
        int num = 5;
        for (int row = 1; row <= num; row++) {
            for(int col = 1; col<=row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void reverseRightAngle(){
        int num = 5;
        for (int row = 1; row <= num; row++) {
            for(int col = row; col <= num; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void numberTriangle(){
        int num = 5;
        for (int row = 1; row <=num; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col);
            }

            System.out.println();
        }
    }

    public static void revNumberTriangle(){
        int num = 5;
        for (int row = 1; row <=num; row++) {
            for (int col = row; col <= num; col++) {
                System.out.print(col);
            }

            System.out.println();
        }
        
    }

    public static void revNumberTriangle2(){
        int num = 5;
        for (int row = 1; row <=num; row++) {
            for (int col = num; col >= row; col--) {
                System.out.print(col);
            }

            System.out.println();
        }
        System.out.println();
        triangle1();
    }

    public static void triangle1(){
        int num = 5;
        for (int row = 1; row <= 2*num; row++) {
            int totalColsInRow = row > num ? 2*num - row:row;
            for (int col = 1; col <= totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        triangle();
    }

    public static void triangle(){
        int num = 5;
        for (int row = 1; row <=num; row++) {
            for (int space = 1; space <= num-row; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col < 2*row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        uStarPattern();
    }

public static void uStarPattern(){
    int num = 5;
    for (int row = 1; row <= num; row++) {
        for (int col = 1; col <= num; col++) {
            if (col == 1 || col == num || row == num) {
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}

}