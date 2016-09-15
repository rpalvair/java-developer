package com.palvair.java.developer.enums;

/**
 * Created by ruddyp on 15/09/2016.
 */
public enum SingletonEnum {

    SINGLE_INSTANCE;

    private SingletonEnum() {
        System.out.println("Instanciated");
    }

    public void displayName() {
        System.out.println("this.getClass().getName() = "+this.getClass().getName());
    }
}
