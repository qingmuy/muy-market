package com.muy.domain.award.service;

import com.muy.domain.award.model.entity.UserAwardRecordEntity;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: qingmuy
 * @date: 2025/10/19 00:11
 * @description : 奖品服务接口
 */
public interface IAwardService {

    void saveUserAwardRecord(UserAwardRecordEntity userAwardRecordEntity);

}
