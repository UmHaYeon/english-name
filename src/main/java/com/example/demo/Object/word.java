package com.example.demo.Object;

import lombok.*;

@Getter @Setter
@NoArgsConstructor @Data @AllArgsConstructor
@ToString
public class word {
    private String root;
    private int id;
    private String word;
    private String meaning;
}
