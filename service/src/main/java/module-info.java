module com.romros.jpms.maven.jshell.service {

  requires java.logging;
  requires java.annotation;
  requires jdk.jshell;
  requires spring.beans;
  requires spring.context;

  exports com.romros.jpms.maven.jshell.service.service;
  exports com.romros.jpms.maven.jshell.service.domain;

  opens com.romros.jpms.maven.jshell.service.service;
  opens com.romros.jpms.maven.jshell.service.domain;
  opens com.romros.jpms.maven.jshell.service.config;

}
