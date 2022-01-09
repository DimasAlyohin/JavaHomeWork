package com.pb.alekhin.hw14;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client1 {
    public static void main(String[] args) throws Exception {

        String serverIp = "127.0.0.1";
        int serverPort = 1234;
        System.out.println("Соединение с сервером " + serverIp + " ...");

        Socket socket = new Socket(serverIp, serverPort);
        System.out.println("Соединение установлено на порту " + serverPort);
        BufferedReader brServer = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);

        Scanner scan = new Scanner(System.in);
        String serverMessage;

        while (true) {
            String clientMessage = scan.nextLine();
            pw.println(clientMessage);
            serverMessage = brServer.readLine();
            System.out.println(serverMessage);
            if ("bye".equals(clientMessage)) {
                break;
            }
        }
        pw.close();
        brServer.close();
        socket.close();
    }
}