package pl.altkom.springboot.lab03.swagger.controller.model;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;

@Getter
public class UpdateAccountRequest {
    @NotNull
    private String firstName;
    @NotNull
    private String lastName;
}
