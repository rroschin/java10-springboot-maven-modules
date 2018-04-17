package com.romros.jpms.maven.jshell.service.domain;

import jdk.jshell.SnippetEvent;

public class CmdOutput {

  private final SnippetEvent snippetEvent;

  public CmdOutput(final SnippetEvent snippetEvent) {

    this.snippetEvent = snippetEvent;
  }

  public String getValue() {

    return this.snippetEvent.value();
  }

  public String getStatus() {

    return this.snippetEvent.status()
                            .toString();
  }

  public Throwable getException() {

    return this.snippetEvent.exception();
  }

  @Override
  public String toString() {

    return String.format("{ type: CmdOutput, status: %s, value: %s, exception: %s }", this.snippetEvent.status(), this.snippetEvent.value(),
        this.snippetEvent.exception());
  }

}
