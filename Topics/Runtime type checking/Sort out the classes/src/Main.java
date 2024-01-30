import java.util.List;

class Sort {
    public static void sortShapes(Shape[] array,
                                  List<Shape> shapes,
                                  List<Polygon> polygons,
                                  List<Square> squares,
                                  List<Circle> circles) {
        // write your code here
        for(Shape sh : array){
            if(sh instanceof Square){
                squares.add((Square)sh);
            }
            else if(sh instanceof Polygon){
                polygons.add((Polygon)sh);
            }
            else if(sh instanceof Circle){
                circles.add((Circle)sh);
            }
            else{
                shapes.add(sh);
            }
        }
    }
}

//Don't change classes below
class Shape { }
class Polygon extends Shape { }
class Square extends Polygon { }
class Circle extends Shape { }