package com.shui.exam.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 选择题题库表
 * </p>
 *
 * @author lin
 * @since 2022-01-21
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("single_question")
@ApiModel(value="SingleQuestion对象", description="选择题题库表")
public class SingleQuestion implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "试题编号")
    @TableId(value = "questionId", type = IdType.AUTO)
    private Integer questionId;

    @ApiModelProperty(value = "考试科目")
    private String subject;

    @ApiModelProperty(value = "问题题目")
    private String question;

    @ApiModelProperty(value = "选项A")
    @TableField("answerA")
    private String answerA;

    @ApiModelProperty(value = "选项B")
    @TableField("answerB")
    private String answerB;

    @ApiModelProperty(value = "选项C")
    @TableField("answerC")
    private String answerC;

    @ApiModelProperty(value = "选项D")
    @TableField("answerD")
    private String answerD;

    @ApiModelProperty(value = "正确答案")
    @TableField("rightAnswer")
    private String rightAnswer;

    @ApiModelProperty(value = "题目解析")
    private String analysis;

    @ApiModelProperty(value = "分数")
    private Integer score;

    @ApiModelProperty(value = "所属章节")
    private String section;

    @ApiModelProperty(value = "难度等级")
    private String level;


}
