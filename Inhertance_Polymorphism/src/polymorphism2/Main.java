package polymorphism2;

public class Main {
	 
    public static void main(String[] args) {
 
        // A أي 5 كائنات نوعهم ,A هنا قمنا بتعريف 5 كائنات من الكلاس
        A a1 = new A();
        A a2 = new A();
        A a3 = new A();
        A a4 = new A();
        A a5 = new A();
 
        // فيها A ثم قمنا بتخزين جميع الكائنات المشتقة من ,A هنا قمنا بإنشاء مصفوفة نوعها
        A[] list = { a1, a2, a3, a4, a5 };
 
        // list المخزن كثالث عنصر في المصفوفة a3 الموجود في الكائن x هنا قمنا بإعطاء قيمة للمتغير
        list[2].x = 14;
 
        // list[2] الموجودة في العنصر x سترجع قيمة المتغير printX() لاحظ أن الدالة
        a3.printX();
 
        // a3 الموجودة في العنصر x سترجع قيمة المتغير printX() و لاحظ أن الدالة
        list[2].printX();
 
    }
 
}
