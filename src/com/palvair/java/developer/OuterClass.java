package com.palvair.java.developer;

/**
 * Created by ruddyp on 15/09/2016.
 */
public class OuterClass {

    private String name = OuterClass.class.getSimpleName();

    private static String staticName;
    static {
        staticName =  OuterClass.class.getSimpleName();
    }



    public void displayName() {
        System.out.println("this.name = " + this.name);
    }

    class InnerClass {

        private String name = InnerClass.class.getSimpleName();

        public void displayName() {
            System.out.println("OuterClass.this.namee = " + OuterClass.this.name);
            System.out.println("this.name = " + this.name);
        }
    }

    private class PrivateInnerClass {

        private String name = InnerClass.class.getSimpleName();

        public void displayName() {
            System.out.println("OuterClass.this.namee = " + OuterClass.this.name);
            System.out.println("this.name = " + this.name);
        }
    }

    public static class StaticNestedClass {

        private String name = StaticNestedClass.class.getSimpleName();

        public void displayName() {
            //System.out.println("OuterClass.this.namee = " + OuterClass.this.name);
            System.out.println("OuterClass.staticName = " + OuterClass.staticName);
            System.out.println("this.name = " + this.name);
        }
    }
}
