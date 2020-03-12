package pl.itbrains.demo.quarkusrr;

import io.quarkus.vertx.web.Route;
import io.vertx.ext.web.RoutingContext;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;

@ApplicationScoped
public class QuarkusReactiveRoutes {

  @Route(path = "api/get-json", produces = MediaType.APPLICATION_JSON)
  void jsonResult(RoutingContext rc) {
    rc.response()
        .putHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON)
        .end("{}");
  }

}
