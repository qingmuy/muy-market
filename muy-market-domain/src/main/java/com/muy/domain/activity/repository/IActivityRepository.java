package com.muy.domain.activity.repository;

import com.muy.domain.activity.model.aggregate.CreateOrderAggregate;
import com.muy.domain.activity.model.entity.ActivityCountEntity;
import com.muy.domain.activity.model.entity.ActivityEntity;
import com.muy.domain.activity.model.entity.ActivitySkuEntity;
import com.muy.domain.activity.model.valobj.ActivitySkuStockKeyVO;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: qingmuy
 * @date: 2025/10/5 18:34
 * @description : 活动仓储接口
 */
public interface IActivityRepository {

    ActivitySkuEntity queryActivitySku(Long sku);

    ActivityEntity queryRaffleActivityByActivityId(Long activityId);

    ActivityCountEntity queryRaffleActivityCountByActivityCountId(Long activityCountId);

    void doSaveOrder(CreateOrderAggregate createOrderAggregate);

    void cacheActivitySkuStockCount(String cacheKey, Integer stockCount);

    boolean subtractionActivitySkuStock(Long sku, String cacheKey, Date endDateTime);

    void activitySkuStockConsumeSendQueue(ActivitySkuStockKeyVO activitySkuStockKeyVO);

    ActivitySkuStockKeyVO takeQueueValue();

    void clearQueueValue();

    void updateActivitySkuStock(Long sku);

    void clearActivitySkuStock(Long sku);

}
