package com.ramazan.services;

import com.ramazan.api.domain.User;
import com.ramazan.api.domain.UserData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ApiServiceImpl implements ApiService
{
    @Autowired
    private RestTemplate restTemplate;

    @Override
    public List<User> getUsers(Integer limit)
    {
        return restTemplate.getForObject("http://apifaketory.com/api/user?limit=" + String.valueOf(limit - 1), UserData.class).getData();
    }
}
