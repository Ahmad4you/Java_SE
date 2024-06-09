package polymorphism3;

public class Circle extends Shape {
	 
    // إذا قمت باستدعاء هذه الدالة من هذا الكائن, ستعرض لك شكل يشبه الدائرة
    @Override
    public void shapeForm() {
        System.out.println("  * * *\n* * * * *\n* * * * *\n  * * *\n");
    }
 
}
