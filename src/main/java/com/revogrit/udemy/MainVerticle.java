package com.revogrit.udemy;

import com.revogrit.udemy.services.VerticleA;
import com.revogrit.udemy.services.VerticleAA;
import com.revogrit.udemy.services.VerticleB;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.revogrit.udemy.services.VerticleN;
import io.vertx.core.*;
import io.vertx.core.json.JsonObject;

import java.util.UUID;

public class MainVerticle extends AbstractVerticle {
final Logger logger = LogManager.getLogger(MainVerticle.class);


  public static void main(String[] args) {
  final  Vertx vertx = Vertx.vertx();
    vertx.deployVerticle(new MainVerticle());
//
//    final Promise<Void> returnVoid = Promise.promise();
//    returnVoid.complete();
//
//    final Promise<String> stringPromise = Promise.promise();
//    vertx.setTimer(500,id->{
//      stringPromise.complete();
//    });
//
//    final Promise<JsonObject> returnJsonObject= Promise.promise();
//
//    returnJsonObject.complete(new JsonObject().put("Message","Hello"));
//
//
//    final Future<String> future = stringPromise.future();
//    future.onSuccess(result->{
////      context.notify();
//    });


  }
  @Override
  public void start(Promise<Void> startPromise) throws Exception {
    logger.debug("Start {}",getClass().getName());
    //System.out.println("Start" + getClass().getName());
//    vertx.deployVerticle(new VerticleA());
//    vertx.deployVerticle(new VerticleB());
    //verticle is deployed 4times

    vertx.deployVerticle(VerticleN.class.getName(),
      new DeploymentOptions().
      setInstances(5)
        .setConfig(new JsonObject()
          .put("id", UUID.randomUUID().toString())
          .put("name",VerticleN.class.getSimpleName())
        ));
    startPromise.complete();


  }
}
