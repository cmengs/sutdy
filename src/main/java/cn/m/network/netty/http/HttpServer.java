package cn.m.network.netty.http;

import io.netty.bootstrap.ServerBootstrap;

public class HttpServer {

    int post;

    public HttpServer(int post) {
        this.post = post;
    }

    public void start() throws Exception{
        ServerBootstrap bootstrap = new ServerBootstrap();

    }
}
