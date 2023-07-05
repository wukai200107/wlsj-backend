package com.wlsj.wlsjbi.constant;

/**
 * 用户常量
 * @author wlsj
 */
public interface UserConstant {

    /**
     * 盐值，混淆密码
     */
    String SALT = "wlsj";

    /**
     * 用户登录态键
     */
    String USER_LOGIN_STATE = "user_login";

    //  region 权限

    /**
     * 默认角色
     */
    String DEFAULT_ROLE = "user";

    /**
     * 管理员角色
     */
    String ADMIN_ROLE = "admin";

    /**
     * 被封号
     */
    String BAN_ROLE = "ban";

    /**
     * 默认头像
     */
    String DEFAULT_AVATAR = "http://cdn.wlsj.space/2ba31420-500e-45c0-9c0f-1b0356921bbb.png";

}
