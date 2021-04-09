package com.lg.sjfz_json.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author lm
 * @since 2021-03-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="EbookEntry对象", description="")
public class EbookEntry implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("categoryId")
    private Integer categoryid;

    private String title;

    private String summary;

    private String uploaduser;
    @TableField(fill = FieldFill.INSERT)
    private Date createdate;


}
