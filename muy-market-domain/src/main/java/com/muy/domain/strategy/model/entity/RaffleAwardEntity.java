package com.muy.domain.strategy.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created withIntelliJ IDEA.
 *
 * @author: qingmuy
 * @date:2025/9/9
 * @time:22:38
 * @description : 抽奖奖品实体
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RaffleAwardEntity {

    /** 奖品ID */
    private Integer awardId;

    /** 抽奖奖品标题 */
    private String awardTitle;

    /** 奖品配置信息 */
    private String awardConfig;

    /** 奖品顺序号 */
    private Integer sort;

}
