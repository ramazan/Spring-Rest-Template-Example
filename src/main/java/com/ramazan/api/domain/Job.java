package com.ramazan.api.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Data
public class Job implements Serializable
{

    private final static long serialVersionUID = -1721007199473789014L;
    private String title;
    private String company;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
}
