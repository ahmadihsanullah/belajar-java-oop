public class ShapeApp {
    public static void main(String[] args) {
        var Shape = new Shape();
        System.out.println(Shape.getCorner());

        var rectangle = new Rectangle();
        System.out.println(rectangle.getCorner());
        System.out.println(rectangle.getParentCorner());
    }
}
