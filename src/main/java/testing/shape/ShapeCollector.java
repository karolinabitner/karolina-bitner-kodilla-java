package testing.shape;

public class ShapeCollector {
    <ArrayList> shapeCollection = new <ArrayList>();

    public void addFigure(Shape shape){
        shapeCollection.add(shape);
    }
    public boolean removeFigure(Shape shape){
        return shapeCollection.remove(shape);
    }
    public void showFigures(){
        System.out.println(shapeCollection.toString());
    }
}
