package com.musala.content.service.parsers;

import com.musala.content.model.Source;

import java.util.HashMap;
import java.util.Map;

public class HomesParser implements Parser {

    // TODO
    @Override
    public Map<String, String> parse(Source source) {
        Map<String, String> data = new HashMap<>();
        data.put("Title", "Big House");
        data.put("City", "Sofia");
        return data;
    }

}
