package com.tele2.junjie.strategy;

import lombok.Data;

import java.util.Random;

@Data
public abstract class Strategy {
    public final static int SEEDSUM = 0 + 1 + 2;
    public final static int SEED = 3;
    private int moneyBox;
    private int playerChoiceBox;
    private int hostChoiceBox;

    private void assignMoneyBox() {
        Random rand = new Random();
        moneyBox = rand.nextInt(SEED);
    }

    private void playerChoose() {
        Random rand = new Random();
        playerChoiceBox = rand.nextInt(SEED);
    }

    private void hostChoose() {
        Random rand = new Random();
        do {
            hostChoiceBox = rand.nextInt(SEED);
        } while (hostChoiceBox == moneyBox || hostChoiceBox == playerChoiceBox);
    }

    protected abstract void makeDecision();

    private boolean checkWin() {
        return playerChoiceBox == moneyBox;
    }

    public boolean executeOnce() {
        assignMoneyBox();
        playerChoose();
        hostChoose();
        makeDecision();
        return checkWin();
    }
}
