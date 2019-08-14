package com.leejun.restapitestalone.model;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter

@NoArgsConstructor
@Builder

@EqualsAndHashCode(of = "id")
@AllArgsConstructor

public class Todo {

    private Integer id;
    private String name;
    private String desc;
    private Status status = Status.READY;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;

}
