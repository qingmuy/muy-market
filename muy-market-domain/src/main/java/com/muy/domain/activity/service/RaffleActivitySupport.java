package com.muy.domain.activity.service;

import com.muy.domain.activity.model.entity.ActivityCountEntity;
import com.muy.domain.activity.model.entity.ActivityEntity;
import com.muy.domain.activity.model.entity.ActivitySkuEntity;
import com.muy.domain.activity.repository.IActivityRepository;
import com.muy.domain.activity.service.rule.factory.DefaultActivityChainFactory;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: qingmuy
 * @date: 2025/10/7 18:27
 * @description : 抽奖活动的支撑类
 */
public class RaffleActivitySupport {

    protected DefaultActivityChainFactory defaultActivityChainFactory;

    protected IActivityRepository activityRepository;

    public RaffleActivitySupport(IActivityRepository activityRepository, DefaultActivityChainFactory defaultActivityChainFactory) {
        this.activityRepository = activityRepository;
        this.defaultActivityChainFactory = defaultActivityChainFactory;
    }

    public ActivitySkuEntity queryActivitySku(Long sku) {
        return activityRepository.queryActivitySku(sku);
    }

    public ActivityEntity queryRaffleActivityByActivityId(Long activityId) {
        return activityRepository.queryRaffleActivityByActivityId(activityId);
    }

    public ActivityCountEntity queryRaffleActivityCountByActivityCountId(Long activityCountId) {
        return activityRepository.queryRaffleActivityCountByActivityCountId(activityCountId);
    }

}
