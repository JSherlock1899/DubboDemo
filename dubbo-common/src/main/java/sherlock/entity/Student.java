package sherlock.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author: sherlock
 * @description:
 * @date: 2020/5/21 5:59
 */
@Data
public class Student implements Serializable {

    private String no;
    private String name;
    private String address;
}
