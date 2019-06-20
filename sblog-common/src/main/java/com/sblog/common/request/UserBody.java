package com.sblog.common.request;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

/**
 * @author yuan
 * @date 2019/1/3
 */
@Data
public class UserBody {

    @NotBlank(message = "用户名不能为空")
    @Length(min = 6,max = 20,message = "用户名长度需在6-20字符之间")
    private String username;

    @NotBlank(message = "密码不能为空")
    @Length(min = 6,max = 20,message = "密码长度需在6-20字符之间")
    private String password;

    @NotBlank(message = "名称不能为空")
    @Length(min = 3,max = 20,message = "昵称长度需在3-20字符之间")
    private String name;
}
