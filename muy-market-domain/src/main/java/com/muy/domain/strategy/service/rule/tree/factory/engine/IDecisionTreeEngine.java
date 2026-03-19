package com.muy.domain.strategy.service.rule.tree.factory.engine;

import com.muy.domain.strategy.service.rule.tree.factory.DefaultTreeFactory;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: qingmuy
 * @date: 2025/9/13 23:19
 * @description : 规则树组合接口
 */
public interface IDecisionTreeEngine {

    DefaultTreeFactory.StrategyAwardVO process(String userId, Long strategyId, Integer awardId);

}
