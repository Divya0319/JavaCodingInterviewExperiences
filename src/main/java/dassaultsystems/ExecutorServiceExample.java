package dassaultsystems;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* How is ExecutorService instantiated.
 Give example, and how can create thread pool with it,
 and run something in multiple threads using it. */
public class ExecutorServiceExample {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(4);

        Runnable task1 = () -> {
            System.out.println("Running task 1");
        };

        Runnable task2 = () -> {
            System.out.println("Running task 2");
        };

        Runnable task3 = () -> {
            System.out.println("Running task 3");
        };

        Runnable task4 = () -> {
            System.out.println("Running task 4");
        };

        executorService.submit(task1);
        executorService.submit(task2);
        executorService.submit(task3);
        executorService.submit(task4);

        executorService.shutdown();
    }

}
