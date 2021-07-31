//package Vistula.Vistula.laba1.Laba2;
//
//public class third {
//
//    public static void main(String[] args) {
//	// write your code here
//    }
//}
//class Vector{
//    double x;
//    double y;
//
//    public Vector(double x, double y) {
//        this.x = x;
//        this.y = y;
//    }
//    public Vector(Point end, Point start) {
//        this.x = end.x - start.x;
//        this.y = end.y - start.y;
//    }
//
//
//    Vector add(Vector v){
//        return new Vector(this.x+v.x,this.y+v.y);
//    }
//
//    double dot(Vector v){
//        return this.x*v.x + this.y*v.y;
//    }
//
//    double getParalelogramField(Vector v){
//        return Math.abs(x*v.y-y*v.x);
//    }
////    double getAngel(Vector v){
////
////    }
//
//}
//class Point {
//    double x = 0.0;
//    double y = 0.0;
//
//
//    public Point()  {
//        super();
//    }
//
//    public Point(double x, double y) {
//        this.x = x;
//        this.y = y;
//    }
//    public static Point generateFromRadial(double gamma, double r){
//        double x = r*Math.cos(gamma*Math.PI/180);
//        double y = r*Math.sin(gamma*Math.PI/180);
//        return new Point(x,y);
//    }
//    public double getDistance(Point p) {
//        return Math.sqrt((x-p.x)*(x-p.x) + (y-p.y)*(y-p.y));
//    }
//
//    @Override
//    public String toString() {
//        return "Srodek {" +
//                "x=" + x +
//                ", y=" + y +
//                '}';
//    }
//}
