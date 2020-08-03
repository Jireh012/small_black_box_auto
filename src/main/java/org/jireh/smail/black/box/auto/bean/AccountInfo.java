package org.jireh.smail.black.box.auto.bean;

import lombok.Data;

import java.util.List;

@Data
public class AccountInfo {

    /**
     * os_type : Android
     * os_version : 10
     * box_version : 1.3.811
     * channel : xiaomi
     * account : [{"pkey":"1111111111","imei":"222222222222","heybox_id":"33333333333"},{"pkey":"44444444444","imei":"5555555555555","heybox_id":"66666666666"},{"pkey":"7777777777777","imei":"888888888888888","heybox_id":"999999999999999"}]
     */

    private String os_type;
    private String os_version;
    private String box_version;
    private String channel;
    private List<AccountBean> account;

    @Data
    public static class AccountBean {
        /**
         * pkey : 1111111111
         * imei : 222222222222
         * heybox_id : 33333333333
         */

        private String pkey;
        private String imei;
        private String heybox_id;
    }
}
