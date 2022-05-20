package pl.altkom.springboot.lab03.swagger.controller.model;

import javax.validation.constraints.NotNull;

import lombok.Getter;

@Getter
public class UpdateAccountRequest {
    @NotNull
    private String firstName;
    @NotNull
    private String lastName;
}
