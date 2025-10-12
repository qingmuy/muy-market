package com.muy.domain.activity.service.rule;

import com.muy.domain.activity.model.entity.ActivityCountEntity;
import com.muy.domain.activity.model.entity.ActivityEntity;
import com.muy.domain.activity.model.entity.ActivitySkuEntity;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: qingmuy
 * @date: 2025/10/7 18:29
 * @description : 下单规则过滤接口
 */
public interface IActionChain extends IActionChainArmory {

    boolean action(ActivitySkuEntity activitySkuEntity, ActivityEntity activityEntity, ActivityCountEntity activityCountEntity);

}
