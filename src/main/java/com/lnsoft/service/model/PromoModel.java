package com.lnsoft.service.model;

import org.joda.time.DateTime;

import java.math.BigDecimal;

/**
 * 秒杀模型
 * <p>
 * Created By Chr on 2019/1/9/0009.
 */
public class PromoModel {

    private Integer id;

    /**
     * 根据当前时间，和开始时间和结束时间对比，得到当前活动的状态，
     * 直接被外层调用，
     */
    //秒杀活动状态：0没有秒杀活动。1没开始。2进行中。3已结束
    private Integer status;

    //秒杀活动名字
    private String promoName;

    //秒杀活动开始事件:DateTime是joda-time
    private DateTime startTime;

    //秒杀活动的结束时间
    private DateTime endTime;

    //秒杀活动的适用商品
    private Integer itemId;

    //秒杀活动的价格
    private BigDecimal promoItemPrice;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPromoName() {
        return promoName;
    }

    public void setPromoName(String promoName) {
        this.promoName = promoName;
    }

    public DateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(DateTime startTime) {
        this.startTime = startTime;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public BigDecimal getPromoItemPrice() {
        return promoItemPrice;
    }

    public void setPromoItemPrice(BigDecimal promoItemPrice) {
        this.promoItemPrice = promoItemPrice;
    }

    public DateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(DateTime endTime) {
        this.endTime = endTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
