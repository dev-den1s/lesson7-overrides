//package Vistula.Vistula.laba1.Laba2;
//
//class Circle{
//    double radius = 1.0;
//    String color = "red";
//    Point srodek = new Point();
//
//    public Circle(){
//        super();
//    }
//    public Circle(double radius){
//        this.radius = radius;
//    }
//    public Circle(Point srodek, double radius){
//        this.radius = radius;
//        this.srodek = srodek;
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
//                ", pole=" + srodek.toString() +'\'' +
//                "\n}";
//    }
//    void ifHaveCommonPoints (Circle c){
//        String str="";
//        if(this.radius + c.radius < srodek.getDistance(c.srodek))
//            str+="Nie mają wspólnych punktów;\n";
//        else if(this.radius + c.radius < srodek.getDistance(c.srodek))
//            str+="Koła są styczne;\n";
//        else
//            str+="Koła mają wspólną cesc";
//    }
//}
// class Point {
//    double x = 0.0;
//    double y = 0.0;
//
//    public Point() {
//    }
//
//    public Point(double x, double y) {
//        this.x = x;
//        this.y = y;
//    }
//    public double getDistance(Point p) {
//        return Math.sqrt((x-p.x)*(x-p.x) + (y-p.y)*(y-p.y));
//    }
//
//     @Override
//     public String toString() {
//         return "Srodek {" +
//                 "x=" + x +
//                 ", y=" + y +
//                 '}';
//     }
// }
//public class Main {
//    public static void main(String[] args) {
//	// write your code here
//    }
//}
