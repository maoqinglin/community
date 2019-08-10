package com.ireadygo.community.dto;

import lombok.Data;

@Data
public class GithubUser {

    String name;
    Long id;
    String bio;
    String avatar_url;
}
