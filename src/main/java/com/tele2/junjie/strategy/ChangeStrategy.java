package com.tele2.junjie.strategy;

public class ChangeStrategy extends Strategy {
    @Override
    protected void makeDecision() {
        setPlayerChoiceBox(SEEDSUM - getPlayerChoiceBox() - getHostChoiceBox());
    }
}
