package com.CompletableFuture.CompletableFuture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;

@RestController
public class ExampleController {

    @Autowired
    private ExampleService exampleService;

    @GetMapping("/fetch-data")
    public CompletableFuture<String> fetchData() {
        // Call the asynchronous task method from the service
        return exampleService.fetchDataAsync();
    }
}
