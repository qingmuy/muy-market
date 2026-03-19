package cn.muy.trigger.api;

import cn.muy.trigger.api.dto.ActivityDrawRequestDTO;
import cn.muy.trigger.api.dto.ActivityDrawResponseDTO;
import com.muy.types.model.Response;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: qingmuy
 * @date: 2025/10/19 18:31
 * @description : 抽奖活动服务
 */
public interface IRaffleActivityService {

    /**
     * 活动装配，数据预热缓存
     * @param activityId 活动ID
     * @return 装配结果
     */
    Response<Boolean> armory(Long activityId);

    /**
     * 活动抽奖接口
     * @param request 请求对象
     * @return 返回结果
     */
    Response<ActivityDrawResponseDTO> draw(ActivityDrawRequestDTO request);

}
