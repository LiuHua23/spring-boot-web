package com.hwa.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author LiuHua
 * @date 2018/8/20
 */
@Component
public class Properties {

    @Value("${com.hwa.title}")
    private String title;

    @Value("${com.hwa.description}")
    private String description;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
