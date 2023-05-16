package com.springboot.mybatisboard.common.dto;

import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.web.bind.annotation.RequestMethod;

@Getter
@AllArgsConstructor
public class MessageDto {

    private String message;
    private String redirectUri;
    private RequestMethod method;
    private Map<String, Object> data;
}
