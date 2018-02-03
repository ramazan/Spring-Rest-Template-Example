package com.ramazan.services;

import com.ramazan.api.domain.User;
import com.ramazan.api.domain.UserData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@Service
public class ApiServiceImpl implements ApiService
{
    @Autowired
    private RestTemplate restTemplate;

    // inject value from application.properties
    @Value("${api.url}")
    private String API_URL;

    @Override
    public List<User> getUsers(Integer limit)
    {
        UriComponentsBuilder uriBuilder = UriComponentsBuilder
                .fromUriString(API_URL)
                .queryParam("limit", String.valueOf(limit - 1));

        return restTemplate.getForObject(uriBuilder.toUriString(), UserData.class).getData();
    }
}
