package com.sm.jeyz9.storemateapi.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserChartDTO {
    private Integer oldUser;
    private Integer newUser;
    private Integer inactiveUser;
}
