package com.ultimates.grs.data.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class GameDataDto {
    private Long idx;
    private String userName;
    private int gameNumber;
    private Date startTime;
    private Date endTime;
    private String playChamp;
    private int killCnt;
    private int death;
    private int assist;
    private boolean win;
    private int atkDmg;
    private int recDmg;

}