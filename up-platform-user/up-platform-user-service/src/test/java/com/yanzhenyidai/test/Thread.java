package com.yanzhenyidai.test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author tanzhen.frank
 * @since 1.0.0
 */
public class Thread {

    public static void main(String[] args) throws IOException {
//        ExecutorService service = Executors.newCachedThreadPool();
//
//        for (int i = 1; i <= 5; i++) {
//            final int index = i;
//            try {
//                java.lang.Thread.sleep(5000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            service.execute(new Runnable() {
//                @Override
//                public void run() {
//                    System.out.println("第" + index + "个线程,名字:" + java.lang.Thread.currentThread().getName());
//                }
//            });
//        }
//        service.shutdown();

        ExecutorService service = Executors.newFixedThreadPool(3);


        File file = new File("D://a.txt");
        if (!file.exists()) {
            file.createNewFile();
        }

        for (int i = 1; i < 10; i++) {
            final int index = i;

//            service.execute(new Runnable() {
//                @Override
//                public void run() {
//
//
//                }
//            });

            service.submit(new Callable<Object>() {
                @Override
                public Object call() throws Exception {

                    try {
                        java.lang.Thread.sleep(1000);

                        FileOutputStream fs = new FileOutputStream(file, true);

                        String context = java.lang.Thread.currentThread().getName();

                        fs.write(context.getBytes());

                    } catch (Exception e) {
                        e.printStackTrace();
                    }


                    System.out.println("第" + index + "个线程,名字:" + java.lang.Thread.currentThread().getName());
                    return java.lang.Thread.currentThread().getName();
                }
            });

        }
        service.shutdown();
    }
}
