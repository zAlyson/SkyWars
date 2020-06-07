package com.zalyson.core.server;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Server {

    private Integer id;
    private ServerType serverType;

    private String address;
    private int port;

}
