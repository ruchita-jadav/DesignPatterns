package com.github.design.patterns.creational.singleton;

public class DataSourceDoubleCheckLocking {
    /**
     * The sole instance of the class. Note its marked volatile
     */

    private volatile static DataSourceDoubleCheckLocking dataSource;

    private DataSourceDoubleCheckLocking() {
    }

    // Create a static method for object creation
    synchronized public static DataSourceDoubleCheckLocking getInstance() {
        // Only instantiate the object when needed.
        if (dataSource == null) {
        // Note how we are synchronizing on the class object
            synchronized (DataSourceDoubleCheckLocking.class)
            {
                if (dataSource == null) {
                    dataSource = new DataSourceDoubleCheckLocking();
                }
            }
        }
        return dataSource;
    }
}
