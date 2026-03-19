package com.muy.domain.award.repository;

import com.muy.domain.award.model.aggregate.UserAwardRecordAggregate;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: qingmuy
 * @date: 2025/10/19 00:08
 * @description : 奖品仓储服务
 */
public interface IAwardRepository {

    void saveUserAwardRecord(UserAwardRecordAggregate userAwardRecordAggregate);

}
