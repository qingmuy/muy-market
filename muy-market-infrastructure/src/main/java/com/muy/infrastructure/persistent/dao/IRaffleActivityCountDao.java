package com.muy.infrastructure.persistent.dao;

import com.muy.infrastructure.persistent.po.RaffleActivityCount;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: qingmuy
 * @date: 2025/9/24 22:11
 * @description : 抽奖活动次数配置表Dao
 */
@Mapper
public interface IRaffleActivityCountDao {

    RaffleActivityCount queryRaffleActivityCountByActivityCountId(Long activityCountId);

}
