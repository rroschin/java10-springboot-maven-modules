module com.romros.jpms.maven.jshell.api {

  requires spring.core;
  requires spring.beans;
  requires spring.context;
  requires spring.web;
  requires spring.boot;
  requires spring.boot.autoconfigure;

  requires com.romros.jpms.maven.jshell.service;

  exports com.romros.jpms.maven.jshell.api;

  opens com.romros.jpms.maven.jshell.api;
  opens com.romros.jpms.maven.jshell.api.controller;
}
