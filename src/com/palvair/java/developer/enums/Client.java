package com.palvair.java.developer.enums;

/**
 * Created by ruddyp on 15/09/2016.
 */
public class Client {

    public static void main(String[] args) {
        SingletonEnum singletonEnum = SingletonEnum.SINGLE_INSTANCE;
        singletonEnum.displayName();
    }

}
