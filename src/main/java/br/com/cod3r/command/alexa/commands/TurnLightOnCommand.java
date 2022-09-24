package br.com.cod3r.command.alexa.commands;

import br.com.cod3r.command.alexa.lights.GenericLight;

public class TurnLightOnCommand implements Command{
    private GenericLight light;

    public TurnLightOnCommand(final GenericLight light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.turnOn();
    }
}
