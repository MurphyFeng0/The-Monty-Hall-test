package com.tele2.junjie;

import com.tele2.junjie.strategy.DecisionType;
import com.tele2.junjie.strategy.StrategyContext;

public class Main {
    public static void main(String[] args) {
        int totalCount = 100000;
        int stayWins = 0;
        StrategyContext stayContext = new StrategyContext(DecisionType.STAY);
        for (int count = 0; count < totalCount; count++) {
            if (stayContext.executeOnce()) {
                stayWins++;
            }
        }

        int changeWins = 0;
        StrategyContext changeContext = new StrategyContext(DecisionType.CHANGE);
        for (int count = 0; count < totalCount; count++) {
            if (changeContext.executeOnce()) {
                changeWins++;
            }
        }

        System.out.println(String.format("stay strategy executes %s times in total, and wins %s times",
                totalCount, stayWins));
        System.out.println(String.format("change strategy executes %s times in total, and wins %s times",
                totalCount, changeWins));
    }
}
