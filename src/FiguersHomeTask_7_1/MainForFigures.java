package FiguersHomeTask_7_1;

import java.util.Random;

public class MainForFigures {
    public static void main(String[] args) {
        Figure[] figures = new Figure[5];
        Random random = new Random();
        double totalPerimeter = 0;
        double totalArea = 0;

        for (int i = 0; i < figures.length; i++) {
            int figureType = random.nextInt(3);

            switch (figureType) {

                case 0:
                    double side1 = random.nextInt(1, 10);
                    double side2 = random.nextInt(1, 10);
                    double side3 = random.nextInt(1, 10);

                    while (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
                        side1 = random.nextInt(1, 10);
                        side2 = random.nextInt(1, 10);
                        side3 = random.nextInt(1, 10);
                    }
                    figures[i] = new Triangle(side1, side2, side3);
                    break;
                case 1:
                    double length = random.nextInt(1, 10);
                    double width = random.nextInt(1, 10);
                    figures[i] = new Rectangle(length, width);
                    break;
                case 2:
                    double radius = random.nextInt(1, 10);
                    figures[i] = new Circle(radius);
                    break;
            }

        }
        for (Figure figure : figures) {
            if (figure != null) {
                System.out.println(figure.getFigureInfo());
                System.out.println("Area: " + figure.calculateArea());
                System.out.println("Perimeter: " + figure.calculatePerimeter());
                System.out.println();

                totalPerimeter += figure.calculatePerimeter();
                totalArea += figure.calculateArea();
            }


        }
        System.out.println("Total perimeter of all figures: " + totalPerimeter);
        System.out.println("Total area of all figures: " + totalArea);

    }

}