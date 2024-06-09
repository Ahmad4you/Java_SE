package polymorphism3;

public class Drawer {
	 
    public void draw(Shape s) {       // Shape عند إستدعاء هذه الدالة يجب ان نمرر لها أي كائن مشتق من الكلاس
        s.shapeForm();                // الموجودة في الكائن الذي قام باستدعاءها shapeForm() هنا سيتم استدعاء الدالة
    }
 
}
