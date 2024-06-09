package polymorphism3;

public class Triangle extends Shape {
	 
    // إذا قمت باستدعاء هذه الدالة من هذا الكائن, ستعرض لك شكل يشبه المثلث
    @Override
    public void shapeForm() {
        System.out.println("    *\n   * *\n  * * *\n * * * *\n* * * * *\n");
    }
 
}