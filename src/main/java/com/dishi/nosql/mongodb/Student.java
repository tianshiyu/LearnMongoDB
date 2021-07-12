package com.dishi.nosql.mongodb;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Getter
@Setter
public class Student {
    @Id
    private String id;
    @Indexed
    private Long studentId;
    @Indexed
    private Long teacherId;
    @Indexed
    private Long classId;
    @Indexed
    private String name;
    private Integer age;
    private String sex;
    @Transient // 有此注解的字段不存入mongodb
    private String dream;
}
