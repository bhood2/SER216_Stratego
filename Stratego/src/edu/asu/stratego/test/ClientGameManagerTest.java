package edu.asu.stratego.test;

import edu.asu.stratego.game.ClientSocket;
import edu.asu.stratego.game.ServerGameManager;
import org.junit.Test;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import static org.junit.Assert.assertEquals;

public class ClientGameManagerTest {

    private void startClient() throws Exception {
        new Thread(() -> {

            try {
                Thread.sleep(200);
                ClientSocket.connect("localhost", 4212);
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }

    private boolean startPseudoServer() throws Exception {
        try {
            ServerSocket listener = new ServerSocket(4212);
            startClient();
            startClient();
            Socket pOne = listener.accept();
            Socket pTwo = listener.accept();
            new ServerGameManager(pOne, pTwo, 0);
            listener.close();
            return true;
        } catch (Exception e) {
            return false;
        }
        
        
    }

    @Test
    public void testConnectServer() throws Exception {
        assertEquals(startPseudoServer(), true);
    }

}