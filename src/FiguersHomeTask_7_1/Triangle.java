package FiguersHomeTask_7_1;

 class Triangle extends Figure {
    private double side1, side2, side3;

     public Triangle(double side1, double side2, double side3) {
         if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
             System.out.println("Invalid triangle sides");
             return;

         }
         this.side1 = side1;
         this.side2 = side2;
         this.side3 = side3;
     }


     @Override
     public double calculateArea() {
         double s = (side1 + side2 + side3) / 2;
         return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
     }

     @Override
     public double calculatePerimeter() {
         return side1 + side2 + side3;
     }

     @Override
     public String getFigureInfo() {
         return String.format("Triangle: sides = " + side1 + " " + side2 + " " + side3);
     }
 }

