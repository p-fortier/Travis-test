package travis.example;

import sun.jvm.hotspot.HelloWorld;

public class App {
    public static void main(String[] args) {
        System.out.println(new App().HelloWorld());
    }

    private String HelloWorld(){
        return "HelloWorld";
    }
}
