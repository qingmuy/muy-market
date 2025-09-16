package cn.muy.trigger.api.dto;

import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: qingmuy
 * @date: 2025/9/16 10:55
 * @description : 抽奖奖品列表，请求对象
 */
@Data
public class RaffleAwardListRequestDTO {

    // 抽奖策略ID
    private Long strategyId;

}
