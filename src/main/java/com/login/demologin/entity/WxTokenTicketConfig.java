package com.login.demologin.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 微信公众号accesstoken记录表
 * </p>
 *
 * @author Teng
 * @since 2024-05-09
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class WxTokenTicketConfig implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 微信token
     */
    private String accessToken;

    private String jsapiTicket;

    /**
     * 有效期截至时间
     */
    private Date lifeEnd;


}
