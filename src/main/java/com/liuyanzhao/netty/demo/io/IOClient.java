package com.liuyanzhao.netty.demo.io;

import java.io.IOException;
import java.net.Socket;
import java.util.Date;

/**
 * 客户端
 * @author 言曌
 * @date 2019-08-30 19:33
 */

public class IOClient {

    public static void main(String[] args) {
        new Thread(() -> {
            try {
                Socket socket = new Socket("127.0.0.1", 8000);
                while (true) {
                    try {
                        socket.getOutputStream().write((new Date() + ": hello world").getBytes());
                        Thread.sleep(2000);
                    } catch (Exception e) {
                    }
                }
            } catch (IOException e) {
            }
        }).start();
    }
}