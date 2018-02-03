package com.ramazan.api.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Data
public class Billing implements Serializable
{

    private final static long serialVersionUID = 3940954723216972217L;
    private Card card;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
}
