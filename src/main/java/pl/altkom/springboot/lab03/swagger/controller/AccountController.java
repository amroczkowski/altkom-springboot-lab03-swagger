package pl.altkom.springboot.lab03.swagger.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import pl.altkom.springboot.lab03.swagger.controller.model.Account;
import pl.altkom.springboot.lab03.swagger.controller.model.CreateAccountRequest;
import pl.altkom.springboot.lab03.swagger.controller.model.UpdateAccountRequest;

@Tag(name = "Account Management Resource")
@RequiredArgsConstructor
@RequestMapping("/account")
@RestController
public class AccountController {

    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "OK"),
            @ApiResponse(responseCode = "400", description = "Bad Request")
    })
    @Operation(summary = "Get all accounts")
    @GetMapping
    public List<Account> getAccounts() {
        return List.of();
    }

    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "OK"),
            @ApiResponse(responseCode = "400", description = "Bad Request")
    })
    @Operation(summary = "Get account by id")
    @GetMapping("/{id}")
    public Account getAccount(@PathVariable("id") final Long accountId) {
        return Account.builder().build();
    }

    @ApiResponses({
            @ApiResponse(responseCode = "201", description = "Created"),
            @ApiResponse(responseCode = "400", description = "Bad Request")
    })

    @ResponseStatus(HttpStatus.CREATED)
    @Operation(summary = "Create account")
    @PostMapping
    public Long createAccount(@RequestBody @Valid final CreateAccountRequest request) {
        return null;
    }

    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "OK"),
            @ApiResponse(responseCode = "400", description = "Bad Request")
    })
    @Operation(summary = "Update account")
    @PutMapping("/{id}")
    public void updateAccount(@PathVariable("id") final Long accountId, @RequestBody @Valid final UpdateAccountRequest request) {

    }
}
