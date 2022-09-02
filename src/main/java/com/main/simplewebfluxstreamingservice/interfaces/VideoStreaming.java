package com.main.simplewebfluxstreamingservice.interfaces;

import org.springframework.web.bind.annotation.RestController;

@RestController
public interface VideoStreaming {

    Object getVideoStreaming(String titleName);
}
