package com.codingjx.blogservice.payload;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CommentDto {
    private long id;

    @NotEmpty(message = "Name should not be null or empty.")
    private String name;

    @NotEmpty(message = "Email should not be null or empty.")
    private String email;

    @NotEmpty
    @Size(min = 10, message = "Comment body must have minimum 10 characters.")
    private String body;
}
