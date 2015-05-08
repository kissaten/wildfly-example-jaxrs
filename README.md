# Wildfly Swarm Example JAX-RS

This is an example app running [Wildfly Swarm](http://wildfly.org/news/2015/05/05/WildFly-Swarm-Released/)
on Heroku using JAX-RS. Click this button to deploy it:

[![Deploy to Heroku](https://www.herokucdn.com/deploy/button.png)](https://heroku.com/deploy)

Or follow these steps, after installing the [Heroku Toolbelt](https://toolbelt.heroku.com/), to deploy with Maven:

```sh-session
$ git clone https://github.com/kissaten/wildfly-example-jaxrs
$ heroku create
$ mvn package heroku:deploy -Dheroku.appName=<appName>
```

Or follow these steps to deploy with Git.

```sh-session
$ git clone https://github.com/kissaten/wildfly-example-jaxrs
$ heroku create
$ git push heroku master
```
