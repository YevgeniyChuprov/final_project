package ru.lamoda.tests.api.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;

public class CookieModel {
    public Map<String, String> cookies () {
        Map<String, String> map = new HashMap<>();
        map.put("sid","ZjI1NTg1NjAzMWZjNTIyZTBjZmFmY2RiMDkwNmZjMjI=|1677136624|2820f9cd95c8654705535897bc0272ad61e0a91a");
        return map;
    }
}

