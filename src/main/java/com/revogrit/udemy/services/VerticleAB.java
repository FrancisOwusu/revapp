package com.revogrit.udemy.services;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Promise;

public class VerticleAB extends AbstractVerticle {
  public void start(Promise<Void> startPromise) throws Exception {
    System.out.println("Start" + getClass().getName());
//    vertx.deployVerticle(new VerticleA(),whenDeployed->{
//      System.out.println("Deployed" + VerticleA.class.getName());
//      vertx.undeploy(whenDeployed.result());
//    });
    startPromise.complete();
  }


  public void stop(Promise<Void> stopPromise) throws Exception{
    System.out.println("stop" + getClass().getName());
    stopPromise.complete();
  }
}
