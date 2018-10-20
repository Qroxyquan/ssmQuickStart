package cn.qroxy.common;

/**
 * create by 林镇权
 * *
 * QQ：1114031075
 * *
 * 时间: 2018/9/28-7:44 PM
 */
public enum ResponseCode {
    SUCCESS(0,"SUCCESS"),
    ERROR(1,"ERROR"),
    NEED_LOGIN(10,"NEED_LOGIN"),
    ILLEGAL_ARGUMENT(2," ILLEGAL_ARGUMENT");

    ResponseCode(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    private  final int code;
    private  final  String desc;


}
