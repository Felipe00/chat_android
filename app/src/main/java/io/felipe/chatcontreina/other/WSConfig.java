package io.felipe.chatcontreina.other;

/**
 * Created by overhead on 20/02/17.
 */

public class WSConfig {
    private static final String SERVE_NAME = "ChatSocketServer";
    private static final String SERVE_IP = "192.168.1.14:8080";
    public static final String URL_WEBSOCKET = "ws://" + SERVE_IP + "/" + SERVE_NAME + "/chat?name=";
}
