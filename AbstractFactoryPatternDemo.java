package Question_number_2;
		
public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        DrawingControl drawControl = new DrawingControl();
        //get shape factory
        AbstractFactory factoryForShapes = FactoryProducer.getFactory(false);
        //get an object of Shape Rectangle
        Shape shape1 = factoryForShapes.getShape("RECTANGLE");
        shape1.draw();
        drawControl.save(shape1);
        //get an object of Shape Square
        Shape shape2 = factoryForShapes.getShape("SQUARE");
        shape2.draw();
        drawControl.save(shape2);
        //get shape factory
        AbstractFactory rounderShapeFactory = FactoryProducer.getFactory(true);
        //get an object of Shape RoundedRectangle
        Shape shape3 = rounderShapeFactory.getShape("ROUNDED_RECTANGLE");
        shape3.draw();
        drawControl.save(shape3);
        //get an object of Shape RoundedSquare
        Shape shape4 = rounderShapeFactory.getShape("ROUNDED_SQUARE");
        shape4.draw();
        drawControl.save(shape4);
        System.out.println("redo");
        drawControl.redo();
        drawControl.redo();
        drawControl.redo();
        drawControl.redo();
        drawControl.redo();
        System.out.println("undo");
        drawControl.undo();
        drawControl.undo();
        drawControl.undo();
    }
}
