package net.yestic.sample.api.model;

import java.io.Serializable;
import lombok.Data;
import java.util.Date;

@Data
public class TestModel implements Serializable {

    private Integer id;

    private Integer age;

    private String userName;

    private Date createdAt;

    private Date updatedAt;

}