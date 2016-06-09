package com.xjeffrose.xio.client;

import com.google.common.net.HostAndPort;
import com.google.common.util.concurrent.ListenableFuture;
import com.xjeffrose.xio.client.retry.RetryPolicy;
import com.xjeffrose.xio.client.retry.RetrySleeper;
import com.xjeffrose.xio.core.ShutdownUtil;
import io.airlift.units.Duration;
import io.netty.bootstrap.Bootstrap;
import io.netty.buffer.PooledByteBufAllocator;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.util.Timer;
import java.io.Closeable;
import java.net.InetSocketAddress;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.util.List;

import com.xjeffrose.xio.server.XioService;
import com.xjeffrose.xio.client.loadbalancer.Distributor;


import static com.google.common.base.Preconditions.checkNotNull;

public class XioClient implements Closeable {
  private static final Logger log = Logger.getLogger(XioClient.class);

  public XioClient(Distributor distributor, XioService xioService) {
  }

  public XioClient(List<String> serverList, XioService xioService) {
  }

  public XioClient(String zkConnectionStringAndPath, XioService xioService) {
  }

  public XioClient(XioClientConfig xioClientConfig, XioService xioService) {
  }

  private static InetSocketAddress toInetAddress(HostAndPort hostAndPort) {
    return (hostAndPort == null) ? null : new InetSocketAddress(hostAndPort.getHostText(), hostAndPort.getPort());
  }


  @Override
  public void close() throws IOException {
  }

}
