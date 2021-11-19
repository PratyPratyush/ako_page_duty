package com.ako.pageduty.model;

import lombok.Data;

import java.util.List;
@Data
public class RequestObject {
    Team team;
    List<Developer> developers;
}
