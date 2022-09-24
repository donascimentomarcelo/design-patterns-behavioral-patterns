package br.com.cod3r.command.alexa.commands;

import br.com.cod3r.command.alexa.lights.GenericLight;

public class TurnLightOffCommand implements Command {
    private GenericLight light;

    public TurnLightOffCommand(final GenericLight light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.turnOff();
    }
}
