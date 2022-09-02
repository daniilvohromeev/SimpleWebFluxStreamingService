package com.main.simplewebfluxstreamingservice.controllers;

import com.main.simplewebfluxstreamingservice.interfaces.VideoResponse;
import com.main.simplewebfluxstreamingservice.services.StreamingService;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class StreamingController implements VideoResponse {
    public final StreamingService streamingService;

    public StreamingController(StreamingService streamingService) {
        this.streamingService = streamingService;
    }
    @Override
    public Mono<Resource> getVideo(@PathVariable String titleName) {
        return streamingService.getVideoStreaming(titleName);
    }
}
