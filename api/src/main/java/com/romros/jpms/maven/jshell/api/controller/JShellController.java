package com.romros.jpms.maven.jshell.api.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.romros.jpms.maven.jshell.service.domain.CmdInput;
import com.romros.jpms.maven.jshell.service.domain.CmdOutput;
import com.romros.jpms.maven.jshell.service.service.JShellService;

@RestController
public class JShellController {

  @Autowired JShellService replService;

  @RequestMapping(value = "/repl", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<List<CmdOutput>> replCommand(@RequestBody final Map<String, Object> commandInput) {

    final var inputCmd = new CmdInput((String) commandInput.get("command"));
    final var outputCmd = this.replService.executeCommand(inputCmd);
    return new ResponseEntity<>(outputCmd, HttpStatus.OK);
  }
}
