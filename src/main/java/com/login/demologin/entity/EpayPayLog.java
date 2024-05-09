package com.login.demologin.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 支付日志记录表
 * </p>
 *
 * @author Teng
 * @since 2024-05-09
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class EpayPayLog implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 类型
     */
    private String type;

    /**
     * 方法名称
     */
    private String methodName;

    /**
     * 请求报文
     */
    private String reqMessage;

    /**
     * 响应报文数据
     */
    private String respMessage;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;


}
