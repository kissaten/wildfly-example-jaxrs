package com.heroku.examples.wildfly;

import org.wildfly.swarm.container.Container;
import org.wildfly.swarm.container.SocketBindingGroup;
import org.wildfly.swarm.jaxrs.JaxRsDeployment;

public class Main {

    public static void main(String[] args) throws Exception {
        Container container = new Container();

        container.iface("public", "${jboss.bind.address:0.0.0.0}");

        container.socketBindingGroup(
          new SocketBindingGroup("default-sockets", "public", "${jboss.socket.binding.port-offset:0}")
          .socketBinding("http", "${jboss.http.port:8080}")
        );

        JaxRsDeployment deployment = new JaxRsDeployment();
        deployment.addResource(MyResource.class);

        container.start(deployment);
    }
}
