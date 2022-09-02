package com.main.simplewebfluxstreamingservice.interfaces;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface VideoResponse {
    @GetMapping(value = "/video/{titleName}", produces = "video/mp4")
    Object getVideo(@PathVariable String titleName);
}
