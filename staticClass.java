
// static method and variables 
class StaticClassExample {
    public static void Hello() {
        System.out.println("Hello World");
        System.out.println("value of a is : " + a);
    }

    static int a = 10;
}

class staticClass {
    public static void main(String[] args) {
        StaticClassExample.Hello();
    }
}