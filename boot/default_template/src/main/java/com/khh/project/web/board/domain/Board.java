package com.khh.project.web.board.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Board {
    @Id
    String name;
    String addr;

}
