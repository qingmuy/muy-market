package com.muy.domain.strategy.service.armory;

/**
 * Created withIntelliJ IDEA.
 *
 * @author: qingmuy
 * @date:2025/9/9
 * @time:20:26
 * @description : do some thing
 */
public interface IStrategyDispatch {

    /**
     * 获取抽奖策略装配的随机结果
     *
     * @param strategyId 策略ID
     * @return 抽奖结果
     */
    Integer getRandomAwardId(Long strategyId);

    Integer getRandomAwardId(Long strategyId, String ruleWeightValue);

}
