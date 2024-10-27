package creational.singleton;

/*
  Common use cases of the singleton design pattern in web development:
    1. Database Connection Pool
    2. Logging Mechanism
    3. Configuration Settings
    4. Thread Pool Management
    5. Cache Management
*/

import java.util.HashMap;
import java.util.Map;

public class Singleton_simpleCache {
    private static Singleton_simpleCache instance;
    private final Map<String, Object> cache;

    // Private constructor to prevent instantiation
    private Singleton_simpleCache() {
        System.out.println("Initialize cache");
        cache = new HashMap<>();
    }
    /*
     * A thread is a lightweight process that represents a separate path of
     * execution within a program. It is a single line of instructions that the CPU
     * can process.
     * 
     * Java supports multithreading, which allows multiple threads to run
     * concurrently within a single Java application.
     * 
     * This can improve performance
     * and responsiveness, particularly for applications that require background
     * processing, like user interfaces, servers, and data processing tasks.
     * 
     * A typical Java application will have at least one main thread - which is the
     * one running on the main method. The JVM itself may use several threads for
     * garbage collection, handling native calls, and managing other internal tasks.
     * 
     * The number of additional threads can vary widely depending on the
     * application. For example:
     * 
     * A web server (like Tomcat) might spawn threads for each incoming request.
     * 
     * A database connection pool may create several threads to handle database
     * operations.
     * 
     * Background tasks (like timers or scheduled tasks) may also introduce
     * additional threads.
     */

    // Only one thread can use a method with the keyword synchronized at a time.
    public static synchronized Singleton_simpleCache getInstance() {
        if (instance == null) {
            instance = new Singleton_simpleCache();
        }
        return instance;
    }

    public synchronized void put(String key, Object value) {
        cache.put(key, value);
        System.out.println("Cached value: " + value + " with key: " + key);
    }

    public synchronized Object get(String key) {
        return cache.get(key);
    }

    public synchronized void remove(String key) {
        cache.remove(key);
        System.out.println("Removed cache entry with key: " + key);
    }
}
