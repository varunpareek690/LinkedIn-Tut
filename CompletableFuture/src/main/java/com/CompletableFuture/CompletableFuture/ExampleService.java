package com.CompletableFuture.CompletableFuture;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.CompletableFuture;

@Service
public class ExampleService {

    private static final String API_BASE_URL = "https://jsonplaceholder.typicode.com";
    private final RestTemplate restTemplate;
    public ExampleService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Async
    public CompletableFuture<String> fetchDataAsync() {
        String url = API_BASE_URL + "/posts/1";
        String result = restTemplate.getForObject(url, String.class);

        return CompletableFuture.completedFuture(result);
    }
}
