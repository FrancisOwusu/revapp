package com.revogrit.udemy.eventLoop;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Promise;
import io.vertx.core.Vertx;
import io.vertx.core.impl.logging.LoggerFactory;
import org.apache.logging.log4j.Logger;

public class EventLoopExample extends AbstractVerticle {

//  private static final Logger log = LoggerFactory
  public static void main(String[] args) {
    Vertx vertx = Vertx.vertx();
    vertx.deployVerticle(new EventLoopExample());

  }

  @Override
  public void start(final Promise<Void> startPromise) throws Exception {
    super.start(startPromise);
  }
}
