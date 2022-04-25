package com.solvd.connections;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ConnectionTest {
    public static void main(String[] args) {
        Logger log = LogManager.getLogger(ConnectionTest.class);
        int POOL_SIZE = 6;
        ConnectionPool pool = new ConnectionPool();

        ExecutorService executorPool = new ThreadPoolExecutor(POOL_SIZE, POOL_SIZE, 10, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>());

        for (int i = 0; i < POOL_SIZE / 2; i++) {
            executorPool.execute(new MyRunnable("MR" + (i + 1), pool));
        }
        for (int i = POOL_SIZE / 2; i < POOL_SIZE; i++) {
            executorPool.execute(new MyThread("MT" + (i + 1), pool));
        }
        executorPool.shutdown();

        try {
            executorPool.awaitTermination(20, TimeUnit.SECONDS);

            if (executorPool.isTerminated()) {
                log.info("All MyThreads/MyRunnables finished");
            } else {
                log.info("Not all MyThreads/MyRunnables finished");
            }

        } catch (InterruptedException e) {
            log.error("The executorPool can't awaitTermination", e);
        }
    }
}
