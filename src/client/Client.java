package client;

import GameGUI.GameWindow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {

    PrintWriter out;
    BufferedReader in;
    Socket s;

    public Client() {

        GameWindow gw = new GameWindow();

        gw.startButton.addActionListener(e -> connectToServer());

        String fromServer;
        while (true) {
//            try {
//                fromServer = in.readLine();
//                if (fromServer.equals("inaktiv")) {
//                    //wait
//                } else if (fromServer.equals("aktiv")) {
//                    //kategori eller frågor
//                }
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
        }
    }

    public void connectToServer() {
        try {
            s = new Socket("127.0.0.1", 55555);
            out = new PrintWriter(s.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(s.getInputStream()));
            out.println("connected");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        new Client();
    }

}
