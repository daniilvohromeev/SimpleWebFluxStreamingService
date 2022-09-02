package com.main.simplewebfluxstreamingservice.services;

import com.main.simplewebfluxstreamingservice.interfaces.VideoStreaming;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class StreamingService implements VideoStreaming {
    private final ResourceLoader resourceLoader;

    public StreamingService(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

    @Override
    public Mono<Resource> getVideoStreaming(String titleName) {
        return Mono.fromSupplier(() -> resourceLoader.getResource("classpath:videos/" + titleName + ".mp4"));
    }
}
