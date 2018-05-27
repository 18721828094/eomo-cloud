package com.prato.cloud.drools;

import com.prato.cloud.drools.rule.Rule;

/**
 * @ClassName: RuleEngine
 * @Description: 定义规则引擎
 * @author Albert Ge
 * @version 1.2.0
 * @date 2016年5月26日
 *
 */
public interface RuleEngine {
    /**
     * Initializes the rules engine.
     */
    public void init();

    /**
     * Refresh the rules engine.
     */
    public void refresh();

    /**
     * Execute the rules engine.
     */
    public void execute(final Rule rule);
}
