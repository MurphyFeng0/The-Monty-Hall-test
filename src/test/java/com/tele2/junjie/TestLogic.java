package com.tele2.junjie;

import com.tele2.junjie.strategy.ChangeStrategy;
import com.tele2.junjie.strategy.StayStrategy;
import com.tele2.junjie.strategy.Strategy;
import org.junit.Assert;
import org.junit.Test;

public class TestLogic {

    @Test
    public void stayStrategyTest() {
        Strategy stayStrategy = new StayStrategy();
        stayStrategy.executeOnce();
        Assert.assertTrue(stayStrategy.getHostChoiceBox() >= 0 && stayStrategy.getHostChoiceBox() < 3);
        Assert.assertTrue(stayStrategy.getMoneyBox() >= 0 && stayStrategy.getMoneyBox() < 3);
        Assert.assertTrue(stayStrategy.getHostChoiceBox() >= 0 && stayStrategy.getHostChoiceBox() < 3);
        Assert.assertTrue(stayStrategy.getHostChoiceBox() != stayStrategy.getPlayerChoiceBox() &&
                stayStrategy.getHostChoiceBox() != stayStrategy.getMoneyBox());
    }

    @Test
    public void changeStrategyTest() {
        Strategy changeStrategy = new ChangeStrategy();
        changeStrategy.executeOnce();
        Assert.assertTrue(changeStrategy.getHostChoiceBox() >= 0 && changeStrategy.getHostChoiceBox() < 3);
        Assert.assertTrue(changeStrategy.getMoneyBox() >= 0 && changeStrategy.getMoneyBox() < 3);
        Assert.assertTrue(changeStrategy.getHostChoiceBox() >= 0 && changeStrategy.getHostChoiceBox() < 3);
        Assert.assertTrue(changeStrategy.getHostChoiceBox() != changeStrategy.getPlayerChoiceBox() &&
                changeStrategy.getHostChoiceBox() != changeStrategy.getMoneyBox());
    }

}
