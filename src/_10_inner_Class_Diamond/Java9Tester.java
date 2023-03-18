package _10_inner_Class_Diamond;

public class Java9Tester {

    public static void main(String[] args) {

        Handler<String> handler = new Handler<>("Hello Java 9 handler") {
            @Override
            public void getMessage() {
                System.out.println(content);
            }

            @Override
            String getNotes(String message) {
                return super.getNotes(message);
            }
        };

        // ? extends String  ? => https://www.baeldung.com/java-generics-vs-extends-object

        Handler<? extends String> handler1 = new Handler<>("Hello Java 9 handler1") {
            @Override
            public void getMessage() {
                System.out.println(content);
            }
        };

        Handler<?> handler2 = new Handler<>(9) {
            @Override
            public void getMessage() {
                System.out.println(content);
            }
        };

        handler.getMessage();
        System.out.println(handler.getNotes("Test Notes"));
        handler1.getMessage();
        handler2.getMessage();

    }
}
