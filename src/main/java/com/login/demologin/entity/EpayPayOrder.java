package com.login.demologin.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 支付订单记录表
 * </p>
 *
 * @author Teng
 * @since 2024-05-09
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class EpayPayOrder implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 业务号（投保单号、保单号等等)
     */
    private String businessNo;

    /**
     * 商户账号
     */
    private String merAccountId;

    /**
     * 请求方生成的唯一交易流水号
     */
    private String reqTransNo;

    /**
     * 订单号
     */
    private String orderId;

    /**
     * 支付渠道返回的交易流水号
     */
    private String bankTransNo;

    /**
     * 商品描述
     */
    private String productName;

    /**
     * 订单总金额（单位分）
     */
    private String orderTotalAmount;

    /**
     * 实付金额（单位分）
     */
    private String payAmount;

    /**
     * 币种，当前只支持人民币，编码为001
     */
    private String currency;

    /**
     * 支付状态（0：初始化，1：成功，2：失败，3：支付中）
     */
    private String payStatus;

    /**
     * 银行账号（数币是子钱包token）
     */
    private String bankAccountNo;

    /**
     * 账号类型（00-储蓄卡，01-存折，02-信用卡，03-数币钱包）
     */
    private String bankAccountType;

    /**
     * 银行编码
     */
    private String bankCode;

    /**
     * 银行名称
     */
    private String bankName;

    /**
     * 支付方式（0：微信，1：银行卡支付，2：数字人民币钱包）
     */
    private String paymentType;

    /**
     * 支付渠道（0：腾讯，1：银企直连，2：金联万家，3：数字人民币）
     */
    private String paymentChannel;

    /**
     * 支付渠道订单号
     */
    private String fgOrderId;

    /**
     * 退款订单所属的支付订单号
     */
    private String payOrderId;

    /**
     * 交易完成时间（渠道返回）
     */
    private Date endTime;

    /**
     * 发起支付的系统编码
     */
    private String systemCode;

    /**
     * 子钱包片段信息
     */
    private String walletSegInfo;

    /**
     * 场景类型
     */
    private String abcTranType;

    /**
     * 场景子类
     */
    private String abcTranCode;

    /**
     * 收款方名称
     */
    private String abcAcqCustname;

    /**
     * 创建日期
     */
    private Date createTime;

    /**
     * 更新日期
     */
    private Date updateTime;

    /**
     * 订单类型,0支付订单，1退款订单
     */
    private String orderType;


}
