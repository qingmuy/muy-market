package com.muy.domain.activity.service.rule.tree;

import com.muy.domain.activity.service.rule.tree.factory.DefaultTreeFactory;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: qingmuy
 * @date: 2025/9/13 23:18
 * @description : 规则树接口
 */
public interface ILogicTreeNode {

    DefaultTreeFactory.TreeActionEntity logic(String userId, Long strategyId, Integer awardId, String ruleValue);

}
