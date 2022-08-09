package com.revogrit.udemy.services;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Promise;

public class VerticleN extends AbstractVerticle {
  @Override
  public void start(Promise<Void> startPromise) throws Exception {
   // System.out.println("Start" + getClass().getName() + "on thread" + Thread.currentThread().getName());
    System.out.println("Start" + getClass().getName() + "with config  " + config().toString());
    startPromise.complete();
  }
}
