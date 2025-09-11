package com.muy.domain.strategy.service.rule.filter;

import com.muy.domain.strategy.model.entity.RuleActionEntity;
import com.muy.domain.strategy.model.entity.RuleMatterEntity;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: qingmuy
 * @date: 2025/9/9 22:50
 * @description : 抽奖规则过滤接口
 */
public interface ILogicFilter<T extends RuleActionEntity.RaffleEntity> {

    RuleActionEntity<T> filter(RuleMatterEntity ruleMatterEntity);

}

