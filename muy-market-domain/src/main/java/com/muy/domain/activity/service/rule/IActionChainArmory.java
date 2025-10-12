package com.muy.domain.activity.service.rule;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: qingmuy
 * @date: 2025/10/7 18:30
 * @description : do some thing
 */
public interface IActionChainArmory {

    IActionChain next();

    IActionChain appendNext(IActionChain next);

}
