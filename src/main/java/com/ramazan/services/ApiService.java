package com.ramazan.services;

import com.ramazan.api.domain.User;

import java.util.List;

public interface ApiService
{
    List<User> getUsers(Integer limit);
}
