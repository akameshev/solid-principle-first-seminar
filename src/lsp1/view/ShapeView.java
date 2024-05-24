package lsp1.view;

import lsp1.shape.QuadroLiteral;
import lsp1.shape.Rectangle;

public class ShapeView {
    private final QuadroLiteral rectangle;

    public ShapeView(QuadroLiteral rectangle) {
        this.rectangle = rectangle;
    }

    public void showArea() {
        System.out.print("Area of rectangle equal:");
        System.out.println(rectangle.getArea());
    }
}
