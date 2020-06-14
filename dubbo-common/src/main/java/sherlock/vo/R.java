package sherlock.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: sherlock
 * @description:统一结果返回
 * @date: 2020/5/21 6:03
 */
@Data
public class R implements Serializable {

    private int code;
    private String msg;
    private List data;


    public static R setR(boolean issuccess, String msg, List data) {
        R r = new R();
        if (issuccess) {
            r.setCode(0);
        } else {
            r.setCode(1);
        }
        r.setData(data);
        r.setMsg(msg);
        return r;
    }

    public static R ok(List object) {
        return setR(true, "ok", object);
    }

    public static R fail() {
        return setR(false, "fail", null);
    }
}
