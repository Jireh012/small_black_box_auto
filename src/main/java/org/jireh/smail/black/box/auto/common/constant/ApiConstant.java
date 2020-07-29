/*
 *      Copyright (c) 2018-2028, Chill Zhuang All rights reserved.
 *
 *  Redistribution and use in source and binary forms, with or without
 *  modification, are permitted provided that the following conditions are met:
 *
 *  Redistributions of source code must retain the above copyright notice,
 *  this list of conditions and the following disclaimer.
 *  Redistributions in binary form must reproduce the above copyright
 *  notice, this list of conditions and the following disclaimer in the
 *  documentation and/or other materials provided with the distribution.
 *  Neither the name of the dreamlu.net developer nor the names of its
 *  contributors may be used to endorse or promote products derived from
 *  this software without specific prior written permission.
 *  Author: Chill 庄骞 (smallchill@163.com)
 */
package org.jireh.smail.black.box.auto.common.constant;

/**
 * API地址池
 *
 * @author Jireh
 */
public interface ApiConstant {

    /**
     * 检查更新
     */
    String VERSION_CHECK = "/account/version_control_info/?os_type=Android";


    /**
     * 任务状态
     */
    String GET_TASK_STATS = "/task/stats";


    /**
     * 任务列表
     */
    String GET_TASK_LIST = "task/list";


    /**
     * 检查更新
     */
    String SMALL_BLACK_BOX_VERSION_CHECK = "/account/version_control_info/?os_type=Android";

    /**
     * 关注更新提醒
     */
    String GET_FOLLOW_ALERT = "/bbs/app/api/follow/alert";

    /**
     * 关注列表
     */
    String GET_SUBSCRIBED_EVENTS = "/bbs/app/profile/subscribed/events";

    /**
     *
     */
    String GET_NEWS_LIST = "/maxnews/app/list";

    /**
     * 文章附加信息
     */
    String GET_LINK_TREE = "/bbs/app/link/tree";

    /**
     * 文章页
     */
    String GET_NEWS_DETAIL = "/maxnews/app/detail/";

    /**
     * 视频页框架
     */
    String GET_VIDEO_VIEW = "/bbs/app/link/web/view";

    /**
     * 游戏评价
     */
    String GET_GAME_COMMENTS = "/bbs/app/link/game/comments/";


    /**
     * 游戏详情
     */
    String GET_GAME_DETAIL = "/game/get_game_detail/";

    /**
     * 游戏文章
     */
    String GET_GAME_REVIEWS = "/bbs/app/link/game/reviews";

    /**
     * 拉取推荐关注列表
     */
    String GET_RECOMMEND_FOLLOWING = "/bbs/app/profile/recommend/following";

    /**
     * 拉取广告
     */
    String GET_ADS_INFO = "/account/get_ads_info/";

    /**
     * 获取账户验证信息
     */
    String GET_AUTH_INFO = "/account/get_auth_info/";

    /**
     * 拉取ROLL房列表
     */
    String GET_ACTIVE_ROLL_ROOM = "/store/get_all_active_roll_room/";

    /**
     * 获取个人资料
     */
    String GET_USER_PROFILE = "/bbs/app/profile/user/profile";

    /**
     * 拉取粉丝列表
     */
    String GET_FOLLOWER_LIST = "/bbs/app/profile/follower/list";

    /**
     * 拉取关注列表
     */
    String GET_FOLLOWING_LIST = "/bbs/app/profile/following/list";

    /**
     * 拉取社区答题题目
     */
    String GET_COMMUNITY_SURVEY = "/bbs/app/api/activity/community_survey";

    /**
     * 检查有没有解锁新成就
     */
    String GET_ACHIEVE_LIST = "/bbs/app/profile/achieve/list";

    /**
     * 私信/通知提醒
     */
    String GET_NOTIFY_ALERT = "/bbs/app/api/notify/alert";

    /**
     * 拉取用户动态
     */
    String GET_USER_FOLLOW_POST = "/bbs/app/profile/events";

    /**
     * 拉取用户发帖
     */
    String GET_USER_POST = "/bbs/app/profile/user/link/list";

    /**
     * 拉取用户评论
     */
    String GET_USER_COMMENT = "/bbs/app/profile/news/comment/list";

    /**
     * 获取商店的游戏列表
     */
    String GET_STORE_GAME_LIST = "/mall/list/";

    /**
     * 一般点赞
     */
    String LIKE_LINK = "/bbs/app/profile/award/link";

    /**
     * 评测点赞
     */
    String SUPPORT_COMMENT = "/bbs/app/link/game/comment/up";

    /**
     * 评论点赞
     */
    String LIKE_COMMENT = "/bbs/app/comment/support";

    /**
     * 签到
     */
    String SIGN = "/task/sign/";

    /**
     * 签到列表
     */
    String SIGN_LIST = "/task/sign_list/";

    /**
     * 分享
     */
    String SHARE_CLICK = "/bbs/app/link/share/click";

    /**
     * 检查分享
     */
    String SHARE_CHECK = "/task/shared/";

    /**
     * 加关注
     */
    String FOLLOW_USER = "/bbs/app/profile/follow/user";

    /**
     * 取消关注
     */
    String UNFOLLOW_USER = "/bbs/app/profile/follow/user/cancel";

    /**
     * 社区答题提交
     */
    String BBS_QA_STATE = "/task/push_bbs_qa_state/";

    /**
     * 修改个人资料
     */
    String UPDATE_PROFILE = "/account/update_profile/";

    /**
     * 发送私信
     */
    String SEND_MESSAGE = "/chat/send_message/";

}
