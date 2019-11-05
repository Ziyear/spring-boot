package com.ziyear.common.response;

public class ActionResult {
    private static final String SUCCESS_CODE = "000000";
    private static final String SUCCESS_MESSAGE = "成功";
    private static final String ERR_MESSAGE = "请求失败";
    private static final String ERR_CODE = "999999";

    private String code;
    private String message;
    private Object data;
    private boolean isSuccess;

    public ActionResult(String code, String message, boolean isSuccess, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public ActionResult(String code, String message, boolean isSuccess) {
        this.code = code;
        this.message = message;
        this.data = null;
    }

    public static ActionResult getSuccessResult() {
        return new ActionResult(SUCCESS_CODE, SUCCESS_MESSAGE, true);
    }

    public static ActionResult getSuccessResult(Object data) {
        return new ActionResult(SUCCESS_CODE, SUCCESS_MESSAGE, true, data);
    }

    public static ActionResult getErrorResult(Object data) {
        return new ActionResult(ERR_CODE, ERR_MESSAGE, false, data);
    }

    public static ActionResult getErrorResult(String code, String message) {
        return new ActionResult(code, message, false);
    }

    public static ActionResult getErrorResult(String message) {
        return new ActionResult(ERR_CODE, message, false);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }
}
