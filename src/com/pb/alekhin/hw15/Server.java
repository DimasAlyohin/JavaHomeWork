package com.pb.alekhin.hw15;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {

    static class Handler implements Runnable {
        private final Socket socket;

        public Handler(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {
            while (true) {
                try (Socket localSocket = socket;
                     BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                     PrintWriter pw = new PrintWriter(localSocket.getOutputStream(), true)) {
                    System.out.println(Thread.currentThread().getName() + ": Подключен к порту");

                    String clientMessage;
                    while ((clientMessage = br.readLine()) != null) {
                        System.out.println(LocalTime.now() + " " + Thread.currentThread().getName() + " написал:   '" + clientMessage + "'");
                        pw.println(LocalTime.now() + " " + Thread.currentThread().getName() + ":   '" + clientMessage + "'");
                        if (clientMessage.equals("bye")) {
                            System.out.println(Thread.currentThread().getName() + " отключился");
                            break;
                        }
                    }
                } catch (Exception ex) {
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        int port = 1234;
        ServerSocket serverSocket = new ServerSocket(port);
        System.out.println("Сервер запущен на порту : " + port);
        ExecutorService threadPool = Executors.newFixedThreadPool(10);

        while (true) {
            Socket clientSocket = serverSocket.accept();
            threadPool.submit(new Handler(clientSocket));
        }
    }
}