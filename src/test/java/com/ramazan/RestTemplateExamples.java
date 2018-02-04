package com.ramazan;

import com.fasterxml.jackson.databind.JsonNode;
import org.junit.Test;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

public class RestTemplateExamples
{
    public static final String API_ROOT = "https://api.predic8.de:443/shop";

    private RestTemplate restTemplate = new RestTemplate();

    @Test
    public void GetCategories()
    {
        String API_URL = API_ROOT + "/categories/";
        createRequest(API_URL, true);
    }

    @Test
    public void GetCustomers()
    {
        String API_URL = API_ROOT + "/customers/";
        createRequest(API_URL, true);
    }

    @Test
    public void GetProducts()
    {
        String API_URL = API_ROOT + "/products/";
        createRequest(API_URL, true);
    }

    @Test
    public void CreateCustomers()
    {
        String API_URL = API_ROOT + "/customers/";
        Map<String, Object> objectMap = new HashMap<>();

        objectMap.put("firstname", "Ramazan");
        objectMap.put("lastname", "Demir");

        createRequest(API_URL, objectMap, false);
    }

    @Test
    public void CreateVendors()
    {
        String API_URL = API_ROOT + "/vendors/";
        Map<String, Object> objectMap = new HashMap<>();

        objectMap.put("name", "Ramazan");

        createRequest(API_URL, objectMap, false);
    }

    private void createRequest(String API_URL, Boolean isGet)
    {
        createRequest(API_URL, null, isGet);
    }

    private void createRequest(String API_URL, Map<String, Object> objectMap, Boolean isGet)
    {
        JsonNode jsonNode = null;

        if (isGet)
            jsonNode = restTemplate.getForObject(API_URL, JsonNode.class);
        else
            jsonNode = restTemplate.postForObject(API_URL, objectMap, JsonNode.class);

        System.out.println("Response : ");
        System.out.println(jsonNode.toString());
    }
}
