package com.pb.alekhin.hw13;

import java.util.LinkedList;
import java.util.Queue;


public class ProducerConsumer {

        public static void main(String[] args) {

            Buffer buffer = new Buffer();
            Producer producer = new Producer(buffer);
            Consumer consumer = new Consumer(buffer);
            new Thread(producer).start();
            new Thread(consumer).start();
        }
    }
    class Buffer{
    Queue<Integer> queue = new LinkedList<>();
        public synchronized void get() {
            while (queue.size() <= 0) {
                try {
                    wait();
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            queue.poll();
            System.out.println("Из буффера потреблено 1 единицу продукции");
            System.out.println("В буффере осталось: " + queue.size() + " единиц продукции");
            System.out.println(queue.toString());
            notify();
        }
        public synchronized void put() {
            while (queue.size() >= 5) {
                try {
                    wait();
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            queue.add((int) (Math.random() * 100));
            System.out.println("Произведено 1 единицу продукции");
            System.out.println("В буффере: " + queue.size() + " единиц продукции");
            System.out.println(queue.toString());
            notify();
        }
    }

    class Producer implements Runnable {

        private final Buffer buffer;

        public Producer(Buffer buffer) {
            this.buffer = buffer;
        }

        @Override
        public void run() {
            for (;;) {
                buffer.put();
            }
        }
    }

    class Consumer implements Runnable {

        private final Buffer buffer;

        public Consumer(Buffer buffer) {
            this.buffer = buffer;
        }

        @Override
        public void run() {
            for (;;) {
                buffer.get();
            }
        }
}
