package trickyquestions;

public class TrickyQuestions {

    public static void main(String[] args) {
        test(null); // compiler is gonna call the more specific method.
        // if there is moe than 1 specific overloaded method, a compile error will occur.
    }

    public static void test(Object o) {
        System.out.println("Object impl....");
    }

//    public static void test(String s) {
//        System.out.println("String impl...");
//    }

//    public static void test(Integer i) {
//        System.out.println("Integer impl...");
//    }

}
