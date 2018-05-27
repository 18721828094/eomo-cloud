package com.prato.cloud.drools;

public class SingleRuleFactory {
    private static RuleBase ruleBase;

    public static RuleBase getRuleBase(){
        return null != ruleBase ? ruleBase : RuleBaseFactory.newRuleBase();
    }
}
