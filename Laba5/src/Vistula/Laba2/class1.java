//package Vistula.Vistula.laba1.Laba2;
//
//public class Main {
//
//    public static void main(String[] args) {
//
//	Circle circle = new Circle();
//	circle.radius = 1.0;
//	circle.color = "red";
//	Circle circle1 = new Circle(2.0);
//	circle1.color = "blue";
//        System.out.printf("Circle first %s", circle.toString() );
//        System.out.printf("Circle second %s", circle1.toString() );
//
//
//    }
//}
//class Circle{
//    double radius = 1.0;
//    String color = "red";
//    public Circle(){
//        super();
//    }
//    public Circle(double radius){
//        this.radius = radius;
//    }
//    double getRadius(){
//        return this.radius;
//    }
//    double getArea(){
//        return Math.ceil(Math.pow(this.radius,2)/(4 * Math.PI)* Math.pow(10,2)) / Math.pow(10,2);
//    }
//    @Override
//    public String toString() {
//        return "Circle {\n" +
//                "radius=" + radius +
//                ", color='" + color + '\'' +
//                ", pole=" + getArea() +'\'' +
//                "\n}";
//    }
//}
