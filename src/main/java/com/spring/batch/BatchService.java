package com.spring.batch;

import org.springframework.stereotype.Component;

@Component
public class BatchService implements Runnable {

    @Override
    public void run() {
        System.out.println("hello world");
    }
}
