package polymorphism4;

public class Main {
	
	// سنستخدمها لمعرفة إسم الكلاس الذي إشتق منه كل كائن static هنا قمنا بتعريف دالة نوعها
    static void check (A obj) {         // parameter from Type A will be check an object, if obj in subclass A
        if(obj instanceof B)            // سيتم تنفيذ أمر الطباعة الموجود فيها B كائن من الكلاس obj في حال كان الـ
        {
            System.out.println("This is an object from the class B");
        }
        else if(obj instanceof C)       // سيتم تنفيذ أمر الطباعة الموجود فيها C كائن من الكلاس obj في حال كان الـ
        {
            System.out.println("This is an object from the class C");
        }
    }
	 
    public static void main(String[] args) {
 
        A b = new B();         // Upcasting      B و حددنا أن نوعه A هنا قمنا بإنشاء كائن من
        A c = new C();         // Upcasting      C و حددنا أن نوعه A هنا قمنا بإنشاء كائن من
 
        check(b);              // لمعرفة إسم الكلاس المشتق منه check() في الدالة b هنا قمنا بتمرير الكائن
        check(c);              // لمعرفة إسم الكلاس المشتق منه check() في الدالة c هنا قمنا بتمرير الكائن
 
    }
 
 
}
