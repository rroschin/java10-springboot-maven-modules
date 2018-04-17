package com.romros.jpms.maven.jshell.service.domain;

public class CmdInput {

  private final String command;

  public CmdInput(final String command) {

    this.command = command;
  }

  public String getCommand() {

    return this.command;
  }

  @Override
  public String toString() {

    return String.format("{ type: CmdInput, command: %s }", this.command);
  }

}
