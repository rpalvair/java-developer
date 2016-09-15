package com.palvair.java.developer;

/**
 * Created by ruddyp on 15/09/2016.
 */
public class Client {

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        OuterClass.StaticNestedClass staticNestedClass = new OuterClass.StaticNestedClass();

        outerClass.displayName();
        innerClass.displayName();
        staticNestedClass.displayName();
    }
}
