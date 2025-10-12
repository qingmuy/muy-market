package com.muy.domain.activity.service.rule;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: qingmuy
 * @date: 2025/10/7 18:28
 * @description : 下单规则责任链抽象类
 */
public abstract class AbstractActionChain implements IActionChain {

    private IActionChain next;

    @Override
    public IActionChain next() {
        return next;
    }

    @Override
    public IActionChain appendNext(IActionChain next) {
        this.next = next;
        return next;
    }

}
