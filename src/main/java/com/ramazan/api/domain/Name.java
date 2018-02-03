package com.ramazan.api.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Data
public class Name implements Serializable
{
    private final static long serialVersionUID = 8774121541996823739L;
    private String title;
    private String first;
    private String last;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
}
