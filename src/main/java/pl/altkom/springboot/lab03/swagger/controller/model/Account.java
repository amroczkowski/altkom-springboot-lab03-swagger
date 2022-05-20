package pl.altkom.springboot.lab03.swagger.controller.model;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Account {

    private Long id;
    private String firstName;
    private String lastName;
}
