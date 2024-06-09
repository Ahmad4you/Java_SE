package polymorphism3;

public class Rectangle extends Shape {
	 
    // إذا قمت باستدعاء هذه الدالة من هذا الكائن, ستعرض لك شكل يشبه المربع
    @Override
    public void shapeForm() {
        System.out.println("* * * * * *\n* * * * * *\n* * * * * *\n");
    }
 
}
