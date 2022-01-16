package com.pb.alekhin.hw15;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.Socket;
import java.time.LocalTime;

public class Client1 {

    private JPanel Client;
    private JTextField msg;
    private JButton Send;
    private JTextArea text;
    public Socket socket = new Socket("localhost", 1234);

    public Client1() throws IOException {
        Send.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                    PrintWriter out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
                    out.println(msg.getText());
                    out.flush();
                    String temp = text.getText();
                    if (temp.equalsIgnoreCase("bye")) {
                        System.exit(0);

                    }
                    msg.setText("");
                    text.append(LocalTime.now() + ":\n" + in.readLine() + "\n");
                } catch (IOException ioe) {
                    text.setText("Exception during communication.Server probably closed connection.");
                }
            }
        });
    }

    public static void main(String[] args) throws Exception {
        JFrame frame = new JFrame("Client1");
        frame.setContentPane(new Client1().Client);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
}
