package cn.junhui.demo.vo;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * ResultVO class
 *
 * @author junhui
 * @date 19-4-26
 */
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class ResultVO {
    private String code;
    private String msg;
    private Object data;

    public ResultVO(String code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResultVO{" +
                "code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
