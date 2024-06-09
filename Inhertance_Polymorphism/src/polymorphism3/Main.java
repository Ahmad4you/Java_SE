package polymorphism3;

public class Main {
	
//	static void draw(Shape s) {       // Shape is Parameter
//        s.shapeForm();                // shapeForm() هنا سيتم استدعاء الدالة
//    }
	 
    public static void main(String[] args) {
    	
 
                                          // هنا كل كائن سيمثل شكل هندسي معين <-- Shape هنا قمنا بإنشاء 4 كائنات من الكلاس
        Shape s = new Square();           // Square و حددنا أن نوعه Shape هنا قمنا بإنشاء كائن من
        Shape r = new Rectangle();        // Rectangle و حددنا أن نوعه Shape هنا قمنا بإنشاء كائن من
        Shape t = new Triangle();         // Triangle و حددنا أن نوعه Shape هنا قمنا بإنشاء كائن من
        Shape c = new Circle();           // Circle و حددنا أن نوعه Shape هنا قمنا بإنشاء كائن من
 
        Drawer drawer = new Drawer();     // الموجودة فيه draw() حتى نستطيع استخدام الدالة drawer هنا قمنا بإنشاء كائن من
 
                                          // لعرض شكل كل كائن draw() هنا قمنا باستدعاء الدالة
        drawer.draw(s);                   // Square المعرفة في الكلاس shapeForm() سيتم إستدعاء الدالة ,Square نوعه s بما أن الكائن
        drawer.draw(r);                   // Rectangle المعرفة في الكلاس shapeForm() سيتم إستدعاء الدالة ,Rectangle نوعه r بما أن الكائن
        drawer.draw(t);                   // Triangle المعرفة في الكلاس shapeForm() سيتم إستدعاء الدالة ,Triangle نوعه t بما أن الكائن
        drawer.draw(c);                   // Circle المعرفة في الكلاس shapeForm() سيتم إستدعاء الدالة ,Circle نوعه c بما أن الكائن
 
//        draw(s);
    }
 
}
