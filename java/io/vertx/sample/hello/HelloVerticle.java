package io.vertx.sample.hello;

import io.vertx.core.AbstractVerticle;

public class HelloVerticle extends AbstractVerticle {

  @Override
  public void start() throws Exception {
    //haha 
    vertx.createHttpServer().requestHandler(request -> {
      request.response().end("Hello Java world !");
    }).listen(8080);
  }
}
