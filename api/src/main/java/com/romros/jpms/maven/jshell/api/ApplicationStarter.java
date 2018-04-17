package com.romros.jpms.maven.jshell.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.romros.jpms.maven.jshell.*")
public class ApplicationStarter {

  public static void main(final String[] args) {

    SpringApplication.run(ApplicationStarter.class, args);
  }

}
