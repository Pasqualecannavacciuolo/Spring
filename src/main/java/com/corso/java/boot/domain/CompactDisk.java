package com.corso.java.boot.domain;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@AllArgsConstructor
@Document(collection = "compactDisk")

public class CompactDisk {
    private String name;
    private String title;
    private String description;
    private String author;
    private int age;
}
