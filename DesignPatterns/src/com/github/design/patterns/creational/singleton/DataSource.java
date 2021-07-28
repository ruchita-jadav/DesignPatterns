package com.github.design.patterns.creational.singleton;

public class DataSource {
    /**
     *  Thread safe way 2 : create a sole instance in starting itself
     */
//    static DataSource dataSource = new DataSource();
    static DataSource dataSource;

    private int i = 0;

    private DataSource() {
        i++;
        System.out.println(Thread.currentThread().getName() + " called DataSource constructor" + i);
    }

    public static DataSource getInstance() {
        if (dataSource == null) {
            dataSource = new DataSource();
        }
        try {
            Thread.sleep(400);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(Thread.currentThread().getName() + " has called getInstance and datasource is " + dataSource);
        return dataSource;
    }

    /**
     *  Thread safe way 1 : synchronized Method
     */

    public static synchronized DataSource getInstanceThreadSafe() {
        if (dataSource == null) {
            dataSource = new DataSource();
        }
        try {
            Thread.sleep(400);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(Thread.currentThread().getName() + " has called getInstance and datasource is " + dataSource);
        return dataSource;
    }

}
