package com.tele2.junjie.strategy;

import java.util.HashMap;
import java.util.Map;

public class StrategyContext {
    private Strategy strategy;

    private static Map<DecisionType, Strategy> strategyMap = new HashMap<>();

    static {
        strategyMap.put(DecisionType.STAY, new StayStrategy());
        strategyMap.put(DecisionType.CHANGE, new ChangeStrategy());
    }

    public StrategyContext(DecisionType decisionType) {
        this.strategy = strategyMap.get(decisionType);
    }

    public boolean executeOnce() {
        return this.strategy.executeOnce();
    }


}
