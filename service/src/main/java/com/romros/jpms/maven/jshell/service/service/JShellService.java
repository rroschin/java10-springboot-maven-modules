package com.romros.jpms.maven.jshell.service.service;

import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.romros.jpms.maven.jshell.service.domain.CmdInput;
import com.romros.jpms.maven.jshell.service.domain.CmdOutput;

import jdk.jshell.JShell;

@Service
public class JShellService {

  private static final Logger log = Logger.getLogger(JShellService.class.getName());

  private JShell jshell;

  @PostConstruct
  public void init() {

    this.jshell = JShell.builder()
                        .build();

    this.executeFirstCommand();
  }

  private void executeFirstCommand() {

    final var exampleCmd = new CmdInput("2+2");
    final var snippetEvents = this.jshell.eval(exampleCmd.getCommand());

    final var outputs = snippetEvents.stream()
                                     .map(event -> new CmdOutput(event))
                                     .collect(Collectors.toCollection(LinkedList::new));

    log.info("Outputs of command: " + exampleCmd + " are: ");
    log.info(outputs.toString());

  }

  public List<CmdOutput> executeCommand(final CmdInput commandInput) {

    final var snippetEvents = this.jshell.eval(commandInput.getCommand());
    return snippetEvents.stream()
                        .map(event -> new CmdOutput(event))
                        .collect(Collectors.toCollection(LinkedList::new));
  }

}
